
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
 * AffectedAssets
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-03T16:35:03.728797Z[GMT]")
public class AffectedAssets {
  public static final String SERIALIZED_NAME_ASSET_NAME = "assetName";
  @SerializedName(SERIALIZED_NAME_ASSET_NAME)
  private String assetName;

  public static final String SERIALIZED_NAME_PRODUCT_ID = "productId";
  @SerializedName(SERIALIZED_NAME_PRODUCT_ID)
  private String productId;

  public static final String SERIALIZED_NAME_CASE_NUMBER = "caseNumber";
  @SerializedName(SERIALIZED_NAME_CASE_NUMBER)
  private String caseNumber;

  public static final String SERIALIZED_NAME_CASE_ACTION = "caseAction";
  @SerializedName(SERIALIZED_NAME_CASE_ACTION)
  private String caseAction;

  public static final String SERIALIZED_NAME_OCCURRENCES = "occurrences";
  @SerializedName(SERIALIZED_NAME_OCCURRENCES)
  private Integer occurrences;

  public static final String SERIALIZED_NAME_FIRST_OCCURRENCE = "firstOccurrence";
  @SerializedName(SERIALIZED_NAME_FIRST_OCCURRENCE)
  private OffsetDateTime firstOccurrence;

  public static final String SERIALIZED_NAME_LAST_OCCURRENCE = "lastOccurrence";
  @SerializedName(SERIALIZED_NAME_LAST_OCCURRENCE)
  private OffsetDateTime lastOccurrence;

  public static final String SERIALIZED_NAME_FAULT_ID = "faultId";
  @SerializedName(SERIALIZED_NAME_FAULT_ID)
  private Integer faultId;

  public static final String SERIALIZED_NAME_SERIAL_NUMBER = "serialNumber";
  @SerializedName(SERIALIZED_NAME_SERIAL_NUMBER)
  private String serialNumber;

  public AffectedAssets() { 
  }

  public AffectedAssets assetName(String assetName) {
    
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


  public AffectedAssets productId(String productId) {
    
    this.productId = productId;
    return this;
  }

   /**
   * Cisco product number of the asset
   * @return productId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Cisco product number of the asset")

  public String getProductId() {
    return productId;
  }


  public void setProductId(String productId) {
    this.productId = productId;
  }


  public AffectedAssets caseNumber(String caseNumber) {
    
    this.caseNumber = caseNumber;
    return this;
  }

   /**
   * If case automation is enabled, this is the Cisco support case number created
   * @return caseNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If case automation is enabled, this is the Cisco support case number created")

  public String getCaseNumber() {
    return caseNumber;
  }


  public void setCaseNumber(String caseNumber) {
    this.caseNumber = caseNumber;
  }


  public AffectedAssets caseAction(String caseAction) {
    
    this.caseAction = caseAction;
    return this;
  }

   /**
   * If case automation is enabled, this is the status of the Cisco support case request submitted by CX Cloud for the asset
   * @return caseAction
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If case automation is enabled, this is the status of the Cisco support case request submitted by CX Cloud for the asset")

  public String getCaseAction() {
    return caseAction;
  }


  public void setCaseAction(String caseAction) {
    this.caseAction = caseAction;
  }


  public AffectedAssets occurrences(Integer occurrences) {
    
    this.occurrences = occurrences;
    return this;
  }

   /**
   * Number of times the fault occurred on the asset
   * @return occurrences
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of times the fault occurred on the asset")

  public Integer getOccurrences() {
    return occurrences;
  }


  public void setOccurrences(Integer occurrences) {
    this.occurrences = occurrences;
  }


  public AffectedAssets firstOccurrence(OffsetDateTime firstOccurrence) {
    
    this.firstOccurrence = firstOccurrence;
    return this;
  }

   /**
   * Date the fault first occurred on the asset
   * @return firstOccurrence
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Date the fault first occurred on the asset")

  public OffsetDateTime getFirstOccurrence() {
    return firstOccurrence;
  }


  public void setFirstOccurrence(OffsetDateTime firstOccurrence) {
    this.firstOccurrence = firstOccurrence;
  }


  public AffectedAssets lastOccurrence(OffsetDateTime lastOccurrence) {
    
    this.lastOccurrence = lastOccurrence;
    return this;
  }

   /**
   * Date the fault last occurred on the asset
   * @return lastOccurrence
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Date the fault last occurred on the asset")

  public OffsetDateTime getLastOccurrence() {
    return lastOccurrence;
  }


  public void setLastOccurrence(OffsetDateTime lastOccurrence) {
    this.lastOccurrence = lastOccurrence;
  }


  public AffectedAssets faultId(Integer faultId) {
    
    this.faultId = faultId;
    return this;
  }

   /**
   * Unique identifier used in CX Cloud to identify the fault
   * @return faultId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Unique identifier used in CX Cloud to identify the fault")

  public Integer getFaultId() {
    return faultId;
  }


  public void setFaultId(Integer faultId) {
    this.faultId = faultId;
  }


  public AffectedAssets serialNumber(String serialNumber) {
    
    this.serialNumber = serialNumber;
    return this;
  }

   /**
   * Unique Cisco serial number of the asset
   * @return serialNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Unique Cisco serial number of the asset")

  public String getSerialNumber() {
    return serialNumber;
  }


  public void setSerialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AffectedAssets affectedAssets = (AffectedAssets) o;
    return Objects.equals(this.assetName, affectedAssets.assetName) &&
        Objects.equals(this.productId, affectedAssets.productId) &&
        Objects.equals(this.caseNumber, affectedAssets.caseNumber) &&
        Objects.equals(this.caseAction, affectedAssets.caseAction) &&
        Objects.equals(this.occurrences, affectedAssets.occurrences) &&
        Objects.equals(this.firstOccurrence, affectedAssets.firstOccurrence) &&
        Objects.equals(this.lastOccurrence, affectedAssets.lastOccurrence) &&
        Objects.equals(this.faultId, affectedAssets.faultId) &&
        Objects.equals(this.serialNumber, affectedAssets.serialNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetName, productId, caseNumber, caseAction, occurrences, firstOccurrence, lastOccurrence, faultId, serialNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AffectedAssets {\n");
    sb.append("    assetName: ").append(toIndentedString(assetName)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    caseNumber: ").append(toIndentedString(caseNumber)).append("\n");
    sb.append("    caseAction: ").append(toIndentedString(caseAction)).append("\n");
    sb.append("    occurrences: ").append(toIndentedString(occurrences)).append("\n");
    sb.append("    firstOccurrence: ").append(toIndentedString(firstOccurrence)).append("\n");
    sb.append("    lastOccurrence: ").append(toIndentedString(lastOccurrence)).append("\n");
    sb.append("    faultId: ").append(toIndentedString(faultId)).append("\n");
    sb.append("    serialNumber: ").append(toIndentedString(serialNumber)).append("\n");
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
    openapiFields.add("assetName");
    openapiFields.add("productId");
    openapiFields.add("caseNumber");
    openapiFields.add("caseAction");
    openapiFields.add("occurrences");
    openapiFields.add("firstOccurrence");
    openapiFields.add("lastOccurrence");
    openapiFields.add("faultId");
    openapiFields.add("serialNumber");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AffectedAssets
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AffectedAssets.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AffectedAssets is not found in the empty JSON string", AffectedAssets.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AffectedAssets.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AffectedAssets` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("assetName") != null && !jsonObj.get("assetName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `assetName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("assetName").toString()));
      }
      if (jsonObj.get("productId") != null && !jsonObj.get("productId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `productId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("productId").toString()));
      }
      if (jsonObj.get("caseNumber") != null && !jsonObj.get("caseNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `caseNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("caseNumber").toString()));
      }
      if (jsonObj.get("caseAction") != null && !jsonObj.get("caseAction").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `caseAction` to be a primitive type in the JSON string but got `%s`", jsonObj.get("caseAction").toString()));
      }
      if (jsonObj.get("serialNumber") != null && !jsonObj.get("serialNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `serialNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("serialNumber").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AffectedAssets.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AffectedAssets' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AffectedAssets> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AffectedAssets.class));

       return (TypeAdapter<T>) new TypeAdapter<AffectedAssets>() {
           @Override
           public void write(JsonWriter out, AffectedAssets value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AffectedAssets read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AffectedAssets given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AffectedAssets
  * @throws IOException if the JSON string is invalid with respect to AffectedAssets
  */
  public static AffectedAssets fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AffectedAssets.class);
  }

 /**
  * Convert an instance of AffectedAssets to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

