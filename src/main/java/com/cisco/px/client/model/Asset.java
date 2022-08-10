
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
import java.time.LocalDate;

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
 * Asset
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-03T16:36:10.038229Z[GMT]")
public class Asset {
  public static final String SERIALIZED_NAME_DEPLOYMENT_STATUS = "deploymentStatus";
  @SerializedName(SERIALIZED_NAME_DEPLOYMENT_STATUS)
  private String deploymentStatus;

  public static final String SERIALIZED_NAME_ASSET_NAME = "assetName";
  @SerializedName(SERIALIZED_NAME_ASSET_NAME)
  private String assetName;

  public static final String SERIALIZED_NAME_IP_ADDRESS = "ipAddress";
  @SerializedName(SERIALIZED_NAME_IP_ADDRESS)
  private String ipAddress;

  public static final String SERIALIZED_NAME_SELECTED_RELEASE = "selectedRelease";
  @SerializedName(SERIALIZED_NAME_SELECTED_RELEASE)
  private String selectedRelease;

  public static final String SERIALIZED_NAME_RELEASE_DATE = "releaseDate";
  @SerializedName(SERIALIZED_NAME_RELEASE_DATE)
  private LocalDate releaseDate;

  public static final String SERIALIZED_NAME_SOFTWARE_GROUP_NAME = "softwareGroupName";
  @SerializedName(SERIALIZED_NAME_SOFTWARE_GROUP_NAME)
  private String softwareGroupName;

  public static final String SERIALIZED_NAME_SOFTWARE_TYPE = "softwareType";
  @SerializedName(SERIALIZED_NAME_SOFTWARE_TYPE)
  private String softwareType;

  public static final String SERIALIZED_NAME_CURRENT_RELEASE = "currentRelease";
  @SerializedName(SERIALIZED_NAME_CURRENT_RELEASE)
  private String currentRelease;

  public Asset() { 
  }

  public Asset deploymentStatus(String deploymentStatus) {
    
    this.deploymentStatus = deploymentStatus;
    return this;
  }

   /**
   * Value that indicates whether a suggested Cisco software release has been selected by the customer in CX Cloud to use for the next software update on the asset - • None- A suggested release has not been selected • Upgrade- A suggested release has been selected • Production- A suggested release is already running on the asset
   * @return deploymentStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Value that indicates whether a suggested Cisco software release has been selected by the customer in CX Cloud to use for the next software update on the asset - • None- A suggested release has not been selected • Upgrade- A suggested release has been selected • Production- A suggested release is already running on the asset")

  public String getDeploymentStatus() {
    return deploymentStatus;
  }


  public void setDeploymentStatus(String deploymentStatus) {
    this.deploymentStatus = deploymentStatus;
  }


  public Asset assetName(String assetName) {
    
    this.assetName = assetName;
    return this;
  }

   /**
   * Unique asset name
   * @return assetName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Unique asset name")

  public String getAssetName() {
    return assetName;
  }


  public void setAssetName(String assetName) {
    this.assetName = assetName;
  }


  public Asset ipAddress(String ipAddress) {
    
    this.ipAddress = ipAddress;
    return this;
  }

   /**
   * IP address assigned to the asset
   * @return ipAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "IP address assigned to the asset")

  public String getIpAddress() {
    return ipAddress;
  }


  public void setIpAddress(String ipAddress) {
    this.ipAddress = ipAddress;
  }


  public Asset selectedRelease(String selectedRelease) {
    
    this.selectedRelease = selectedRelease;
    return this;
  }

   /**
   * The suggested Cisco software release the customer selected to use for the next software update on the asset
   * @return selectedRelease
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The suggested Cisco software release the customer selected to use for the next software update on the asset")

  public String getSelectedRelease() {
    return selectedRelease;
  }


  public void setSelectedRelease(String selectedRelease) {
    this.selectedRelease = selectedRelease;
  }


  public Asset releaseDate(LocalDate releaseDate) {
    
    this.releaseDate = releaseDate;
    return this;
  }

   /**
   * Date the Cisco software image was released
   * @return releaseDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Date the Cisco software image was released")

  public LocalDate getReleaseDate() {
    return releaseDate;
  }


  public void setReleaseDate(LocalDate releaseDate) {
    this.releaseDate = releaseDate;
  }


  public Asset softwareGroupName(String softwareGroupName) {
    
    this.softwareGroupName = softwareGroupName;
    return this;
  }

   /**
   * Name of the Software Group whose data is being retrieved. The Software Group name is based on the Cisco product ID of the assets in the Software Group.
   * @return softwareGroupName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of the Software Group whose data is being retrieved. The Software Group name is based on the Cisco product ID of the assets in the Software Group.")

  public String getSoftwareGroupName() {
    return softwareGroupName;
  }


  public void setSoftwareGroupName(String softwareGroupName) {
    this.softwareGroupName = softwareGroupName;
  }


  public Asset softwareType(String softwareType) {
    
    this.softwareType = softwareType;
    return this;
  }

   /**
   * Cisco software type running on the asset, for example IOS-XE
   * @return softwareType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Cisco software type running on the asset, for example IOS-XE")

  public String getSoftwareType() {
    return softwareType;
  }


  public void setSoftwareType(String softwareType) {
    this.softwareType = softwareType;
  }


  public Asset currentRelease(String currentRelease) {
    
    this.currentRelease = currentRelease;
    return this;
  }

   /**
   * Cisco software release running on the asset
   * @return currentRelease
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Cisco software release running on the asset")

  public String getCurrentRelease() {
    return currentRelease;
  }


  public void setCurrentRelease(String currentRelease) {
    this.currentRelease = currentRelease;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Asset asset = (Asset) o;
    return Objects.equals(this.deploymentStatus, asset.deploymentStatus) &&
        Objects.equals(this.assetName, asset.assetName) &&
        Objects.equals(this.ipAddress, asset.ipAddress) &&
        Objects.equals(this.selectedRelease, asset.selectedRelease) &&
        Objects.equals(this.releaseDate, asset.releaseDate) &&
        Objects.equals(this.softwareGroupName, asset.softwareGroupName) &&
        Objects.equals(this.softwareType, asset.softwareType) &&
        Objects.equals(this.currentRelease, asset.currentRelease);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deploymentStatus, assetName, ipAddress, selectedRelease, releaseDate, softwareGroupName, softwareType, currentRelease);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Asset {\n");
    sb.append("    deploymentStatus: ").append(toIndentedString(deploymentStatus)).append("\n");
    sb.append("    assetName: ").append(toIndentedString(assetName)).append("\n");
    sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
    sb.append("    selectedRelease: ").append(toIndentedString(selectedRelease)).append("\n");
    sb.append("    releaseDate: ").append(toIndentedString(releaseDate)).append("\n");
    sb.append("    softwareGroupName: ").append(toIndentedString(softwareGroupName)).append("\n");
    sb.append("    softwareType: ").append(toIndentedString(softwareType)).append("\n");
    sb.append("    currentRelease: ").append(toIndentedString(currentRelease)).append("\n");
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
    openapiFields.add("deploymentStatus");
    openapiFields.add("assetName");
    openapiFields.add("ipAddress");
    openapiFields.add("selectedRelease");
    openapiFields.add("releaseDate");
    openapiFields.add("softwareGroupName");
    openapiFields.add("softwareType");
    openapiFields.add("currentRelease");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Asset
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (Asset.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in Asset is not found in the empty JSON string", Asset.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Asset.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Asset` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("deploymentStatus") != null && !jsonObj.get("deploymentStatus").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `deploymentStatus` to be a primitive type in the JSON string but got `%s`", jsonObj.get("deploymentStatus").toString()));
      }
      if (jsonObj.get("assetName") != null && !jsonObj.get("assetName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `assetName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("assetName").toString()));
      }
      if (jsonObj.get("ipAddress") != null && !jsonObj.get("ipAddress").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ipAddress` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ipAddress").toString()));
      }
      if (jsonObj.get("selectedRelease") != null && !jsonObj.get("selectedRelease").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `selectedRelease` to be a primitive type in the JSON string but got `%s`", jsonObj.get("selectedRelease").toString()));
      }
      if (jsonObj.get("softwareGroupName") != null && !jsonObj.get("softwareGroupName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `softwareGroupName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("softwareGroupName").toString()));
      }
      if (jsonObj.get("softwareType") != null && !jsonObj.get("softwareType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `softwareType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("softwareType").toString()));
      }
      if (jsonObj.get("currentRelease") != null && !jsonObj.get("currentRelease").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currentRelease` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currentRelease").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Asset.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Asset' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Asset> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Asset.class));

       return (TypeAdapter<T>) new TypeAdapter<Asset>() {
           @Override
           public void write(JsonWriter out, Asset value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Asset read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Asset given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Asset
  * @throws IOException if the JSON string is invalid with respect to Asset
  */
  public static Asset fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Asset.class);
  }

 /**
  * Convert an instance of Asset to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

