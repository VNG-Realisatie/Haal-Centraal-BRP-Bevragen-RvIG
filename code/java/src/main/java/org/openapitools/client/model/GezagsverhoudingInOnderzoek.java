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

/**
 * Geeft aan welke gegevens van de gezagsverhouding in onderzoek zijn. Zie de [functionele specificaties](https://github.com/VNG-Realisatie/Haal-Centraal-BRP-bevragen/blob/v1.1.0/features/in_onderzoek.feature) 
 */
@ApiModel(description = "Geeft aan welke gegevens van de gezagsverhouding in onderzoek zijn. Zie de [functionele specificaties](https://github.com/VNG-Realisatie/Haal-Centraal-BRP-bevragen/blob/v1.1.0/features/in_onderzoek.feature) ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-02-22T08:00:54.409Z[Etc/UTC]")
public class GezagsverhoudingInOnderzoek {
  public static final String SERIALIZED_NAME_INDICATIE_CURATELE_REGISTER = "indicatieCurateleRegister";
  @SerializedName(SERIALIZED_NAME_INDICATIE_CURATELE_REGISTER)
  private Boolean indicatieCurateleRegister;

  public static final String SERIALIZED_NAME_INDICATIE_GEZAG_MINDERJARIGE = "indicatieGezagMinderjarige";
  @SerializedName(SERIALIZED_NAME_INDICATIE_GEZAG_MINDERJARIGE)
  private Boolean indicatieGezagMinderjarige;

  public static final String SERIALIZED_NAME_DATUM_INGANG_ONDERZOEK = "datumIngangOnderzoek";
  @SerializedName(SERIALIZED_NAME_DATUM_INGANG_ONDERZOEK)
  private DatumOnvolledig datumIngangOnderzoek;


  public GezagsverhoudingInOnderzoek indicatieCurateleRegister(Boolean indicatieCurateleRegister) {
    
    this.indicatieCurateleRegister = indicatieCurateleRegister;
    return this;
  }

   /**
   * Get indicatieCurateleRegister
   * @return indicatieCurateleRegister
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIndicatieCurateleRegister() {
    return indicatieCurateleRegister;
  }


  public void setIndicatieCurateleRegister(Boolean indicatieCurateleRegister) {
    this.indicatieCurateleRegister = indicatieCurateleRegister;
  }


  public GezagsverhoudingInOnderzoek indicatieGezagMinderjarige(Boolean indicatieGezagMinderjarige) {
    
    this.indicatieGezagMinderjarige = indicatieGezagMinderjarige;
    return this;
  }

   /**
   * Get indicatieGezagMinderjarige
   * @return indicatieGezagMinderjarige
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIndicatieGezagMinderjarige() {
    return indicatieGezagMinderjarige;
  }


  public void setIndicatieGezagMinderjarige(Boolean indicatieGezagMinderjarige) {
    this.indicatieGezagMinderjarige = indicatieGezagMinderjarige;
  }


  public GezagsverhoudingInOnderzoek datumIngangOnderzoek(DatumOnvolledig datumIngangOnderzoek) {
    
    this.datumIngangOnderzoek = datumIngangOnderzoek;
    return this;
  }

   /**
   * Get datumIngangOnderzoek
   * @return datumIngangOnderzoek
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DatumOnvolledig getDatumIngangOnderzoek() {
    return datumIngangOnderzoek;
  }


  public void setDatumIngangOnderzoek(DatumOnvolledig datumIngangOnderzoek) {
    this.datumIngangOnderzoek = datumIngangOnderzoek;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GezagsverhoudingInOnderzoek gezagsverhoudingInOnderzoek = (GezagsverhoudingInOnderzoek) o;
    return Objects.equals(this.indicatieCurateleRegister, gezagsverhoudingInOnderzoek.indicatieCurateleRegister) &&
        Objects.equals(this.indicatieGezagMinderjarige, gezagsverhoudingInOnderzoek.indicatieGezagMinderjarige) &&
        Objects.equals(this.datumIngangOnderzoek, gezagsverhoudingInOnderzoek.datumIngangOnderzoek);
  }

  @Override
  public int hashCode() {
    return Objects.hash(indicatieCurateleRegister, indicatieGezagMinderjarige, datumIngangOnderzoek);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GezagsverhoudingInOnderzoek {\n");
    sb.append("    indicatieCurateleRegister: ").append(toIndentedString(indicatieCurateleRegister)).append("\n");
    sb.append("    indicatieGezagMinderjarige: ").append(toIndentedString(indicatieGezagMinderjarige)).append("\n");
    sb.append("    datumIngangOnderzoek: ").append(toIndentedString(datumIngangOnderzoek)).append("\n");
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

