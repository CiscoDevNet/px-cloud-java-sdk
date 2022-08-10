
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
import com.cisco.px.client.model.AccSessionAttendees;
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
 * AssetSession
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-05T16:32:06.013598Z[GMT]")
public class AssetSession {
  public static final String SERIALIZED_NAME_ADDITIONAL_ATTENDEES = "additionalAttendees";
  @SerializedName(SERIALIZED_NAME_ADDITIONAL_ATTENDEES)
  private List<AccSessionAttendees> additionalAttendees = null;

  public static final String SERIALIZED_NAME_BUSINESS_OUTCOME = "businessOutcome";
  @SerializedName(SERIALIZED_NAME_BUSINESS_OUTCOME)
  private String businessOutcome;

  public static final String SERIALIZED_NAME_CCO_ID = "ccoId";
  @SerializedName(SERIALIZED_NAME_CCO_ID)
  private String ccoId;

  public static final String SERIALIZED_NAME_COMPANY_NAME = "companyName";
  @SerializedName(SERIALIZED_NAME_COMPANY_NAME)
  private String companyName;

  public static final String SERIALIZED_NAME_CUSTOMER_ID = "customerId";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_ID)
  private String customerId;

  public static final String SERIALIZED_NAME_DNAC_VERSION = "dnacVersion";
  @SerializedName(SERIALIZED_NAME_DNAC_VERSION)
  private String dnacVersion;

  public static final String SERIALIZED_NAME_ENVIRONMENT = "environment";
  @SerializedName(SERIALIZED_NAME_ENVIRONMENT)
  private String environment;

  public static final String SERIALIZED_NAME_PREFERRED_LANGUAGE = "preferredLanguage";
  @SerializedName(SERIALIZED_NAME_PREFERRED_LANGUAGE)
  private String preferredLanguage;

  public static final String SERIALIZED_NAME_PREFERRED_SLOT = "preferredSlot";
  @SerializedName(SERIALIZED_NAME_PREFERRED_SLOT)
  private String preferredSlot;

  public static final String SERIALIZED_NAME_PRESENTER_NAME = "presenterName";
  @SerializedName(SERIALIZED_NAME_PRESENTER_NAME)
  private String presenterName;

  public static final String SERIALIZED_NAME_REASON_FOR_INTEREST = "reasonForInterest";
  @SerializedName(SERIALIZED_NAME_REASON_FOR_INTEREST)
  private String reasonForInterest;

  public static final String SERIALIZED_NAME_SESSION_ID = "sessionId";
  @SerializedName(SERIALIZED_NAME_SESSION_ID)
  private String sessionId;

  public static final String SERIALIZED_NAME_SESSION_START_DATE = "sessionStartDate";
  @SerializedName(SERIALIZED_NAME_SESSION_START_DATE)
  private OffsetDateTime sessionStartDate;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_TIMEZONE = "timezone";
  @SerializedName(SERIALIZED_NAME_TIMEZONE)
  private String timezone;

  public static final String SERIALIZED_NAME_USER_EMAIL = "userEmail";
  @SerializedName(SERIALIZED_NAME_USER_EMAIL)
  private String userEmail;

  public static final String SERIALIZED_NAME_USER_FULL_NAME = "userFullName";
  @SerializedName(SERIALIZED_NAME_USER_FULL_NAME)
  private String userFullName;

  public AssetSession() { 
  }

  public AssetSession additionalAttendees(List<AccSessionAttendees> additionalAttendees) {
    
    this.additionalAttendees = additionalAttendees;
    return this;
  }

  public AssetSession addAdditionalAttendeesItem(AccSessionAttendees additionalAttendeesItem) {
    if (this.additionalAttendees == null) {
      this.additionalAttendees = new ArrayList<>();
    }
    this.additionalAttendees.add(additionalAttendeesItem);
    return this;
  }

   /**
   * Get additionalAttendees
   * @return additionalAttendees
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<AccSessionAttendees> getAdditionalAttendees() {
    return additionalAttendees;
  }


  public void setAdditionalAttendees(List<AccSessionAttendees> additionalAttendees) {
    this.additionalAttendees = additionalAttendees;
  }


  public AssetSession businessOutcome(String businessOutcome) {
    
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


  public AssetSession ccoId(String ccoId) {
    
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


  public AssetSession companyName(String companyName) {
    
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


  public AssetSession customerId(String customerId) {
    
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


  public AssetSession dnacVersion(String dnacVersion) {
    
    this.dnacVersion = dnacVersion;
    return this;
  }

   /**
   * Get dnacVersion
   * @return dnacVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDnacVersion() {
    return dnacVersion;
  }


  public void setDnacVersion(String dnacVersion) {
    this.dnacVersion = dnacVersion;
  }


  public AssetSession environment(String environment) {
    
    this.environment = environment;
    return this;
  }

   /**
   * Get environment
   * @return environment
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getEnvironment() {
    return environment;
  }


  public void setEnvironment(String environment) {
    this.environment = environment;
  }


  public AssetSession preferredLanguage(String preferredLanguage) {
    
    this.preferredLanguage = preferredLanguage;
    return this;
  }

   /**
   * Get preferredLanguage
   * @return preferredLanguage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPreferredLanguage() {
    return preferredLanguage;
  }


  public void setPreferredLanguage(String preferredLanguage) {
    this.preferredLanguage = preferredLanguage;
  }


  public AssetSession preferredSlot(String preferredSlot) {
    
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


  public AssetSession presenterName(String presenterName) {
    
    this.presenterName = presenterName;
    return this;
  }

   /**
   * Get presenterName
   * @return presenterName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPresenterName() {
    return presenterName;
  }


  public void setPresenterName(String presenterName) {
    this.presenterName = presenterName;
  }


  public AssetSession reasonForInterest(String reasonForInterest) {
    
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


  public AssetSession sessionId(String sessionId) {
    
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


  public AssetSession sessionStartDate(OffsetDateTime sessionStartDate) {
    
    this.sessionStartDate = sessionStartDate;
    return this;
  }

   /**
   * Get sessionStartDate
   * @return sessionStartDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getSessionStartDate() {
    return sessionStartDate;
  }


  public void setSessionStartDate(OffsetDateTime sessionStartDate) {
    this.sessionStartDate = sessionStartDate;
  }


  public AssetSession status(String status) {
    
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


  public AssetSession timezone(String timezone) {
    
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


  public AssetSession userEmail(String userEmail) {
    
    this.userEmail = userEmail;
    return this;
  }

   /**
   * Get userEmail
   * @return userEmail
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUserEmail() {
    return userEmail;
  }


  public void setUserEmail(String userEmail) {
    this.userEmail = userEmail;
  }


  public AssetSession userFullName(String userFullName) {
    
    this.userFullName = userFullName;
    return this;
  }

   /**
   * Get userFullName
   * @return userFullName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUserFullName() {
    return userFullName;
  }


  public void setUserFullName(String userFullName) {
    this.userFullName = userFullName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssetSession assetSession = (AssetSession) o;
    return Objects.equals(this.additionalAttendees, assetSession.additionalAttendees) &&
        Objects.equals(this.businessOutcome, assetSession.businessOutcome) &&
        Objects.equals(this.ccoId, assetSession.ccoId) &&
        Objects.equals(this.companyName, assetSession.companyName) &&
        Objects.equals(this.customerId, assetSession.customerId) &&
        Objects.equals(this.dnacVersion, assetSession.dnacVersion) &&
        Objects.equals(this.environment, assetSession.environment) &&
        Objects.equals(this.preferredLanguage, assetSession.preferredLanguage) &&
        Objects.equals(this.preferredSlot, assetSession.preferredSlot) &&
        Objects.equals(this.presenterName, assetSession.presenterName) &&
        Objects.equals(this.reasonForInterest, assetSession.reasonForInterest) &&
        Objects.equals(this.sessionId, assetSession.sessionId) &&
        Objects.equals(this.sessionStartDate, assetSession.sessionStartDate) &&
        Objects.equals(this.status, assetSession.status) &&
        Objects.equals(this.timezone, assetSession.timezone) &&
        Objects.equals(this.userEmail, assetSession.userEmail) &&
        Objects.equals(this.userFullName, assetSession.userFullName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalAttendees, businessOutcome, ccoId, companyName, customerId, dnacVersion, environment, preferredLanguage, preferredSlot, presenterName, reasonForInterest, sessionId, sessionStartDate, status, timezone, userEmail, userFullName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssetSession {\n");
    sb.append("    additionalAttendees: ").append(toIndentedString(additionalAttendees)).append("\n");
    sb.append("    businessOutcome: ").append(toIndentedString(businessOutcome)).append("\n");
    sb.append("    ccoId: ").append(toIndentedString(ccoId)).append("\n");
    sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    dnacVersion: ").append(toIndentedString(dnacVersion)).append("\n");
    sb.append("    environment: ").append(toIndentedString(environment)).append("\n");
    sb.append("    preferredLanguage: ").append(toIndentedString(preferredLanguage)).append("\n");
    sb.append("    preferredSlot: ").append(toIndentedString(preferredSlot)).append("\n");
    sb.append("    presenterName: ").append(toIndentedString(presenterName)).append("\n");
    sb.append("    reasonForInterest: ").append(toIndentedString(reasonForInterest)).append("\n");
    sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
    sb.append("    sessionStartDate: ").append(toIndentedString(sessionStartDate)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
    sb.append("    userEmail: ").append(toIndentedString(userEmail)).append("\n");
    sb.append("    userFullName: ").append(toIndentedString(userFullName)).append("\n");
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
    openapiFields.add("additionalAttendees");
    openapiFields.add("businessOutcome");
    openapiFields.add("ccoId");
    openapiFields.add("companyName");
    openapiFields.add("customerId");
    openapiFields.add("dnacVersion");
    openapiFields.add("environment");
    openapiFields.add("preferredLanguage");
    openapiFields.add("preferredSlot");
    openapiFields.add("presenterName");
    openapiFields.add("reasonForInterest");
    openapiFields.add("sessionId");
    openapiFields.add("sessionStartDate");
    openapiFields.add("status");
    openapiFields.add("timezone");
    openapiFields.add("userEmail");
    openapiFields.add("userFullName");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AssetSession
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AssetSession.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AssetSession is not found in the empty JSON string", AssetSession.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AssetSession.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AssetSession` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      JsonArray jsonArrayadditionalAttendees = jsonObj.getAsJsonArray("additionalAttendees");
      if (jsonArrayadditionalAttendees != null) {
        // ensure the json data is an array
        if (!jsonObj.get("additionalAttendees").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `additionalAttendees` to be an array in the JSON string but got `%s`", jsonObj.get("additionalAttendees").toString()));
        }

        // validate the optional field `additionalAttendees` (array)
        for (int i = 0; i < jsonArrayadditionalAttendees.size(); i++) {
          AccSessionAttendees.validateJsonObject(jsonArrayadditionalAttendees.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("businessOutcome") != null && !jsonObj.get("businessOutcome").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `businessOutcome` to be a primitive type in the JSON string but got `%s`", jsonObj.get("businessOutcome").toString()));
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
      if (jsonObj.get("dnacVersion") != null && !jsonObj.get("dnacVersion").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dnacVersion` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dnacVersion").toString()));
      }
      if (jsonObj.get("environment") != null && !jsonObj.get("environment").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `environment` to be a primitive type in the JSON string but got `%s`", jsonObj.get("environment").toString()));
      }
      if (jsonObj.get("preferredLanguage") != null && !jsonObj.get("preferredLanguage").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `preferredLanguage` to be a primitive type in the JSON string but got `%s`", jsonObj.get("preferredLanguage").toString()));
      }
      if (jsonObj.get("preferredSlot") != null && !jsonObj.get("preferredSlot").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `preferredSlot` to be a primitive type in the JSON string but got `%s`", jsonObj.get("preferredSlot").toString()));
      }
      if (jsonObj.get("presenterName") != null && !jsonObj.get("presenterName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `presenterName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("presenterName").toString()));
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
      if (jsonObj.get("userEmail") != null && !jsonObj.get("userEmail").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `userEmail` to be a primitive type in the JSON string but got `%s`", jsonObj.get("userEmail").toString()));
      }
      if (jsonObj.get("userFullName") != null && !jsonObj.get("userFullName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `userFullName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("userFullName").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AssetSession.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AssetSession' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AssetSession> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AssetSession.class));

       return (TypeAdapter<T>) new TypeAdapter<AssetSession>() {
           @Override
           public void write(JsonWriter out, AssetSession value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AssetSession read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AssetSession given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AssetSession
  * @throws IOException if the JSON string is invalid with respect to AssetSession
  */
  public static AssetSession fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AssetSession.class);
  }

 /**
  * Convert an instance of AssetSession to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

