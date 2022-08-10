
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
 * AssetViolation
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-03T16:36:05.060218Z[GMT]")
public class AssetViolation {
  public static final String SERIALIZED_NAME_SEVERITY = "severity";
  @SerializedName(SERIALIZED_NAME_SEVERITY)
  private String severity;

  public static final String SERIALIZED_NAME_REGULATORY_TYPE = "regulatoryType";
  @SerializedName(SERIALIZED_NAME_REGULATORY_TYPE)
  private String regulatoryType;

  public static final String SERIALIZED_NAME_VIOLATION_MESSAGE = "violationMessage";
  @SerializedName(SERIALIZED_NAME_VIOLATION_MESSAGE)
  private String violationMessage;

  public static final String SERIALIZED_NAME_VIOLATION_AGE = "violationAge";
  @SerializedName(SERIALIZED_NAME_VIOLATION_AGE)
  private Long violationAge;

  public static final String SERIALIZED_NAME_SUGGESTION = "suggestion";
  @SerializedName(SERIALIZED_NAME_SUGGESTION)
  private String suggestion;

  public static final String SERIALIZED_NAME_POLICY_DESCRIPTION = "policyDescription";
  @SerializedName(SERIALIZED_NAME_POLICY_DESCRIPTION)
  private String policyDescription;

  public static final String SERIALIZED_NAME_RULE_TITLE = "ruleTitle";
  @SerializedName(SERIALIZED_NAME_RULE_TITLE)
  private String ruleTitle;

  public static final String SERIALIZED_NAME_RULE_DESCRIPTION = "ruleDescription";
  @SerializedName(SERIALIZED_NAME_RULE_DESCRIPTION)
  private String ruleDescription;

  public AssetViolation() { 
  }

  public AssetViolation severity(String severity) {
    
    this.severity = severity;
    return this;
  }

   /**
   * Get severity
   * @return severity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSeverity() {
    return severity;
  }


  public void setSeverity(String severity) {
    this.severity = severity;
  }


  public AssetViolation regulatoryType(String regulatoryType) {
    
    this.regulatoryType = regulatoryType;
    return this;
  }

   /**
   * Get regulatoryType
   * @return regulatoryType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getRegulatoryType() {
    return regulatoryType;
  }


  public void setRegulatoryType(String regulatoryType) {
    this.regulatoryType = regulatoryType;
  }


  public AssetViolation violationMessage(String violationMessage) {
    
    this.violationMessage = violationMessage;
    return this;
  }

   /**
   * Get violationMessage
   * @return violationMessage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getViolationMessage() {
    return violationMessage;
  }


  public void setViolationMessage(String violationMessage) {
    this.violationMessage = violationMessage;
  }


  public AssetViolation violationAge(Long violationAge) {
    
    this.violationAge = violationAge;
    return this;
  }

   /**
   * Get violationAge
   * @return violationAge
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getViolationAge() {
    return violationAge;
  }


  public void setViolationAge(Long violationAge) {
    this.violationAge = violationAge;
  }


  public AssetViolation suggestion(String suggestion) {
    
    this.suggestion = suggestion;
    return this;
  }

   /**
   * Get suggestion
   * @return suggestion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSuggestion() {
    return suggestion;
  }


  public void setSuggestion(String suggestion) {
    this.suggestion = suggestion;
  }


  public AssetViolation policyDescription(String policyDescription) {
    
    this.policyDescription = policyDescription;
    return this;
  }

   /**
   * Get policyDescription
   * @return policyDescription
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPolicyDescription() {
    return policyDescription;
  }


  public void setPolicyDescription(String policyDescription) {
    this.policyDescription = policyDescription;
  }


  public AssetViolation ruleTitle(String ruleTitle) {
    
    this.ruleTitle = ruleTitle;
    return this;
  }

   /**
   * Get ruleTitle
   * @return ruleTitle
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getRuleTitle() {
    return ruleTitle;
  }


  public void setRuleTitle(String ruleTitle) {
    this.ruleTitle = ruleTitle;
  }


  public AssetViolation ruleDescription(String ruleDescription) {
    
    this.ruleDescription = ruleDescription;
    return this;
  }

   /**
   * Get ruleDescription
   * @return ruleDescription
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getRuleDescription() {
    return ruleDescription;
  }


  public void setRuleDescription(String ruleDescription) {
    this.ruleDescription = ruleDescription;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssetViolation assetViolation = (AssetViolation) o;
    return Objects.equals(this.severity, assetViolation.severity) &&
        Objects.equals(this.regulatoryType, assetViolation.regulatoryType) &&
        Objects.equals(this.violationMessage, assetViolation.violationMessage) &&
        Objects.equals(this.violationAge, assetViolation.violationAge) &&
        Objects.equals(this.suggestion, assetViolation.suggestion) &&
        Objects.equals(this.policyDescription, assetViolation.policyDescription) &&
        Objects.equals(this.ruleTitle, assetViolation.ruleTitle) &&
        Objects.equals(this.ruleDescription, assetViolation.ruleDescription);
  }

  @Override
  public int hashCode() {
    return Objects.hash(severity, regulatoryType, violationMessage, violationAge, suggestion, policyDescription, ruleTitle, ruleDescription);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssetViolation {\n");
    sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
    sb.append("    regulatoryType: ").append(toIndentedString(regulatoryType)).append("\n");
    sb.append("    violationMessage: ").append(toIndentedString(violationMessage)).append("\n");
    sb.append("    violationAge: ").append(toIndentedString(violationAge)).append("\n");
    sb.append("    suggestion: ").append(toIndentedString(suggestion)).append("\n");
    sb.append("    policyDescription: ").append(toIndentedString(policyDescription)).append("\n");
    sb.append("    ruleTitle: ").append(toIndentedString(ruleTitle)).append("\n");
    sb.append("    ruleDescription: ").append(toIndentedString(ruleDescription)).append("\n");
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
    openapiFields.add("severity");
    openapiFields.add("regulatoryType");
    openapiFields.add("violationMessage");
    openapiFields.add("violationAge");
    openapiFields.add("suggestion");
    openapiFields.add("policyDescription");
    openapiFields.add("ruleTitle");
    openapiFields.add("ruleDescription");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AssetViolation
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AssetViolation.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AssetViolation is not found in the empty JSON string", AssetViolation.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AssetViolation.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AssetViolation` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("severity") != null && !jsonObj.get("severity").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `severity` to be a primitive type in the JSON string but got `%s`", jsonObj.get("severity").toString()));
      }
      if (jsonObj.get("regulatoryType") != null && !jsonObj.get("regulatoryType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `regulatoryType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("regulatoryType").toString()));
      }
      if (jsonObj.get("violationMessage") != null && !jsonObj.get("violationMessage").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `violationMessage` to be a primitive type in the JSON string but got `%s`", jsonObj.get("violationMessage").toString()));
      }
      if (jsonObj.get("suggestion") != null && !jsonObj.get("suggestion").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `suggestion` to be a primitive type in the JSON string but got `%s`", jsonObj.get("suggestion").toString()));
      }
      if (jsonObj.get("policyDescription") != null && !jsonObj.get("policyDescription").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `policyDescription` to be a primitive type in the JSON string but got `%s`", jsonObj.get("policyDescription").toString()));
      }
      if (jsonObj.get("ruleTitle") != null && !jsonObj.get("ruleTitle").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ruleTitle` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ruleTitle").toString()));
      }
      if (jsonObj.get("ruleDescription") != null && !jsonObj.get("ruleDescription").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ruleDescription` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ruleDescription").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AssetViolation.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AssetViolation' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AssetViolation> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AssetViolation.class));

       return (TypeAdapter<T>) new TypeAdapter<AssetViolation>() {
           @Override
           public void write(JsonWriter out, AssetViolation value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AssetViolation read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AssetViolation given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AssetViolation
  * @throws IOException if the JSON string is invalid with respect to AssetViolation
  */
  public static AssetViolation fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AssetViolation.class);
  }

 /**
  * Convert an instance of AssetViolation to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

