/*
 * Bevragen Ingeschreven Personen RvIG
 * API voor het bevragen van ingeschreven personen uit de basisregistratie personen (BRP), inclusief de registratie niet-ingezeten (RNI). Met deze API kun je personen zoeken en actuele gegevens over personen, kinderen, partners en ouders raadplegen.  Gegevens die er niet zijn of niet actueel zijn krijg je niet terug. Heeft een persoon bijvoorbeeld geen geldige nationaliteit, en alleen een beëindigd partnerschap, dan krijg je geen gegevens over nationaliteit en partner.  Zie de [Functionele documentatie](https://github.com/VNG-Realisatie/Haal-Centraal-BRP-bevragen/tree/v1.2.0/features) voor nadere toelichting.  De API zal door RvIG worden aangeboden. Daarin wordt een aantal afgeleide gegevens niet opgenomen. Daarom bevat deze specificatie minder gegevens dan de specificatie op [BRP-bevragen](https://github.com/VNG-Realisatie/Haal-Centraal-BRP-bevragen/blob/master/specificatie/genereervariant/openapi.yaml). 
 *
 * The version of the OpenAPI document: 1.2.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.DatumOnvolledig;
import org.openapitools.client.model.Geboorte;
import org.openapitools.client.model.GeslachtEnum;
import org.openapitools.client.model.Gezagsverhouding;
import org.openapitools.client.model.IngeschrevenPersoonEmbedded;
import org.openapitools.client.model.IngeschrevenPersoonHalAllOf;
import org.openapitools.client.model.IngeschrevenPersoonHalBasis;
import org.openapitools.client.model.IngeschrevenPersoonLinks;
import org.openapitools.client.model.Kiesrecht;
import org.openapitools.client.model.NaamPersoon;
import org.openapitools.client.model.Nationaliteit;
import org.openapitools.client.model.OpschortingBijhouding;
import org.openapitools.client.model.Overlijden;
import org.openapitools.client.model.PersoonInOnderzoek;
import org.openapitools.client.model.Verblijfplaats;
import org.openapitools.client.model.Verblijfstitel;

/**
 * IngeschrevenPersoonHal
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-02-22T08:37:05.945Z[Etc/UTC]")
public class IngeschrevenPersoonHal {
  public static final String SERIALIZED_NAME_BURGERSERVICENUMMER = "burgerservicenummer";
  @SerializedName(SERIALIZED_NAME_BURGERSERVICENUMMER)
  private String burgerservicenummer;

  public static final String SERIALIZED_NAME_GEHEIMHOUDING_PERSOONSGEGEVENS = "geheimhoudingPersoonsgegevens";
  @SerializedName(SERIALIZED_NAME_GEHEIMHOUDING_PERSOONSGEGEVENS)
  private Boolean geheimhoudingPersoonsgegevens;

  public static final String SERIALIZED_NAME_GESLACHTSAANDUIDING = "geslachtsaanduiding";
  @SerializedName(SERIALIZED_NAME_GESLACHTSAANDUIDING)
  private GeslachtEnum geslachtsaanduiding;

  public static final String SERIALIZED_NAME_DATUM_EERSTE_INSCHRIJVING_G_B_A = "datumEersteInschrijvingGBA";
  @SerializedName(SERIALIZED_NAME_DATUM_EERSTE_INSCHRIJVING_G_B_A)
  private DatumOnvolledig datumEersteInschrijvingGBA;

  public static final String SERIALIZED_NAME_KIESRECHT = "kiesrecht";
  @SerializedName(SERIALIZED_NAME_KIESRECHT)
  private Kiesrecht kiesrecht;

  public static final String SERIALIZED_NAME_NAAM = "naam";
  @SerializedName(SERIALIZED_NAME_NAAM)
  private NaamPersoon naam = null;

  public static final String SERIALIZED_NAME_IN_ONDERZOEK = "inOnderzoek";
  @SerializedName(SERIALIZED_NAME_IN_ONDERZOEK)
  private PersoonInOnderzoek inOnderzoek;

  public static final String SERIALIZED_NAME_NATIONALITEITEN = "nationaliteiten";
  @SerializedName(SERIALIZED_NAME_NATIONALITEITEN)
  private List<Nationaliteit> nationaliteiten = null;

  public static final String SERIALIZED_NAME_GEBOORTE = "geboorte";
  @SerializedName(SERIALIZED_NAME_GEBOORTE)
  private Geboorte geboorte = null;

  public static final String SERIALIZED_NAME_OPSCHORTING_BIJHOUDING = "opschortingBijhouding";
  @SerializedName(SERIALIZED_NAME_OPSCHORTING_BIJHOUDING)
  private OpschortingBijhouding opschortingBijhouding;

  public static final String SERIALIZED_NAME_OVERLIJDEN = "overlijden";
  @SerializedName(SERIALIZED_NAME_OVERLIJDEN)
  private Overlijden overlijden;

  public static final String SERIALIZED_NAME_VERBLIJFPLAATS = "verblijfplaats";
  @SerializedName(SERIALIZED_NAME_VERBLIJFPLAATS)
  private Verblijfplaats verblijfplaats = null;

  public static final String SERIALIZED_NAME_GEZAGSVERHOUDING = "gezagsverhouding";
  @SerializedName(SERIALIZED_NAME_GEZAGSVERHOUDING)
  private Gezagsverhouding gezagsverhouding;

  public static final String SERIALIZED_NAME_VERBLIJFSTITEL = "verblijfstitel";
  @SerializedName(SERIALIZED_NAME_VERBLIJFSTITEL)
  private Verblijfstitel verblijfstitel;

  public static final String SERIALIZED_NAME_REISDOCUMENTNUMMERS = "reisdocumentnummers";
  @SerializedName(SERIALIZED_NAME_REISDOCUMENTNUMMERS)
  private List<String> reisdocumentnummers = null;

  public static final String SERIALIZED_NAME_LINKS = "_links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private IngeschrevenPersoonLinks links;

  public static final String SERIALIZED_NAME_EMBEDDED = "_embedded";
  @SerializedName(SERIALIZED_NAME_EMBEDDED)
  private IngeschrevenPersoonEmbedded embedded;


  public IngeschrevenPersoonHal burgerservicenummer(String burgerservicenummer) {
    
    this.burgerservicenummer = burgerservicenummer;
    return this;
  }

   /**
   * Get burgerservicenummer
   * @return burgerservicenummer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "555555021", value = "")

  public String getBurgerservicenummer() {
    return burgerservicenummer;
  }


  public void setBurgerservicenummer(String burgerservicenummer) {
    this.burgerservicenummer = burgerservicenummer;
  }


  public IngeschrevenPersoonHal geheimhoudingPersoonsgegevens(Boolean geheimhoudingPersoonsgegevens) {
    
    this.geheimhoudingPersoonsgegevens = geheimhoudingPersoonsgegevens;
    return this;
  }

   /**
   * Gegevens mogen niet worden verstrekt aan derden / maatschappelijke instellingen. 
   * @return geheimhoudingPersoonsgegevens
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Gegevens mogen niet worden verstrekt aan derden / maatschappelijke instellingen. ")

  public Boolean getGeheimhoudingPersoonsgegevens() {
    return geheimhoudingPersoonsgegevens;
  }


  public void setGeheimhoudingPersoonsgegevens(Boolean geheimhoudingPersoonsgegevens) {
    this.geheimhoudingPersoonsgegevens = geheimhoudingPersoonsgegevens;
  }


  public IngeschrevenPersoonHal geslachtsaanduiding(GeslachtEnum geslachtsaanduiding) {
    
    this.geslachtsaanduiding = geslachtsaanduiding;
    return this;
  }

   /**
   * Get geslachtsaanduiding
   * @return geslachtsaanduiding
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GeslachtEnum getGeslachtsaanduiding() {
    return geslachtsaanduiding;
  }


  public void setGeslachtsaanduiding(GeslachtEnum geslachtsaanduiding) {
    this.geslachtsaanduiding = geslachtsaanduiding;
  }


  public IngeschrevenPersoonHal datumEersteInschrijvingGBA(DatumOnvolledig datumEersteInschrijvingGBA) {
    
    this.datumEersteInschrijvingGBA = datumEersteInschrijvingGBA;
    return this;
  }

   /**
   * Get datumEersteInschrijvingGBA
   * @return datumEersteInschrijvingGBA
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DatumOnvolledig getDatumEersteInschrijvingGBA() {
    return datumEersteInschrijvingGBA;
  }


  public void setDatumEersteInschrijvingGBA(DatumOnvolledig datumEersteInschrijvingGBA) {
    this.datumEersteInschrijvingGBA = datumEersteInschrijvingGBA;
  }


  public IngeschrevenPersoonHal kiesrecht(Kiesrecht kiesrecht) {
    
    this.kiesrecht = kiesrecht;
    return this;
  }

   /**
   * Get kiesrecht
   * @return kiesrecht
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Kiesrecht getKiesrecht() {
    return kiesrecht;
  }


  public void setKiesrecht(Kiesrecht kiesrecht) {
    this.kiesrecht = kiesrecht;
  }


  public IngeschrevenPersoonHal naam(NaamPersoon naam) {
    
    this.naam = naam;
    return this;
  }

   /**
   * Get naam
   * @return naam
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public NaamPersoon getNaam() {
    return naam;
  }


  public void setNaam(NaamPersoon naam) {
    this.naam = naam;
  }


  public IngeschrevenPersoonHal inOnderzoek(PersoonInOnderzoek inOnderzoek) {
    
    this.inOnderzoek = inOnderzoek;
    return this;
  }

   /**
   * Get inOnderzoek
   * @return inOnderzoek
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PersoonInOnderzoek getInOnderzoek() {
    return inOnderzoek;
  }


  public void setInOnderzoek(PersoonInOnderzoek inOnderzoek) {
    this.inOnderzoek = inOnderzoek;
  }


  public IngeschrevenPersoonHal nationaliteiten(List<Nationaliteit> nationaliteiten) {
    
    this.nationaliteiten = nationaliteiten;
    return this;
  }

  public IngeschrevenPersoonHal addNationaliteitenItem(Nationaliteit nationaliteitenItem) {
    if (this.nationaliteiten == null) {
      this.nationaliteiten = new ArrayList<>();
    }
    this.nationaliteiten.add(nationaliteitenItem);
    return this;
  }

   /**
   * Get nationaliteiten
   * @return nationaliteiten
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Nationaliteit> getNationaliteiten() {
    return nationaliteiten;
  }


  public void setNationaliteiten(List<Nationaliteit> nationaliteiten) {
    this.nationaliteiten = nationaliteiten;
  }


  public IngeschrevenPersoonHal geboorte(Geboorte geboorte) {
    
    this.geboorte = geboorte;
    return this;
  }

   /**
   * Get geboorte
   * @return geboorte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Geboorte getGeboorte() {
    return geboorte;
  }


  public void setGeboorte(Geboorte geboorte) {
    this.geboorte = geboorte;
  }


  public IngeschrevenPersoonHal opschortingBijhouding(OpschortingBijhouding opschortingBijhouding) {
    
    this.opschortingBijhouding = opschortingBijhouding;
    return this;
  }

   /**
   * Get opschortingBijhouding
   * @return opschortingBijhouding
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OpschortingBijhouding getOpschortingBijhouding() {
    return opschortingBijhouding;
  }


  public void setOpschortingBijhouding(OpschortingBijhouding opschortingBijhouding) {
    this.opschortingBijhouding = opschortingBijhouding;
  }


  public IngeschrevenPersoonHal overlijden(Overlijden overlijden) {
    
    this.overlijden = overlijden;
    return this;
  }

   /**
   * Get overlijden
   * @return overlijden
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Overlijden getOverlijden() {
    return overlijden;
  }


  public void setOverlijden(Overlijden overlijden) {
    this.overlijden = overlijden;
  }


  public IngeschrevenPersoonHal verblijfplaats(Verblijfplaats verblijfplaats) {
    
    this.verblijfplaats = verblijfplaats;
    return this;
  }

   /**
   * Get verblijfplaats
   * @return verblijfplaats
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Verblijfplaats getVerblijfplaats() {
    return verblijfplaats;
  }


  public void setVerblijfplaats(Verblijfplaats verblijfplaats) {
    this.verblijfplaats = verblijfplaats;
  }


  public IngeschrevenPersoonHal gezagsverhouding(Gezagsverhouding gezagsverhouding) {
    
    this.gezagsverhouding = gezagsverhouding;
    return this;
  }

   /**
   * Get gezagsverhouding
   * @return gezagsverhouding
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Gezagsverhouding getGezagsverhouding() {
    return gezagsverhouding;
  }


  public void setGezagsverhouding(Gezagsverhouding gezagsverhouding) {
    this.gezagsverhouding = gezagsverhouding;
  }


  public IngeschrevenPersoonHal verblijfstitel(Verblijfstitel verblijfstitel) {
    
    this.verblijfstitel = verblijfstitel;
    return this;
  }

   /**
   * Get verblijfstitel
   * @return verblijfstitel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Verblijfstitel getVerblijfstitel() {
    return verblijfstitel;
  }


  public void setVerblijfstitel(Verblijfstitel verblijfstitel) {
    this.verblijfstitel = verblijfstitel;
  }


  public IngeschrevenPersoonHal reisdocumentnummers(List<String> reisdocumentnummers) {
    
    this.reisdocumentnummers = reisdocumentnummers;
    return this;
  }

  public IngeschrevenPersoonHal addReisdocumentnummersItem(String reisdocumentnummersItem) {
    if (this.reisdocumentnummers == null) {
      this.reisdocumentnummers = new ArrayList<>();
    }
    this.reisdocumentnummers.add(reisdocumentnummersItem);
    return this;
  }

   /**
   * Get reisdocumentnummers
   * @return reisdocumentnummers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getReisdocumentnummers() {
    return reisdocumentnummers;
  }


  public void setReisdocumentnummers(List<String> reisdocumentnummers) {
    this.reisdocumentnummers = reisdocumentnummers;
  }


  public IngeschrevenPersoonHal links(IngeschrevenPersoonLinks links) {
    
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public IngeschrevenPersoonLinks getLinks() {
    return links;
  }


  public void setLinks(IngeschrevenPersoonLinks links) {
    this.links = links;
  }


  public IngeschrevenPersoonHal embedded(IngeschrevenPersoonEmbedded embedded) {
    
    this.embedded = embedded;
    return this;
  }

   /**
   * Get embedded
   * @return embedded
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public IngeschrevenPersoonEmbedded getEmbedded() {
    return embedded;
  }


  public void setEmbedded(IngeschrevenPersoonEmbedded embedded) {
    this.embedded = embedded;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IngeschrevenPersoonHal ingeschrevenPersoonHal = (IngeschrevenPersoonHal) o;
    return Objects.equals(this.burgerservicenummer, ingeschrevenPersoonHal.burgerservicenummer) &&
        Objects.equals(this.geheimhoudingPersoonsgegevens, ingeschrevenPersoonHal.geheimhoudingPersoonsgegevens) &&
        Objects.equals(this.geslachtsaanduiding, ingeschrevenPersoonHal.geslachtsaanduiding) &&
        Objects.equals(this.datumEersteInschrijvingGBA, ingeschrevenPersoonHal.datumEersteInschrijvingGBA) &&
        Objects.equals(this.kiesrecht, ingeschrevenPersoonHal.kiesrecht) &&
        Objects.equals(this.naam, ingeschrevenPersoonHal.naam) &&
        Objects.equals(this.inOnderzoek, ingeschrevenPersoonHal.inOnderzoek) &&
        Objects.equals(this.nationaliteiten, ingeschrevenPersoonHal.nationaliteiten) &&
        Objects.equals(this.geboorte, ingeschrevenPersoonHal.geboorte) &&
        Objects.equals(this.opschortingBijhouding, ingeschrevenPersoonHal.opschortingBijhouding) &&
        Objects.equals(this.overlijden, ingeschrevenPersoonHal.overlijden) &&
        Objects.equals(this.verblijfplaats, ingeschrevenPersoonHal.verblijfplaats) &&
        Objects.equals(this.gezagsverhouding, ingeschrevenPersoonHal.gezagsverhouding) &&
        Objects.equals(this.verblijfstitel, ingeschrevenPersoonHal.verblijfstitel) &&
        Objects.equals(this.reisdocumentnummers, ingeschrevenPersoonHal.reisdocumentnummers) &&
        Objects.equals(this.links, ingeschrevenPersoonHal.links) &&
        Objects.equals(this.embedded, ingeschrevenPersoonHal.embedded);
  }

  @Override
  public int hashCode() {
    return Objects.hash(burgerservicenummer, geheimhoudingPersoonsgegevens, geslachtsaanduiding, datumEersteInschrijvingGBA, kiesrecht, naam, inOnderzoek, nationaliteiten, geboorte, opschortingBijhouding, overlijden, verblijfplaats, gezagsverhouding, verblijfstitel, reisdocumentnummers, links, embedded);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IngeschrevenPersoonHal {\n");
    sb.append("    burgerservicenummer: ").append(toIndentedString(burgerservicenummer)).append("\n");
    sb.append("    geheimhoudingPersoonsgegevens: ").append(toIndentedString(geheimhoudingPersoonsgegevens)).append("\n");
    sb.append("    geslachtsaanduiding: ").append(toIndentedString(geslachtsaanduiding)).append("\n");
    sb.append("    datumEersteInschrijvingGBA: ").append(toIndentedString(datumEersteInschrijvingGBA)).append("\n");
    sb.append("    kiesrecht: ").append(toIndentedString(kiesrecht)).append("\n");
    sb.append("    naam: ").append(toIndentedString(naam)).append("\n");
    sb.append("    inOnderzoek: ").append(toIndentedString(inOnderzoek)).append("\n");
    sb.append("    nationaliteiten: ").append(toIndentedString(nationaliteiten)).append("\n");
    sb.append("    geboorte: ").append(toIndentedString(geboorte)).append("\n");
    sb.append("    opschortingBijhouding: ").append(toIndentedString(opschortingBijhouding)).append("\n");
    sb.append("    overlijden: ").append(toIndentedString(overlijden)).append("\n");
    sb.append("    verblijfplaats: ").append(toIndentedString(verblijfplaats)).append("\n");
    sb.append("    gezagsverhouding: ").append(toIndentedString(gezagsverhouding)).append("\n");
    sb.append("    verblijfstitel: ").append(toIndentedString(verblijfstitel)).append("\n");
    sb.append("    reisdocumentnummers: ").append(toIndentedString(reisdocumentnummers)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    embedded: ").append(toIndentedString(embedded)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

