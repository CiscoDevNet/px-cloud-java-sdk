

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
 * PolicyRuleDetails
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-03T16:36:05.060218Z[GMT]")
public class PolicyRuleDetails {
  public static final String SERIALIZED_NAME_POLICY_NAME = "policyName";
  @SerializedName(SERIALIZED_NAME_POLICY_NAME)
  private String policyName;

  public static final String SERIALIZED_NAME_POLICY_DESCRIPTION = "policyDescription";
  @SerializedName(SERIALIZED_NAME_POLICY_DESCRIPTION)
  private String policyDescription;

  public static final String SERIALIZED_NAME_POLICY_ID = "policyId";
  @SerializedName(SERIALIZED_NAME_POLICY_ID)
  private String policyId;

  public static final String SERIALIZED_NAME_RULE_ID = "ruleId";
  @SerializedName(SERIALIZED_NAME_RULE_ID)
  private String ruleId;

  public PolicyRuleDetails() { 
  }

  public PolicyRuleDetails policyName(String policyName) {
    
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


  public PolicyRuleDetails policyDescription(String policyDescription) {
    
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


  public PolicyRuleDetails policyId(String policyId) {
    
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


  public PolicyRuleDetails ruleId(String ruleId) {
    
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PolicyRuleDetails policyRuleDetails = (PolicyRuleDetails) o;
    return Objects.equals(this.policyName, policyRuleDetails.policyName) &&
        Objects.equals(this.policyDescription, policyRuleDetails.policyDescription) &&
        Objects.equals(this.policyId, policyRuleDetails.policyId) &&
        Objects.equals(this.ruleId, policyRuleDetails.ruleId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(policyName, policyDescription, policyId, ruleId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PolicyRuleDetails {\n");
    sb.append("    policyName: ").append(toIndentedString(policyName)).append("\n");
    sb.append("    policyDescription: ").append(toIndentedString(policyDescription)).append("\n");
    sb.append("    policyId: ").append(toIndentedString(policyId)).append("\n");
    sb.append("    ruleId: ").append(toIndentedString(ruleId)).append("\n");
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
    openapiFields.add("policyName");
    openapiFields.add("policyDescription");
    openapiFields.add("policyId");
    openapiFields.add("ruleId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PolicyRuleDetails
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (PolicyRuleDetails.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in PolicyRuleDetails is not found in the empty JSON string", PolicyRuleDetails.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!PolicyRuleDetails.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PolicyRuleDetails` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("policyName") != null && !jsonObj.get("policyName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `policyName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("policyName").toString()));
      }
      if (jsonObj.get("policyDescription") != null && !jsonObj.get("policyDescription").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `policyDescription` to be a primitive type in the JSON string but got `%s`", jsonObj.get("policyDescription").toString()));
      }
      if (jsonObj.get("policyId") != null && !jsonObj.get("policyId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `policyId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("policyId").toString()));
      }
      if (jsonObj.get("ruleId") != null && !jsonObj.get("ruleId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ruleId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ruleId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PolicyRuleDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PolicyRuleDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PolicyRuleDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PolicyRuleDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<PolicyRuleDetails>() {
           @Override
           public void write(JsonWriter out, PolicyRuleDetails value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PolicyRuleDetails read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PolicyRuleDetails given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PolicyRuleDetails
  * @throws IOException if the JSON string is invalid with respect to PolicyRuleDetails
  */
  public static PolicyRuleDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PolicyRuleDetails.class);
  }

 /**
  * Convert an instance of PolicyRuleDetails to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

