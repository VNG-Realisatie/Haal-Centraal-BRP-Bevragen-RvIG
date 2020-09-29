/*
 * Bevragingen ingeschreven personen
 * API voor het ontsluiten van gegevens van ingeschreven personen en aanverwante gegevens uit de GBA en RNI. Met deze API worden de actuele gegevens van ingeschreven personen, hun kinderen, partners en ouders ontsloten. <br> Heeft een persoon bijvoorbeeld geen geldige nationaliteit, dan wordt nationaliteit niet geretourneerd. <br> Heeft een persoon een beëindigd partnerschap of huwelijk, dan wordt de partner niet geretourneerd. <br> <br> Zie de [Functionele documentatie](https://github.com/VNG-Realisatie/Bevragingen-ingeschreven-personen/tree/master/features) voor nadere toelichting. <br> 
 *
 * The version of the OpenAPI document: 1.0.0
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
import org.openapitools.client.model.BinnenlandsAdres;
import org.openapitools.client.model.DatumOnvolledig;
import org.openapitools.client.model.SoortAdresEnum;
import org.openapitools.client.model.VerblijfBuitenland;
import org.openapitools.client.model.VerblijfplaatsAllOf;
import org.openapitools.client.model.VerblijfplaatsInOnderzoek;
import org.openapitools.client.model.Waardetabel;

/**
 * Verblijfplaats
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-09-21T14:20:17.398Z[Etc/UTC]")
public class Verblijfplaats {
  public static final String SERIALIZED_NAME_FUNCTIE_ADRES = "functieAdres";
  @SerializedName(SERIALIZED_NAME_FUNCTIE_ADRES)
  private SoortAdresEnum functieAdres;

  public static final String SERIALIZED_NAME_HUISLETTER = "huisletter";
  @SerializedName(SERIALIZED_NAME_HUISLETTER)
  private String huisletter;

  public static final String SERIALIZED_NAME_HUISNUMMER = "huisnummer";
  @SerializedName(SERIALIZED_NAME_HUISNUMMER)
  private Integer huisnummer;

  public static final String SERIALIZED_NAME_HUISNUMMERTOEVOEGING = "huisnummertoevoeging";
  @SerializedName(SERIALIZED_NAME_HUISNUMMERTOEVOEGING)
  private String huisnummertoevoeging;

  public static final String SERIALIZED_NAME_AANDUIDING_BIJ_HUISNUMMER = "aanduidingBijHuisnummer";
  @SerializedName(SERIALIZED_NAME_AANDUIDING_BIJ_HUISNUMMER)
  private AanduidingBijHuisnummerEnum aanduidingBijHuisnummer;

  public static final String SERIALIZED_NAME_IDENTIFICATIECODE_NUMMERAANDUIDING = "identificatiecodeNummeraanduiding";
  @SerializedName(SERIALIZED_NAME_IDENTIFICATIECODE_NUMMERAANDUIDING)
  private String identificatiecodeNummeraanduiding;

  public static final String SERIALIZED_NAME_NAAM_OPENBARE_RUIMTE = "naamOpenbareRuimte";
  @SerializedName(SERIALIZED_NAME_NAAM_OPENBARE_RUIMTE)
  private String naamOpenbareRuimte;

  public static final String SERIALIZED_NAME_POSTCODE = "postcode";
  @SerializedName(SERIALIZED_NAME_POSTCODE)
  private String postcode;

  public static final String SERIALIZED_NAME_WOONPLAATSNAAM = "woonplaatsnaam";
  @SerializedName(SERIALIZED_NAME_WOONPLAATSNAAM)
  private String woonplaatsnaam;

  public static final String SERIALIZED_NAME_IDENTIFICATIECODE_ADRESSEERBAAR_OBJECT = "identificatiecodeAdresseerbaarObject";
  @SerializedName(SERIALIZED_NAME_IDENTIFICATIECODE_ADRESSEERBAAR_OBJECT)
  private String identificatiecodeAdresseerbaarObject;

  public static final String SERIALIZED_NAME_INDICATIE_VESTIGING_VANUIT_BUITENLAND = "indicatieVestigingVanuitBuitenland";
  @SerializedName(SERIALIZED_NAME_INDICATIE_VESTIGING_VANUIT_BUITENLAND)
  private Boolean indicatieVestigingVanuitBuitenland;

  public static final String SERIALIZED_NAME_LOCATIEBESCHRIJVING = "locatiebeschrijving";
  @SerializedName(SERIALIZED_NAME_LOCATIEBESCHRIJVING)
  private String locatiebeschrijving;

  public static final String SERIALIZED_NAME_STRAATNAAM = "straatnaam";
  @SerializedName(SERIALIZED_NAME_STRAATNAAM)
  private String straatnaam;

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

  public static final String SERIALIZED_NAME_VERBLIJF_BUITENLAND = "verblijfBuitenland";
  @SerializedName(SERIALIZED_NAME_VERBLIJF_BUITENLAND)
  private VerblijfBuitenland verblijfBuitenland;

  public static final String SERIALIZED_NAME_IN_ONDERZOEK = "inOnderzoek";
  @SerializedName(SERIALIZED_NAME_IN_ONDERZOEK)
  private VerblijfplaatsInOnderzoek inOnderzoek;


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


  public Verblijfplaats huisletter(String huisletter) {
    
    this.huisletter = huisletter;
    return this;
  }

   /**
   * Een door of namens het bevoegd gemeentelijk orgaan ten aanzien van een adresseerbaar object toegekende toevoeging aan een huisnummer in de vorm van een alfanumeriek teken. a - z , A – Z
   * @return huisletter
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "B", value = "Een door of namens het bevoegd gemeentelijk orgaan ten aanzien van een adresseerbaar object toegekende toevoeging aan een huisnummer in de vorm van een alfanumeriek teken. a - z , A – Z")

  public String getHuisletter() {
    return huisletter;
  }


  public void setHuisletter(String huisletter) {
    this.huisletter = huisletter;
  }


  public Verblijfplaats huisnummer(Integer huisnummer) {
    
    this.huisnummer = huisnummer;
    return this;
  }

   /**
   * Een door of namens het bevoegd gemeentelijk orgaan ten aanzien van een adresseerbaar object toegekende nummering. Alle natuurlijke getallen tussen 1 en 99999.
   * maximum: 99999
   * @return huisnummer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "23", value = "Een door of namens het bevoegd gemeentelijk orgaan ten aanzien van een adresseerbaar object toegekende nummering. Alle natuurlijke getallen tussen 1 en 99999.")

  public Integer getHuisnummer() {
    return huisnummer;
  }


  public void setHuisnummer(Integer huisnummer) {
    this.huisnummer = huisnummer;
  }


  public Verblijfplaats huisnummertoevoeging(String huisnummertoevoeging) {
    
    this.huisnummertoevoeging = huisnummertoevoeging;
    return this;
  }

   /**
   * Een door of namens het bevoegd gemeentelijk orgaan ten aanzien van een adresseerbaar object toegekende nadere toevoeging aan een huisnummer of een combinatie van huisnummer en huisletter. a - z , A - Z , 0 – 9
   * @return huisnummertoevoeging
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "IV", value = "Een door of namens het bevoegd gemeentelijk orgaan ten aanzien van een adresseerbaar object toegekende nadere toevoeging aan een huisnummer of een combinatie van huisnummer en huisletter. a - z , A - Z , 0 – 9")

  public String getHuisnummertoevoeging() {
    return huisnummertoevoeging;
  }


  public void setHuisnummertoevoeging(String huisnummertoevoeging) {
    this.huisnummertoevoeging = huisnummertoevoeging;
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


  public Verblijfplaats identificatiecodeNummeraanduiding(String identificatiecodeNummeraanduiding) {
    
    this.identificatiecodeNummeraanduiding = identificatiecodeNummeraanduiding;
    return this;
  }

   /**
   * De unieke aanduiding van een NUMMERAANDUIDING. Combinatie van de viercijferige &#39;gemeentecode&#39; de tweecijferige &#39;objecttypecode&#39; en een voor het betreffende objecttype binnen een gemeente uniek tiencijferig &#39;objectvolgnummer&#39;. De objecttypecode kent in de BAG de volgende waarde:20 nummeraanduiding. Combinatie van de viercijferige &#39;gemeentecode&#39; (volgens GBA tabel 33, Gemeententabel), de tweecijferige &#39;objecttypecode&#39; en een voor het betreffende objecttype binnen een gemeente uniek tiencijferig &#39;objectvolgnummer&#39;. De objecttypecode kent in de BAG de volgende waarde:20 nummeraanduiding.
   * @return identificatiecodeNummeraanduiding
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0518200000366054", value = "De unieke aanduiding van een NUMMERAANDUIDING. Combinatie van de viercijferige 'gemeentecode' de tweecijferige 'objecttypecode' en een voor het betreffende objecttype binnen een gemeente uniek tiencijferig 'objectvolgnummer'. De objecttypecode kent in de BAG de volgende waarde:20 nummeraanduiding. Combinatie van de viercijferige 'gemeentecode' (volgens GBA tabel 33, Gemeententabel), de tweecijferige 'objecttypecode' en een voor het betreffende objecttype binnen een gemeente uniek tiencijferig 'objectvolgnummer'. De objecttypecode kent in de BAG de volgende waarde:20 nummeraanduiding.")

  public String getIdentificatiecodeNummeraanduiding() {
    return identificatiecodeNummeraanduiding;
  }


  public void setIdentificatiecodeNummeraanduiding(String identificatiecodeNummeraanduiding) {
    this.identificatiecodeNummeraanduiding = identificatiecodeNummeraanduiding;
  }


  public Verblijfplaats naamOpenbareRuimte(String naamOpenbareRuimte) {
    
    this.naamOpenbareRuimte = naamOpenbareRuimte;
    return this;
  }

   /**
   * Een door het bevoegde gemeentelijke orgaan aan een OPENBARE RUIMTE toegekende benaming Tekens gecodeerd volgens de UTF-8 standaard
   * @return naamOpenbareRuimte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Loosduinsekade", value = "Een door het bevoegde gemeentelijke orgaan aan een OPENBARE RUIMTE toegekende benaming Tekens gecodeerd volgens de UTF-8 standaard")

  public String getNaamOpenbareRuimte() {
    return naamOpenbareRuimte;
  }


  public void setNaamOpenbareRuimte(String naamOpenbareRuimte) {
    this.naamOpenbareRuimte = naamOpenbareRuimte;
  }


  public Verblijfplaats postcode(String postcode) {
    
    this.postcode = postcode;
    return this;
  }

   /**
   * De door PostNL vastgestelde code behorende bij een bepaalde combinatie van een naam van een woonplaats, naam van een openbare ruimte en een huisnummer
   * @return postcode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2571CC", value = "De door PostNL vastgestelde code behorende bij een bepaalde combinatie van een naam van een woonplaats, naam van een openbare ruimte en een huisnummer")

  public String getPostcode() {
    return postcode;
  }


  public void setPostcode(String postcode) {
    this.postcode = postcode;
  }


  public Verblijfplaats woonplaatsnaam(String woonplaatsnaam) {
    
    this.woonplaatsnaam = woonplaatsnaam;
    return this;
  }

   /**
   * De door het bevoegde gemeentelijke orgaan aan een WOONPLAATS toegekende benaming. Tekens gecodeerd volgens de UTF-8 standaard.
   * @return woonplaatsnaam
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Utrecht", value = "De door het bevoegde gemeentelijke orgaan aan een WOONPLAATS toegekende benaming. Tekens gecodeerd volgens de UTF-8 standaard.")

  public String getWoonplaatsnaam() {
    return woonplaatsnaam;
  }


  public void setWoonplaatsnaam(String woonplaatsnaam) {
    this.woonplaatsnaam = woonplaatsnaam;
  }


  public Verblijfplaats identificatiecodeAdresseerbaarObject(String identificatiecodeAdresseerbaarObject) {
    
    this.identificatiecodeAdresseerbaarObject = identificatiecodeAdresseerbaarObject;
    return this;
  }

   /**
   * Een verblijfplaats kan een ligplaats, een standplaats of een verblijfsobject in een of meerdere panden zijn, waaraan respectievelijk een ligplaatsidentificatie, standplaatsidentificatie of verblijfsobjectidentificatie is toegekend. De Identificatiecode verblijfplaats is een combinatie van een viercijferige gemeentecode, een tweecijferige objecttypecode die aangeeft of de aanduiding een verblijfsobject (01), ligplaats (02) of standplaats (03) betreft en een voor het betreffende objecttype binnen een gemeente uniek tiencijferig volgnummer. Combinatie van de viercijferige &#39;gemeentecode&#39; (volgens GBA tabel 33, Gemeententabel), de tweecijferige &#39;objecttypecode&#39; en een voor het betreffende objecttype binnen een gemeente uniek tiencijferig &#39;objectvolgnummer&#39;.
   * @return identificatiecodeAdresseerbaarObject
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0518200000366054", value = "Een verblijfplaats kan een ligplaats, een standplaats of een verblijfsobject in een of meerdere panden zijn, waaraan respectievelijk een ligplaatsidentificatie, standplaatsidentificatie of verblijfsobjectidentificatie is toegekend. De Identificatiecode verblijfplaats is een combinatie van een viercijferige gemeentecode, een tweecijferige objecttypecode die aangeeft of de aanduiding een verblijfsobject (01), ligplaats (02) of standplaats (03) betreft en een voor het betreffende objecttype binnen een gemeente uniek tiencijferig volgnummer. Combinatie van de viercijferige 'gemeentecode' (volgens GBA tabel 33, Gemeententabel), de tweecijferige 'objecttypecode' en een voor het betreffende objecttype binnen een gemeente uniek tiencijferig 'objectvolgnummer'.")

  public String getIdentificatiecodeAdresseerbaarObject() {
    return identificatiecodeAdresseerbaarObject;
  }


  public void setIdentificatiecodeAdresseerbaarObject(String identificatiecodeAdresseerbaarObject) {
    this.identificatiecodeAdresseerbaarObject = identificatiecodeAdresseerbaarObject;
  }


  public Verblijfplaats indicatieVestigingVanuitBuitenland(Boolean indicatieVestigingVanuitBuitenland) {
    
    this.indicatieVestigingVanuitBuitenland = indicatieVestigingVanuitBuitenland;
    return this;
  }

   /**
   * Indicatie waarmee aangegeven wordt of de ingeschreven persoon zich vanuit het buitenland heeftingeschreven. Deze indicatie heeft als rol om aan te geven dat iemand zich vanuit het buitenland gevestigd heeft. Deze indicator wordt altijd meegeleverd als de waarde true is. Als de waarde false is wordt de indicator niet meegeleverd.
   * @return indicatieVestigingVanuitBuitenland
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicatie waarmee aangegeven wordt of de ingeschreven persoon zich vanuit het buitenland heeftingeschreven. Deze indicatie heeft als rol om aan te geven dat iemand zich vanuit het buitenland gevestigd heeft. Deze indicator wordt altijd meegeleverd als de waarde true is. Als de waarde false is wordt de indicator niet meegeleverd.")

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
   * Een geheel of gedeeltelijke omschrijving van de ligging van een object.
   * @return locatiebeschrijving
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Naast de derde brug", value = "Een geheel of gedeeltelijke omschrijving van de ligging van een object.")

  public String getLocatiebeschrijving() {
    return locatiebeschrijving;
  }


  public void setLocatiebeschrijving(String locatiebeschrijving) {
    this.locatiebeschrijving = locatiebeschrijving;
  }


  public Verblijfplaats straatnaam(String straatnaam) {
    
    this.straatnaam = straatnaam;
    return this;
  }

   /**
   * De officiële straatnaam zoals door het bevoegd gemeentelijk orgaan is vastgesteld, zo nodig ingekort conform de specificaties van de NEN 5825. alle alfanumrieke tekens
   * @return straatnaam
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "De officiële straatnaam zoals door het bevoegd gemeentelijk orgaan is vastgesteld, zo nodig ingekort conform de specificaties van de NEN 5825. alle alfanumrieke tekens")

  public String getStraatnaam() {
    return straatnaam;
  }


  public void setStraatnaam(String straatnaam) {
    this.straatnaam = straatnaam;
  }


  public Verblijfplaats vanuitVertrokkenOnbekendWaarheen(Boolean vanuitVertrokkenOnbekendWaarheen) {
    
    this.vanuitVertrokkenOnbekendWaarheen = vanuitVertrokkenOnbekendWaarheen;
    return this;
  }

   /**
   * Indicatie waarmee aangegeven wordt dat de persoon is teruggekeerd uit een situatie van vertrokken onbekend waarheen
   * @return vanuitVertrokkenOnbekendWaarheen
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Indicatie waarmee aangegeven wordt dat de persoon is teruggekeerd uit een situatie van vertrokken onbekend waarheen")

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


  public Verblijfplaats verblijfBuitenland(VerblijfBuitenland verblijfBuitenland) {
    
    this.verblijfBuitenland = verblijfBuitenland;
    return this;
  }

   /**
   * Get verblijfBuitenland
   * @return verblijfBuitenland
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VerblijfBuitenland getVerblijfBuitenland() {
    return verblijfBuitenland;
  }


  public void setVerblijfBuitenland(VerblijfBuitenland verblijfBuitenland) {
    this.verblijfBuitenland = verblijfBuitenland;
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
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Verblijfplaats verblijfplaats = (Verblijfplaats) o;
    return Objects.equals(this.functieAdres, verblijfplaats.functieAdres) &&
        Objects.equals(this.huisletter, verblijfplaats.huisletter) &&
        Objects.equals(this.huisnummer, verblijfplaats.huisnummer) &&
        Objects.equals(this.huisnummertoevoeging, verblijfplaats.huisnummertoevoeging) &&
        Objects.equals(this.aanduidingBijHuisnummer, verblijfplaats.aanduidingBijHuisnummer) &&
        Objects.equals(this.identificatiecodeNummeraanduiding, verblijfplaats.identificatiecodeNummeraanduiding) &&
        Objects.equals(this.naamOpenbareRuimte, verblijfplaats.naamOpenbareRuimte) &&
        Objects.equals(this.postcode, verblijfplaats.postcode) &&
        Objects.equals(this.woonplaatsnaam, verblijfplaats.woonplaatsnaam) &&
        Objects.equals(this.identificatiecodeAdresseerbaarObject, verblijfplaats.identificatiecodeAdresseerbaarObject) &&
        Objects.equals(this.indicatieVestigingVanuitBuitenland, verblijfplaats.indicatieVestigingVanuitBuitenland) &&
        Objects.equals(this.locatiebeschrijving, verblijfplaats.locatiebeschrijving) &&
        Objects.equals(this.straatnaam, verblijfplaats.straatnaam) &&
        Objects.equals(this.vanuitVertrokkenOnbekendWaarheen, verblijfplaats.vanuitVertrokkenOnbekendWaarheen) &&
        Objects.equals(this.datumAanvangAdreshouding, verblijfplaats.datumAanvangAdreshouding) &&
        Objects.equals(this.datumIngangGeldigheid, verblijfplaats.datumIngangGeldigheid) &&
        Objects.equals(this.datumInschrijvingInGemeente, verblijfplaats.datumInschrijvingInGemeente) &&
        Objects.equals(this.datumVestigingInNederland, verblijfplaats.datumVestigingInNederland) &&
        Objects.equals(this.gemeenteVanInschrijving, verblijfplaats.gemeenteVanInschrijving) &&
        Objects.equals(this.landVanwaarIngeschreven, verblijfplaats.landVanwaarIngeschreven) &&
        Objects.equals(this.verblijfBuitenland, verblijfplaats.verblijfBuitenland) &&
        Objects.equals(this.inOnderzoek, verblijfplaats.inOnderzoek);
  }

  @Override
  public int hashCode() {
    return Objects.hash(functieAdres, huisletter, huisnummer, huisnummertoevoeging, aanduidingBijHuisnummer, identificatiecodeNummeraanduiding, naamOpenbareRuimte, postcode, woonplaatsnaam, identificatiecodeAdresseerbaarObject, indicatieVestigingVanuitBuitenland, locatiebeschrijving, straatnaam, vanuitVertrokkenOnbekendWaarheen, datumAanvangAdreshouding, datumIngangGeldigheid, datumInschrijvingInGemeente, datumVestigingInNederland, gemeenteVanInschrijving, landVanwaarIngeschreven, verblijfBuitenland, inOnderzoek);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Verblijfplaats {\n");
    sb.append("    functieAdres: ").append(toIndentedString(functieAdres)).append("\n");
    sb.append("    huisletter: ").append(toIndentedString(huisletter)).append("\n");
    sb.append("    huisnummer: ").append(toIndentedString(huisnummer)).append("\n");
    sb.append("    huisnummertoevoeging: ").append(toIndentedString(huisnummertoevoeging)).append("\n");
    sb.append("    aanduidingBijHuisnummer: ").append(toIndentedString(aanduidingBijHuisnummer)).append("\n");
    sb.append("    identificatiecodeNummeraanduiding: ").append(toIndentedString(identificatiecodeNummeraanduiding)).append("\n");
    sb.append("    naamOpenbareRuimte: ").append(toIndentedString(naamOpenbareRuimte)).append("\n");
    sb.append("    postcode: ").append(toIndentedString(postcode)).append("\n");
    sb.append("    woonplaatsnaam: ").append(toIndentedString(woonplaatsnaam)).append("\n");
    sb.append("    identificatiecodeAdresseerbaarObject: ").append(toIndentedString(identificatiecodeAdresseerbaarObject)).append("\n");
    sb.append("    indicatieVestigingVanuitBuitenland: ").append(toIndentedString(indicatieVestigingVanuitBuitenland)).append("\n");
    sb.append("    locatiebeschrijving: ").append(toIndentedString(locatiebeschrijving)).append("\n");
    sb.append("    straatnaam: ").append(toIndentedString(straatnaam)).append("\n");
    sb.append("    vanuitVertrokkenOnbekendWaarheen: ").append(toIndentedString(vanuitVertrokkenOnbekendWaarheen)).append("\n");
    sb.append("    datumAanvangAdreshouding: ").append(toIndentedString(datumAanvangAdreshouding)).append("\n");
    sb.append("    datumIngangGeldigheid: ").append(toIndentedString(datumIngangGeldigheid)).append("\n");
    sb.append("    datumInschrijvingInGemeente: ").append(toIndentedString(datumInschrijvingInGemeente)).append("\n");
    sb.append("    datumVestigingInNederland: ").append(toIndentedString(datumVestigingInNederland)).append("\n");
    sb.append("    gemeenteVanInschrijving: ").append(toIndentedString(gemeenteVanInschrijving)).append("\n");
    sb.append("    landVanwaarIngeschreven: ").append(toIndentedString(landVanwaarIngeschreven)).append("\n");
    sb.append("    verblijfBuitenland: ").append(toIndentedString(verblijfBuitenland)).append("\n");
    sb.append("    inOnderzoek: ").append(toIndentedString(inOnderzoek)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

