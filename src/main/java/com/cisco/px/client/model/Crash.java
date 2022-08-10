
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
 * Crash
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-03T16:34:07.228086Z[GMT]")
public class Crash {
  public static final String SERIALIZED_NAME_RESET_REASON = "resetReason";
  @SerializedName(SERIALIZED_NAME_RESET_REASON)
  private String resetReason;

  public static final String SERIALIZED_NAME_TIME_STAMP = "timeStamp";
  @SerializedName(SERIALIZED_NAME_TIME_STAMP)
  private OffsetDateTime timeStamp;

  public Crash() { 
  }

  public Crash resetReason(String resetReason) {
    
    this.resetReason = resetReason;
    return this;
  }

   /**
   * Get resetReason
   * @return resetReason
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getResetReason() {
    return resetReason;
  }


  public void setResetReason(String resetReason) {
    this.resetReason = resetReason;
  }


  public Crash timeStamp(OffsetDateTime timeStamp) {
    
    this.timeStamp = timeStamp;
    return this;
  }

   /**
   * Get timeStamp
   * @return timeStamp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getTimeStamp() {
    return timeStamp;
  }


  public void setTimeStamp(OffsetDateTime timeStamp) {
    this.timeStamp = timeStamp;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Crash crash = (Crash) o;
    return Objects.equals(this.resetReason, crash.resetReason) &&
        Objects.equals(this.timeStamp, crash.timeStamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resetReason, timeStamp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Crash {\n");
    sb.append("    resetReason: ").append(toIndentedString(resetReason)).append("\n");
    sb.append("    timeStamp: ").append(toIndentedString(timeStamp)).append("\n");
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
    openapiFields.add("resetReason");
    openapiFields.add("timeStamp");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Crash
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (Crash.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in Crash is not found in the empty JSON string", Crash.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Crash.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Crash` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("resetReason") != null && !jsonObj.get("resetReason").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `resetReason` to be a primitive type in the JSON string but got `%s`", jsonObj.get("resetReason").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Crash.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Crash' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Crash> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Crash.class));

       return (TypeAdapter<T>) new TypeAdapter<Crash>() {
           @Override
           public void write(JsonWriter out, Crash value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Crash read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Crash given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Crash
  * @throws IOException if the JSON string is invalid with respect to Crash
  */
  public static Crash fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Crash.class);
  }

 /**
  * Convert an instance of Crash to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

