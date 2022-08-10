
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
 * Number of security advisories the current Cisco software releases are exposed to that are addressed by the suggested release, grouped by impact
 */
@ApiModel(description = "Number of security advisories the current Cisco software releases are exposed to that are addressed by the suggested release, grouped by impact")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-03T16:36:10.038229Z[GMT]")
public class SuggestionSummaryAdvisoriesSeverityInnerResolved {
  public static final String SERIALIZED_NAME_HIGH = "high";
  @SerializedName(SERIALIZED_NAME_HIGH)
  private Long high;

  public static final String SERIALIZED_NAME_LOW = "low";
  @SerializedName(SERIALIZED_NAME_LOW)
  private Long low;

  public static final String SERIALIZED_NAME_MEDIUM = "medium";
  @SerializedName(SERIALIZED_NAME_MEDIUM)
  private Long medium;

  public SuggestionSummaryAdvisoriesSeverityInnerResolved() { 
  }

  public SuggestionSummaryAdvisoriesSeverityInnerResolved high(Long high) {
    
    this.high = high;
    return this;
  }

   /**
   * Number of High impact security advisories addressed by the suggested Cisco software release
   * @return high
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of High impact security advisories addressed by the suggested Cisco software release")

  public Long getHigh() {
    return high;
  }


  public void setHigh(Long high) {
    this.high = high;
  }


  public SuggestionSummaryAdvisoriesSeverityInnerResolved low(Long low) {
    
    this.low = low;
    return this;
  }

   /**
   * Number of Low impact security advisories addressed by the suggested Cisco software release
   * @return low
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of Low impact security advisories addressed by the suggested Cisco software release")

  public Long getLow() {
    return low;
  }


  public void setLow(Long low) {
    this.low = low;
  }


  public SuggestionSummaryAdvisoriesSeverityInnerResolved medium(Long medium) {
    
    this.medium = medium;
    return this;
  }

   /**
   * Number of Medium impact security advisories addressed by the suggested Cisco software release
   * @return medium
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of Medium impact security advisories addressed by the suggested Cisco software release")

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
    SuggestionSummaryAdvisoriesSeverityInnerResolved suggestionSummaryAdvisoriesSeverityInnerResolved = (SuggestionSummaryAdvisoriesSeverityInnerResolved) o;
    return Objects.equals(this.high, suggestionSummaryAdvisoriesSeverityInnerResolved.high) &&
        Objects.equals(this.low, suggestionSummaryAdvisoriesSeverityInnerResolved.low) &&
        Objects.equals(this.medium, suggestionSummaryAdvisoriesSeverityInnerResolved.medium);
  }

  @Override
  public int hashCode() {
    return Objects.hash(high, low, medium);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SuggestionSummaryAdvisoriesSeverityInnerResolved {\n");
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
  * @throws IOException if the JSON Object is invalid with respect to SuggestionSummaryAdvisoriesSeverityInnerResolved
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (SuggestionSummaryAdvisoriesSeverityInnerResolved.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in SuggestionSummaryAdvisoriesSeverityInnerResolved is not found in the empty JSON string", SuggestionSummaryAdvisoriesSeverityInnerResolved.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!SuggestionSummaryAdvisoriesSeverityInnerResolved.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SuggestionSummaryAdvisoriesSeverityInnerResolved` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SuggestionSummaryAdvisoriesSeverityInnerResolved.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SuggestionSummaryAdvisoriesSeverityInnerResolved' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SuggestionSummaryAdvisoriesSeverityInnerResolved> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SuggestionSummaryAdvisoriesSeverityInnerResolved.class));

       return (TypeAdapter<T>) new TypeAdapter<SuggestionSummaryAdvisoriesSeverityInnerResolved>() {
           @Override
           public void write(JsonWriter out, SuggestionSummaryAdvisoriesSeverityInnerResolved value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SuggestionSummaryAdvisoriesSeverityInnerResolved read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SuggestionSummaryAdvisoriesSeverityInnerResolved given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SuggestionSummaryAdvisoriesSeverityInnerResolved
  * @throws IOException if the JSON string is invalid with respect to SuggestionSummaryAdvisoriesSeverityInnerResolved
  */
  public static SuggestionSummaryAdvisoriesSeverityInnerResolved fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SuggestionSummaryAdvisoriesSeverityInnerResolved.class);
  }

 /**
  * Convert an instance of SuggestionSummaryAdvisoriesSeverityInnerResolved to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

