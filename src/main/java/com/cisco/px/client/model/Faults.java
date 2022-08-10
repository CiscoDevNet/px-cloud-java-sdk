

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
 * Faults
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-03T16:35:03.728797Z[GMT]")
public class Faults {
  public static final String SERIALIZED_NAME_SEVERITY = "severity";
  @SerializedName(SERIALIZED_NAME_SEVERITY)
  private String severity;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_LAST_OCCURENCE = "lastOccurence";
  @SerializedName(SERIALIZED_NAME_LAST_OCCURENCE)
  private OffsetDateTime lastOccurence;

  public static final String SERIALIZED_NAME_CONDITION = "condition";
  @SerializedName(SERIALIZED_NAME_CONDITION)
  private String condition;

  /**
   * Indicates whether support case automation has been enabled for the fault
   */
  @JsonAdapter(CaseAutomationEnum.Adapter.class)
  public enum CaseAutomationEnum {
    ENABLED("enabled"),
    
    DISABLED("disabled");

    private String value;

    CaseAutomationEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CaseAutomationEnum fromValue(String value) {
      for (CaseAutomationEnum b : CaseAutomationEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<CaseAutomationEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CaseAutomationEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CaseAutomationEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return CaseAutomationEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_CASE_AUTOMATION = "caseAutomation";
  @SerializedName(SERIALIZED_NAME_CASE_AUTOMATION)
  private CaseAutomationEnum caseAutomation;

  public static final String SERIALIZED_NAME_FAULT_ID = "faultId";
  @SerializedName(SERIALIZED_NAME_FAULT_ID)
  private Integer faultId;

  public static final String SERIALIZED_NAME_CATEGORY = "category";
  @SerializedName(SERIALIZED_NAME_CATEGORY)
  private String category;

  public static final String SERIALIZED_NAME_OPEN_CASES = "openCases";
  @SerializedName(SERIALIZED_NAME_OPEN_CASES)
  private Integer openCases;

  public static final String SERIALIZED_NAME_AFFECTED_ASSETS = "affectedAssets";
  @SerializedName(SERIALIZED_NAME_AFFECTED_ASSETS)
  private String affectedAssets;

  public static final String SERIALIZED_NAME_OCCURENCES = "occurences";
  @SerializedName(SERIALIZED_NAME_OCCURENCES)
  private Integer occurences;

  public static final String SERIALIZED_NAME_IGNORED_ASSETS = "ignoredAssets";
  @SerializedName(SERIALIZED_NAME_IGNORED_ASSETS)
  private Integer ignoredAssets;

  public Faults() { 
  }

  public Faults severity(String severity) {
    
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


  public Faults title(String title) {
    
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


  public Faults lastOccurence(OffsetDateTime lastOccurence) {
    
    this.lastOccurence = lastOccurence;
    return this;
  }

   /**
   * Date the fault last occurred
   * @return lastOccurence
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Date the fault last occurred")

  public OffsetDateTime getLastOccurence() {
    return lastOccurence;
  }


  public void setLastOccurence(OffsetDateTime lastOccurence) {
    this.lastOccurence = lastOccurence;
  }


  public Faults condition(String condition) {
    
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


  public Faults caseAutomation(CaseAutomationEnum caseAutomation) {
    
    this.caseAutomation = caseAutomation;
    return this;
  }

   /**
   * Indicates whether support case automation has been enabled for the fault
   * @return caseAutomation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates whether support case automation has been enabled for the fault")

  public CaseAutomationEnum getCaseAutomation() {
    return caseAutomation;
  }


  public void setCaseAutomation(CaseAutomationEnum caseAutomation) {
    this.caseAutomation = caseAutomation;
  }


  public Faults faultId(Integer faultId) {
    
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


  public Faults category(String category) {
    
    this.category = category;
    return this;
  }

   /**
   * The category assigned to the fault by CX Cloud, for example System, CPU-Memory, Services, and Environment
   * @return category
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The category assigned to the fault by CX Cloud, for example System, CPU-Memory, Services, and Environment")

  public String getCategory() {
    return category;
  }


  public void setCategory(String category) {
    this.category = category;
  }


  public Faults openCases(Integer openCases) {
    
    this.openCases = openCases;
    return this;
  }

   /**
   * Number of Cisco support cases automatically created for the fault
   * @return openCases
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of Cisco support cases automatically created for the fault")

  public Integer getOpenCases() {
    return openCases;
  }


  public void setOpenCases(Integer openCases) {
    this.openCases = openCases;
  }


  public Faults affectedAssets(String affectedAssets) {
    
    this.affectedAssets = affectedAssets;
    return this;
  }

   /**
   * Number of assets affected by the fault
   * @return affectedAssets
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of assets affected by the fault")

  public String getAffectedAssets() {
    return affectedAssets;
  }


  public void setAffectedAssets(String affectedAssets) {
    this.affectedAssets = affectedAssets;
  }


  public Faults occurences(Integer occurences) {
    
    this.occurences = occurences;
    return this;
  }

   /**
   * Number of times the fault occurred
   * @return occurences
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of times the fault occurred")

  public Integer getOccurences() {
    return occurences;
  }


  public void setOccurences(Integer occurences) {
    this.occurences = occurences;
  }


  public Faults ignoredAssets(Integer ignoredAssets) {
    
    this.ignoredAssets = ignoredAssets;
    return this;
  }

   /**
   * Number of assets the fault is ignored for
   * @return ignoredAssets
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of assets the fault is ignored for")

  public Integer getIgnoredAssets() {
    return ignoredAssets;
  }


  public void setIgnoredAssets(Integer ignoredAssets) {
    this.ignoredAssets = ignoredAssets;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Faults faults = (Faults) o;
    return Objects.equals(this.severity, faults.severity) &&
        Objects.equals(this.title, faults.title) &&
        Objects.equals(this.lastOccurence, faults.lastOccurence) &&
        Objects.equals(this.condition, faults.condition) &&
        Objects.equals(this.caseAutomation, faults.caseAutomation) &&
        Objects.equals(this.faultId, faults.faultId) &&
        Objects.equals(this.category, faults.category) &&
        Objects.equals(this.openCases, faults.openCases) &&
        Objects.equals(this.affectedAssets, faults.affectedAssets) &&
        Objects.equals(this.occurences, faults.occurences) &&
        Objects.equals(this.ignoredAssets, faults.ignoredAssets);
  }

  @Override
  public int hashCode() {
    return Objects.hash(severity, title, lastOccurence, condition, caseAutomation, faultId, category, openCases, affectedAssets, occurences, ignoredAssets);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Faults {\n");
    sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    lastOccurence: ").append(toIndentedString(lastOccurence)).append("\n");
    sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
    sb.append("    caseAutomation: ").append(toIndentedString(caseAutomation)).append("\n");
    sb.append("    faultId: ").append(toIndentedString(faultId)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    openCases: ").append(toIndentedString(openCases)).append("\n");
    sb.append("    affectedAssets: ").append(toIndentedString(affectedAssets)).append("\n");
    sb.append("    occurences: ").append(toIndentedString(occurences)).append("\n");
    sb.append("    ignoredAssets: ").append(toIndentedString(ignoredAssets)).append("\n");
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
    openapiFields.add("title");
    openapiFields.add("lastOccurence");
    openapiFields.add("condition");
    openapiFields.add("caseAutomation");
    openapiFields.add("faultId");
    openapiFields.add("category");
    openapiFields.add("openCases");
    openapiFields.add("affectedAssets");
    openapiFields.add("occurences");
    openapiFields.add("ignoredAssets");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Faults
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (Faults.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in Faults is not found in the empty JSON string", Faults.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Faults.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Faults` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("severity") != null && !jsonObj.get("severity").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `severity` to be a primitive type in the JSON string but got `%s`", jsonObj.get("severity").toString()));
      }
      if (jsonObj.get("title") != null && !jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
      if (jsonObj.get("condition") != null && !jsonObj.get("condition").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `condition` to be a primitive type in the JSON string but got `%s`", jsonObj.get("condition").toString()));
      }
      if (jsonObj.get("caseAutomation") != null && !jsonObj.get("caseAutomation").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `caseAutomation` to be a primitive type in the JSON string but got `%s`", jsonObj.get("caseAutomation").toString()));
      }
      if (jsonObj.get("category") != null && !jsonObj.get("category").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `category` to be a primitive type in the JSON string but got `%s`", jsonObj.get("category").toString()));
      }
      if (jsonObj.get("affectedAssets") != null && !jsonObj.get("affectedAssets").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `affectedAssets` to be a primitive type in the JSON string but got `%s`", jsonObj.get("affectedAssets").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Faults.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Faults' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Faults> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Faults.class));

       return (TypeAdapter<T>) new TypeAdapter<Faults>() {
           @Override
           public void write(JsonWriter out, Faults value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Faults read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Faults given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Faults
  * @throws IOException if the JSON string is invalid with respect to Faults
  */
  public static Faults fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Faults.class);
  }

 /**
  * Convert an instance of Faults to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

