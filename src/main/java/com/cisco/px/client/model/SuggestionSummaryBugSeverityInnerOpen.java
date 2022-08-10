
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

import com.cisco.px.client.JSON;

/**
 * Number of bugs the current Cisco software releases are exposed to, grouped by severity
 */
@ApiModel(description = "Number of bugs the current Cisco software releases are exposed to, grouped by severity")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-03T16:36:10.038229Z[GMT]")
public class SuggestionSummaryBugSeverityInnerOpen {
  public static final String SERIALIZED_NAME_HIGH = "high";
  @SerializedName(SERIALIZED_NAME_HIGH)
  private Long high;

  public static final String SERIALIZED_NAME_LOW = "low";
  @SerializedName(SERIALIZED_NAME_LOW)
  private Long low;

  public static final String SERIALIZED_NAME_MEDIUM = "medium";
  @SerializedName(SERIALIZED_NAME_MEDIUM)
  private Long medium;

  public SuggestionSummaryBugSeverityInnerOpen() { 
  }

  public SuggestionSummaryBugSeverityInnerOpen high(Long high) {
    
    this.high = high;
    return this;
  }

   /**
   * Number of High severity bugs the current Cisco software releases are exposed to
   * @return high
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of High severity bugs the current Cisco software releases are exposed to")

  public Long getHigh() {
    return high;
  }


  public void setHigh(Long high) {
    this.high = high;
  }


  public SuggestionSummaryBugSeverityInnerOpen low(Long low) {
    
    this.low = low;
    return this;
  }

   /**
   * Number of Low severity bugs the current Cisco software releases are exposed to
   * @return low
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of Low severity bugs the current Cisco software releases are exposed to")

  public Long getLow() {
    return low;
  }


  public void setLow(Long low) {
    this.low = low;
  }


  public SuggestionSummaryBugSeverityInnerOpen medium(Long medium) {
    
    this.medium = medium;
    return this;
  }

   /**
   * Number of Medium severity bugs the current Cisco software releases are exposed to
   * @return medium
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of Medium severity bugs the current Cisco software releases are exposed to")

  public Long getMedium() {
    return medium;
  }


  public void setMedium(Long medium) {
    this.medium = medium;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SuggestionSummaryBugSeverityInnerOpen suggestionSummaryBugSeverityInnerOpen = (SuggestionSummaryBugSeverityInnerOpen) o;
    return Objects.equals(this.high, suggestionSummaryBugSeverityInnerOpen.high) &&
        Objects.equals(this.low, suggestionSummaryBugSeverityInnerOpen.low) &&
        Objects.equals(this.medium, suggestionSummaryBugSeverityInnerOpen.medium);
  }

  @Override
  public int hashCode() {
    return Objects.hash(high, low, medium);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SuggestionSummaryBugSeverityInnerOpen {\n");
    sb.append("    high: ").append(toIndentedString(high)).append("\n");
    sb.append("    low: ").append(toIndentedString(low)).append("\n");
    sb.append("    medium: ").append(toIndentedString(medium)).append("\n");
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
    openapiFields.add("high");
    openapiFields.add("low");
    openapiFields.add("medium");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SuggestionSummaryBugSeverityInnerOpen
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (SuggestionSummaryBugSeverityInnerOpen.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in SuggestionSummaryBugSeverityInnerOpen is not found in the empty JSON string", SuggestionSummaryBugSeverityInnerOpen.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!SuggestionSummaryBugSeverityInnerOpen.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SuggestionSummaryBugSeverityInnerOpen` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SuggestionSummaryBugSeverityInnerOpen.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SuggestionSummaryBugSeverityInnerOpen' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SuggestionSummaryBugSeverityInnerOpen> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SuggestionSummaryBugSeverityInnerOpen.class));

       return (TypeAdapter<T>) new TypeAdapter<SuggestionSummaryBugSeverityInnerOpen>() {
           @Override
           public void write(JsonWriter out, SuggestionSummaryBugSeverityInnerOpen value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SuggestionSummaryBugSeverityInnerOpen read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SuggestionSummaryBugSeverityInnerOpen given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SuggestionSummaryBugSeverityInnerOpen
  * @throws IOException if the JSON string is invalid with respect to SuggestionSummaryBugSeverityInnerOpen
  */
  public static SuggestionSummaryBugSeverityInnerOpen fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SuggestionSummaryBugSeverityInnerOpen.class);
  }

 /**
  * Convert an instance of SuggestionSummaryBugSeverityInnerOpen to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

