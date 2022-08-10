
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
 * Suggestion
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-03T16:36:05.060218Z[GMT]")
public class Suggestion {
  public static final String SERIALIZED_NAME_SEVERITY = "severity";
  @SerializedName(SERIALIZED_NAME_SEVERITY)
  private String severity;

  public static final String SERIALIZED_NAME_VIOLATION_MESSAGE = "violationMessage";
  @SerializedName(SERIALIZED_NAME_VIOLATION_MESSAGE)
  private String violationMessage;

  public static final String SERIALIZED_NAME_SUGGESTION = "suggestion";
  @SerializedName(SERIALIZED_NAME_SUGGESTION)
  private String suggestion;

  public static final String SERIALIZED_NAME_AFFECTED_ASSETS_COUNT = "affectedAssetsCount";
  @SerializedName(SERIALIZED_NAME_AFFECTED_ASSETS_COUNT)
  private Long affectedAssetsCount;

  public Suggestion() { 
  }

  public Suggestion severity(String severity) {
    
    this.severity = severity;
    return this;
  }

   /**
   * Get severity
   * @return severity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSeverity() {
    return severity;
  }


  public void setSeverity(String severity) {
    this.severity = severity;
  }


  public Suggestion violationMessage(String violationMessage) {
    
    this.violationMessage = violationMessage;
    return this;
  }

   /**
   * Get violationMessage
   * @return violationMessage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getViolationMessage() {
    return violationMessage;
  }


  public void setViolationMessage(String violationMessage) {
    this.violationMessage = violationMessage;
  }


  public Suggestion suggestion(String suggestion) {
    
    this.suggestion = suggestion;
    return this;
  }

   /**
   * Get suggestion
   * @return suggestion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSuggestion() {
    return suggestion;
  }


  public void setSuggestion(String suggestion) {
    this.suggestion = suggestion;
  }


  public Suggestion affectedAssetsCount(Long affectedAssetsCount) {
    
    this.affectedAssetsCount = affectedAssetsCount;
    return this;
  }

   /**
   * Get affectedAssetsCount
   * @return affectedAssetsCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getAffectedAssetsCount() {
    return affectedAssetsCount;
  }


  public void setAffectedAssetsCount(Long affectedAssetsCount) {
    this.affectedAssetsCount = affectedAssetsCount;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Suggestion suggestion = (Suggestion) o;
    return Objects.equals(this.severity, suggestion.severity) &&
        Objects.equals(this.violationMessage, suggestion.violationMessage) &&
        Objects.equals(this.suggestion, suggestion.suggestion) &&
        Objects.equals(this.affectedAssetsCount, suggestion.affectedAssetsCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(severity, violationMessage, suggestion, affectedAssetsCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Suggestion {\n");
    sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
    sb.append("    violationMessage: ").append(toIndentedString(violationMessage)).append("\n");
    sb.append("    suggestion: ").append(toIndentedString(suggestion)).append("\n");
    sb.append("    affectedAssetsCount: ").append(toIndentedString(affectedAssetsCount)).append("\n");
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
    openapiFields.add("severity");
    openapiFields.add("violationMessage");
    openapiFields.add("suggestion");
    openapiFields.add("affectedAssetsCount");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Suggestion
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (Suggestion.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in Suggestion is not found in the empty JSON string", Suggestion.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Suggestion.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Suggestion` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("severity") != null && !jsonObj.get("severity").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `severity` to be a primitive type in the JSON string but got `%s`", jsonObj.get("severity").toString()));
      }
      if (jsonObj.get("violationMessage") != null && !jsonObj.get("violationMessage").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `violationMessage` to be a primitive type in the JSON string but got `%s`", jsonObj.get("violationMessage").toString()));
      }
      if (jsonObj.get("suggestion") != null && !jsonObj.get("suggestion").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `suggestion` to be a primitive type in the JSON string but got `%s`", jsonObj.get("suggestion").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Suggestion.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Suggestion' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Suggestion> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Suggestion.class));

       return (TypeAdapter<T>) new TypeAdapter<Suggestion>() {
           @Override
           public void write(JsonWriter out, Suggestion value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Suggestion read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Suggestion given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Suggestion
  * @throws IOException if the JSON string is invalid with respect to Suggestion
  */
  public static Suggestion fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Suggestion.class);
  }

 /**
  * Convert an instance of Suggestion to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

