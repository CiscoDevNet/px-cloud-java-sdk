
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
import java.util.ArrayList;
import java.util.List;

import com.cisco.px.client.JSON;
import com.cisco.px.client.model.PartnerOfferAttendee;
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
 * PartnerOfferSession
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-05T16:32:06.013598Z[GMT]")
public class PartnerOfferSession {
  public static final String SERIALIZED_NAME_ATTENDEE_LIST = "attendeeList";
  @SerializedName(SERIALIZED_NAME_ATTENDEE_LIST)
  private List<PartnerOfferAttendee> attendeeList = null;

  public static final String SERIALIZED_NAME_BUSINESS_OUTCOME = "businessOutcome";
  @SerializedName(SERIALIZED_NAME_BUSINESS_OUTCOME)
  private String businessOutcome;

  public static final String SERIALIZED_NAME_CREATED_DATE = "createdDate";
  @SerializedName(SERIALIZED_NAME_CREATED_DATE)
  private OffsetDateTime createdDate;

  public static final String SERIALIZED_NAME_MODIFIED_DATE = "modifiedDate";
  @SerializedName(SERIALIZED_NAME_MODIFIED_DATE)
  private OffsetDateTime modifiedDate;

  public static final String SERIALIZED_NAME_PREFERRED_SLOT = "preferredSlot";
  @SerializedName(SERIALIZED_NAME_PREFERRED_SLOT)
  private String preferredSlot;

  public static final String SERIALIZED_NAME_REASON_FOR_INTEREST = "reasonForInterest";
  @SerializedName(SERIALIZED_NAME_REASON_FOR_INTEREST)
  private String reasonForInterest;

  public static final String SERIALIZED_NAME_SESSION_ID = "sessionId";
  @SerializedName(SERIALIZED_NAME_SESSION_ID)
  private String sessionId;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_TIMEZONE = "timezone";
  @SerializedName(SERIALIZED_NAME_TIMEZONE)
  private String timezone;

  public PartnerOfferSession() { 
  }

  public PartnerOfferSession attendeeList(List<PartnerOfferAttendee> attendeeList) {
    
    this.attendeeList = attendeeList;
    return this;
  }

  public PartnerOfferSession addAttendeeListItem(PartnerOfferAttendee attendeeListItem) {
    if (this.attendeeList == null) {
      this.attendeeList = new ArrayList<>();
    }
    this.attendeeList.add(attendeeListItem);
    return this;
  }

   /**
   * Get attendeeList
   * @return attendeeList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<PartnerOfferAttendee> getAttendeeList() {
    return attendeeList;
  }


  public void setAttendeeList(List<PartnerOfferAttendee> attendeeList) {
    this.attendeeList = attendeeList;
  }


  public PartnerOfferSession businessOutcome(String businessOutcome) {
    
    this.businessOutcome = businessOutcome;
    return this;
  }

   /**
   * Get businessOutcome
   * @return businessOutcome
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getBusinessOutcome() {
    return businessOutcome;
  }


  public void setBusinessOutcome(String businessOutcome) {
    this.businessOutcome = businessOutcome;
  }


  public PartnerOfferSession createdDate(OffsetDateTime createdDate) {
    
    this.createdDate = createdDate;
    return this;
  }

   /**
   * Get createdDate
   * @return createdDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getCreatedDate() {
    return createdDate;
  }


  public void setCreatedDate(OffsetDateTime createdDate) {
    this.createdDate = createdDate;
  }


  public PartnerOfferSession modifiedDate(OffsetDateTime modifiedDate) {
    
    this.modifiedDate = modifiedDate;
    return this;
  }

   /**
   * Get modifiedDate
   * @return modifiedDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getModifiedDate() {
    return modifiedDate;
  }


  public void setModifiedDate(OffsetDateTime modifiedDate) {
    this.modifiedDate = modifiedDate;
  }


  public PartnerOfferSession preferredSlot(String preferredSlot) {
    
    this.preferredSlot = preferredSlot;
    return this;
  }

   /**
   * Get preferredSlot
   * @return preferredSlot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPreferredSlot() {
    return preferredSlot;
  }


  public void setPreferredSlot(String preferredSlot) {
    this.preferredSlot = preferredSlot;
  }


  public PartnerOfferSession reasonForInterest(String reasonForInterest) {
    
    this.reasonForInterest = reasonForInterest;
    return this;
  }

   /**
   * Get reasonForInterest
   * @return reasonForInterest
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getReasonForInterest() {
    return reasonForInterest;
  }


  public void setReasonForInterest(String reasonForInterest) {
    this.reasonForInterest = reasonForInterest;
  }


  public PartnerOfferSession sessionId(String sessionId) {
    
    this.sessionId = sessionId;
    return this;
  }

   /**
   * Get sessionId
   * @return sessionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSessionId() {
    return sessionId;
  }


  public void setSessionId(String sessionId) {
    this.sessionId = sessionId;
  }


  public PartnerOfferSession status(String status) {
    
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


  public PartnerOfferSession timezone(String timezone) {
    
    this.timezone = timezone;
    return this;
  }

   /**
   * Get timezone
   * @return timezone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTimezone() {
    return timezone;
  }


  public void setTimezone(String timezone) {
    this.timezone = timezone;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PartnerOfferSession partnerOfferSession = (PartnerOfferSession) o;
    return Objects.equals(this.attendeeList, partnerOfferSession.attendeeList) &&
        Objects.equals(this.businessOutcome, partnerOfferSession.businessOutcome) &&
        Objects.equals(this.createdDate, partnerOfferSession.createdDate) &&
        Objects.equals(this.modifiedDate, partnerOfferSession.modifiedDate) &&
        Objects.equals(this.preferredSlot, partnerOfferSession.preferredSlot) &&
        Objects.equals(this.reasonForInterest, partnerOfferSession.reasonForInterest) &&
        Objects.equals(this.sessionId, partnerOfferSession.sessionId) &&
        Objects.equals(this.status, partnerOfferSession.status) &&
        Objects.equals(this.timezone, partnerOfferSession.timezone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attendeeList, businessOutcome, createdDate, modifiedDate, preferredSlot, reasonForInterest, sessionId, status, timezone);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PartnerOfferSession {\n");
    sb.append("    attendeeList: ").append(toIndentedString(attendeeList)).append("\n");
    sb.append("    businessOutcome: ").append(toIndentedString(businessOutcome)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    modifiedDate: ").append(toIndentedString(modifiedDate)).append("\n");
    sb.append("    preferredSlot: ").append(toIndentedString(preferredSlot)).append("\n");
    sb.append("    reasonForInterest: ").append(toIndentedString(reasonForInterest)).append("\n");
    sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
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
    openapiFields.add("attendeeList");
    openapiFields.add("businessOutcome");
    openapiFields.add("createdDate");
    openapiFields.add("modifiedDate");
    openapiFields.add("preferredSlot");
    openapiFields.add("reasonForInterest");
    openapiFields.add("sessionId");
    openapiFields.add("status");
    openapiFields.add("timezone");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PartnerOfferSession
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (PartnerOfferSession.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in PartnerOfferSession is not found in the empty JSON string", PartnerOfferSession.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!PartnerOfferSession.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PartnerOfferSession` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      JsonArray jsonArrayattendeeList = jsonObj.getAsJsonArray("attendeeList");
      if (jsonArrayattendeeList != null) {
        // ensure the json data is an array
        if (!jsonObj.get("attendeeList").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `attendeeList` to be an array in the JSON string but got `%s`", jsonObj.get("attendeeList").toString()));
        }

        // validate the optional field `attendeeList` (array)
        for (int i = 0; i < jsonArrayattendeeList.size(); i++) {
          PartnerOfferAttendee.validateJsonObject(jsonArrayattendeeList.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("businessOutcome") != null && !jsonObj.get("businessOutcome").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `businessOutcome` to be a primitive type in the JSON string but got `%s`", jsonObj.get("businessOutcome").toString()));
      }
      if (jsonObj.get("preferredSlot") != null && !jsonObj.get("preferredSlot").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `preferredSlot` to be a primitive type in the JSON string but got `%s`", jsonObj.get("preferredSlot").toString()));
      }
      if (jsonObj.get("reasonForInterest") != null && !jsonObj.get("reasonForInterest").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reasonForInterest` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reasonForInterest").toString()));
      }
      if (jsonObj.get("sessionId") != null && !jsonObj.get("sessionId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sessionId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sessionId").toString()));
      }
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if (jsonObj.get("timezone") != null && !jsonObj.get("timezone").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `timezone` to be a primitive type in the JSON string but got `%s`", jsonObj.get("timezone").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PartnerOfferSession.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PartnerOfferSession' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PartnerOfferSession> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PartnerOfferSession.class));

       return (TypeAdapter<T>) new TypeAdapter<PartnerOfferSession>() {
           @Override
           public void write(JsonWriter out, PartnerOfferSession value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PartnerOfferSession read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PartnerOfferSession given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PartnerOfferSession
  * @throws IOException if the JSON string is invalid with respect to PartnerOfferSession
  */
  public static PartnerOfferSession fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PartnerOfferSession.class);
  }

 /**
  * Convert an instance of PartnerOfferSession to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

