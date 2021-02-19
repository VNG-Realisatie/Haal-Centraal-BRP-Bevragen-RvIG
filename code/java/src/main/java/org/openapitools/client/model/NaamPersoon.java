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
import org.openapitools.client.model.Naam;
import org.openapitools.client.model.NaamPersoonAllOf;
import org.openapitools.client.model.NaamPersoonInOnderzoek;
import org.openapitools.client.model.NaamgebruikEnum;
import org.openapitools.client.model.Waardetabel;

/**
 * NaamPersoon
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-02-19T12:52:03.859Z[Etc/UTC]")
public class NaamPersoon {
  public static final String SERIALIZED_NAME_GESLACHTSNAAM = "geslachtsnaam";
  @SerializedName(SERIALIZED_NAME_GESLACHTSNAAM)
  private String geslachtsnaam;

  public static final String SERIALIZED_NAME_VOORNAMEN = "voornamen";
  @SerializedName(SERIALIZED_NAME_VOORNAMEN)
  private String voornamen;

  public static final String SERIALIZED_NAME_VOORVOEGSEL = "voorvoegsel";
  @SerializedName(SERIALIZED_NAME_VOORVOEGSEL)
  private String voorvoegsel;

  public static final String SERIALIZED_NAME_ADELLIJKE_TITEL_PREDIKAAT = "adellijkeTitelPredikaat";
  @SerializedName(SERIALIZED_NAME_ADELLIJKE_TITEL_PREDIKAAT)
  private Waardetabel adellijkeTitelPredikaat;

  public static final String SERIALIZED_NAME_IN_ONDERZOEK = "inOnderzoek";
  @SerializedName(SERIALIZED_NAME_IN_ONDERZOEK)
  private NaamPersoonInOnderzoek inOnderzoek = null;

  public static final String SERIALIZED_NAME_AANDUIDING_NAAMGEBRUIK = "aanduidingNaamgebruik";
  @SerializedName(SERIALIZED_NAME_AANDUIDING_NAAMGEBRUIK)
  private NaamgebruikEnum aanduidingNaamgebruik;


  public NaamPersoon geslachtsnaam(String geslachtsnaam) {
    
    this.geslachtsnaam = geslachtsnaam;
    return this;
  }

   /**
   * De achternaam van een persoon. 
   * @return geslachtsnaam
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Vries", value = "De achternaam van een persoon. ")

  public String getGeslachtsnaam() {
    return geslachtsnaam;
  }


  public void setGeslachtsnaam(String geslachtsnaam) {
    this.geslachtsnaam = geslachtsnaam;
  }


  public NaamPersoon voornamen(String voornamen) {
    
    this.voornamen = voornamen;
    return this;
  }

   /**
   * De verzameling namen voor de geslachtsnaam, gescheiden door spaties. 
   * @return voornamen
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Pieter Jan", value = "De verzameling namen voor de geslachtsnaam, gescheiden door spaties. ")

  public String getVoornamen() {
    return voornamen;
  }


  public void setVoornamen(String voornamen) {
    this.voornamen = voornamen;
  }


  public NaamPersoon voorvoegsel(String voorvoegsel) {
    
    this.voorvoegsel = voorvoegsel;
    return this;
  }

   /**
   * Get voorvoegsel
   * @return voorvoegsel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "de", value = "")

  public String getVoorvoegsel() {
    return voorvoegsel;
  }


  public void setVoorvoegsel(String voorvoegsel) {
    this.voorvoegsel = voorvoegsel;
  }


  public NaamPersoon adellijkeTitelPredikaat(Waardetabel adellijkeTitelPredikaat) {
    
    this.adellijkeTitelPredikaat = adellijkeTitelPredikaat;
    return this;
  }

   /**
   * Get adellijkeTitelPredikaat
   * @return adellijkeTitelPredikaat
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Waardetabel getAdellijkeTitelPredikaat() {
    return adellijkeTitelPredikaat;
  }


  public void setAdellijkeTitelPredikaat(Waardetabel adellijkeTitelPredikaat) {
    this.adellijkeTitelPredikaat = adellijkeTitelPredikaat;
  }


  public NaamPersoon inOnderzoek(NaamPersoonInOnderzoek inOnderzoek) {
    
    this.inOnderzoek = inOnderzoek;
    return this;
  }

   /**
   * Get inOnderzoek
   * @return inOnderzoek
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public NaamPersoonInOnderzoek getInOnderzoek() {
    return inOnderzoek;
  }


  public void setInOnderzoek(NaamPersoonInOnderzoek inOnderzoek) {
    this.inOnderzoek = inOnderzoek;
  }


  public NaamPersoon aanduidingNaamgebruik(NaamgebruikEnum aanduidingNaamgebruik) {
    
    this.aanduidingNaamgebruik = aanduidingNaamgebruik;
    return this;
  }

   /**
   * Get aanduidingNaamgebruik
   * @return aanduidingNaamgebruik
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public NaamgebruikEnum getAanduidingNaamgebruik() {
    return aanduidingNaamgebruik;
  }


  public void setAanduidingNaamgebruik(NaamgebruikEnum aanduidingNaamgebruik) {
    this.aanduidingNaamgebruik = aanduidingNaamgebruik;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NaamPersoon naamPersoon = (NaamPersoon) o;
    return Objects.equals(this.geslachtsnaam, naamPersoon.geslachtsnaam) &&
        Objects.equals(this.voornamen, naamPersoon.voornamen) &&
        Objects.equals(this.voorvoegsel, naamPersoon.voorvoegsel) &&
        Objects.equals(this.adellijkeTitelPredikaat, naamPersoon.adellijkeTitelPredikaat) &&
        Objects.equals(this.inOnderzoek, naamPersoon.inOnderzoek) &&
        Objects.equals(this.aanduidingNaamgebruik, naamPersoon.aanduidingNaamgebruik);
  }

  @Override
  public int hashCode() {
    return Objects.hash(geslachtsnaam, voornamen, voorvoegsel, adellijkeTitelPredikaat, inOnderzoek, aanduidingNaamgebruik);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NaamPersoon {\n");
    sb.append("    geslachtsnaam: ").append(toIndentedString(geslachtsnaam)).append("\n");
    sb.append("    voornamen: ").append(toIndentedString(voornamen)).append("\n");
    sb.append("    voorvoegsel: ").append(toIndentedString(voorvoegsel)).append("\n");
    sb.append("    adellijkeTitelPredikaat: ").append(toIndentedString(adellijkeTitelPredikaat)).append("\n");
    sb.append("    inOnderzoek: ").append(toIndentedString(inOnderzoek)).append("\n");
    sb.append("    aanduidingNaamgebruik: ").append(toIndentedString(aanduidingNaamgebruik)).append("\n");
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

