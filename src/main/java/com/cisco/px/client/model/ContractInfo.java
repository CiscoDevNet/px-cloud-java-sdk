
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
 * ContractInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-05T16:32:06.013598Z[GMT]")
public class ContractInfo {
  public static final String SERIALIZED_NAME_CITY = "city";
  @SerializedName(SERIALIZED_NAME_CITY)
  private String city;

  public static final String SERIALIZED_NAME_CONTRACT_NUMBER = "contractNumber";
  @SerializedName(SERIALIZED_NAME_CONTRACT_NUMBER)
  private String contractNumber;

  public static final String SERIALIZED_NAME_CONTRACT_STATUS = "contractStatus";
  @SerializedName(SERIALIZED_NAME_CONTRACT_STATUS)
  private String contractStatus;

  public static final String SERIALIZED_NAME_CONTRACT_VALUE = "contractValue";
  @SerializedName(SERIALIZED_NAME_CONTRACT_VALUE)
  private Double contractValue;

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private String country;

  public static final String SERIALIZED_NAME_COUNTRY_CODE = "countryCode";
  @SerializedName(SERIALIZED_NAME_COUNTRY_CODE)
  private String countryCode;

  public static final String SERIALIZED_NAME_CUID = "cuid";
  @SerializedName(SERIALIZED_NAME_CUID)
  private Integer cuid;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private String currency;

  public static final String SERIALIZED_NAME_END_CUST_GU_NAME = "endCustGuName";
  @SerializedName(SERIALIZED_NAME_END_CUST_GU_NAME)
  private String endCustGuName;

  public static final String SERIALIZED_NAME_END_DATE = "endDate";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private OffsetDateTime endDate;

  public static final String SERIALIZED_NAME_START_DATE = "startDate";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private OffsetDateTime startDate;

  public ContractInfo() { 
  }

  public ContractInfo city(String city) {
    
    this.city = city;
    return this;
  }

   /**
   * Get city
   * @return city
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCity() {
    return city;
  }


  public void setCity(String city) {
    this.city = city;
  }


  public ContractInfo contractNumber(String contractNumber) {
    
    this.contractNumber = contractNumber;
    return this;
  }

   /**
   * Get contractNumber
   * @return contractNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getContractNumber() {
    return contractNumber;
  }


  public void setContractNumber(String contractNumber) {
    this.contractNumber = contractNumber;
  }


  public ContractInfo contractStatus(String contractStatus) {
    
    this.contractStatus = contractStatus;
    return this;
  }

   /**
   * Get contractStatus
   * @return contractStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getContractStatus() {
    return contractStatus;
  }


  public void setContractStatus(String contractStatus) {
    this.contractStatus = contractStatus;
  }


  public ContractInfo contractValue(Double contractValue) {
    
    this.contractValue = contractValue;
    return this;
  }

   /**
   * Get contractValue
   * @return contractValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getContractValue() {
    return contractValue;
  }


  public void setContractValue(Double contractValue) {
    this.contractValue = contractValue;
  }


  public ContractInfo country(String country) {
    
    this.country = country;
    return this;
  }

   /**
   * Get country
   * @return country
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCountry() {
    return country;
  }


  public void setCountry(String country) {
    this.country = country;
  }


  public ContractInfo countryCode(String countryCode) {
    
    this.countryCode = countryCode;
    return this;
  }

   /**
   * Get countryCode
   * @return countryCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCountryCode() {
    return countryCode;
  }


  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }


  public ContractInfo cuid(Integer cuid) {
    
    this.cuid = cuid;
    return this;
  }

   /**
   * Get cuid
   * @return cuid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getCuid() {
    return cuid;
  }


  public void setCuid(Integer cuid) {
    this.cuid = cuid;
  }


  public ContractInfo currency(String currency) {
    
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCurrency() {
    return currency;
  }


  public void setCurrency(String currency) {
    this.currency = currency;
  }


  public ContractInfo endCustGuName(String endCustGuName) {
    
    this.endCustGuName = endCustGuName;
    return this;
  }

   /**
   * Get endCustGuName
   * @return endCustGuName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getEndCustGuName() {
    return endCustGuName;
  }


  public void setEndCustGuName(String endCustGuName) {
    this.endCustGuName = endCustGuName;
  }


  public ContractInfo endDate(OffsetDateTime endDate) {
    
    this.endDate = endDate;
    return this;
  }

   /**
   * Get endDate
   * @return endDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getEndDate() {
    return endDate;
  }


  public void setEndDate(OffsetDateTime endDate) {
    this.endDate = endDate;
  }


  public ContractInfo startDate(OffsetDateTime startDate) {
    
    this.startDate = startDate;
    return this;
  }

   /**
   * Get startDate
   * @return startDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getStartDate() {
    return startDate;
  }


  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContractInfo contractInfo = (ContractInfo) o;
    return Objects.equals(this.city, contractInfo.city) &&
        Objects.equals(this.contractNumber, contractInfo.contractNumber) &&
        Objects.equals(this.contractStatus, contractInfo.contractStatus) &&
        Objects.equals(this.contractValue, contractInfo.contractValue) &&
        Objects.equals(this.country, contractInfo.country) &&
        Objects.equals(this.countryCode, contractInfo.countryCode) &&
        Objects.equals(this.cuid, contractInfo.cuid) &&
        Objects.equals(this.currency, contractInfo.currency) &&
        Objects.equals(this.endCustGuName, contractInfo.endCustGuName) &&
        Objects.equals(this.endDate, contractInfo.endDate) &&
        Objects.equals(this.startDate, contractInfo.startDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(city, contractNumber, contractStatus, contractValue, country, countryCode, cuid, currency, endCustGuName, endDate, startDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContractInfo {\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    contractNumber: ").append(toIndentedString(contractNumber)).append("\n");
    sb.append("    contractStatus: ").append(toIndentedString(contractStatus)).append("\n");
    sb.append("    contractValue: ").append(toIndentedString(contractValue)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    cuid: ").append(toIndentedString(cuid)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    endCustGuName: ").append(toIndentedString(endCustGuName)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
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
    openapiFields.add("city");
    openapiFields.add("contractNumber");
    openapiFields.add("contractStatus");
    openapiFields.add("contractValue");
    openapiFields.add("country");
    openapiFields.add("countryCode");
    openapiFields.add("cuid");
    openapiFields.add("currency");
    openapiFields.add("endCustGuName");
    openapiFields.add("endDate");
    openapiFields.add("startDate");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ContractInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ContractInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ContractInfo is not found in the empty JSON string", ContractInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ContractInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ContractInfo` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("city") != null && !jsonObj.get("city").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `city` to be a primitive type in the JSON string but got `%s`", jsonObj.get("city").toString()));
      }
      if (jsonObj.get("contractNumber") != null && !jsonObj.get("contractNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `contractNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("contractNumber").toString()));
      }
      if (jsonObj.get("contractStatus") != null && !jsonObj.get("contractStatus").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `contractStatus` to be a primitive type in the JSON string but got `%s`", jsonObj.get("contractStatus").toString()));
      }
      if (jsonObj.get("country") != null && !jsonObj.get("country").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `country` to be a primitive type in the JSON string but got `%s`", jsonObj.get("country").toString()));
      }
      if (jsonObj.get("countryCode") != null && !jsonObj.get("countryCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `countryCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("countryCode").toString()));
      }
      if (jsonObj.get("currency") != null && !jsonObj.get("currency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currency").toString()));
      }
      if (jsonObj.get("endCustGuName") != null && !jsonObj.get("endCustGuName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `endCustGuName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("endCustGuName").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ContractInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ContractInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ContractInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ContractInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<ContractInfo>() {
           @Override
           public void write(JsonWriter out, ContractInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ContractInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ContractInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ContractInfo
  * @throws IOException if the JSON string is invalid with respect to ContractInfo
  */
  public static ContractInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ContractInfo.class);
  }

 /**
  * Convert an instance of ContractInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

