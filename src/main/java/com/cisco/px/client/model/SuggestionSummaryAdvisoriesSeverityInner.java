
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
import com.cisco.px.client.model.SuggestionSummaryAdvisoriesSeverityInnerNewOpen;
import com.cisco.px.client.model.SuggestionSummaryAdvisoriesSeverityInnerOpen;
import com.cisco.px.client.model.SuggestionSummaryAdvisoriesSeverityInnerResolved;

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
 * SuggestionSummaryAdvisoriesSeverityInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-03T16:36:10.038229Z[GMT]")
public class SuggestionSummaryAdvisoriesSeverityInner {
  public static final String SERIALIZED_NAME_RESOLVED = "resolved";
  @SerializedName(SERIALIZED_NAME_RESOLVED)
  private SuggestionSummaryAdvisoriesSeverityInnerResolved resolved;

  public static final String SERIALIZED_NAME_NEW_OPEN = "newOpen";
  @SerializedName(SERIALIZED_NAME_NEW_OPEN)
  private SuggestionSummaryAdvisoriesSeverityInnerNewOpen newOpen;

  public static final String SERIALIZED_NAME_OPEN = "open";
  @SerializedName(SERIALIZED_NAME_OPEN)
  private SuggestionSummaryAdvisoriesSeverityInnerOpen open;

  public SuggestionSummaryAdvisoriesSeverityInner() { 
  }

  public SuggestionSummaryAdvisoriesSeverityInner resolved(SuggestionSummaryAdvisoriesSeverityInnerResolved resolved) {
    
    this.resolved = resolved;
    return this;
  }

   /**
   * Get resolved
   * @return resolved
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SuggestionSummaryAdvisoriesSeverityInnerResolved getResolved() {
    return resolved;
  }


  public void setResolved(SuggestionSummaryAdvisoriesSeverityInnerResolved resolved) {
    this.resolved = resolved;
  }


  public SuggestionSummaryAdvisoriesSeverityInner newOpen(SuggestionSummaryAdvisoriesSeverityInnerNewOpen newOpen) {
    
    this.newOpen = newOpen;
    return this;
  }

   /**
   * Get newOpen
   * @return newOpen
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SuggestionSummaryAdvisoriesSeverityInnerNewOpen getNewOpen() {
    return newOpen;
  }


  public void setNewOpen(SuggestionSummaryAdvisoriesSeverityInnerNewOpen newOpen) {
    this.newOpen = newOpen;
  }


  public SuggestionSummaryAdvisoriesSeverityInner open(SuggestionSummaryAdvisoriesSeverityInnerOpen open) {
    
    this.open = open;
    return this;
  }

   /**
   * Get open
   * @return open
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SuggestionSummaryAdvisoriesSeverityInnerOpen getOpen() {
    return open;
  }


  public void setOpen(SuggestionSummaryAdvisoriesSeverityInnerOpen open) {
    this.open = open;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SuggestionSummaryAdvisoriesSeverityInner suggestionSummaryAdvisoriesSeverityInner = (SuggestionSummaryAdvisoriesSeverityInner) o;
    return Objects.equals(this.resolved, suggestionSummaryAdvisoriesSeverityInner.resolved) &&
        Objects.equals(this.newOpen, suggestionSummaryAdvisoriesSeverityInner.newOpen) &&
        Objects.equals(this.open, suggestionSummaryAdvisoriesSeverityInner.open);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resolved, newOpen, open);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SuggestionSummaryAdvisoriesSeverityInner {\n");
    sb.append("    resolved: ").append(toIndentedString(resolved)).append("\n");
    sb.append("    newOpen: ").append(toIndentedString(newOpen)).append("\n");
    sb.append("    open: ").append(toIndentedString(open)).append("\n");
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
    openapiFields.add("resolved");
    openapiFields.add("newOpen");
    openapiFields.add("open");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SuggestionSummaryAdvisoriesSeverityInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (SuggestionSummaryAdvisoriesSeverityInner.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in SuggestionSummaryAdvisoriesSeverityInner is not found in the empty JSON string", SuggestionSummaryAdvisoriesSeverityInner.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!SuggestionSummaryAdvisoriesSeverityInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SuggestionSummaryAdvisoriesSeverityInner` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `resolved`
      if (jsonObj.getAsJsonObject("resolved") != null) {
        SuggestionSummaryAdvisoriesSeverityInnerResolved.validateJsonObject(jsonObj.getAsJsonObject("resolved"));
      }
      // validate the optional field `newOpen`
      if (jsonObj.getAsJsonObject("newOpen") != null) {
        SuggestionSummaryAdvisoriesSeverityInnerNewOpen.validateJsonObject(jsonObj.getAsJsonObject("newOpen"));
      }
      // validate the optional field `open`
      if (jsonObj.getAsJsonObject("open") != null) {
        SuggestionSummaryAdvisoriesSeverityInnerOpen.validateJsonObject(jsonObj.getAsJsonObject("open"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SuggestionSummaryAdvisoriesSeverityInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SuggestionSummaryAdvisoriesSeverityInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SuggestionSummaryAdvisoriesSeverityInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SuggestionSummaryAdvisoriesSeverityInner.class));

       return (TypeAdapter<T>) new TypeAdapter<SuggestionSummaryAdvisoriesSeverityInner>() {
           @Override
           public void write(JsonWriter out, SuggestionSummaryAdvisoriesSeverityInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SuggestionSummaryAdvisoriesSeverityInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SuggestionSummaryAdvisoriesSeverityInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SuggestionSummaryAdvisoriesSeverityInner
  * @throws IOException if the JSON string is invalid with respect to SuggestionSummaryAdvisoriesSeverityInner
  */
  public static SuggestionSummaryAdvisoriesSeverityInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SuggestionSummaryAdvisoriesSeverityInner.class);
  }

 /**
  * Convert an instance of SuggestionSummaryAdvisoriesSeverityInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

