
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
import java.util.ArrayList;
import java.util.List;

import com.cisco.px.client.JSON;
import com.cisco.px.client.model.PartnerOfferSession;
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
 * PartnerOfferWithSessions
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-05T16:32:06.013598Z[GMT]")
public class PartnerOfferWithSessions {
  public static final String SERIALIZED_NAME_OFFER_ID = "offerId";
  @SerializedName(SERIALIZED_NAME_OFFER_ID)
  private String offerId;

  public static final String SERIALIZED_NAME_SESSIONS = "sessions";
  @SerializedName(SERIALIZED_NAME_SESSIONS)
  private List<PartnerOfferSession> sessions = null;

  public PartnerOfferWithSessions() { 
  }

  public PartnerOfferWithSessions offerId(String offerId) {
    
    this.offerId = offerId;
    return this;
  }

   /**
   * Get offerId
   * @return offerId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getOfferId() {
    return offerId;
  }


  public void setOfferId(String offerId) {
    this.offerId = offerId;
  }


  public PartnerOfferWithSessions sessions(List<PartnerOfferSession> sessions) {
    
    this.sessions = sessions;
    return this;
  }

  public PartnerOfferWithSessions addSessionsItem(PartnerOfferSession sessionsItem) {
    if (this.sessions == null) {
      this.sessions = new ArrayList<>();
    }
    this.sessions.add(sessionsItem);
    return this;
  }

   /**
   * Get sessions
   * @return sessions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<PartnerOfferSession> getSessions() {
    return sessions;
  }


  public void setSessions(List<PartnerOfferSession> sessions) {
    this.sessions = sessions;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PartnerOfferWithSessions partnerOfferWithSessions = (PartnerOfferWithSessions) o;
    return Objects.equals(this.offerId, partnerOfferWithSessions.offerId) &&
        Objects.equals(this.sessions, partnerOfferWithSessions.sessions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offerId, sessions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PartnerOfferWithSessions {\n");
    sb.append("    offerId: ").append(toIndentedString(offerId)).append("\n");
    sb.append("    sessions: ").append(toIndentedString(sessions)).append("\n");
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
    openapiFields.add("offerId");
    openapiFields.add("sessions");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PartnerOfferWithSessions
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (PartnerOfferWithSessions.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in PartnerOfferWithSessions is not found in the empty JSON string", PartnerOfferWithSessions.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!PartnerOfferWithSessions.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PartnerOfferWithSessions` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("offerId") != null && !jsonObj.get("offerId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `offerId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("offerId").toString()));
      }
      JsonArray jsonArraysessions = jsonObj.getAsJsonArray("sessions");
      if (jsonArraysessions != null) {
        // ensure the json data is an array
        if (!jsonObj.get("sessions").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `sessions` to be an array in the JSON string but got `%s`", jsonObj.get("sessions").toString()));
        }

        // validate the optional field `sessions` (array)
        for (int i = 0; i < jsonArraysessions.size(); i++) {
          PartnerOfferSession.validateJsonObject(jsonArraysessions.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PartnerOfferWithSessions.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PartnerOfferWithSessions' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PartnerOfferWithSessions> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PartnerOfferWithSessions.class));

       return (TypeAdapter<T>) new TypeAdapter<PartnerOfferWithSessions>() {
           @Override
           public void write(JsonWriter out, PartnerOfferWithSessions value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PartnerOfferWithSessions read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PartnerOfferWithSessions given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PartnerOfferWithSessions
  * @throws IOException if the JSON string is invalid with respect to PartnerOfferWithSessions
  */
  public static PartnerOfferWithSessions fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PartnerOfferWithSessions.class);
  }

 /**
  * Convert an instance of PartnerOfferWithSessions to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

