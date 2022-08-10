
package com.cisco.px.client.model;

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
import java.math.BigDecimal;

import com.cisco.px.client.JSON;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * RacetrackTooltip
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-05T16:32:06.013598Z[GMT]")
public class RacetrackTooltip {
  public static final String SERIALIZED_NAME_SEQUENCE = "sequence";
  @SerializedName(SERIALIZED_NAME_SEQUENCE)
  private BigDecimal sequence;

  public static final String SERIALIZED_NAME_TOOLTIP = "tooltip";
  @SerializedName(SERIALIZED_NAME_TOOLTIP)
  private String tooltip;

  public RacetrackTooltip() { 
  }

  public RacetrackTooltip sequence(BigDecimal sequence) {
    
    this.sequence = sequence;
    return this;
  }

   /**
   * Sequence of the tooltip
   * @return sequence
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Sequence of the tooltip")

  public BigDecimal getSequence() {
    return sequence;
  }


  public void setSequence(BigDecimal sequence) {
    this.sequence = sequence;
  }


  public RacetrackTooltip tooltip(String tooltip) {
    
    this.tooltip = tooltip;
    return this;
  }

   /**
   * tooltip name
   * @return tooltip
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "tooltip name")

  public String getTooltip() {
    return tooltip;
  }


  public void setTooltip(String tooltip) {
    this.tooltip = tooltip;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RacetrackTooltip racetrackTooltip = (RacetrackTooltip) o;
    return Objects.equals(this.sequence, racetrackTooltip.sequence) &&
        Objects.equals(this.tooltip, racetrackTooltip.tooltip);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sequence, tooltip);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RacetrackTooltip {\n");
    sb.append("    sequence: ").append(toIndentedString(sequence)).append("\n");
    sb.append("    tooltip: ").append(toIndentedString(tooltip)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("sequence");
    openapiFields.add("tooltip");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("sequence");
    openapiRequiredFields.add("tooltip");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to RacetrackTooltip
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (RacetrackTooltip.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in RacetrackTooltip is not found in the empty JSON string", RacetrackTooltip.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!RacetrackTooltip.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RacetrackTooltip` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : RacetrackTooltip.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("tooltip") != null && !jsonObj.get("tooltip").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tooltip` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tooltip").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RacetrackTooltip.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RacetrackTooltip' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RacetrackTooltip> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RacetrackTooltip.class));

       return (TypeAdapter<T>) new TypeAdapter<RacetrackTooltip>() {
           @Override
           public void write(JsonWriter out, RacetrackTooltip value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RacetrackTooltip read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RacetrackTooltip given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RacetrackTooltip
  * @throws IOException if the JSON string is invalid with respect to RacetrackTooltip
  */
  public static RacetrackTooltip fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RacetrackTooltip.class);
  }

 /**
  * Convert an instance of RacetrackTooltip to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

