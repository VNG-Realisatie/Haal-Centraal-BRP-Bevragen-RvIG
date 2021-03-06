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
import io.swagger.annotations.ApiModel;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Geeft aan dat de persoon behandeld wordt als Nederlander, of dat door de rechter is vastgesteld dat de persoon niet de Nederlandse nationaliteit bezit * &#x60;behandeld_als_nederlander&#x60; - B * &#x60;vastgesteld_niet_nederlander&#x60; - V 
 */
@JsonAdapter(AanduidingBijzonderNederlanderschapEnum.Adapter.class)
public enum AanduidingBijzonderNederlanderschapEnum {
  
  BEHANDELD_ALS_NEDERLANDER("behandeld_als_nederlander"),
  
  VASTGESTELD_NIET_NEDERLANDER("vastgesteld_niet_nederlander");

  private String value;

  AanduidingBijzonderNederlanderschapEnum(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AanduidingBijzonderNederlanderschapEnum fromValue(String value) {
    for (AanduidingBijzonderNederlanderschapEnum b : AanduidingBijzonderNederlanderschapEnum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<AanduidingBijzonderNederlanderschapEnum> {
    @Override
    public void write(final JsonWriter jsonWriter, final AanduidingBijzonderNederlanderschapEnum enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AanduidingBijzonderNederlanderschapEnum read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AanduidingBijzonderNederlanderschapEnum.fromValue(value);
    }
  }
}

