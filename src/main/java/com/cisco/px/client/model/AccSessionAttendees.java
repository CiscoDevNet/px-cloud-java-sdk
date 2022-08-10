
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
 * AccSessionAttendees
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-05T16:32:06.013598Z[GMT]")
public class AccSessionAttendees {
  public static final String SERIALIZED_NAME_ATTENDEE_EMAIL = "attendeeEmail";
  @SerializedName(SERIALIZED_NAME_ATTENDEE_EMAIL)
  private String attendeeEmail;

  public static final String SERIALIZED_NAME_ATTENDEE_NAME = "attendeeName";
  @SerializedName(SERIALIZED_NAME_ATTENDEE_NAME)
  private String attendeeName;

  public AccSessionAttendees() { 
  }

  public AccSessionAttendees attendeeEmail(String attendeeEmail) {
    
    this.attendeeEmail = attendeeEmail;
    return this;
  }

   /**
   * Get attendeeEmail
   * @return attendeeEmail
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAttendeeEmail() {
    return attendeeEmail;
  }


  public void setAttendeeEmail(String attendeeEmail) {
    this.attendeeEmail = attendeeEmail;
  }


  public AccSessionAttendees attendeeName(String attendeeName) {
    
    this.attendeeName = attendeeName;
    return this;
  }

   /**
   * Get attendeeName
   * @return attendeeName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAttendeeName() {
    return attendeeName;
  }


  public void setAttendeeName(String attendeeName) {
    this.attendeeName = attendeeName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccSessionAttendees accSessionAttendees = (AccSessionAttendees) o;
    return Objects.equals(this.attendeeEmail, accSessionAttendees.attendeeEmail) &&
        Objects.equals(this.attendeeName, accSessionAttendees.attendeeName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attendeeEmail, attendeeName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccSessionAttendees {\n");
    sb.append("    attendeeEmail: ").append(toIndentedString(attendeeEmail)).append("\n");
    sb.append("    attendeeName: ").append(toIndentedString(attendeeName)).append("\n");
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
    openapiFields.add("attendeeEmail");
    openapiFields.add("attendeeName");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AccSessionAttendees
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AccSessionAttendees.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AccSessionAttendees is not found in the empty JSON string", AccSessionAttendees.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AccSessionAttendees.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AccSessionAttendees` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("attendeeEmail") != null && !jsonObj.get("attendeeEmail").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `attendeeEmail` to be a primitive type in the JSON string but got `%s`", jsonObj.get("attendeeEmail").toString()));
      }
      if (jsonObj.get("attendeeName") != null && !jsonObj.get("attendeeName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `attendeeName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("attendeeName").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AccSessionAttendees.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AccSessionAttendees' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AccSessionAttendees> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AccSessionAttendees.class));

       return (TypeAdapter<T>) new TypeAdapter<AccSessionAttendees>() {
           @Override
           public void write(JsonWriter out, AccSessionAttendees value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AccSessionAttendees read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AccSessionAttendees given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AccSessionAttendees
  * @throws IOException if the JSON string is invalid with respect to AccSessionAttendees
  */
  public static AccSessionAttendees fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AccSessionAttendees.class);
  }

 /**
  * Convert an instance of AccSessionAttendees to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

