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
import org.openapitools.client.model.NaamPersoonInOnderzoek;
import org.openapitools.client.model.NaamgebruikEnum;

/**
 * NaamPersoonAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-02-22T08:37:05.945Z[Etc/UTC]")
public class NaamPersoonAllOf {
  public static final String SERIALIZED_NAME_AANDUIDING_NAAMGEBRUIK = "aanduidingNaamgebruik";
  @SerializedName(SERIALIZED_NAME_AANDUIDING_NAAMGEBRUIK)
  private NaamgebruikEnum aanduidingNaamgebruik;

  public static final String SERIALIZED_NAME_IN_ONDERZOEK = "inOnderzoek";
  @SerializedName(SERIALIZED_NAME_IN_ONDERZOEK)
  private NaamPersoonInOnderzoek inOnderzoek = null;


  public NaamPersoonAllOf aanduidingNaamgebruik(NaamgebruikEnum aanduidingNaamgebruik) {
    
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


  public NaamPersoonAllOf inOnderzoek(NaamPersoonInOnderzoek inOnderzoek) {
    
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NaamPersoonAllOf naamPersoonAllOf = (NaamPersoonAllOf) o;
    return Objects.equals(this.aanduidingNaamgebruik, naamPersoonAllOf.aanduidingNaamgebruik) &&
        Objects.equals(this.inOnderzoek, naamPersoonAllOf.inOnderzoek);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aanduidingNaamgebruik, inOnderzoek);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NaamPersoonAllOf {\n");
    sb.append("    aanduidingNaamgebruik: ").append(toIndentedString(aanduidingNaamgebruik)).append("\n");
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

