
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
 * OptInResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-03T16:36:05.060218Z[GMT]")
public class OptInResponse {
  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_HAS_QUALIFIED_ASSETS = "hasQualifiedAssets";
  @SerializedName(SERIALIZED_NAME_HAS_QUALIFIED_ASSETS)
  private String hasQualifiedAssets;

  public OptInResponse() { 
  }

  public OptInResponse status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public OptInResponse hasQualifiedAssets(String hasQualifiedAssets) {
    
    this.hasQualifiedAssets = hasQualifiedAssets;
    return this;
  }

   /**
   * Get hasQualifiedAssets
   * @return hasQualifiedAssets
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getHasQualifiedAssets() {
    return hasQualifiedAssets;
  }


  public void setHasQualifiedAssets(String hasQualifiedAssets) {
    this.hasQualifiedAssets = hasQualifiedAssets;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OptInResponse optInResponse = (OptInResponse) o;
    return Objects.equals(this.status, optInResponse.status) &&
        Objects.equals(this.hasQualifiedAssets, optInResponse.hasQualifiedAssets);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, hasQualifiedAssets);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OptInResponse {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    hasQualifiedAssets: ").append(toIndentedString(hasQualifiedAssets)).append("\n");
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
    openapiFields.add("status");
    openapiFields.add("hasQualifiedAssets");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to OptInResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (OptInResponse.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in OptInResponse is not found in the empty JSON string", OptInResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!OptInResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OptInResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if (jsonObj.get("hasQualifiedAssets") != null && !jsonObj.get("hasQualifiedAssets").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `hasQualifiedAssets` to be a primitive type in the JSON string but got `%s`", jsonObj.get("hasQualifiedAssets").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OptInResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OptInResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OptInResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OptInResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<OptInResponse>() {
           @Override
           public void write(JsonWriter out, OptInResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OptInResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OptInResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OptInResponse
  * @throws IOException if the JSON string is invalid with respect to OptInResponse
  */
  public static OptInResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OptInResponse.class);
  }

 /**
  * Convert an instance of OptInResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

