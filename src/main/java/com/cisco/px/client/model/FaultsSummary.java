
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
 * FaultsSummary
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-03T16:35:03.728797Z[GMT]")
public class FaultsSummary {
  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_SUGGESTION = "suggestion";
  @SerializedName(SERIALIZED_NAME_SUGGESTION)
  private String suggestion;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_CONDITION = "condition";
  @SerializedName(SERIALIZED_NAME_CONDITION)
  private String condition;

  public static final String SERIALIZED_NAME_CATEGORY = "category";
  @SerializedName(SERIALIZED_NAME_CATEGORY)
  private String category;

  public static final String SERIALIZED_NAME_SUPPORTED_PRODUCT_SERIES = "supportedProductSeries";
  @SerializedName(SERIALIZED_NAME_SUPPORTED_PRODUCT_SERIES)
  private String supportedProductSeries;

  public static final String SERIALIZED_NAME_IMPACT = "impact";
  @SerializedName(SERIALIZED_NAME_IMPACT)
  private String impact;

  public static final String SERIALIZED_NAME_SEVERITY = "severity";
  @SerializedName(SERIALIZED_NAME_SEVERITY)
  private String severity;

  public FaultsSummary() { 
  }

  public FaultsSummary title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * Title of the fault
   * @return title
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Title of the fault")

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public FaultsSummary suggestion(String suggestion) {
    
    this.suggestion = suggestion;
    return this;
  }

   /**
   * Suggestion provided by CX Cloud to help address the fault
   * @return suggestion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Suggestion provided by CX Cloud to help address the fault")

  public String getSuggestion() {
    return suggestion;
  }


  public void setSuggestion(String suggestion) {
    this.suggestion = suggestion;
  }


  public FaultsSummary description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Detailed description of the fault
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Detailed description of the fault")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public FaultsSummary condition(String condition) {
    
    this.condition = condition;
    return this;
  }

   /**
   * The facility, condition severity, and mnemonic portion of the fault message
   * @return condition
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The facility, condition severity, and mnemonic portion of the fault message")

  public String getCondition() {
    return condition;
  }


  public void setCondition(String condition) {
    this.condition = condition;
  }


  public FaultsSummary category(String category) {
    
    this.category = category;
    return this;
  }

   /**
   * The category assigned to the fault by CX Cloud, such as System, CPU-Memory, Services, and Environment
   * @return category
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The category assigned to the fault by CX Cloud, such as System, CPU-Memory, Services, and Environment")

  public String getCategory() {
    return category;
  }


  public void setCategory(String category) {
    this.category = category;
  }


  public FaultsSummary supportedProductSeries(String supportedProductSeries) {
    
    this.supportedProductSeries = supportedProductSeries;
    return this;
  }

   /**
   * Cisco product families the fault applies to
   * @return supportedProductSeries
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Cisco product families the fault applies to")

  public String getSupportedProductSeries() {
    return supportedProductSeries;
  }


  public void setSupportedProductSeries(String supportedProductSeries) {
    this.supportedProductSeries = supportedProductSeries;
  }


  public FaultsSummary impact(String impact) {
    
    this.impact = impact;
    return this;
  }

   /**
   * The possible effect the fault has on the assets and network
   * @return impact
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The possible effect the fault has on the assets and network")

  public String getImpact() {
    return impact;
  }


  public void setImpact(String impact) {
    this.impact = impact;
  }


  public FaultsSummary severity(String severity) {
    
    this.severity = severity;
    return this;
  }

   /**
   * Severity value assigned by CX Cloud
   * @return severity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Severity value assigned by CX Cloud")

  public String getSeverity() {
    return severity;
  }


  public void setSeverity(String severity) {
    this.severity = severity;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FaultsSummary faultsSummary = (FaultsSummary) o;
    return Objects.equals(this.title, faultsSummary.title) &&
        Objects.equals(this.suggestion, faultsSummary.suggestion) &&
        Objects.equals(this.description, faultsSummary.description) &&
        Objects.equals(this.condition, faultsSummary.condition) &&
        Objects.equals(this.category, faultsSummary.category) &&
        Objects.equals(this.supportedProductSeries, faultsSummary.supportedProductSeries) &&
        Objects.equals(this.impact, faultsSummary.impact) &&
        Objects.equals(this.severity, faultsSummary.severity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, suggestion, description, condition, category, supportedProductSeries, impact, severity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FaultsSummary {\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    suggestion: ").append(toIndentedString(suggestion)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    supportedProductSeries: ").append(toIndentedString(supportedProductSeries)).append("\n");
    sb.append("    impact: ").append(toIndentedString(impact)).append("\n");
    sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
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
    openapiFields.add("title");
    openapiFields.add("suggestion");
    openapiFields.add("description");
    openapiFields.add("condition");
    openapiFields.add("category");
    openapiFields.add("supportedProductSeries");
    openapiFields.add("impact");
    openapiFields.add("severity");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to FaultsSummary
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (FaultsSummary.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in FaultsSummary is not found in the empty JSON string", FaultsSummary.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!FaultsSummary.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `FaultsSummary` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("title") != null && !jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
      if (jsonObj.get("suggestion") != null && !jsonObj.get("suggestion").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `suggestion` to be a primitive type in the JSON string but got `%s`", jsonObj.get("suggestion").toString()));
      }
      if (jsonObj.get("description") != null && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if (jsonObj.get("condition") != null && !jsonObj.get("condition").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `condition` to be a primitive type in the JSON string but got `%s`", jsonObj.get("condition").toString()));
      }
      if (jsonObj.get("category") != null && !jsonObj.get("category").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `category` to be a primitive type in the JSON string but got `%s`", jsonObj.get("category").toString()));
      }
      if (jsonObj.get("supportedProductSeries") != null && !jsonObj.get("supportedProductSeries").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `supportedProductSeries` to be a primitive type in the JSON string but got `%s`", jsonObj.get("supportedProductSeries").toString()));
      }
      if (jsonObj.get("impact") != null && !jsonObj.get("impact").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `impact` to be a primitive type in the JSON string but got `%s`", jsonObj.get("impact").toString()));
      }
      if (jsonObj.get("severity") != null && !jsonObj.get("severity").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `severity` to be a primitive type in the JSON string but got `%s`", jsonObj.get("severity").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FaultsSummary.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FaultsSummary' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FaultsSummary> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FaultsSummary.class));

       return (TypeAdapter<T>) new TypeAdapter<FaultsSummary>() {
           @Override
           public void write(JsonWriter out, FaultsSummary value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FaultsSummary read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of FaultsSummary given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FaultsSummary
  * @throws IOException if the JSON string is invalid with respect to FaultsSummary
  */
  public static FaultsSummary fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FaultsSummary.class);
  }

 /**
  * Convert an instance of FaultsSummary to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

