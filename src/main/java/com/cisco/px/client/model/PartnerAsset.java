
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
import com.cisco.px.client.model.AssetSession;
import com.cisco.px.client.model.SolutionMapping;
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
 * PartnerAsset
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-05T16:32:06.013598Z[GMT]")
public class PartnerAsset {
  public static final String SERIALIZED_NAME_ASSET_ID = "assetId";
  @SerializedName(SERIALIZED_NAME_ASSET_ID)
  private String assetId;

  public static final String SERIALIZED_NAME_ASSET_TYPE = "assetType";
  @SerializedName(SERIALIZED_NAME_ASSET_TYPE)
  private String assetType;

  public static final String SERIALIZED_NAME_COMPLIES = "complies";
  @SerializedName(SERIALIZED_NAME_COMPLIES)
  private Boolean complies;

  public static final String SERIALIZED_NAME_CREATED_BY = "createdBy";
  @SerializedName(SERIALIZED_NAME_CREATED_BY)
  private String createdBy;

  public static final String SERIALIZED_NAME_CUSTOMER = "customer";
  @SerializedName(SERIALIZED_NAME_CUSTOMER)
  private List<String> customer = null;

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

  public static final String SERIALIZED_NAME_IMAGE_URL = "imageUrl";
  @SerializedName(SERIALIZED_NAME_IMAGE_URL)
  private String imageUrl;

  public static final String SERIALIZED_NAME_LAST_UPDATED = "lastUpdated";
  @SerializedName(SERIALIZED_NAME_LAST_UPDATED)
  private OffsetDateTime lastUpdated;

  public static final String SERIALIZED_NAME_MAPPING = "mapping";
  @SerializedName(SERIALIZED_NAME_MAPPING)
  private List<SolutionMapping> mapping = null;

  public static final String SERIALIZED_NAME_PARTNER_ID = "partnerId";
  @SerializedName(SERIALIZED_NAME_PARTNER_ID)
  private String partnerId;

  public static final String SERIALIZED_NAME_PARTNER_NAME = "partnerName";
  @SerializedName(SERIALIZED_NAME_PARTNER_NAME)
  private String partnerName;

  public static final String SERIALIZED_NAME_PARTNER_USER_EMAIL_ID = "partnerUserEmailId";
  @SerializedName(SERIALIZED_NAME_PARTNER_USER_EMAIL_ID)
  private String partnerUserEmailId;

  public static final String SERIALIZED_NAME_PARTNER_USER_FIRST_NAME = "partnerUserFirstName";
  @SerializedName(SERIALIZED_NAME_PARTNER_USER_FIRST_NAME)
  private String partnerUserFirstName;

  public static final String SERIALIZED_NAME_PARTNER_USER_LAST_NAME = "partnerUserLastName";
  @SerializedName(SERIALIZED_NAME_PARTNER_USER_LAST_NAME)
  private String partnerUserLastName;

  public static final String SERIALIZED_NAME_PITSTOPS = "pitstops";
  @SerializedName(SERIALIZED_NAME_PITSTOPS)
  private String pitstops;

  public static final String SERIALIZED_NAME_RECORDING_URL = "recordingUrl";
  @SerializedName(SERIALIZED_NAME_RECORDING_URL)
  private String recordingUrl;

  public static final String SERIALIZED_NAME_SESSIONS = "sessions";
  @SerializedName(SERIALIZED_NAME_SESSIONS)
  private List<AssetSession> sessions = null;

  public static final String SERIALIZED_NAME_SOLUTIONS = "solutions";
  @SerializedName(SERIALIZED_NAME_SOLUTIONS)
  private String solutions;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_TECHNOLOGY_AREA = "technologyArea";
  @SerializedName(SERIALIZED_NAME_TECHNOLOGY_AREA)
  private String technologyArea;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_USECASES = "usecases";
  @SerializedName(SERIALIZED_NAME_USECASES)
  private String usecases;

  public PartnerAsset() { 
  }

  public PartnerAsset assetId(String assetId) {
    
    this.assetId = assetId;
    return this;
  }

   /**
   * Get assetId
   * @return assetId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAssetId() {
    return assetId;
  }


  public void setAssetId(String assetId) {
    this.assetId = assetId;
  }


  public PartnerAsset assetType(String assetType) {
    
    this.assetType = assetType;
    return this;
  }

   /**
   * Get assetType
   * @return assetType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAssetType() {
    return assetType;
  }


  public void setAssetType(String assetType) {
    this.assetType = assetType;
  }


  public PartnerAsset complies(Boolean complies) {
    
    this.complies = complies;
    return this;
  }

   /**
   * Get complies
   * @return complies
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getComplies() {
    return complies;
  }


  public void setComplies(Boolean complies) {
    this.complies = complies;
  }


  public PartnerAsset createdBy(String createdBy) {
    
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


  public PartnerAsset customer(List<String> customer) {
    
    this.customer = customer;
    return this;
  }

  public PartnerAsset addCustomerItem(String customerItem) {
    if (this.customer == null) {
      this.customer = new ArrayList<>();
    }
    this.customer.add(customerItem);
    return this;
  }

   /**
   * Get customer
   * @return customer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getCustomer() {
    return customer;
  }


  public void setCustomer(List<String> customer) {
    this.customer = customer;
  }


  public PartnerAsset customerRating(Double customerRating) {
    
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


  public PartnerAsset description(String description) {
    
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


  public PartnerAsset duration(Long duration) {
    
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


  public PartnerAsset imageFileName(String imageFileName) {
    
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


  public PartnerAsset imageUrl(String imageUrl) {
    
    this.imageUrl = imageUrl;
    return this;
  }

   /**
   * Get imageUrl
   * @return imageUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getImageUrl() {
    return imageUrl;
  }


  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }


  public PartnerAsset lastUpdated(OffsetDateTime lastUpdated) {
    
    this.lastUpdated = lastUpdated;
    return this;
  }

   /**
   * Get lastUpdated
   * @return lastUpdated
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getLastUpdated() {
    return lastUpdated;
  }


  public void setLastUpdated(OffsetDateTime lastUpdated) {
    this.lastUpdated = lastUpdated;
  }


  public PartnerAsset mapping(List<SolutionMapping> mapping) {
    
    this.mapping = mapping;
    return this;
  }

  public PartnerAsset addMappingItem(SolutionMapping mappingItem) {
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

  public List<SolutionMapping> getMapping() {
    return mapping;
  }


  public void setMapping(List<SolutionMapping> mapping) {
    this.mapping = mapping;
  }


  public PartnerAsset partnerId(String partnerId) {
    
    this.partnerId = partnerId;
    return this;
  }

   /**
   * Get partnerId
   * @return partnerId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPartnerId() {
    return partnerId;
  }


  public void setPartnerId(String partnerId) {
    this.partnerId = partnerId;
  }


  public PartnerAsset partnerName(String partnerName) {
    
    this.partnerName = partnerName;
    return this;
  }

   /**
   * Get partnerName
   * @return partnerName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPartnerName() {
    return partnerName;
  }


  public void setPartnerName(String partnerName) {
    this.partnerName = partnerName;
  }


  public PartnerAsset partnerUserEmailId(String partnerUserEmailId) {
    
    this.partnerUserEmailId = partnerUserEmailId;
    return this;
  }

   /**
   * Get partnerUserEmailId
   * @return partnerUserEmailId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPartnerUserEmailId() {
    return partnerUserEmailId;
  }


  public void setPartnerUserEmailId(String partnerUserEmailId) {
    this.partnerUserEmailId = partnerUserEmailId;
  }


  public PartnerAsset partnerUserFirstName(String partnerUserFirstName) {
    
    this.partnerUserFirstName = partnerUserFirstName;
    return this;
  }

   /**
   * Get partnerUserFirstName
   * @return partnerUserFirstName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPartnerUserFirstName() {
    return partnerUserFirstName;
  }


  public void setPartnerUserFirstName(String partnerUserFirstName) {
    this.partnerUserFirstName = partnerUserFirstName;
  }


  public PartnerAsset partnerUserLastName(String partnerUserLastName) {
    
    this.partnerUserLastName = partnerUserLastName;
    return this;
  }

   /**
   * Get partnerUserLastName
   * @return partnerUserLastName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPartnerUserLastName() {
    return partnerUserLastName;
  }


  public void setPartnerUserLastName(String partnerUserLastName) {
    this.partnerUserLastName = partnerUserLastName;
  }


  public PartnerAsset pitstops(String pitstops) {
    
    this.pitstops = pitstops;
    return this;
  }

   /**
   * Get pitstops
   * @return pitstops
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPitstops() {
    return pitstops;
  }


  public void setPitstops(String pitstops) {
    this.pitstops = pitstops;
  }


  public PartnerAsset recordingUrl(String recordingUrl) {
    
    this.recordingUrl = recordingUrl;
    return this;
  }

   /**
   * Get recordingUrl
   * @return recordingUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getRecordingUrl() {
    return recordingUrl;
  }


  public void setRecordingUrl(String recordingUrl) {
    this.recordingUrl = recordingUrl;
  }


  public PartnerAsset sessions(List<AssetSession> sessions) {
    
    this.sessions = sessions;
    return this;
  }

  public PartnerAsset addSessionsItem(AssetSession sessionsItem) {
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

  public List<AssetSession> getSessions() {
    return sessions;
  }


  public void setSessions(List<AssetSession> sessions) {
    this.sessions = sessions;
  }


  public PartnerAsset solutions(String solutions) {
    
    this.solutions = solutions;
    return this;
  }

   /**
   * Get solutions
   * @return solutions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSolutions() {
    return solutions;
  }


  public void setSolutions(String solutions) {
    this.solutions = solutions;
  }


  public PartnerAsset status(String status) {
    
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


  public PartnerAsset technologyArea(String technologyArea) {
    
    this.technologyArea = technologyArea;
    return this;
  }

   /**
   * Get technologyArea
   * @return technologyArea
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTechnologyArea() {
    return technologyArea;
  }


  public void setTechnologyArea(String technologyArea) {
    this.technologyArea = technologyArea;
  }


  public PartnerAsset title(String title) {
    
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


  public PartnerAsset usecases(String usecases) {
    
    this.usecases = usecases;
    return this;
  }

   /**
   * Get usecases
   * @return usecases
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUsecases() {
    return usecases;
  }


  public void setUsecases(String usecases) {
    this.usecases = usecases;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PartnerAsset partnerAsset = (PartnerAsset) o;
    return Objects.equals(this.assetId, partnerAsset.assetId) &&
        Objects.equals(this.assetType, partnerAsset.assetType) &&
        Objects.equals(this.complies, partnerAsset.complies) &&
        Objects.equals(this.createdBy, partnerAsset.createdBy) &&
        Objects.equals(this.customer, partnerAsset.customer) &&
        Objects.equals(this.customerRating, partnerAsset.customerRating) &&
        Objects.equals(this.description, partnerAsset.description) &&
        Objects.equals(this.duration, partnerAsset.duration) &&
        Objects.equals(this.imageFileName, partnerAsset.imageFileName) &&
        Objects.equals(this.imageUrl, partnerAsset.imageUrl) &&
        Objects.equals(this.lastUpdated, partnerAsset.lastUpdated) &&
        Objects.equals(this.mapping, partnerAsset.mapping) &&
        Objects.equals(this.partnerId, partnerAsset.partnerId) &&
        Objects.equals(this.partnerName, partnerAsset.partnerName) &&
        Objects.equals(this.partnerUserEmailId, partnerAsset.partnerUserEmailId) &&
        Objects.equals(this.partnerUserFirstName, partnerAsset.partnerUserFirstName) &&
        Objects.equals(this.partnerUserLastName, partnerAsset.partnerUserLastName) &&
        Objects.equals(this.pitstops, partnerAsset.pitstops) &&
        Objects.equals(this.recordingUrl, partnerAsset.recordingUrl) &&
        Objects.equals(this.sessions, partnerAsset.sessions) &&
        Objects.equals(this.solutions, partnerAsset.solutions) &&
        Objects.equals(this.status, partnerAsset.status) &&
        Objects.equals(this.technologyArea, partnerAsset.technologyArea) &&
        Objects.equals(this.title, partnerAsset.title) &&
        Objects.equals(this.usecases, partnerAsset.usecases);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetId, assetType, complies, createdBy, customer, customerRating, description, duration, imageFileName, imageUrl, lastUpdated, mapping, partnerId, partnerName, partnerUserEmailId, partnerUserFirstName, partnerUserLastName, pitstops, recordingUrl, sessions, solutions, status, technologyArea, title, usecases);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PartnerAsset {\n");
    sb.append("    assetId: ").append(toIndentedString(assetId)).append("\n");
    sb.append("    assetType: ").append(toIndentedString(assetType)).append("\n");
    sb.append("    complies: ").append(toIndentedString(complies)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    customerRating: ").append(toIndentedString(customerRating)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    imageFileName: ").append(toIndentedString(imageFileName)).append("\n");
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
    sb.append("    lastUpdated: ").append(toIndentedString(lastUpdated)).append("\n");
    sb.append("    mapping: ").append(toIndentedString(mapping)).append("\n");
    sb.append("    partnerId: ").append(toIndentedString(partnerId)).append("\n");
    sb.append("    partnerName: ").append(toIndentedString(partnerName)).append("\n");
    sb.append("    partnerUserEmailId: ").append(toIndentedString(partnerUserEmailId)).append("\n");
    sb.append("    partnerUserFirstName: ").append(toIndentedString(partnerUserFirstName)).append("\n");
    sb.append("    partnerUserLastName: ").append(toIndentedString(partnerUserLastName)).append("\n");
    sb.append("    pitstops: ").append(toIndentedString(pitstops)).append("\n");
    sb.append("    recordingUrl: ").append(toIndentedString(recordingUrl)).append("\n");
    sb.append("    sessions: ").append(toIndentedString(sessions)).append("\n");
    sb.append("    solutions: ").append(toIndentedString(solutions)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    technologyArea: ").append(toIndentedString(technologyArea)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    usecases: ").append(toIndentedString(usecases)).append("\n");
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
    openapiFields.add("assetId");
    openapiFields.add("assetType");
    openapiFields.add("complies");
    openapiFields.add("createdBy");
    openapiFields.add("customer");
    openapiFields.add("customerRating");
    openapiFields.add("description");
    openapiFields.add("duration");
    openapiFields.add("imageFileName");
    openapiFields.add("imageUrl");
    openapiFields.add("lastUpdated");
    openapiFields.add("mapping");
    openapiFields.add("partnerId");
    openapiFields.add("partnerName");
    openapiFields.add("partnerUserEmailId");
    openapiFields.add("partnerUserFirstName");
    openapiFields.add("partnerUserLastName");
    openapiFields.add("pitstops");
    openapiFields.add("recordingUrl");
    openapiFields.add("sessions");
    openapiFields.add("solutions");
    openapiFields.add("status");
    openapiFields.add("technologyArea");
    openapiFields.add("title");
    openapiFields.add("usecases");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PartnerAsset
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (PartnerAsset.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in PartnerAsset is not found in the empty JSON string", PartnerAsset.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!PartnerAsset.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PartnerAsset` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("assetId") != null && !jsonObj.get("assetId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `assetId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("assetId").toString()));
      }
      if (jsonObj.get("assetType") != null && !jsonObj.get("assetType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `assetType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("assetType").toString()));
      }
      if (jsonObj.get("createdBy") != null && !jsonObj.get("createdBy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `createdBy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("createdBy").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("customer") != null && !jsonObj.get("customer").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `customer` to be an array in the JSON string but got `%s`", jsonObj.get("customer").toString()));
      }
      if (jsonObj.get("description") != null && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if (jsonObj.get("imageFileName") != null && !jsonObj.get("imageFileName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `imageFileName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("imageFileName").toString()));
      }
      if (jsonObj.get("imageUrl") != null && !jsonObj.get("imageUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `imageUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("imageUrl").toString()));
      }
      JsonArray jsonArraymapping = jsonObj.getAsJsonArray("mapping");
      if (jsonArraymapping != null) {
        // ensure the json data is an array
        if (!jsonObj.get("mapping").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `mapping` to be an array in the JSON string but got `%s`", jsonObj.get("mapping").toString()));
        }

        // validate the optional field `mapping` (array)
        for (int i = 0; i < jsonArraymapping.size(); i++) {
          SolutionMapping.validateJsonObject(jsonArraymapping.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("partnerId") != null && !jsonObj.get("partnerId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `partnerId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("partnerId").toString()));
      }
      if (jsonObj.get("partnerName") != null && !jsonObj.get("partnerName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `partnerName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("partnerName").toString()));
      }
      if (jsonObj.get("partnerUserEmailId") != null && !jsonObj.get("partnerUserEmailId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `partnerUserEmailId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("partnerUserEmailId").toString()));
      }
      if (jsonObj.get("partnerUserFirstName") != null && !jsonObj.get("partnerUserFirstName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `partnerUserFirstName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("partnerUserFirstName").toString()));
      }
      if (jsonObj.get("partnerUserLastName") != null && !jsonObj.get("partnerUserLastName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `partnerUserLastName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("partnerUserLastName").toString()));
      }
      if (jsonObj.get("pitstops") != null && !jsonObj.get("pitstops").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pitstops` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pitstops").toString()));
      }
      if (jsonObj.get("recordingUrl") != null && !jsonObj.get("recordingUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `recordingUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("recordingUrl").toString()));
      }
      JsonArray jsonArraysessions = jsonObj.getAsJsonArray("sessions");
      if (jsonArraysessions != null) {
        // ensure the json data is an array
        if (!jsonObj.get("sessions").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `sessions` to be an array in the JSON string but got `%s`", jsonObj.get("sessions").toString()));
        }

        // validate the optional field `sessions` (array)
        for (int i = 0; i < jsonArraysessions.size(); i++) {
          AssetSession.validateJsonObject(jsonArraysessions.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("solutions") != null && !jsonObj.get("solutions").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `solutions` to be a primitive type in the JSON string but got `%s`", jsonObj.get("solutions").toString()));
      }
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if (jsonObj.get("technologyArea") != null && !jsonObj.get("technologyArea").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `technologyArea` to be a primitive type in the JSON string but got `%s`", jsonObj.get("technologyArea").toString()));
      }
      if (jsonObj.get("title") != null && !jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
      if (jsonObj.get("usecases") != null && !jsonObj.get("usecases").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `usecases` to be a primitive type in the JSON string but got `%s`", jsonObj.get("usecases").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PartnerAsset.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PartnerAsset' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PartnerAsset> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PartnerAsset.class));

       return (TypeAdapter<T>) new TypeAdapter<PartnerAsset>() {
           @Override
           public void write(JsonWriter out, PartnerAsset value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PartnerAsset read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PartnerAsset given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PartnerAsset
  * @throws IOException if the JSON string is invalid with respect to PartnerAsset
  */
  public static PartnerAsset fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PartnerAsset.class);
  }

 /**
  * Convert an instance of PartnerAsset to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

