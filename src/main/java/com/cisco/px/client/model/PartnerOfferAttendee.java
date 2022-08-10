
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
 * PartnerOfferAttendee
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-05T16:32:06.013598Z[GMT]")
public class PartnerOfferAttendee {
  public static final String SERIALIZED_NAME_ATTENDEE_ID = "attendeeId";
  @SerializedName(SERIALIZED_NAME_ATTENDEE_ID)
  private String attendeeId;

  public static final String SERIALIZED_NAME_ATTENDEE_USER_EMAIL = "attendeeUserEmail";
  @SerializedName(SERIALIZED_NAME_ATTENDEE_USER_EMAIL)
  private String attendeeUserEmail;

  public static final String SERIALIZED_NAME_ATTENDEE_USER_FULL_NAME = "attendeeUserFullName";
  @SerializedName(SERIALIZED_NAME_ATTENDEE_USER_FULL_NAME)
  private String attendeeUserFullName;

  public static final String SERIALIZED_NAME_CCO_ID = "ccoId";
  @SerializedName(SERIALIZED_NAME_CCO_ID)
  private String ccoId;

  public static final String SERIALIZED_NAME_COMPANY_NAME = "companyName";
  @SerializedName(SERIALIZED_NAME_COMPANY_NAME)
  private String companyName;

  public static final String SERIALIZED_NAME_CUSTOMER_ID = "customerId";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_ID)
  private String customerId;

  public PartnerOfferAttendee() { 
  }

  public PartnerOfferAttendee attendeeId(String attendeeId) {
    
    this.attendeeId = attendeeId;
    return this;
  }

   /**
   * Get attendeeId
   * @return attendeeId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAttendeeId() {
    return attendeeId;
  }


  public void setAttendeeId(String attendeeId) {
    this.attendeeId = attendeeId;
  }


  public PartnerOfferAttendee attendeeUserEmail(String attendeeUserEmail) {
    
    this.attendeeUserEmail = attendeeUserEmail;
    return this;
  }

   /**
   * Get attendeeUserEmail
   * @return attendeeUserEmail
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAttendeeUserEmail() {
    return attendeeUserEmail;
  }


  public void setAttendeeUserEmail(String attendeeUserEmail) {
    this.attendeeUserEmail = attendeeUserEmail;
  }


  public PartnerOfferAttendee attendeeUserFullName(String attendeeUserFullName) {
    
    this.attendeeUserFullName = attendeeUserFullName;
    return this;
  }

   /**
   * Get attendeeUserFullName
   * @return attendeeUserFullName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAttendeeUserFullName() {
    return attendeeUserFullName;
  }


  public void setAttendeeUserFullName(String attendeeUserFullName) {
    this.attendeeUserFullName = attendeeUserFullName;
  }


  public PartnerOfferAttendee ccoId(String ccoId) {
    
    this.ccoId = ccoId;
    return this;
  }

   /**
   * Get ccoId
   * @return ccoId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCcoId() {
    return ccoId;
  }


  public void setCcoId(String ccoId) {
    this.ccoId = ccoId;
  }


  public PartnerOfferAttendee companyName(String companyName) {
    
    this.companyName = companyName;
    return this;
  }

   /**
   * Get companyName
   * @return companyName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCompanyName() {
    return companyName;
  }


  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }


  public PartnerOfferAttendee customerId(String customerId) {
    
    this.customerId = customerId;
    return this;
  }

   /**
   * Get customerId
   * @return customerId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCustomerId() {
    return customerId;
  }


  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PartnerOfferAttendee partnerOfferAttendee = (PartnerOfferAttendee) o;
    return Objects.equals(this.attendeeId, partnerOfferAttendee.attendeeId) &&
        Objects.equals(this.attendeeUserEmail, partnerOfferAttendee.attendeeUserEmail) &&
        Objects.equals(this.attendeeUserFullName, partnerOfferAttendee.attendeeUserFullName) &&
        Objects.equals(this.ccoId, partnerOfferAttendee.ccoId) &&
        Objects.equals(this.companyName, partnerOfferAttendee.companyName) &&
        Objects.equals(this.customerId, partnerOfferAttendee.customerId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attendeeId, attendeeUserEmail, attendeeUserFullName, ccoId, companyName, customerId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PartnerOfferAttendee {\n");
    sb.append("    attendeeId: ").append(toIndentedString(attendeeId)).append("\n");
    sb.append("    attendeeUserEmail: ").append(toIndentedString(attendeeUserEmail)).append("\n");
    sb.append("    attendeeUserFullName: ").append(toIndentedString(attendeeUserFullName)).append("\n");
    sb.append("    ccoId: ").append(toIndentedString(ccoId)).append("\n");
    sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
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
    openapiFields.add("attendeeId");
    openapiFields.add("attendeeUserEmail");
    openapiFields.add("attendeeUserFullName");
    openapiFields.add("ccoId");
    openapiFields.add("companyName");
    openapiFields.add("customerId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PartnerOfferAttendee
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (PartnerOfferAttendee.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in PartnerOfferAttendee is not found in the empty JSON string", PartnerOfferAttendee.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!PartnerOfferAttendee.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PartnerOfferAttendee` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("attendeeId") != null && !jsonObj.get("attendeeId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `attendeeId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("attendeeId").toString()));
      }
      if (jsonObj.get("attendeeUserEmail") != null && !jsonObj.get("attendeeUserEmail").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `attendeeUserEmail` to be a primitive type in the JSON string but got `%s`", jsonObj.get("attendeeUserEmail").toString()));
      }
      if (jsonObj.get("attendeeUserFullName") != null && !jsonObj.get("attendeeUserFullName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `attendeeUserFullName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("attendeeUserFullName").toString()));
      }
      if (jsonObj.get("ccoId") != null && !jsonObj.get("ccoId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ccoId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ccoId").toString()));
      }
      if (jsonObj.get("companyName") != null && !jsonObj.get("companyName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `companyName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("companyName").toString()));
      }
      if (jsonObj.get("customerId") != null && !jsonObj.get("customerId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customerId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customerId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PartnerOfferAttendee.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PartnerOfferAttendee' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PartnerOfferAttendee> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PartnerOfferAttendee.class));

       return (TypeAdapter<T>) new TypeAdapter<PartnerOfferAttendee>() {
           @Override
           public void write(JsonWriter out, PartnerOfferAttendee value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PartnerOfferAttendee read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PartnerOfferAttendee given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PartnerOfferAttendee
  * @throws IOException if the JSON string is invalid with respect to PartnerOfferAttendee
  */
  public static PartnerOfferAttendee fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PartnerOfferAttendee.class);
  }

 /**
  * Convert an instance of PartnerOfferAttendee to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

