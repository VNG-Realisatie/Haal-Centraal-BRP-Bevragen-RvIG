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
import org.openapitools.client.model.DatumOnvolledig;
import org.openapitools.client.model.OverlijdenInOnderzoek;
import org.openapitools.client.model.Waardetabel;

/**
 * Gegevens over het overlijden van de persoon. * **datum** : datum waarop de persoon is overleden. * **land** : land waar de persoon is overleden. * **plaats** : plaats waar de persoon is overleden. Voor een plaats buiten Nederland is gemeentecode&#x3D;1999 (RNI) en gemeentenaam de buitenlandse plaatsnaam of aanduiding. 
 */
@ApiModel(description = "Gegevens over het overlijden van de persoon. * **datum** : datum waarop de persoon is overleden. * **land** : land waar de persoon is overleden. * **plaats** : plaats waar de persoon is overleden. Voor een plaats buiten Nederland is gemeentecode=1999 (RNI) en gemeentenaam de buitenlandse plaatsnaam of aanduiding. ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-02-22T08:37:05.945Z[Etc/UTC]")
public class Overlijden {
  public static final String SERIALIZED_NAME_INDICATIE_OVERLEDEN = "indicatieOverleden";
  @SerializedName(SERIALIZED_NAME_INDICATIE_OVERLEDEN)
  private Boolean indicatieOverleden;

  public static final String SERIALIZED_NAME_DATUM = "datum";
  @SerializedName(SERIALIZED_NAME_DATUM)
  private DatumOnvolledig datum;

  public static final String SERIALIZED_NAME_LAND = "land";
  @SerializedName(SERIALIZED_NAME_LAND)
  private Waardetabel land;

  public static final String SERIALIZED_NAME_PLAATS = "plaats";
  @SerializedName(SERIALIZED_NAME_PLAATS)
  private Waardetabel plaats;

  public static final String SERIALIZED_NAME_IN_ONDERZOEK = "inOnderzoek";
  @SerializedName(SERIALIZED_NAME_IN_ONDERZOEK)
  private OverlijdenInOnderzoek inOnderzoek;


  public Overlijden indicatieOverleden(Boolean indicatieOverleden) {
    
    this.indicatieOverleden = indicatieOverleden;
    return this;
  }

   /**
   * Geeft aan dat iemand is overleden (waarde true), ongeacht of de overlijdensdatum bekend is. 
   * @return indicatieOverleden
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Geeft aan dat iemand is overleden (waarde true), ongeacht of de overlijdensdatum bekend is. ")

  public Boolean getIndicatieOverleden() {
    return indicatieOverleden;
  }


  public void setIndicatieOverleden(Boolean indicatieOverleden) {
    this.indicatieOverleden = indicatieOverleden;
  }


  public Overlijden datum(DatumOnvolledig datum) {
    
    this.datum = datum;
    return this;
  }

   /**
   * Get datum
   * @return datum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DatumOnvolledig getDatum() {
    return datum;
  }


  public void setDatum(DatumOnvolledig datum) {
    this.datum = datum;
  }


  public Overlijden land(Waardetabel land) {
    
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


  public Overlijden plaats(Waardetabel plaats) {
    
    this.plaats = plaats;
    return this;
  }

   /**
   * Get plaats
   * @return plaats
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Waardetabel getPlaats() {
    return plaats;
  }


  public void setPlaats(Waardetabel plaats) {
    this.plaats = plaats;
  }


  public Overlijden inOnderzoek(OverlijdenInOnderzoek inOnderzoek) {
    
    this.inOnderzoek = inOnderzoek;
    return this;
  }

   /**
   * Get inOnderzoek
   * @return inOnderzoek
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OverlijdenInOnderzoek getInOnderzoek() {
    return inOnderzoek;
  }


  public void setInOnderzoek(OverlijdenInOnderzoek inOnderzoek) {
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
    Overlijden overlijden = (Overlijden) o;
    return Objects.equals(this.indicatieOverleden, overlijden.indicatieOverleden) &&
        Objects.equals(this.datum, overlijden.datum) &&
        Objects.equals(this.land, overlijden.land) &&
        Objects.equals(this.plaats, overlijden.plaats) &&
        Objects.equals(this.inOnderzoek, overlijden.inOnderzoek);
  }

  @Override
  public int hashCode() {
    return Objects.hash(indicatieOverleden, datum, land, plaats, inOnderzoek);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Overlijden {\n");
    sb.append("    indicatieOverleden: ").append(toIndentedString(indicatieOverleden)).append("\n");
    sb.append("    datum: ").append(toIndentedString(datum)).append("\n");
    sb.append("    land: ").append(toIndentedString(land)).append("\n");
    sb.append("    plaats: ").append(toIndentedString(plaats)).append("\n");
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

