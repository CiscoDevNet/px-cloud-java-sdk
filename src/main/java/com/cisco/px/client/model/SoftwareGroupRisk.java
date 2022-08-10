
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
 * SoftwareGroupRisk
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-03T16:36:10.038229Z[GMT]")
public class SoftwareGroupRisk {
  public static final String SERIALIZED_NAME_CHANGE_FROM_PREV = "changeFromPrev";
  @SerializedName(SERIALIZED_NAME_CHANGE_FROM_PREV)
  private Double changeFromPrev;

  public static final String SERIALIZED_NAME_CHANGE_MESSAGE = "changeMessage";
  @SerializedName(SERIALIZED_NAME_CHANGE_MESSAGE)
  private String changeMessage;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_RISK_CATEGORY = "riskCategory";
  @SerializedName(SERIALIZED_NAME_RISK_CATEGORY)
  private String riskCategory;

  public static final String SERIALIZED_NAME_DATE = "date";
  @SerializedName(SERIALIZED_NAME_DATE)
  private LocalDate date;

  public static final String SERIALIZED_NAME_RISK_SCORE = "riskScore";
  @SerializedName(SERIALIZED_NAME_RISK_SCORE)
  private Double riskScore;

  public SoftwareGroupRisk() { 
  }

  public SoftwareGroupRisk changeFromPrev(Double changeFromPrev) {
    
    this.changeFromPrev = changeFromPrev;
    return this;
  }

   /**
   * The percentage the risk score has changed from the previous week
   * @return changeFromPrev
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The percentage the risk score has changed from the previous week")

  public Double getChangeFromPrev() {
    return changeFromPrev;
  }


  public void setChangeFromPrev(Double changeFromPrev) {
    this.changeFromPrev = changeFromPrev;
  }


  public SoftwareGroupRisk changeMessage(String changeMessage) {
    
    this.changeMessage = changeMessage;
    return this;
  }

   /**
   * Label for the Risk Score Trend graph in CX Cloud that is displayed with the risk score value
   * @return changeMessage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Label for the Risk Score Trend graph in CX Cloud that is displayed with the risk score value")

  public String getChangeMessage() {
    return changeMessage;
  }


  public void setChangeMessage(String changeMessage) {
    this.changeMessage = changeMessage;
  }


  public SoftwareGroupRisk name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Value for the Risk Score Trend graph in CX Cloud to identify the data point type
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Value for the Risk Score Trend graph in CX Cloud to identify the data point type")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public SoftwareGroupRisk riskCategory(String riskCategory) {
    
    this.riskCategory = riskCategory;
    return this;
  }

   /**
   * Risk level of the Cisco software release based on its risk score. The risk level can be High, Medium, or Low.
   * @return riskCategory
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Risk level of the Cisco software release based on its risk score. The risk level can be High, Medium, or Low.")

  public String getRiskCategory() {
    return riskCategory;
  }


  public void setRiskCategory(String riskCategory) {
    this.riskCategory = riskCategory;
  }


  public SoftwareGroupRisk date(LocalDate date) {
    
    this.date = date;
    return this;
  }

   /**
   * Date the weekly risk score was calculated
   * @return date
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Date the weekly risk score was calculated")

  public LocalDate getDate() {
    return date;
  }


  public void setDate(LocalDate date) {
    this.date = date;
  }


  public SoftwareGroupRisk riskScore(Double riskScore) {
    
    this.riskScore = riskScore;
    return this;
  }

   /**
   * Risk score of the Cisco software release for the softwareGroupRiskTrend date
   * @return riskScore
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Risk score of the Cisco software release for the softwareGroupRiskTrend date")

  public Double getRiskScore() {
    return riskScore;
  }


  public void setRiskScore(Double riskScore) {
    this.riskScore = riskScore;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SoftwareGroupRisk softwareGroupRisk = (SoftwareGroupRisk) o;
    return Objects.equals(this.changeFromPrev, softwareGroupRisk.changeFromPrev) &&
        Objects.equals(this.changeMessage, softwareGroupRisk.changeMessage) &&
        Objects.equals(this.name, softwareGroupRisk.name) &&
        Objects.equals(this.riskCategory, softwareGroupRisk.riskCategory) &&
        Objects.equals(this.date, softwareGroupRisk.date) &&
        Objects.equals(this.riskScore, softwareGroupRisk.riskScore);
  }

  @Override
  public int hashCode() {
    return Objects.hash(changeFromPrev, changeMessage, name, riskCategory, date, riskScore);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SoftwareGroupRisk {\n");
    sb.append("    changeFromPrev: ").append(toIndentedString(changeFromPrev)).append("\n");
    sb.append("    changeMessage: ").append(toIndentedString(changeMessage)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    riskCategory: ").append(toIndentedString(riskCategory)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    riskScore: ").append(toIndentedString(riskScore)).append("\n");
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
    openapiFields.add("changeFromPrev");
    openapiFields.add("changeMessage");
    openapiFields.add("name");
    openapiFields.add("riskCategory");
    openapiFields.add("date");
    openapiFields.add("riskScore");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SoftwareGroupRisk
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (SoftwareGroupRisk.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in SoftwareGroupRisk is not found in the empty JSON string", SoftwareGroupRisk.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!SoftwareGroupRisk.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SoftwareGroupRisk` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("changeMessage") != null && !jsonObj.get("changeMessage").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `changeMessage` to be a primitive type in the JSON string but got `%s`", jsonObj.get("changeMessage").toString()));
      }
      if (jsonObj.get("name") != null && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (jsonObj.get("riskCategory") != null && !jsonObj.get("riskCategory").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `riskCategory` to be a primitive type in the JSON string but got `%s`", jsonObj.get("riskCategory").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SoftwareGroupRisk.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SoftwareGroupRisk' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SoftwareGroupRisk> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SoftwareGroupRisk.class));

       return (TypeAdapter<T>) new TypeAdapter<SoftwareGroupRisk>() {
           @Override
           public void write(JsonWriter out, SoftwareGroupRisk value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SoftwareGroupRisk read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SoftwareGroupRisk given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SoftwareGroupRisk
  * @throws IOException if the JSON string is invalid with respect to SoftwareGroupRisk
  */
  public static SoftwareGroupRisk fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SoftwareGroupRisk.class);
  }

 /**
  * Convert an instance of SoftwareGroupRisk to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

