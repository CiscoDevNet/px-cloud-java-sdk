
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
import java.time.OffsetDateTime;

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
 * AssetsFaultHistory
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-03T16:35:03.728797Z[GMT]")
public class AssetsFaultHistory {
  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_FAILURE_MESSAGE = "failureMessage";
  @SerializedName(SERIALIZED_NAME_FAILURE_MESSAGE)
  private String failureMessage;

  public static final String SERIALIZED_NAME_LAST_OCCURRENCE = "lastOccurrence";
  @SerializedName(SERIALIZED_NAME_LAST_OCCURRENCE)
  private OffsetDateTime lastOccurrence;

  public AssetsFaultHistory() { 
  }

  public AssetsFaultHistory status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * If case automation is enabled when the fault occurs, this returns the status of the Cisco support case request submitted by CX Cloud. If case automation is not enabled, this returns \&quot;Fault Occurred\&quot;.
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If case automation is enabled when the fault occurs, this returns the status of the Cisco support case request submitted by CX Cloud. If case automation is not enabled, this returns \"Fault Occurred\".")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public AssetsFaultHistory failureMessage(String failureMessage) {
    
    this.failureMessage = failureMessage;
    return this;
  }

   /**
   * Error message returned when the value of the status attribute is \&quot;Failed\&quot;
   * @return failureMessage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Error message returned when the value of the status attribute is \"Failed\"")

  public String getFailureMessage() {
    return failureMessage;
  }


  public void setFailureMessage(String failureMessage) {
    this.failureMessage = failureMessage;
  }


  public AssetsFaultHistory lastOccurrence(OffsetDateTime lastOccurrence) {
    
    this.lastOccurrence = lastOccurrence;
    return this;
  }

   /**
   * Date the fault occurred
   * @return lastOccurrence
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Date the fault occurred")

  public OffsetDateTime getLastOccurrence() {
    return lastOccurrence;
  }


  public void setLastOccurrence(OffsetDateTime lastOccurrence) {
    this.lastOccurrence = lastOccurrence;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssetsFaultHistory assetsFaultHistory = (AssetsFaultHistory) o;
    return Objects.equals(this.status, assetsFaultHistory.status) &&
        Objects.equals(this.failureMessage, assetsFaultHistory.failureMessage) &&
        Objects.equals(this.lastOccurrence, assetsFaultHistory.lastOccurrence);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, failureMessage, lastOccurrence);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssetsFaultHistory {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    failureMessage: ").append(toIndentedString(failureMessage)).append("\n");
    sb.append("    lastOccurrence: ").append(toIndentedString(lastOccurrence)).append("\n");
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
    openapiFields.add("failureMessage");
    openapiFields.add("lastOccurrence");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AssetsFaultHistory
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AssetsFaultHistory.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AssetsFaultHistory is not found in the empty JSON string", AssetsFaultHistory.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AssetsFaultHistory.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AssetsFaultHistory` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if (jsonObj.get("failureMessage") != null && !jsonObj.get("failureMessage").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `failureMessage` to be a primitive type in the JSON string but got `%s`", jsonObj.get("failureMessage").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AssetsFaultHistory.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AssetsFaultHistory' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AssetsFaultHistory> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AssetsFaultHistory.class));

       return (TypeAdapter<T>) new TypeAdapter<AssetsFaultHistory>() {
           @Override
           public void write(JsonWriter out, AssetsFaultHistory value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AssetsFaultHistory read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AssetsFaultHistory given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AssetsFaultHistory
  * @throws IOException if the JSON string is invalid with respect to AssetsFaultHistory
  */
  public static AssetsFaultHistory fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AssetsFaultHistory.class);
  }

 /**
  * Convert an instance of AssetsFaultHistory to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

