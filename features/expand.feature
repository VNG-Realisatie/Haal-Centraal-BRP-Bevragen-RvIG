# language: nl

# Nederlandse API Strategie:
# API-10 Resources ondersteunen “lazy” en “eager” laden van relaties
# API-11 Gelinkte resources worden expliciet en selectief mee-geladen

Functionaliteit: Automatische laden van gelinkte resources
  "eager loading" van gelinkte resources wordt mogelijk gemaakt voor de volgende relaties:
  - kinderen
  - ouders
  - partners

  Deze gelinkte resources kunnen direct bij de gezochte of geraadpleegde persoon (personen) worden meegeladen. Hiervoor gebruikt met de parameter expand.
  De gevraagde resources worden dan (conform HAL) opgenomen in veld _embedded binnen de resource.

  Gelinkte resources die in _embedded worden opgenomen bevatten altijd de (self) link naar de betreffende resource.

  In de API wordt expand=true niet ondersteund. Gewenste gelinkte resources moeten expliciet worden opgegeven.

  Dit wordt gedaan door de gewenste resources als een komma's gescheiden lijst te specificeren, bijvoorbeeld: expand=ouders,kinderen.

  De dot-notatie wordt gebruikt om specifieke velden van resources te selecteren, bijvoorbeeld expand=ouders.voornamen,ouders.geslachtsaanduiding.
  Wanneer geen specifieke velden van de resource zijn aangegeven, wordt de gehele resource opgenomen.

  Categorieën (groepen attributen) kunnen in gezamenlijk worden gevraagd door de naam van de categorie op te nemen in de expand-parameter. In dat geval worden alle attributen van de categorie opgenomen in het antwoord, voor zover ze een waarde hebben. Bijvoorbeeld expand=partners.burgerservicenummer,partners.naam geeft naast het burgerservicenummer alle attributen van de naam (geslachtsnaam, voornamen, voorvoegsel, enz.) van de partner(s) terug.

  We ondersteunen het automatisch laden van gelinkte resources één niveau diep. Dit betekent dat er geen gelinkte resources van de gelinkte resources direct kunnen worden meegeladen. Bijvoorbeeld van een persoon kunnen de ouders worden meegeladen, maar niet de grootouders (de ouders van de ouders).
  Relaties (links) van de embedde resource kunnen worden gevraagd met de naam van de relatie. Bijvoorbeeld expand=partners.ingeschrevenpersonen geeft de link (uri) van de resource die de partner is van de bevraagde persoon. Hiermee wordt dus niet deze relatie van de relatie embed.

  Gevraagde attributen kunnen in willekeurige volgorde worden opgenomen in de expand-parameter. De volgorde waarin de gevraagde attributen worden opgesomd in de expand-parameter heeft geen invloed op de volgorde waarin deze attributen worden opgenomen in het antwoord (volgorde is niet relevant in een json object).

  Wanneer in de expand-parameter een resource(naam) of veld(naam) wordt opgegeven die niet bestaat, of waarvoor automatisch laden niet wordt ondersteund in de api, wordt een foutmelding teruggegeven.
  Wanneer de expand-parameter wordt opgenomen zonder waarde, wordt een foutmelding gegeven.

  Achtergrond:
    Gegeven de registratie ingeschreven personen kent zoals beschreven in testdata.csv
    En de geraadpleegde persoon een actuele partner(partnerschap of huwelijk), ouders en kinderen heeft

  Scenario: Wanneer de expand-parameter niet is meegegeven, worden gerelateerden niet meegeladen
    Als een ingeschreven persoon wordt geraadpleegd zonder expand-parameter
    Dan is in het antwoord attribuut _embedded niet aanwezig

  Scenario: Gebruik van expand=true is niet toegestaan
    Als een ingeschreven persoon wordt geraadpleegd met expand=true
    Dan levert dit een foutmelding
    Als een ingeschreven persoon wordt geraadpleegd met expand=True
    Dan levert dit een foutmelding
    Als ingeschreven personen gezocht worden met ?geslachtsnaam=groen&geboorte__datum=1983-05-26&expand=true
    Dan levert dit een foutmelding

  Scenario: Expand met incorrecte resource of velden
    Als een ingeschreven persoon wordt geraadpleegd met expand=resourcebestaatniet
    Dan levert dit een foutmelding
    Als een ingeschreven persoon wordt geraadpleegd met expand=reisdocumenten # automatisch laden van reisdocumenten wordt niet ondersteund
    Dan levert dit een foutmelding
    Als een ingeschreven persoon wordt geraadpleegd met expand=ouders.veldbestaatniet
    Dan levert dit een foutmelding

  Scenario: Expand met lege waarde
    Als een ingeschreven persoon wordt geraadpleegd met expand=
    Dan levert dit een foutmelding

  Scenario: Er kunnen meerdere linked resources worden meegeladen door deze als een komma's gescheiden lijst te specificeren
    Als een ingeschreven persoon wordt geraadpleegd met expand=partners,kinderen
    Dan wordt attribuut _embedded.partners teruggegeven
    En wordt attribuut _embedded.kinderen teruggegeven
    En is in het antwoord attribuut _embedded.ouders niet aanwezig

  Scenario: De dot-notatie wordt gebruikt om specifieke velden van resources te selecteren
    Als een ingeschreven persoon wordt geraadpleegd met expand=kinderen.voornamen,kinderen.geslachtsnaam
    Dan wordt attribuut _embedded.kinderen.voornamen teruggegeven
    En wordt attribuut _embedded.kinderen.geslachtsnaam teruggegeven
    En is in het antwoord attribuut _embedded.ouders niet aanwezig # geen andere resource dan die gevraagd is
    En is in het antwoord attribuut _embedded.kinderen.burgerservicenummer niet aanwezig # geen velden waar niet naar gevraagd is

  Scenario: Vragen om een hele categorie
    Als een ingeschreven persoon wordt geraadpleegd met expand=kinderen.voornamen,kinderen.geslachtsnaam,kinderen.geboorte
    Dan wordt attribuut _embedded.kinderen.voornamen teruggegeven
    En wordt attribuut _embedded.kinderen.geboorte teruggegeven
    En wordt attribuut _embedded.kinderen.geboorte.geboorteplaats teruggegeven
    En wordt attribuut _embedded.kinderen.geboorte.geboortedatum teruggegeven
    En wordt attribuut _embedded.kinderen.geboorte.geboortedatum.datum teruggegeven

  Scenario: Vragen om een link
    Als een ingeschreven persoon wordt geraadpleegd met expand=kinderen.voornamen,kinderen.geslachtsnaam
    Dan wordt attribuut _embedded.kinderen._links.self teruggegeven # de self link moet altijd worden opgenomen
    En is in het antwoord attribuut _embedded.kinderen._links.ingeschrevenpersonen niet aanwezig # geen links geven waar niet naar gevraagd is
    Als een ingeschreven persoon wordt geraadpleegd met expand=kinderen.voornamen,kinderen.geslachtsnaam,kinderen.ingeschrevenpersonen
    Dan wordt attribuut _embedded.kinderen._links.ingeschrevenpersonen teruggegeven