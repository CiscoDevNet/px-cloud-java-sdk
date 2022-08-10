
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
import com.cisco.px.client.model.CustomerInfo;
import com.cisco.px.client.model.SuccessTrackMapping;
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
 * PartnerOffer
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-05T16:32:06.013598Z[GMT]")
public class PartnerOffer {
  public static final String SERIALIZED_NAME_ACC_TIME_REQUIRED_HOURS = "accTimeRequiredHours";
  @SerializedName(SERIALIZED_NAME_ACC_TIME_REQUIRED_HOURS)
  private Float accTimeRequiredHours;

  public static final String SERIALIZED_NAME_CREATED = "created";
  @SerializedName(SERIALIZED_NAME_CREATED)
  private OffsetDateTime created;

  public static final String SERIALIZED_NAME_CREATED_BY = "createdBy";
  @SerializedName(SERIALIZED_NAME_CREATED_BY)
  private String createdBy;

  public static final String SERIALIZED_NAME_CUSTOMER_LIST = "customerList";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_LIST)
  private List<CustomerInfo> customerList = null;

  public static final String SERIALIZED_NAME_CUSTOMER_RATING = "customerRating";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_RATING)
  private Double customerRating;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_DURATION = "duration";
  @SerializedName(SERIALIZED_NAME_DURATION)
  private Long duration;

  public static final String SERIALIZED_NAME_IMAGE_FILE_NAME = "imageFileName";
  @SerializedName(SERIALIZED_NAME_IMAGE_FILE_NAME)
  private String imageFileName;

  public static final String SERIALIZED_NAME_LANGUAGE = "language";
  @SerializedName(SERIALIZED_NAME_LANGUAGE)
  private String language;

  public static final String SERIALIZED_NAME_LAST_PUBLISHED_DATE = "lastPublishedDate";
  @SerializedName(SERIALIZED_NAME_LAST_PUBLISHED_DATE)
  private OffsetDateTime lastPublishedDate;

  public static final String SERIALIZED_NAME_LOGO_FILE_NAME = "logoFileName";
  @SerializedName(SERIALIZED_NAME_LOGO_FILE_NAME)
  private String logoFileName;

  public static final String SERIALIZED_NAME_MAPPING = "mapping";
  @SerializedName(SERIALIZED_NAME_MAPPING)
  private List<SuccessTrackMapping> mapping = null;

  public static final String SERIALIZED_NAME_MODIFIED = "modified";
  @SerializedName(SERIALIZED_NAME_MODIFIED)
  private OffsetDateTime modified;

  public static final String SERIALIZED_NAME_MODIFIED_BY = "modifiedBy";
  @SerializedName(SERIALIZED_NAME_MODIFIED_BY)
  private String modifiedBy;

  public static final String SERIALIZED_NAME_NO_OF_ATTENDEES = "noOfAttendees";
  @SerializedName(SERIALIZED_NAME_NO_OF_ATTENDEES)
  private Long noOfAttendees;

  public static final String SERIALIZED_NAME_OFFER_ID = "offerId";
  @SerializedName(SERIALIZED_NAME_OFFER_ID)
  private String offerId;

  public static final String SERIALIZED_NAME_OFFER_TYPE = "offerType";
  @SerializedName(SERIALIZED_NAME_OFFER_TYPE)
  private String offerType;

  public static final String SERIALIZED_NAME_PUBLISHED_TO_ALL_CUSTOMERS = "publishedToAllCustomers";
  @SerializedName(SERIALIZED_NAME_PUBLISHED_TO_ALL_CUSTOMERS)
  private Boolean publishedToAllCustomers;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_USER_EMAIL_ID = "userEmailId";
  @SerializedName(SERIALIZED_NAME_USER_EMAIL_ID)
  private String userEmailId;

  public static final String SERIALIZED_NAME_USER_FIRST_NAME = "userFirstName";
  @SerializedName(SERIALIZED_NAME_USER_FIRST_NAME)
  private String userFirstName;

  public static final String SERIALIZED_NAME_USER_LAST_NAME = "userLastName";
  @SerializedName(SERIALIZED_NAME_USER_LAST_NAME)
  private String userLastName;

  public PartnerOffer() { 
  }

  public PartnerOffer accTimeRequiredHours(Float accTimeRequiredHours) {
    
    this.accTimeRequiredHours = accTimeRequiredHours;
    return this;
  }

   /**
   * Get accTimeRequiredHours
   * @return accTimeRequiredHours
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Float getAccTimeRequiredHours() {
    return accTimeRequiredHours;
  }


  public void setAccTimeRequiredHours(Float accTimeRequiredHours) {
    this.accTimeRequiredHours = accTimeRequiredHours;
  }


  public PartnerOffer created(OffsetDateTime created) {
    
    this.created = created;
    return this;
  }

   /**
   * Get created
   * @return created
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getCreated() {
    return created;
  }


  public void setCreated(OffsetDateTime created) {
    this.created = created;
  }


  public PartnerOffer createdBy(String createdBy) {
    
    this.createdBy = createdBy;
    return this;
  }

   /**
   * Get createdBy
   * @return createdBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCreatedBy() {
    return createdBy;
  }


  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }


  public PartnerOffer customerList(List<CustomerInfo> customerList) {
    
    this.customerList = customerList;
    return this;
  }

  public PartnerOffer addCustomerListItem(CustomerInfo customerListItem) {
    if (this.customerList == null) {
      this.customerList = new ArrayList<>();
    }
    this.customerList.add(customerListItem);
    return this;
  }

   /**
   * Get customerList
   * @return customerList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<CustomerInfo> getCustomerList() {
    return customerList;
  }


  public void setCustomerList(List<CustomerInfo> customerList) {
    this.customerList = customerList;
  }


  public PartnerOffer customerRating(Double customerRating) {
    
    this.customerRating = customerRating;
    return this;
  }

   /**
   * Get customerRating
   * @return customerRating
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getCustomerRating() {
    return customerRating;
  }


  public void setCustomerRating(Double customerRating) {
    this.customerRating = customerRating;
  }


  public PartnerOffer description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public PartnerOffer duration(Long duration) {
    
    this.duration = duration;
    return this;
  }

   /**
   * Get duration
   * @return duration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getDuration() {
    return duration;
  }


  public void setDuration(Long duration) {
    this.duration = duration;
  }


  public PartnerOffer imageFileName(String imageFileName) {
    
    this.imageFileName = imageFileName;
    return this;
  }

   /**
   * Get imageFileName
   * @return imageFileName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getImageFileName() {
    return imageFileName;
  }


  public void setImageFileName(String imageFileName) {
    this.imageFileName = imageFileName;
  }


  public PartnerOffer language(String language) {
    
    this.language = language;
    return this;
  }

   /**
   * Get language
   * @return language
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLanguage() {
    return language;
  }


  public void setLanguage(String language) {
    this.language = language;
  }


  public PartnerOffer lastPublishedDate(OffsetDateTime lastPublishedDate) {
    
    this.lastPublishedDate = lastPublishedDate;
    return this;
  }

   /**
   * Get lastPublishedDate
   * @return lastPublishedDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getLastPublishedDate() {
    return lastPublishedDate;
  }


  public void setLastPublishedDate(OffsetDateTime lastPublishedDate) {
    this.lastPublishedDate = lastPublishedDate;
  }


  public PartnerOffer logoFileName(String logoFileName) {
    
    this.logoFileName = logoFileName;
    return this;
  }

   /**
   * Get logoFileName
   * @return logoFileName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLogoFileName() {
    return logoFileName;
  }


  public void setLogoFileName(String logoFileName) {
    this.logoFileName = logoFileName;
  }


  public PartnerOffer mapping(List<SuccessTrackMapping> mapping) {
    
    this.mapping = mapping;
    return this;
  }

  public PartnerOffer addMappingItem(SuccessTrackMapping mappingItem) {
    if (this.mapping == null) {
      this.mapping = new ArrayList<>();
    }
    this.mapping.add(mappingItem);
    return this;
  }

   /**
   * Get mapping
   * @return mapping
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<SuccessTrackMapping> getMapping() {
    return mapping;
  }


  public void setMapping(List<SuccessTrackMapping> mapping) {
    this.mapping = mapping;
  }


  public PartnerOffer modified(OffsetDateTime modified) {
    
    this.modified = modified;
    return this;
  }

   /**
   * Get modified
   * @return modified
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getModified() {
    return modified;
  }


  public void setModified(OffsetDateTime modified) {
    this.modified = modified;
  }


  public PartnerOffer modifiedBy(String modifiedBy) {
    
    this.modifiedBy = modifiedBy;
    return this;
  }

   /**
   * Get modifiedBy
   * @return modifiedBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getModifiedBy() {
    return modifiedBy;
  }


  public void setModifiedBy(String modifiedBy) {
    this.modifiedBy = modifiedBy;
  }


  public PartnerOffer noOfAttendees(Long noOfAttendees) {
    
    this.noOfAttendees = noOfAttendees;
    return this;
  }

   /**
   * Get noOfAttendees
   * @return noOfAttendees
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getNoOfAttendees() {
    return noOfAttendees;
  }


  public void setNoOfAttendees(Long noOfAttendees) {
    this.noOfAttendees = noOfAttendees;
  }


  public PartnerOffer offerId(String offerId) {
    
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


  public PartnerOffer offerType(String offerType) {
    
    this.offerType = offerType;
    return this;
  }

   /**
   * Get offerType
   * @return offerType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getOfferType() {
    return offerType;
  }


  public void setOfferType(String offerType) {
    this.offerType = offerType;
  }


  public PartnerOffer publishedToAllCustomers(Boolean publishedToAllCustomers) {
    
    this.publishedToAllCustomers = publishedToAllCustomers;
    return this;
  }

   /**
   * Get publishedToAllCustomers
   * @return publishedToAllCustomers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getPublishedToAllCustomers() {
    return publishedToAllCustomers;
  }


  public void setPublishedToAllCustomers(Boolean publishedToAllCustomers) {
    this.publishedToAllCustomers = publishedToAllCustomers;
  }


  public PartnerOffer status(String status) {
    
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


  public PartnerOffer title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public PartnerOffer userEmailId(String userEmailId) {
    
    this.userEmailId = userEmailId;
    return this;
  }

   /**
   * Get userEmailId
   * @return userEmailId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUserEmailId() {
    return userEmailId;
  }


  public void setUserEmailId(String userEmailId) {
    this.userEmailId = userEmailId;
  }


  public PartnerOffer userFirstName(String userFirstName) {
    
    this.userFirstName = userFirstName;
    return this;
  }

   /**
   * Get userFirstName
   * @return userFirstName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUserFirstName() {
    return userFirstName;
  }


  public void setUserFirstName(String userFirstName) {
    this.userFirstName = userFirstName;
  }


  public PartnerOffer userLastName(String userLastName) {
    
    this.userLastName = userLastName;
    return this;
  }

   /**
   * Get userLastName
   * @return userLastName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUserLastName() {
    return userLastName;
  }


  public void setUserLastName(String userLastName) {
    this.userLastName = userLastName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PartnerOffer partnerOffer = (PartnerOffer) o;
    return Objects.equals(this.accTimeRequiredHours, partnerOffer.accTimeRequiredHours) &&
        Objects.equals(this.created, partnerOffer.created) &&
        Objects.equals(this.createdBy, partnerOffer.createdBy) &&
        Objects.equals(this.customerList, partnerOffer.customerList) &&
        Objects.equals(this.customerRating, partnerOffer.customerRating) &&
        Objects.equals(this.description, partnerOffer.description) &&
        Objects.equals(this.duration, partnerOffer.duration) &&
        Objects.equals(this.imageFileName, partnerOffer.imageFileName) &&
        Objects.equals(this.language, partnerOffer.language) &&
        Objects.equals(this.lastPublishedDate, partnerOffer.lastPublishedDate) &&
        Objects.equals(this.logoFileName, partnerOffer.logoFileName) &&
        Objects.equals(this.mapping, partnerOffer.mapping) &&
        Objects.equals(this.modified, partnerOffer.modified) &&
        Objects.equals(this.modifiedBy, partnerOffer.modifiedBy) &&
        Objects.equals(this.noOfAttendees, partnerOffer.noOfAttendees) &&
        Objects.equals(this.offerId, partnerOffer.offerId) &&
        Objects.equals(this.offerType, partnerOffer.offerType) &&
        Objects.equals(this.publishedToAllCustomers, partnerOffer.publishedToAllCustomers) &&
        Objects.equals(this.status, partnerOffer.status) &&
        Objects.equals(this.title, partnerOffer.title) &&
        Objects.equals(this.userEmailId, partnerOffer.userEmailId) &&
        Objects.equals(this.userFirstName, partnerOffer.userFirstName) &&
        Objects.equals(this.userLastName, partnerOffer.userLastName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accTimeRequiredHours, created, createdBy, customerList, customerRating, description, duration, imageFileName, language, lastPublishedDate, logoFileName, mapping, modified, modifiedBy, noOfAttendees, offerId, offerType, publishedToAllCustomers, status, title, userEmailId, userFirstName, userLastName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PartnerOffer {\n");
    sb.append("    accTimeRequiredHours: ").append(toIndentedString(accTimeRequiredHours)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    customerList: ").append(toIndentedString(customerList)).append("\n");
    sb.append("    customerRating: ").append(toIndentedString(customerRating)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    imageFileName: ").append(toIndentedString(imageFileName)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    lastPublishedDate: ").append(toIndentedString(lastPublishedDate)).append("\n");
    sb.append("    logoFileName: ").append(toIndentedString(logoFileName)).append("\n");
    sb.append("    mapping: ").append(toIndentedString(mapping)).append("\n");
    sb.append("    modified: ").append(toIndentedString(modified)).append("\n");
    sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
    sb.append("    noOfAttendees: ").append(toIndentedString(noOfAttendees)).append("\n");
    sb.append("    offerId: ").append(toIndentedString(offerId)).append("\n");
    sb.append("    offerType: ").append(toIndentedString(offerType)).append("\n");
    sb.append("    publishedToAllCustomers: ").append(toIndentedString(publishedToAllCustomers)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    userEmailId: ").append(toIndentedString(userEmailId)).append("\n");
    sb.append("    userFirstName: ").append(toIndentedString(userFirstName)).append("\n");
    sb.append("    userLastName: ").append(toIndentedString(userLastName)).append("\n");
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
    openapiFields.add("accTimeRequiredHours");
    openapiFields.add("created");
    openapiFields.add("createdBy");
    openapiFields.add("customerList");
    openapiFields.add("customerRating");
    openapiFields.add("description");
    openapiFields.add("duration");
    openapiFields.add("imageFileName");
    openapiFields.add("language");
    openapiFields.add("lastPublishedDate");
    openapiFields.add("logoFileName");
    openapiFields.add("mapping");
    openapiFields.add("modified");
    openapiFields.add("modifiedBy");
    openapiFields.add("noOfAttendees");
    openapiFields.add("offerId");
    openapiFields.add("offerType");
    openapiFields.add("publishedToAllCustomers");
    openapiFields.add("status");
    openapiFields.add("title");
    openapiFields.add("userEmailId");
    openapiFields.add("userFirstName");
    openapiFields.add("userLastName");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PartnerOffer
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (PartnerOffer.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in PartnerOffer is not found in the empty JSON string", PartnerOffer.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!PartnerOffer.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PartnerOffer` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("createdBy") != null && !jsonObj.get("createdBy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `createdBy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("createdBy").toString()));
      }
      JsonArray jsonArraycustomerList = jsonObj.getAsJsonArray("customerList");
      if (jsonArraycustomerList != null) {
        // ensure the json data is an array
        if (!jsonObj.get("customerList").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `customerList` to be an array in the JSON string but got `%s`", jsonObj.get("customerList").toString()));
        }

        // validate the optional field `customerList` (array)
        for (int i = 0; i < jsonArraycustomerList.size(); i++) {
          CustomerInfo.validateJsonObject(jsonArraycustomerList.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("description") != null && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if (jsonObj.get("imageFileName") != null && !jsonObj.get("imageFileName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `imageFileName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("imageFileName").toString()));
      }
      if (jsonObj.get("language") != null && !jsonObj.get("language").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `language` to be a primitive type in the JSON string but got `%s`", jsonObj.get("language").toString()));
      }
      if (jsonObj.get("logoFileName") != null && !jsonObj.get("logoFileName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `logoFileName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("logoFileName").toString()));
      }
      JsonArray jsonArraymapping = jsonObj.getAsJsonArray("mapping");
      if (jsonArraymapping != null) {
        // ensure the json data is an array
        if (!jsonObj.get("mapping").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `mapping` to be an array in the JSON string but got `%s`", jsonObj.get("mapping").toString()));
        }

        // validate the optional field `mapping` (array)
        for (int i = 0; i < jsonArraymapping.size(); i++) {
          SuccessTrackMapping.validateJsonObject(jsonArraymapping.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("modifiedBy") != null && !jsonObj.get("modifiedBy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `modifiedBy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("modifiedBy").toString()));
      }
      if (jsonObj.get("offerId") != null && !jsonObj.get("offerId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `offerId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("offerId").toString()));
      }
      if (jsonObj.get("offerType") != null && !jsonObj.get("offerType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `offerType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("offerType").toString()));
      }
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if (jsonObj.get("title") != null && !jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
      if (jsonObj.get("userEmailId") != null && !jsonObj.get("userEmailId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `userEmailId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("userEmailId").toString()));
      }
      if (jsonObj.get("userFirstName") != null && !jsonObj.get("userFirstName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `userFirstName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("userFirstName").toString()));
      }
      if (jsonObj.get("userLastName") != null && !jsonObj.get("userLastName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `userLastName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("userLastName").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PartnerOffer.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PartnerOffer' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PartnerOffer> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PartnerOffer.class));

       return (TypeAdapter<T>) new TypeAdapter<PartnerOffer>() {
           @Override
           public void write(JsonWriter out, PartnerOffer value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PartnerOffer read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PartnerOffer given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PartnerOffer
  * @throws IOException if the JSON string is invalid with respect to PartnerOffer
  */
  public static PartnerOffer fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PartnerOffer.class);
  }

 /**
  * Convert an instance of PartnerOffer to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

