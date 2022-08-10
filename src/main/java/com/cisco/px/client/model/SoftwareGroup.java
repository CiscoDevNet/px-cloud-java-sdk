
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
 * SoftwareGroup
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-03T16:36:10.038229Z[GMT]")
public class SoftwareGroup {
  public static final String SERIALIZED_NAME_ASSET_COUNT = "assetCount";
  @SerializedName(SERIALIZED_NAME_ASSET_COUNT)
  private Integer assetCount;

  public static final String SERIALIZED_NAME_SOURCE_ID = "sourceId";
  @SerializedName(SERIALIZED_NAME_SOURCE_ID)
  private String sourceId;

  public static final String SERIALIZED_NAME_SOURCE_SYSTEM_ID = "sourceSystemId";
  @SerializedName(SERIALIZED_NAME_SOURCE_SYSTEM_ID)
  private String sourceSystemId;

  public static final String SERIALIZED_NAME_SELECTED_RELEASE = "selectedRelease";
  @SerializedName(SERIALIZED_NAME_SELECTED_RELEASE)
  private String selectedRelease;

  public static final String SERIALIZED_NAME_PRODUCT_FAMILY = "productFamily";
  @SerializedName(SERIALIZED_NAME_PRODUCT_FAMILY)
  private String productFamily;

  public static final String SERIALIZED_NAME_SOFTWARE_GROUP_NAME = "softwareGroupName";
  @SerializedName(SERIALIZED_NAME_SOFTWARE_GROUP_NAME)
  private String softwareGroupName;

  public static final String SERIALIZED_NAME_SOFTWARE_GROUP_ID = "softwareGroupId";
  @SerializedName(SERIALIZED_NAME_SOFTWARE_GROUP_ID)
  private String softwareGroupId;

  public static final String SERIALIZED_NAME_SUGGESTIONS = "suggestions";
  @SerializedName(SERIALIZED_NAME_SUGGESTIONS)
  private String suggestions;

  public static final String SERIALIZED_NAME_RISK_LEVEL = "riskLevel";
  @SerializedName(SERIALIZED_NAME_RISK_LEVEL)
  private String riskLevel;

  public static final String SERIALIZED_NAME_SOFTWARE_TYPE = "softwareType";
  @SerializedName(SERIALIZED_NAME_SOFTWARE_TYPE)
  private String softwareType;

  public static final String SERIALIZED_NAME_CURRENT_RELEASES = "currentReleases";
  @SerializedName(SERIALIZED_NAME_CURRENT_RELEASES)
  private String currentReleases;

  public SoftwareGroup() { 
  }

  public SoftwareGroup assetCount(Integer assetCount) {
    
    this.assetCount = assetCount;
    return this;
  }

   /**
   * Number of assets in the Software Group
   * @return assetCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of assets in the Software Group")

  public Integer getAssetCount() {
    return assetCount;
  }


  public void setAssetCount(Integer assetCount) {
    this.assetCount = assetCount;
  }


  public SoftwareGroup sourceId(String sourceId) {
    
    this.sourceId = sourceId;
    return this;
  }

   /**
   * IP address of the Cisco network management system that manages the assets in the Software Group
   * @return sourceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "IP address of the Cisco network management system that manages the assets in the Software Group")

  public String getSourceId() {
    return sourceId;
  }


  public void setSourceId(String sourceId) {
    this.sourceId = sourceId;
  }


  public SoftwareGroup sourceSystemId(String sourceSystemId) {
    
    this.sourceSystemId = sourceSystemId;
    return this;
  }

   /**
   * Unique identifier of the Cisco network management system that manages the assets in the Software Group
   * @return sourceSystemId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Unique identifier of the Cisco network management system that manages the assets in the Software Group")

  public String getSourceSystemId() {
    return sourceSystemId;
  }


  public void setSourceSystemId(String sourceSystemId) {
    this.sourceSystemId = sourceSystemId;
  }


  public SoftwareGroup selectedRelease(String selectedRelease) {
    
    this.selectedRelease = selectedRelease;
    return this;
  }

   /**
   * The suggested Cisco software release the customer selected to use for the next software update on the assets in the Software Group
   * @return selectedRelease
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The suggested Cisco software release the customer selected to use for the next software update on the assets in the Software Group")

  public String getSelectedRelease() {
    return selectedRelease;
  }


  public void setSelectedRelease(String selectedRelease) {
    this.selectedRelease = selectedRelease;
  }


  public SoftwareGroup productFamily(String productFamily) {
    
    this.productFamily = productFamily;
    return this;
  }

   /**
   * Cisco product family of the assets in the Software Group, for example Cisco Catalyst 9300 Series Switches
   * @return productFamily
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Cisco product family of the assets in the Software Group, for example Cisco Catalyst 9300 Series Switches")

  public String getProductFamily() {
    return productFamily;
  }


  public void setProductFamily(String productFamily) {
    this.productFamily = productFamily;
  }


  public SoftwareGroup softwareGroupName(String softwareGroupName) {
    
    this.softwareGroupName = softwareGroupName;
    return this;
  }

   /**
   * Software Group name based on the Cisco product ID of the assets in the Software Group
   * @return softwareGroupName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Software Group name based on the Cisco product ID of the assets in the Software Group")

  public String getSoftwareGroupName() {
    return softwareGroupName;
  }


  public void setSoftwareGroupName(String softwareGroupName) {
    this.softwareGroupName = softwareGroupName;
  }


  public SoftwareGroup softwareGroupId(String softwareGroupId) {
    
    this.softwareGroupId = softwareGroupId;
    return this;
  }

   /**
   * Unique identifier used in CX Cloud to identify the Software Group
   * @return softwareGroupId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Unique identifier used in CX Cloud to identify the Software Group")

  public String getSoftwareGroupId() {
    return softwareGroupId;
  }


  public void setSoftwareGroupId(String softwareGroupId) {
    this.softwareGroupId = softwareGroupId;
  }


  public SoftwareGroup suggestions(String suggestions) {
    
    this.suggestions = suggestions;
    return this;
  }

   /**
   * Indicates whether Cisco software release suggestions are available for the Software Group
   * @return suggestions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates whether Cisco software release suggestions are available for the Software Group")

  public String getSuggestions() {
    return suggestions;
  }


  public void setSuggestions(String suggestions) {
    this.suggestions = suggestions;
  }


  public SoftwareGroup riskLevel(String riskLevel) {
    
    this.riskLevel = riskLevel;
    return this;
  }

   /**
   * Risk level of the Software Group based on the risk scores of the current Cisco software releases in the Software Group. The risk level can be High, Medium, or Low.
   * @return riskLevel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Risk level of the Software Group based on the risk scores of the current Cisco software releases in the Software Group. The risk level can be High, Medium, or Low.")

  public String getRiskLevel() {
    return riskLevel;
  }


  public void setRiskLevel(String riskLevel) {
    this.riskLevel = riskLevel;
  }


  public SoftwareGroup softwareType(String softwareType) {
    
    this.softwareType = softwareType;
    return this;
  }

   /**
   * Cisco software type running on the assets in the Software Group, for example IOS-XE
   * @return softwareType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Cisco software type running on the assets in the Software Group, for example IOS-XE")

  public String getSoftwareType() {
    return softwareType;
  }


  public void setSoftwareType(String softwareType) {
    this.softwareType = softwareType;
  }


  public SoftwareGroup currentReleases(String currentReleases) {
    
    this.currentReleases = currentReleases;
    return this;
  }

   /**
   * The Cisco software releases running on assets in the Software Group
   * @return currentReleases
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The Cisco software releases running on assets in the Software Group")

  public String getCurrentReleases() {
    return currentReleases;
  }


  public void setCurrentReleases(String currentReleases) {
    this.currentReleases = currentReleases;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SoftwareGroup softwareGroup = (SoftwareGroup) o;
    return Objects.equals(this.assetCount, softwareGroup.assetCount) &&
        Objects.equals(this.sourceId, softwareGroup.sourceId) &&
        Objects.equals(this.sourceSystemId, softwareGroup.sourceSystemId) &&
        Objects.equals(this.selectedRelease, softwareGroup.selectedRelease) &&
        Objects.equals(this.productFamily, softwareGroup.productFamily) &&
        Objects.equals(this.softwareGroupName, softwareGroup.softwareGroupName) &&
        Objects.equals(this.softwareGroupId, softwareGroup.softwareGroupId) &&
        Objects.equals(this.suggestions, softwareGroup.suggestions) &&
        Objects.equals(this.riskLevel, softwareGroup.riskLevel) &&
        Objects.equals(this.softwareType, softwareGroup.softwareType) &&
        Objects.equals(this.currentReleases, softwareGroup.currentReleases);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetCount, sourceId, sourceSystemId, selectedRelease, productFamily, softwareGroupName, softwareGroupId, suggestions, riskLevel, softwareType, currentReleases);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SoftwareGroup {\n");
    sb.append("    assetCount: ").append(toIndentedString(assetCount)).append("\n");
    sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
    sb.append("    sourceSystemId: ").append(toIndentedString(sourceSystemId)).append("\n");
    sb.append("    selectedRelease: ").append(toIndentedString(selectedRelease)).append("\n");
    sb.append("    productFamily: ").append(toIndentedString(productFamily)).append("\n");
    sb.append("    softwareGroupName: ").append(toIndentedString(softwareGroupName)).append("\n");
    sb.append("    softwareGroupId: ").append(toIndentedString(softwareGroupId)).append("\n");
    sb.append("    suggestions: ").append(toIndentedString(suggestions)).append("\n");
    sb.append("    riskLevel: ").append(toIndentedString(riskLevel)).append("\n");
    sb.append("    softwareType: ").append(toIndentedString(softwareType)).append("\n");
    sb.append("    currentReleases: ").append(toIndentedString(currentReleases)).append("\n");
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
    openapiFields.add("assetCount");
    openapiFields.add("sourceId");
    openapiFields.add("sourceSystemId");
    openapiFields.add("selectedRelease");
    openapiFields.add("productFamily");
    openapiFields.add("softwareGroupName");
    openapiFields.add("softwareGroupId");
    openapiFields.add("suggestions");
    openapiFields.add("riskLevel");
    openapiFields.add("softwareType");
    openapiFields.add("currentReleases");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SoftwareGroup
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (SoftwareGroup.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in SoftwareGroup is not found in the empty JSON string", SoftwareGroup.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!SoftwareGroup.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SoftwareGroup` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("sourceId") != null && !jsonObj.get("sourceId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sourceId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sourceId").toString()));
      }
      if (jsonObj.get("sourceSystemId") != null && !jsonObj.get("sourceSystemId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sourceSystemId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sourceSystemId").toString()));
      }
      if (jsonObj.get("selectedRelease") != null && !jsonObj.get("selectedRelease").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `selectedRelease` to be a primitive type in the JSON string but got `%s`", jsonObj.get("selectedRelease").toString()));
      }
      if (jsonObj.get("productFamily") != null && !jsonObj.get("productFamily").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `productFamily` to be a primitive type in the JSON string but got `%s`", jsonObj.get("productFamily").toString()));
      }
      if (jsonObj.get("softwareGroupName") != null && !jsonObj.get("softwareGroupName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `softwareGroupName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("softwareGroupName").toString()));
      }
      if (jsonObj.get("softwareGroupId") != null && !jsonObj.get("softwareGroupId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `softwareGroupId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("softwareGroupId").toString()));
      }
      if (jsonObj.get("suggestions") != null && !jsonObj.get("suggestions").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `suggestions` to be a primitive type in the JSON string but got `%s`", jsonObj.get("suggestions").toString()));
      }
      if (jsonObj.get("riskLevel") != null && !jsonObj.get("riskLevel").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `riskLevel` to be a primitive type in the JSON string but got `%s`", jsonObj.get("riskLevel").toString()));
      }
      if (jsonObj.get("softwareType") != null && !jsonObj.get("softwareType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `softwareType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("softwareType").toString()));
      }
      if (jsonObj.get("currentReleases") != null && !jsonObj.get("currentReleases").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currentReleases` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currentReleases").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SoftwareGroup.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SoftwareGroup' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SoftwareGroup> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SoftwareGroup.class));

       return (TypeAdapter<T>) new TypeAdapter<SoftwareGroup>() {
           @Override
           public void write(JsonWriter out, SoftwareGroup value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SoftwareGroup read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SoftwareGroup given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SoftwareGroup
  * @throws IOException if the JSON string is invalid with respect to SoftwareGroup
  */
  public static SoftwareGroup fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SoftwareGroup.class);
  }

 /**
  * Convert an instance of SoftwareGroup to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

