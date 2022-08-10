
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
 * ViolationSummary
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-03T16:36:05.060218Z[GMT]")
public class ViolationSummary {
  public static final String SERIALIZED_NAME_SEVERITY = "severity";
  @SerializedName(SERIALIZED_NAME_SEVERITY)
  private String severity;

  public static final String SERIALIZED_NAME_SEVERITY_ID = "severityId";
  @SerializedName(SERIALIZED_NAME_SEVERITY_ID)
  private String severityId;

  public static final String SERIALIZED_NAME_POLICY_GROUP_ID = "policyGroupId";
  @SerializedName(SERIALIZED_NAME_POLICY_GROUP_ID)
  private String policyGroupId;

  public static final String SERIALIZED_NAME_POLICY_GROUP_NAME = "policyGroupName";
  @SerializedName(SERIALIZED_NAME_POLICY_GROUP_NAME)
  private String policyGroupName;

  public static final String SERIALIZED_NAME_POLICY_ID = "policyId";
  @SerializedName(SERIALIZED_NAME_POLICY_ID)
  private String policyId;

  public static final String SERIALIZED_NAME_POLICY_NAME = "policyName";
  @SerializedName(SERIALIZED_NAME_POLICY_NAME)
  private String policyName;

  public static final String SERIALIZED_NAME_RULE_ID = "ruleId";
  @SerializedName(SERIALIZED_NAME_RULE_ID)
  private String ruleId;

  public static final String SERIALIZED_NAME_RULE_TITLE = "ruleTitle";
  @SerializedName(SERIALIZED_NAME_RULE_TITLE)
  private String ruleTitle;

  public static final String SERIALIZED_NAME_VIOLATION_COUNT = "violationCount";
  @SerializedName(SERIALIZED_NAME_VIOLATION_COUNT)
  private Long violationCount;

  public static final String SERIALIZED_NAME_AFFECTED_ASSETS_COUNT = "affectedAssetsCount";
  @SerializedName(SERIALIZED_NAME_AFFECTED_ASSETS_COUNT)
  private Long affectedAssetsCount;

  public static final String SERIALIZED_NAME_POLICY_CATEGORY = "policyCategory";
  @SerializedName(SERIALIZED_NAME_POLICY_CATEGORY)
  private String policyCategory;

  public ViolationSummary() { 
  }

  public ViolationSummary severity(String severity) {
    
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


  public ViolationSummary severityId(String severityId) {
    
    this.severityId = severityId;
    return this;
  }

   /**
   * Get severityId
   * @return severityId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSeverityId() {
    return severityId;
  }


  public void setSeverityId(String severityId) {
    this.severityId = severityId;
  }


  public ViolationSummary policyGroupId(String policyGroupId) {
    
    this.policyGroupId = policyGroupId;
    return this;
  }

   /**
   * Get policyGroupId
   * @return policyGroupId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPolicyGroupId() {
    return policyGroupId;
  }


  public void setPolicyGroupId(String policyGroupId) {
    this.policyGroupId = policyGroupId;
  }


  public ViolationSummary policyGroupName(String policyGroupName) {
    
    this.policyGroupName = policyGroupName;
    return this;
  }

   /**
   * Get policyGroupName
   * @return policyGroupName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPolicyGroupName() {
    return policyGroupName;
  }


  public void setPolicyGroupName(String policyGroupName) {
    this.policyGroupName = policyGroupName;
  }


  public ViolationSummary policyId(String policyId) {
    
    this.policyId = policyId;
    return this;
  }

   /**
   * Get policyId
   * @return policyId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPolicyId() {
    return policyId;
  }


  public void setPolicyId(String policyId) {
    this.policyId = policyId;
  }


  public ViolationSummary policyName(String policyName) {
    
    this.policyName = policyName;
    return this;
  }

   /**
   * Get policyName
   * @return policyName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPolicyName() {
    return policyName;
  }


  public void setPolicyName(String policyName) {
    this.policyName = policyName;
  }


  public ViolationSummary ruleId(String ruleId) {
    
    this.ruleId = ruleId;
    return this;
  }

   /**
   * Get ruleId
   * @return ruleId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getRuleId() {
    return ruleId;
  }


  public void setRuleId(String ruleId) {
    this.ruleId = ruleId;
  }


  public ViolationSummary ruleTitle(String ruleTitle) {
    
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


  public ViolationSummary violationCount(Long violationCount) {
    
    this.violationCount = violationCount;
    return this;
  }

   /**
   * Get violationCount
   * @return violationCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getViolationCount() {
    return violationCount;
  }


  public void setViolationCount(Long violationCount) {
    this.violationCount = violationCount;
  }


  public ViolationSummary affectedAssetsCount(Long affectedAssetsCount) {
    
    this.affectedAssetsCount = affectedAssetsCount;
    return this;
  }

   /**
   * Get affectedAssetsCount
   * @return affectedAssetsCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getAffectedAssetsCount() {
    return affectedAssetsCount;
  }


  public void setAffectedAssetsCount(Long affectedAssetsCount) {
    this.affectedAssetsCount = affectedAssetsCount;
  }


  public ViolationSummary policyCategory(String policyCategory) {
    
    this.policyCategory = policyCategory;
    return this;
  }

   /**
   * Get policyCategory
   * @return policyCategory
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPolicyCategory() {
    return policyCategory;
  }


  public void setPolicyCategory(String policyCategory) {
    this.policyCategory = policyCategory;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ViolationSummary violationSummary = (ViolationSummary) o;
    return Objects.equals(this.severity, violationSummary.severity) &&
        Objects.equals(this.severityId, violationSummary.severityId) &&
        Objects.equals(this.policyGroupId, violationSummary.policyGroupId) &&
        Objects.equals(this.policyGroupName, violationSummary.policyGroupName) &&
        Objects.equals(this.policyId, violationSummary.policyId) &&
        Objects.equals(this.policyName, violationSummary.policyName) &&
        Objects.equals(this.ruleId, violationSummary.ruleId) &&
        Objects.equals(this.ruleTitle, violationSummary.ruleTitle) &&
        Objects.equals(this.violationCount, violationSummary.violationCount) &&
        Objects.equals(this.affectedAssetsCount, violationSummary.affectedAssetsCount) &&
        Objects.equals(this.policyCategory, violationSummary.policyCategory);
  }

  @Override
  public int hashCode() {
    return Objects.hash(severity, severityId, policyGroupId, policyGroupName, policyId, policyName, ruleId, ruleTitle, violationCount, affectedAssetsCount, policyCategory);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ViolationSummary {\n");
    sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
    sb.append("    severityId: ").append(toIndentedString(severityId)).append("\n");
    sb.append("    policyGroupId: ").append(toIndentedString(policyGroupId)).append("\n");
    sb.append("    policyGroupName: ").append(toIndentedString(policyGroupName)).append("\n");
    sb.append("    policyId: ").append(toIndentedString(policyId)).append("\n");
    sb.append("    policyName: ").append(toIndentedString(policyName)).append("\n");
    sb.append("    ruleId: ").append(toIndentedString(ruleId)).append("\n");
    sb.append("    ruleTitle: ").append(toIndentedString(ruleTitle)).append("\n");
    sb.append("    violationCount: ").append(toIndentedString(violationCount)).append("\n");
    sb.append("    affectedAssetsCount: ").append(toIndentedString(affectedAssetsCount)).append("\n");
    sb.append("    policyCategory: ").append(toIndentedString(policyCategory)).append("\n");
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
    openapiFields.add("severityId");
    openapiFields.add("policyGroupId");
    openapiFields.add("policyGroupName");
    openapiFields.add("policyId");
    openapiFields.add("policyName");
    openapiFields.add("ruleId");
    openapiFields.add("ruleTitle");
    openapiFields.add("violationCount");
    openapiFields.add("affectedAssetsCount");
    openapiFields.add("policyCategory");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ViolationSummary
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ViolationSummary.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ViolationSummary is not found in the empty JSON string", ViolationSummary.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ViolationSummary.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ViolationSummary` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("severity") != null && !jsonObj.get("severity").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `severity` to be a primitive type in the JSON string but got `%s`", jsonObj.get("severity").toString()));
      }
      if (jsonObj.get("severityId") != null && !jsonObj.get("severityId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `severityId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("severityId").toString()));
      }
      if (jsonObj.get("policyGroupId") != null && !jsonObj.get("policyGroupId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `policyGroupId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("policyGroupId").toString()));
      }
      if (jsonObj.get("policyGroupName") != null && !jsonObj.get("policyGroupName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `policyGroupName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("policyGroupName").toString()));
      }
      if (jsonObj.get("policyId") != null && !jsonObj.get("policyId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `policyId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("policyId").toString()));
      }
      if (jsonObj.get("policyName") != null && !jsonObj.get("policyName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `policyName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("policyName").toString()));
      }
      if (jsonObj.get("ruleId") != null && !jsonObj.get("ruleId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ruleId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ruleId").toString()));
      }
      if (jsonObj.get("ruleTitle") != null && !jsonObj.get("ruleTitle").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ruleTitle` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ruleTitle").toString()));
      }
      if (jsonObj.get("policyCategory") != null && !jsonObj.get("policyCategory").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `policyCategory` to be a primitive type in the JSON string but got `%s`", jsonObj.get("policyCategory").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ViolationSummary.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ViolationSummary' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ViolationSummary> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ViolationSummary.class));

       return (TypeAdapter<T>) new TypeAdapter<ViolationSummary>() {
           @Override
           public void write(JsonWriter out, ViolationSummary value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ViolationSummary read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ViolationSummary given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ViolationSummary
  * @throws IOException if the JSON string is invalid with respect to ViolationSummary
  */
  public static ViolationSummary fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ViolationSummary.class);
  }

 /**
  * Convert an instance of ViolationSummary to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

