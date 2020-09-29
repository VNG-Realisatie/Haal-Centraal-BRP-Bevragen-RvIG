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
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.KindHal;

/**
 * KindHalCollectieEmbedded
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-09-21T14:20:17.398Z[Etc/UTC]")
public class KindHalCollectieEmbedded {
  public static final String SERIALIZED_NAME_KINDEREN = "kinderen";
  @SerializedName(SERIALIZED_NAME_KINDEREN)
  private List<KindHal> kinderen = null;


  public KindHalCollectieEmbedded kinderen(List<KindHal> kinderen) {
    
    this.kinderen = kinderen;
    return this;
  }

  public KindHalCollectieEmbedded addKinderenItem(KindHal kinderenItem) {
    if (this.kinderen == null) {
      this.kinderen = new ArrayList<>();
    }
    this.kinderen.add(kinderenItem);
    return this;
  }

   /**
   * Get kinderen
   * @return kinderen
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<KindHal> getKinderen() {
    return kinderen;
  }


  public void setKinderen(List<KindHal> kinderen) {
    this.kinderen = kinderen;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KindHalCollectieEmbedded kindHalCollectieEmbedded = (KindHalCollectieEmbedded) o;
    return Objects.equals(this.kinderen, kindHalCollectieEmbedded.kinderen);
  }

  @Override
  public int hashCode() {
    return Objects.hash(kinderen);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KindHalCollectieEmbedded {\n");
    sb.append("    kinderen: ").append(toIndentedString(kinderen)).append("\n");
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

