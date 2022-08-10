
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
 * Number of field notices the current Cisco software releases are exposed to
 */
@ApiModel(description = "Number of field notices the current Cisco software releases are exposed to")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-03T16:36:10.038229Z[GMT]")
public class SuggestionSummaryFieldNoticeSeverityInnerOpen {
  public static final String SERIALIZED_NAME_MEDIUM = "medium";
  @SerializedName(SERIALIZED_NAME_MEDIUM)
  private Long medium;

  public SuggestionSummaryFieldNoticeSeverityInnerOpen() { 
  }

  public SuggestionSummaryFieldNoticeSeverityInnerOpen medium(Long medium) {
    
    this.medium = medium;
    return this;
  }

   /**
   * Number of medium impact field notices the current Cisco software releases are exposed to
   * @return medium
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of medium impact field notices the current Cisco software releases are exposed to")

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
    SuggestionSummaryFieldNoticeSeverityInnerOpen suggestionSummaryFieldNoticeSeverityInnerOpen = (SuggestionSummaryFieldNoticeSeverityInnerOpen) o;
    return Objects.equals(this.medium, suggestionSummaryFieldNoticeSeverityInnerOpen.medium);
  }

  @Override
  public int hashCode() {
    return Objects.hash(medium);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SuggestionSummaryFieldNoticeSeverityInnerOpen {\n");
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
    openapiFields.add("medium");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SuggestionSummaryFieldNoticeSeverityInnerOpen
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (SuggestionSummaryFieldNoticeSeverityInnerOpen.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in SuggestionSummaryFieldNoticeSeverityInnerOpen is not found in the empty JSON string", SuggestionSummaryFieldNoticeSeverityInnerOpen.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!SuggestionSummaryFieldNoticeSeverityInnerOpen.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SuggestionSummaryFieldNoticeSeverityInnerOpen` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SuggestionSummaryFieldNoticeSeverityInnerOpen.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SuggestionSummaryFieldNoticeSeverityInnerOpen' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SuggestionSummaryFieldNoticeSeverityInnerOpen> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SuggestionSummaryFieldNoticeSeverityInnerOpen.class));

       return (TypeAdapter<T>) new TypeAdapter<SuggestionSummaryFieldNoticeSeverityInnerOpen>() {
           @Override
           public void write(JsonWriter out, SuggestionSummaryFieldNoticeSeverityInnerOpen value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SuggestionSummaryFieldNoticeSeverityInnerOpen read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SuggestionSummaryFieldNoticeSeverityInnerOpen given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SuggestionSummaryFieldNoticeSeverityInnerOpen
  * @throws IOException if the JSON string is invalid with respect to SuggestionSummaryFieldNoticeSeverityInnerOpen
  */
  public static SuggestionSummaryFieldNoticeSeverityInnerOpen fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SuggestionSummaryFieldNoticeSeverityInnerOpen.class);
  }

 /**
  * Convert an instance of SuggestionSummaryFieldNoticeSeverityInnerOpen to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

