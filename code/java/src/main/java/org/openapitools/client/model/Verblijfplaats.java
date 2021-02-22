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
import org.openapitools.client.model.AanduidingBijHuisnummerEnum;
import org.openapitools.client.model.Adres;
import org.openapitools.client.model.DatumOnvolledig;
import org.openapitools.client.model.SoortAdresEnum;
import org.openapitools.client.model.VerblijfplaatsAllOf;
import org.openapitools.client.model.VerblijfplaatsInOnderzoek;
import org.openapitools.client.model.Waardetabel;

/**
 * Verblijfplaats
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-02-22T08:37:05.945Z[Etc/UTC]")
public class Verblijfplaats {
  public static final String SERIALIZED_NAME_STRAAT = "straat";
  @SerializedName(SERIALIZED_NAME_STRAAT)
  private String straat;

  public static final String SERIALIZED_NAME_HUISNUMMER = "huisnummer";
  @SerializedName(SERIALIZED_NAME_HUISNUMMER)
  private Integer huisnummer;

  public static final String SERIALIZED_NAME_HUISLETTER = "huisletter";
  @SerializedName(SERIALIZED_NAME_HUISLETTER)
  private String huisletter;

  public static final String SERIALIZED_NAME_HUISNUMMERTOEVOEGING = "huisnummertoevoeging";
  @SerializedName(SERIALIZED_NAME_HUISNUMMERTOEVOEGING)
  private String huisnummertoevoeging;

  public static final String SERIALIZED_NAME_POSTCODE = "postcode";
  @SerializedName(SERIALIZED_NAME_POSTCODE)
  private String postcode;

  public static final String SERIALIZED_NAME_WOONPLAATS = "woonplaats";
  @SerializedName(SERIALIZED_NAME_WOONPLAATS)
  private String woonplaats;

  public static final String SERIALIZED_NAME_ADRESSEERBAAR_OBJECT_IDENTIFICATIE = "adresseerbaarObjectIdentificatie";
  @SerializedName(SERIALIZED_NAME_ADRESSEERBAAR_OBJECT_IDENTIFICATIE)
  private String adresseerbaarObjectIdentificatie;

  public static final String SERIALIZED_NAME_AANDUIDING_BIJ_HUISNUMMER = "aanduidingBijHuisnummer";
  @SerializedName(SERIALIZED_NAME_AANDUIDING_BIJ_HUISNUMMER)
  private AanduidingBijHuisnummerEnum aanduidingBijHuisnummer;

  public static final String SERIALIZED_NAME_NUMMERAANDUIDING_IDENTIFICATIE = "nummeraanduidingIdentificatie";
  @SerializedName(SERIALIZED_NAME_NUMMERAANDUIDING_IDENTIFICATIE)
  private String nummeraanduidingIdentificatie;

  public static final String SERIALIZED_NAME_FUNCTIE_ADRES = "functieAdres";
  @SerializedName(SERIALIZED_NAME_FUNCTIE_ADRES)
  private SoortAdresEnum functieAdres;

  public static final String SERIALIZED_NAME_INDICATIE_VESTIGING_VANUIT_BUITENLAND = "indicatieVestigingVanuitBuitenland";
  @SerializedName(SERIALIZED_NAME_INDICATIE_VESTIGING_VANUIT_BUITENLAND)
  private Boolean indicatieVestigingVanuitBuitenland;

  public static final String SERIALIZED_NAME_LOCATIEBESCHRIJVING = "locatiebeschrijving";
  @SerializedName(SERIALIZED_NAME_LOCATIEBESCHRIJVING)
  private String locatiebeschrijving;

  public static final String SERIALIZED_NAME_KORTE_NAAM = "korteNaam";
  @SerializedName(SERIALIZED_NAME_KORTE_NAAM)
  private String korteNaam;

  public static final String SERIALIZED_NAME_VANUIT_VERTROKKEN_ONBEKEND_WAARHEEN = "vanuitVertrokkenOnbekendWaarheen";
  @SerializedName(SERIALIZED_NAME_VANUIT_VERTROKKEN_ONBEKEND_WAARHEEN)
  private Boolean vanuitVertrokkenOnbekendWaarheen;

  public static final String SERIALIZED_NAME_DATUM_AANVANG_ADRESHOUDING = "datumAanvangAdreshouding";
  @SerializedName(SERIALIZED_NAME_DATUM_AANVANG_ADRESHOUDING)
  private DatumOnvolledig datumAanvangAdreshouding;

  public static final String SERIALIZED_NAME_DATUM_INGANG_GELDIGHEID = "datumIngangGeldigheid";
  @SerializedName(SERIALIZED_NAME_DATUM_INGANG_GELDIGHEID)
  private DatumOnvolledig datumIngangGeldigheid;

  public static final String SERIALIZED_NAME_DATUM_INSCHRIJVING_IN_GEMEENTE = "datumInschrijvingInGemeente";
  @SerializedName(SERIALIZED_NAME_DATUM_INSCHRIJVING_IN_GEMEENTE)
  private DatumOnvolledig datumInschrijvingInGemeente;

  public static final String SERIALIZED_NAME_DATUM_VESTIGING_IN_NEDERLAND = "datumVestigingInNederland";
  @SerializedName(SERIALIZED_NAME_DATUM_VESTIGING_IN_NEDERLAND)
  private DatumOnvolledig datumVestigingInNederland;

  public static final String SERIALIZED_NAME_GEMEENTE_VAN_INSCHRIJVING = "gemeenteVanInschrijving";
  @SerializedName(SERIALIZED_NAME_GEMEENTE_VAN_INSCHRIJVING)
  private Waardetabel gemeenteVanInschrijving;

  public static final String SERIALIZED_NAME_LAND_VANWAAR_INGESCHREVEN = "landVanwaarIngeschreven";
  @SerializedName(SERIALIZED_NAME_LAND_VANWAAR_INGESCHREVEN)
  private Waardetabel landVanwaarIngeschreven;

  public static final String SERIALIZED_NAME_ADRESREGEL1 = "adresregel1";
  @SerializedName(SERIALIZED_NAME_ADRESREGEL1)
  private String adresregel1;

  public static final String SERIALIZED_NAME_ADRESREGEL2 = "adresregel2";
  @SerializedName(SERIALIZED_NAME_ADRESREGEL2)
  private String adresregel2;

  public static final String SERIALIZED_NAME_ADRESREGEL3 = "adresregel3";
  @SerializedName(SERIALIZED_NAME_ADRESREGEL3)
  private String adresregel3;

  public static final String SERIALIZED_NAME_VERTROKKEN_ONBEKEND_WAARHEEN = "vertrokkenOnbekendWaarheen";
  @SerializedName(SERIALIZED_NAME_VERTROKKEN_ONBEKEND_WAARHEEN)
  private Boolean vertrokkenOnbekendWaarheen;

  public static final String SERIALIZED_NAME_LAND = "land";
  @SerializedName(SERIALIZED_NAME_LAND)
  private Waardetabel land;

  public static final String SERIALIZED_NAME_IN_ONDERZOEK = "inOnderzoek";
  @SerializedName(SERIALIZED_NAME_IN_ONDERZOEK)
  private VerblijfplaatsInOnderzoek inOnderzoek;


  public Verblijfplaats straat(String straat) {
    
    this.straat = straat;
    return this;
  }

   /**
   * Een naam die door de gemeente aan een openbare ruimte is gegeven.
   * @return straat
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Laan van de landinrichtingscommissie Duiven-Westervoort", value = "Een naam die door de gemeente aan een openbare ruimte is gegeven.")

  public String getStraat() {
    return straat;
  }


  public void setStraat(String straat) {
    this.straat = straat;
  }


  public Verblijfplaats huisnummer(Integer huisnummer) {
    
    this.huisnummer = huisnummer;
    return this;
  }

   /**
   * Een nummer dat door de gemeente aan een adresseerbaar object is gegeven.
   * @return huisnummer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "Een nummer dat door de gemeente aan een adresseerbaar object is gegeven.")

  public Integer getHuisnummer() {
    return huisnummer;
  }


  public void setHuisnummer(Integer huisnummer) {
    this.huisnummer = huisnummer;
  }


  public Verblijfplaats huisletter(String huisletter) {
    
    this.huisletter = huisletter;
    return this;
  }

   /**
   * Een toevoeging aan een huisnummer in de vorm van een letter die door de gemeente aan een adresseerbaar object is gegeven.
   * @return huisletter
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "A", value = "Een toevoeging aan een huisnummer in de vorm van een letter die door de gemeente aan een adresseerbaar object is gegeven.")

  public String getHuisletter() {
    return huisletter;
  }


  public void setHuisletter(String huisletter) {
    this.huisletter = huisletter;
  }


  public Verblijfplaats huisnummertoevoeging(String huisnummertoevoeging) {
    
    this.huisnummertoevoeging = huisnummertoevoeging;
    return this;
  }

   /**
   * Een toevoeging aan een huisnummer of een combinatie van huisnummer en huisletter die door de gemeente aan een adresseerbaar object is gegeven.
   * @return huisnummertoevoeging
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "bis", value = "Een toevoeging aan een huisnummer of een combinatie van huisnummer en huisletter die door de gemeente aan een adresseerbaar object is gegeven.")

  public String getHuisnummertoevoeging() {
    return huisnummertoevoeging;
  }


  public void setHuisnummertoevoeging(String huisnummertoevoeging) {
    this.huisnummertoevoeging = huisnummertoevoeging;
  }


  public Verblijfplaats postcode(String postcode) {
    
    this.postcode = postcode;
    return this;
  }

   /**
   * De door PostNL vastgestelde code die bij een bepaalde combinatie van een straatnaam en een huisnummer hoort.
   * @return postcode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "6922KZ", value = "De door PostNL vastgestelde code die bij een bepaalde combinatie van een straatnaam en een huisnummer hoort.")

  public String getPostcode() {
    return postcode;
  }


  public void setPostcode(String postcode) {
    this.postcode = postcode;
  }


  public Verblijfplaats woonplaats(String woonplaats) {
    
    this.woonplaats = woonplaats;
    return this;
  }

   /**
   * Een woonplaats is een gedeelte van het grondgebied van de gemeente met een naam.
   * @return woonplaats
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Duiven", value = "Een woonplaats is een gedeelte van het grondgebied van de gemeente met een naam.")

  public String getWoonplaats() {
    return woonplaats;
  }


  public void setWoonplaats(String woonplaats) {
    this.woonplaats = woonplaats;
  }


  public Verblijfplaats adresseerbaarObjectIdentificatie(String adresseerbaarObjectIdentificatie) {
    
    this.adresseerbaarObjectIdentificatie = adresseerbaarObjectIdentificatie;
    return this;
  }

   /**
   * De verblijfplaats van de persoon kan een ligplaats, een standplaats of een verblijfsobject zijn. 
   * @return adresseerbaarObjectIdentificatie
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0226010000038820", value = "De verblijfplaats van de persoon kan een ligplaats, een standplaats of een verblijfsobject zijn. ")

  public String getAdresseerbaarObjectIdentificatie() {
    return adresseerbaarObjectIdentificatie;
  }


  public void setAdresseerbaarObjectIdentificatie(String adresseerbaarObjectIdentificatie) {
    this.adresseerbaarObjectIdentificatie = adresseerbaarObjectIdentificatie;
  }


  public Verblijfplaats aanduidingBijHuisnummer(AanduidingBijHuisnummerEnum aanduidingBijHuisnummer) {
    
    this.aanduidingBijHuisnummer = aanduidingBijHuisnummer;
    return this;
  }

   /**
   * Get aanduidingBijHuisnummer
   * @return aanduidingBijHuisnummer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AanduidingBijHuisnummerEnum getAanduidingBijHuisnummer() {
    return aanduidingBijHuisnummer;
  }


  public void setAanduidingBijHuisnummer(AanduidingBijHuisnummerEnum aanduidingBijHuisnummer) {
    this.aanduidingBijHuisnummer = aanduidingBijHuisnummer;
  }


  public Verblijfplaats nummeraanduidingIdentificatie(String nummeraanduidingIdentificatie) {
    
    this.nummeraanduidingIdentificatie = nummeraanduidingIdentificatie;
    return this;
  }

   /**
   * Unieke identificatie van een nummeraanduiding (en het bijbehorende adres) in de BAG. 
   * @return nummeraanduidingIdentificatie
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0518200000366054", value = "Unieke identificatie van een nummeraanduiding (en het bijbehorende adres) in de BAG. ")

  public String getNummeraanduidingIdentificatie() {
    return nummeraanduidingIdentificatie;
  }


  public void setNummeraanduidingIdentificatie(String nummeraanduidingIdentificatie) {
    this.nummeraanduidingIdentificatie = nummeraanduidingIdentificatie;
  }


  public Verblijfplaats functieAdres(SoortAdresEnum functieAdres) {
    
    this.functieAdres = functieAdres;
    return this;
  }

   /**
   * Get functieAdres
   * @return functieAdres
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SoortAdresEnum getFunctieAdres() {
    return functieAdres;
  }


  public void setFunctieAdres(SoortAdresEnum functieAdres) {
    this.functieAdres = functieAdres;
  }


  public Verblijfplaats indicatieVestigingVanuitBuitenland(Boolean indicatieVestigingVanuitBuitenland) {
    
    this.indicatieVestigingVanuitBuitenland = indicatieVestigingVanuitBuitenland;
    return this;
  }

   /**
   * Geeft aan dat de ingeschreven persoon zich vanuit het buitenland heeft ingeschreven. 
   * @return indicatieVestigingVanuitBuitenland
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Geeft aan dat de ingeschreven persoon zich vanuit het buitenland heeft ingeschreven. ")

  public Boolean getIndicatieVestigingVanuitBuitenland() {
    return indicatieVestigingVanuitBuitenland;
  }


  public void setIndicatieVestigingVanuitBuitenland(Boolean indicatieVestigingVanuitBuitenland) {
    this.indicatieVestigingVanuitBuitenland = indicatieVestigingVanuitBuitenland;
  }


  public Verblijfplaats locatiebeschrijving(String locatiebeschrijving) {
    
    this.locatiebeschrijving = locatiebeschrijving;
    return this;
  }

   /**
   * Omschrijving van de ligging van een verblijfsobject, standplaats of ligplaats. 
   * @return locatiebeschrijving
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Naast de derde brug", value = "Omschrijving van de ligging van een verblijfsobject, standplaats of ligplaats. ")

  public String getLocatiebeschrijving() {
    return locatiebeschrijving;
  }


  public void setLocatiebeschrijving(String locatiebeschrijving) {
    this.locatiebeschrijving = locatiebeschrijving;
  }


  public Verblijfplaats korteNaam(String korteNaam) {
    
    this.korteNaam = korteNaam;
    return this;
  }

   /**
   * De officiële openbareruimtenaam uit de Basisregistratie Gebouwen en Adressen (BAG) of een verkorte versie. 
   * @return korteNaam
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "De officiële openbareruimtenaam uit de Basisregistratie Gebouwen en Adressen (BAG) of een verkorte versie. ")

  public String getKorteNaam() {
    return korteNaam;
  }


  public void setKorteNaam(String korteNaam) {
    this.korteNaam = korteNaam;
  }


  public Verblijfplaats vanuitVertrokkenOnbekendWaarheen(Boolean vanuitVertrokkenOnbekendWaarheen) {
    
    this.vanuitVertrokkenOnbekendWaarheen = vanuitVertrokkenOnbekendWaarheen;
    return this;
  }

   /**
   * Geeft aan dat de persoon is teruggekeerd uit een situatie van &#39;vertrokken onbekend waarheen.&#39; 
   * @return vanuitVertrokkenOnbekendWaarheen
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Geeft aan dat de persoon is teruggekeerd uit een situatie van 'vertrokken onbekend waarheen.' ")

  public Boolean getVanuitVertrokkenOnbekendWaarheen() {
    return vanuitVertrokkenOnbekendWaarheen;
  }


  public void setVanuitVertrokkenOnbekendWaarheen(Boolean vanuitVertrokkenOnbekendWaarheen) {
    this.vanuitVertrokkenOnbekendWaarheen = vanuitVertrokkenOnbekendWaarheen;
  }


  public Verblijfplaats datumAanvangAdreshouding(DatumOnvolledig datumAanvangAdreshouding) {
    
    this.datumAanvangAdreshouding = datumAanvangAdreshouding;
    return this;
  }

   /**
   * Get datumAanvangAdreshouding
   * @return datumAanvangAdreshouding
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DatumOnvolledig getDatumAanvangAdreshouding() {
    return datumAanvangAdreshouding;
  }


  public void setDatumAanvangAdreshouding(DatumOnvolledig datumAanvangAdreshouding) {
    this.datumAanvangAdreshouding = datumAanvangAdreshouding;
  }


  public Verblijfplaats datumIngangGeldigheid(DatumOnvolledig datumIngangGeldigheid) {
    
    this.datumIngangGeldigheid = datumIngangGeldigheid;
    return this;
  }

   /**
   * Get datumIngangGeldigheid
   * @return datumIngangGeldigheid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DatumOnvolledig getDatumIngangGeldigheid() {
    return datumIngangGeldigheid;
  }


  public void setDatumIngangGeldigheid(DatumOnvolledig datumIngangGeldigheid) {
    this.datumIngangGeldigheid = datumIngangGeldigheid;
  }


  public Verblijfplaats datumInschrijvingInGemeente(DatumOnvolledig datumInschrijvingInGemeente) {
    
    this.datumInschrijvingInGemeente = datumInschrijvingInGemeente;
    return this;
  }

   /**
   * Get datumInschrijvingInGemeente
   * @return datumInschrijvingInGemeente
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DatumOnvolledig getDatumInschrijvingInGemeente() {
    return datumInschrijvingInGemeente;
  }


  public void setDatumInschrijvingInGemeente(DatumOnvolledig datumInschrijvingInGemeente) {
    this.datumInschrijvingInGemeente = datumInschrijvingInGemeente;
  }


  public Verblijfplaats datumVestigingInNederland(DatumOnvolledig datumVestigingInNederland) {
    
    this.datumVestigingInNederland = datumVestigingInNederland;
    return this;
  }

   /**
   * Get datumVestigingInNederland
   * @return datumVestigingInNederland
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DatumOnvolledig getDatumVestigingInNederland() {
    return datumVestigingInNederland;
  }


  public void setDatumVestigingInNederland(DatumOnvolledig datumVestigingInNederland) {
    this.datumVestigingInNederland = datumVestigingInNederland;
  }


  public Verblijfplaats gemeenteVanInschrijving(Waardetabel gemeenteVanInschrijving) {
    
    this.gemeenteVanInschrijving = gemeenteVanInschrijving;
    return this;
  }

   /**
   * Get gemeenteVanInschrijving
   * @return gemeenteVanInschrijving
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Waardetabel getGemeenteVanInschrijving() {
    return gemeenteVanInschrijving;
  }


  public void setGemeenteVanInschrijving(Waardetabel gemeenteVanInschrijving) {
    this.gemeenteVanInschrijving = gemeenteVanInschrijving;
  }


  public Verblijfplaats landVanwaarIngeschreven(Waardetabel landVanwaarIngeschreven) {
    
    this.landVanwaarIngeschreven = landVanwaarIngeschreven;
    return this;
  }

   /**
   * Get landVanwaarIngeschreven
   * @return landVanwaarIngeschreven
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Waardetabel getLandVanwaarIngeschreven() {
    return landVanwaarIngeschreven;
  }


  public void setLandVanwaarIngeschreven(Waardetabel landVanwaarIngeschreven) {
    this.landVanwaarIngeschreven = landVanwaarIngeschreven;
  }


  public Verblijfplaats adresregel1(String adresregel1) {
    
    this.adresregel1 = adresregel1;
    return this;
  }

   /**
   * Het eerste deel van een adres is een combinatie van de straat en huisnummer. 
   * @return adresregel1
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Laan van de landinrichtingscommissie Duiven-Westervoort 26A-3", value = "Het eerste deel van een adres is een combinatie van de straat en huisnummer. ")

  public String getAdresregel1() {
    return adresregel1;
  }


  public void setAdresregel1(String adresregel1) {
    this.adresregel1 = adresregel1;
  }


  public Verblijfplaats adresregel2(String adresregel2) {
    
    this.adresregel2 = adresregel2;
    return this;
  }

   /**
   * Het tweede deel van een adres is een combinatie van woonplaats eventueel in combinatie met de postcode. 
   * @return adresregel2
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1234AA Nootdorp", value = "Het tweede deel van een adres is een combinatie van woonplaats eventueel in combinatie met de postcode. ")

  public String getAdresregel2() {
    return adresregel2;
  }


  public void setAdresregel2(String adresregel2) {
    this.adresregel2 = adresregel2;
  }


  public Verblijfplaats adresregel3(String adresregel3) {
    
    this.adresregel3 = adresregel3;
    return this;
  }

   /**
   * Het derde deel van een adres is optioneel. Het gaat om een of meer geografische gebieden van het adres in het buitenland. 
   * @return adresregel3
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Selangor", value = "Het derde deel van een adres is optioneel. Het gaat om een of meer geografische gebieden van het adres in het buitenland. ")

  public String getAdresregel3() {
    return adresregel3;
  }


  public void setAdresregel3(String adresregel3) {
    this.adresregel3 = adresregel3;
  }


  public Verblijfplaats vertrokkenOnbekendWaarheen(Boolean vertrokkenOnbekendWaarheen) {
    
    this.vertrokkenOnbekendWaarheen = vertrokkenOnbekendWaarheen;
    return this;
  }

   /**
   * Indicatie dat de ingeschreven persoon is vertrokken naar het buitenland, maar dat niet bekend is waar naar toe. 
   * @return vertrokkenOnbekendWaarheen
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicatie dat de ingeschreven persoon is vertrokken naar het buitenland, maar dat niet bekend is waar naar toe. ")

  public Boolean getVertrokkenOnbekendWaarheen() {
    return vertrokkenOnbekendWaarheen;
  }


  public void setVertrokkenOnbekendWaarheen(Boolean vertrokkenOnbekendWaarheen) {
    this.vertrokkenOnbekendWaarheen = vertrokkenOnbekendWaarheen;
  }


  public Verblijfplaats land(Waardetabel land) {
    
    this.land = land;
    return this;
  }

   /**
   * Get land
   * @return land
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Waardetabel getLand() {
    return land;
  }


  public void setLand(Waardetabel land) {
    this.land = land;
  }


  public Verblijfplaats inOnderzoek(VerblijfplaatsInOnderzoek inOnderzoek) {
    
    this.inOnderzoek = inOnderzoek;
    return this;
  }

   /**
   * Get inOnderzoek
   * @return inOnderzoek
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VerblijfplaatsInOnderzoek getInOnderzoek() {
    return inOnderzoek;
  }


  public void setInOnderzoek(VerblijfplaatsInOnderzoek inOnderzoek) {
    this.inOnderzoek = inOnderzoek;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Verblijfplaats verblijfplaats = (Verblijfplaats) o;
    return Objects.equals(this.straat, verblijfplaats.straat) &&
        Objects.equals(this.huisnummer, verblijfplaats.huisnummer) &&
        Objects.equals(this.huisletter, verblijfplaats.huisletter) &&
        Objects.equals(this.huisnummertoevoeging, verblijfplaats.huisnummertoevoeging) &&
        Objects.equals(this.postcode, verblijfplaats.postcode) &&
        Objects.equals(this.woonplaats, verblijfplaats.woonplaats) &&
        Objects.equals(this.adresseerbaarObjectIdentificatie, verblijfplaats.adresseerbaarObjectIdentificatie) &&
        Objects.equals(this.aanduidingBijHuisnummer, verblijfplaats.aanduidingBijHuisnummer) &&
        Objects.equals(this.nummeraanduidingIdentificatie, verblijfplaats.nummeraanduidingIdentificatie) &&
        Objects.equals(this.functieAdres, verblijfplaats.functieAdres) &&
        Objects.equals(this.indicatieVestigingVanuitBuitenland, verblijfplaats.indicatieVestigingVanuitBuitenland) &&
        Objects.equals(this.locatiebeschrijving, verblijfplaats.locatiebeschrijving) &&
        Objects.equals(this.korteNaam, verblijfplaats.korteNaam) &&
        Objects.equals(this.vanuitVertrokkenOnbekendWaarheen, verblijfplaats.vanuitVertrokkenOnbekendWaarheen) &&
        Objects.equals(this.datumAanvangAdreshouding, verblijfplaats.datumAanvangAdreshouding) &&
        Objects.equals(this.datumIngangGeldigheid, verblijfplaats.datumIngangGeldigheid) &&
        Objects.equals(this.datumInschrijvingInGemeente, verblijfplaats.datumInschrijvingInGemeente) &&
        Objects.equals(this.datumVestigingInNederland, verblijfplaats.datumVestigingInNederland) &&
        Objects.equals(this.gemeenteVanInschrijving, verblijfplaats.gemeenteVanInschrijving) &&
        Objects.equals(this.landVanwaarIngeschreven, verblijfplaats.landVanwaarIngeschreven) &&
        Objects.equals(this.adresregel1, verblijfplaats.adresregel1) &&
        Objects.equals(this.adresregel2, verblijfplaats.adresregel2) &&
        Objects.equals(this.adresregel3, verblijfplaats.adresregel3) &&
        Objects.equals(this.vertrokkenOnbekendWaarheen, verblijfplaats.vertrokkenOnbekendWaarheen) &&
        Objects.equals(this.land, verblijfplaats.land) &&
        Objects.equals(this.inOnderzoek, verblijfplaats.inOnderzoek);
  }

  @Override
  public int hashCode() {
    return Objects.hash(straat, huisnummer, huisletter, huisnummertoevoeging, postcode, woonplaats, adresseerbaarObjectIdentificatie, aanduidingBijHuisnummer, nummeraanduidingIdentificatie, functieAdres, indicatieVestigingVanuitBuitenland, locatiebeschrijving, korteNaam, vanuitVertrokkenOnbekendWaarheen, datumAanvangAdreshouding, datumIngangGeldigheid, datumInschrijvingInGemeente, datumVestigingInNederland, gemeenteVanInschrijving, landVanwaarIngeschreven, adresregel1, adresregel2, adresregel3, vertrokkenOnbekendWaarheen, land, inOnderzoek);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Verblijfplaats {\n");
    sb.append("    straat: ").append(toIndentedString(straat)).append("\n");
    sb.append("    huisnummer: ").append(toIndentedString(huisnummer)).append("\n");
    sb.append("    huisletter: ").append(toIndentedString(huisletter)).append("\n");
    sb.append("    huisnummertoevoeging: ").append(toIndentedString(huisnummertoevoeging)).append("\n");
    sb.append("    postcode: ").append(toIndentedString(postcode)).append("\n");
    sb.append("    woonplaats: ").append(toIndentedString(woonplaats)).append("\n");
    sb.append("    adresseerbaarObjectIdentificatie: ").append(toIndentedString(adresseerbaarObjectIdentificatie)).append("\n");
    sb.append("    aanduidingBijHuisnummer: ").append(toIndentedString(aanduidingBijHuisnummer)).append("\n");
    sb.append("    nummeraanduidingIdentificatie: ").append(toIndentedString(nummeraanduidingIdentificatie)).append("\n");
    sb.append("    functieAdres: ").append(toIndentedString(functieAdres)).append("\n");
    sb.append("    indicatieVestigingVanuitBuitenland: ").append(toIndentedString(indicatieVestigingVanuitBuitenland)).append("\n");
    sb.append("    locatiebeschrijving: ").append(toIndentedString(locatiebeschrijving)).append("\n");
    sb.append("    korteNaam: ").append(toIndentedString(korteNaam)).append("\n");
    sb.append("    vanuitVertrokkenOnbekendWaarheen: ").append(toIndentedString(vanuitVertrokkenOnbekendWaarheen)).append("\n");
    sb.append("    datumAanvangAdreshouding: ").append(toIndentedString(datumAanvangAdreshouding)).append("\n");
    sb.append("    datumIngangGeldigheid: ").append(toIndentedString(datumIngangGeldigheid)).append("\n");
    sb.append("    datumInschrijvingInGemeente: ").append(toIndentedString(datumInschrijvingInGemeente)).append("\n");
    sb.append("    datumVestigingInNederland: ").append(toIndentedString(datumVestigingInNederland)).append("\n");
    sb.append("    gemeenteVanInschrijving: ").append(toIndentedString(gemeenteVanInschrijving)).append("\n");
    sb.append("    landVanwaarIngeschreven: ").append(toIndentedString(landVanwaarIngeschreven)).append("\n");
    sb.append("    adresregel1: ").append(toIndentedString(adresregel1)).append("\n");
    sb.append("    adresregel2: ").append(toIndentedString(adresregel2)).append("\n");
    sb.append("    adresregel3: ").append(toIndentedString(adresregel3)).append("\n");
    sb.append("    vertrokkenOnbekendWaarheen: ").append(toIndentedString(vertrokkenOnbekendWaarheen)).append("\n");
    sb.append("    land: ").append(toIndentedString(land)).append("\n");
    sb.append("    inOnderzoek: ").append(toIndentedString(inOnderzoek)).append("\n");
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

