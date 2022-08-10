
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
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import com.cisco.px.client.model.SuggestionSummaryAdvisoriesSeverityInner;
import com.cisco.px.client.model.SuggestionSummaryBugSeverityInner;
import com.cisco.px.client.model.SuggestionSummaryFieldNoticeSeverityInner;

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
 * SuggestionSummary
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-03T16:36:10.038229Z[GMT]")
public class SuggestionSummary {
  public static final String SERIALIZED_NAME_EXPECTED_SOFTWARE_GROUP_RISK = "expectedSoftwareGroupRisk";
  @SerializedName(SERIALIZED_NAME_EXPECTED_SOFTWARE_GROUP_RISK)
  private Double expectedSoftwareGroupRisk;

  public static final String SERIALIZED_NAME_EXPECTED_SOFTWARE_GROUP_RISK_CATEGORY = "expectedSoftwareGroupRiskCategory";
  @SerializedName(SERIALIZED_NAME_EXPECTED_SOFTWARE_GROUP_RISK_CATEGORY)
  private String expectedSoftwareGroupRiskCategory;

  public static final String SERIALIZED_NAME_SUGGESTION_ID = "suggestionId";
  @SerializedName(SERIALIZED_NAME_SUGGESTION_ID)
  private BigDecimal suggestionId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_RELEASE_DATE = "releaseDate";
  @SerializedName(SERIALIZED_NAME_RELEASE_DATE)
  private OffsetDateTime releaseDate;

  public static final String SERIALIZED_NAME_RELEASE = "release";
  @SerializedName(SERIALIZED_NAME_RELEASE)
  private String release;

  public static final String SERIALIZED_NAME_RELEASE_NOTES_URL = "releaseNotesUrl";
  @SerializedName(SERIALIZED_NAME_RELEASE_NOTES_URL)
  private String releaseNotesUrl;

  public static final String SERIALIZED_NAME_BUG_SEVERITY = "bugSeverity";
  @SerializedName(SERIALIZED_NAME_BUG_SEVERITY)
  private List<SuggestionSummaryBugSeverityInner> bugSeverity = null;

  public static final String SERIALIZED_NAME_ADVISORIES_SEVERITY = "advisoriesSeverity";
  @SerializedName(SERIALIZED_NAME_ADVISORIES_SEVERITY)
  private List<SuggestionSummaryAdvisoriesSeverityInner> advisoriesSeverity = null;

  public static final String SERIALIZED_NAME_FIELD_NOTICE_SEVERITY = "fieldNoticeSeverity";
  @SerializedName(SERIALIZED_NAME_FIELD_NOTICE_SEVERITY)
  private List<SuggestionSummaryFieldNoticeSeverityInner> fieldNoticeSeverity = null;

  public SuggestionSummary() { 
  }

  public SuggestionSummary expectedSoftwareGroupRisk(Double expectedSoftwareGroupRisk) {
    
    this.expectedSoftwareGroupRisk = expectedSoftwareGroupRisk;
    return this;
  }

   /**
   * Current risk score of the Cisco software release, which is the level of exposure the software release has to bugs, security advisories, and field notices. The risk score is used to make software suggestions intended to minimize risk for assets in the Software Group.
   * @return expectedSoftwareGroupRisk
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Current risk score of the Cisco software release, which is the level of exposure the software release has to bugs, security advisories, and field notices. The risk score is used to make software suggestions intended to minimize risk for assets in the Software Group.")

  public Double getExpectedSoftwareGroupRisk() {
    return expectedSoftwareGroupRisk;
  }


  public void setExpectedSoftwareGroupRisk(Double expectedSoftwareGroupRisk) {
    this.expectedSoftwareGroupRisk = expectedSoftwareGroupRisk;
  }


  public SuggestionSummary expectedSoftwareGroupRiskCategory(String expectedSoftwareGroupRiskCategory) {
    
    this.expectedSoftwareGroupRiskCategory = expectedSoftwareGroupRiskCategory;
    return this;
  }

   /**
   * Risk level of the Cisco software release based on its risk score. The risk level can be High, Medium, or Low.
   * @return expectedSoftwareGroupRiskCategory
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Risk level of the Cisco software release based on its risk score. The risk level can be High, Medium, or Low.")

  public String getExpectedSoftwareGroupRiskCategory() {
    return expectedSoftwareGroupRiskCategory;
  }


  public void setExpectedSoftwareGroupRiskCategory(String expectedSoftwareGroupRiskCategory) {
    this.expectedSoftwareGroupRiskCategory = expectedSoftwareGroupRiskCategory;
  }


  public SuggestionSummary suggestionId(BigDecimal suggestionId) {
    
    this.suggestionId = suggestionId;
    return this;
  }

   /**
   * Unique identifier of the suggestion
   * @return suggestionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Unique identifier of the suggestion")

  public BigDecimal getSuggestionId() {
    return suggestionId;
  }


  public void setSuggestionId(BigDecimal suggestionId) {
    this.suggestionId = suggestionId;
  }


  public SuggestionSummary name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Value that indicates whether the Cisco software release is a current release or one of the suggested release options
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Value that indicates whether the Cisco software release is a current release or one of the suggested release options")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public SuggestionSummary releaseDate(OffsetDateTime releaseDate) {
    
    this.releaseDate = releaseDate;
    return this;
  }

   /**
   * Date the Cisco software image was released
   * @return releaseDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Date the Cisco software image was released")

  public OffsetDateTime getReleaseDate() {
    return releaseDate;
  }


  public void setReleaseDate(OffsetDateTime releaseDate) {
    this.releaseDate = releaseDate;
  }


  public SuggestionSummary release(String release) {
    
    this.release = release;
    return this;
  }

   /**
   * Release of the Cisco software
   * @return release
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Release of the Cisco software")

  public String getRelease() {
    return release;
  }


  public void setRelease(String release) {
    this.release = release;
  }


  public SuggestionSummary releaseNotesUrl(String releaseNotesUrl) {
    
    this.releaseNotesUrl = releaseNotesUrl;
    return this;
  }

   /**
   * Public URL for the release notes of the Cisco software release
   * @return releaseNotesUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Public URL for the release notes of the Cisco software release")

  public String getReleaseNotesUrl() {
    return releaseNotesUrl;
  }


  public void setReleaseNotesUrl(String releaseNotesUrl) {
    this.releaseNotesUrl = releaseNotesUrl;
  }


  public SuggestionSummary bugSeverity(List<SuggestionSummaryBugSeverityInner> bugSeverity) {
    
    this.bugSeverity = bugSeverity;
    return this;
  }

  public SuggestionSummary addBugSeverityItem(SuggestionSummaryBugSeverityInner bugSeverityItem) {
    if (this.bugSeverity == null) {
      this.bugSeverity = new ArrayList<>();
    }
    this.bugSeverity.add(bugSeverityItem);
    return this;
  }

   /**
   * Number of bugs the Cisco software release is exposed to, and for suggested releases, the number of bugs the suggested release addresses
   * @return bugSeverity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of bugs the Cisco software release is exposed to, and for suggested releases, the number of bugs the suggested release addresses")

  public List<SuggestionSummaryBugSeverityInner> getBugSeverity() {
    return bugSeverity;
  }


  public void setBugSeverity(List<SuggestionSummaryBugSeverityInner> bugSeverity) {
    this.bugSeverity = bugSeverity;
  }


  public SuggestionSummary advisoriesSeverity(List<SuggestionSummaryAdvisoriesSeverityInner> advisoriesSeverity) {
    
    this.advisoriesSeverity = advisoriesSeverity;
    return this;
  }

  public SuggestionSummary addAdvisoriesSeverityItem(SuggestionSummaryAdvisoriesSeverityInner advisoriesSeverityItem) {
    if (this.advisoriesSeverity == null) {
      this.advisoriesSeverity = new ArrayList<>();
    }
    this.advisoriesSeverity.add(advisoriesSeverityItem);
    return this;
  }

   /**
   * Number of security advisories the current Cisco software releases are exposed to that are addressed by the suggested release
   * @return advisoriesSeverity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of security advisories the current Cisco software releases are exposed to that are addressed by the suggested release")

  public List<SuggestionSummaryAdvisoriesSeverityInner> getAdvisoriesSeverity() {
    return advisoriesSeverity;
  }


  public void setAdvisoriesSeverity(List<SuggestionSummaryAdvisoriesSeverityInner> advisoriesSeverity) {
    this.advisoriesSeverity = advisoriesSeverity;
  }


  public SuggestionSummary fieldNoticeSeverity(List<SuggestionSummaryFieldNoticeSeverityInner> fieldNoticeSeverity) {
    
    this.fieldNoticeSeverity = fieldNoticeSeverity;
    return this;
  }

  public SuggestionSummary addFieldNoticeSeverityItem(SuggestionSummaryFieldNoticeSeverityInner fieldNoticeSeverityItem) {
    if (this.fieldNoticeSeverity == null) {
      this.fieldNoticeSeverity = new ArrayList<>();
    }
    this.fieldNoticeSeverity.add(fieldNoticeSeverityItem);
    return this;
  }

   /**
   * Number of field notices the current Cisco software releases are exposed to that are addressed by the suggested release
   * @return fieldNoticeSeverity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of field notices the current Cisco software releases are exposed to that are addressed by the suggested release")

  public List<SuggestionSummaryFieldNoticeSeverityInner> getFieldNoticeSeverity() {
    return fieldNoticeSeverity;
  }


  public void setFieldNoticeSeverity(List<SuggestionSummaryFieldNoticeSeverityInner> fieldNoticeSeverity) {
    this.fieldNoticeSeverity = fieldNoticeSeverity;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SuggestionSummary suggestionSummary = (SuggestionSummary) o;
    return Objects.equals(this.expectedSoftwareGroupRisk, suggestionSummary.expectedSoftwareGroupRisk) &&
        Objects.equals(this.expectedSoftwareGroupRiskCategory, suggestionSummary.expectedSoftwareGroupRiskCategory) &&
        Objects.equals(this.suggestionId, suggestionSummary.suggestionId) &&
        Objects.equals(this.name, suggestionSummary.name) &&
        Objects.equals(this.releaseDate, suggestionSummary.releaseDate) &&
        Objects.equals(this.release, suggestionSummary.release) &&
        Objects.equals(this.releaseNotesUrl, suggestionSummary.releaseNotesUrl) &&
        Objects.equals(this.bugSeverity, suggestionSummary.bugSeverity) &&
        Objects.equals(this.advisoriesSeverity, suggestionSummary.advisoriesSeverity) &&
        Objects.equals(this.fieldNoticeSeverity, suggestionSummary.fieldNoticeSeverity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expectedSoftwareGroupRisk, expectedSoftwareGroupRiskCategory, suggestionId, name, releaseDate, release, releaseNotesUrl, bugSeverity, advisoriesSeverity, fieldNoticeSeverity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SuggestionSummary {\n");
    sb.append("    expectedSoftwareGroupRisk: ").append(toIndentedString(expectedSoftwareGroupRisk)).append("\n");
    sb.append("    expectedSoftwareGroupRiskCategory: ").append(toIndentedString(expectedSoftwareGroupRiskCategory)).append("\n");
    sb.append("    suggestionId: ").append(toIndentedString(suggestionId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    releaseDate: ").append(toIndentedString(releaseDate)).append("\n");
    sb.append("    release: ").append(toIndentedString(release)).append("\n");
    sb.append("    releaseNotesUrl: ").append(toIndentedString(releaseNotesUrl)).append("\n");
    sb.append("    bugSeverity: ").append(toIndentedString(bugSeverity)).append("\n");
    sb.append("    advisoriesSeverity: ").append(toIndentedString(advisoriesSeverity)).append("\n");
    sb.append("    fieldNoticeSeverity: ").append(toIndentedString(fieldNoticeSeverity)).append("\n");
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
    openapiFields.add("expectedSoftwareGroupRisk");
    openapiFields.add("expectedSoftwareGroupRiskCategory");
    openapiFields.add("suggestionId");
    openapiFields.add("name");
    openapiFields.add("releaseDate");
    openapiFields.add("release");
    openapiFields.add("releaseNotesUrl");
    openapiFields.add("bugSeverity");
    openapiFields.add("advisoriesSeverity");
    openapiFields.add("fieldNoticeSeverity");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SuggestionSummary
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (SuggestionSummary.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in SuggestionSummary is not found in the empty JSON string", SuggestionSummary.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!SuggestionSummary.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SuggestionSummary` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("expectedSoftwareGroupRiskCategory") != null && !jsonObj.get("expectedSoftwareGroupRiskCategory").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `expectedSoftwareGroupRiskCategory` to be a primitive type in the JSON string but got `%s`", jsonObj.get("expectedSoftwareGroupRiskCategory").toString()));
      }
      if (jsonObj.get("name") != null && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (jsonObj.get("release") != null && !jsonObj.get("release").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `release` to be a primitive type in the JSON string but got `%s`", jsonObj.get("release").toString()));
      }
      if (jsonObj.get("releaseNotesUrl") != null && !jsonObj.get("releaseNotesUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `releaseNotesUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("releaseNotesUrl").toString()));
      }
      JsonArray jsonArraybugSeverity = jsonObj.getAsJsonArray("bugSeverity");
      if (jsonArraybugSeverity != null) {
        // ensure the json data is an array
        if (!jsonObj.get("bugSeverity").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `bugSeverity` to be an array in the JSON string but got `%s`", jsonObj.get("bugSeverity").toString()));
        }

        // validate the optional field `bugSeverity` (array)
        for (int i = 0; i < jsonArraybugSeverity.size(); i++) {
          SuggestionSummaryBugSeverityInner.validateJsonObject(jsonArraybugSeverity.get(i).getAsJsonObject());
        };
      }
      JsonArray jsonArrayadvisoriesSeverity = jsonObj.getAsJsonArray("advisoriesSeverity");
      if (jsonArrayadvisoriesSeverity != null) {
        // ensure the json data is an array
        if (!jsonObj.get("advisoriesSeverity").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `advisoriesSeverity` to be an array in the JSON string but got `%s`", jsonObj.get("advisoriesSeverity").toString()));
        }

        // validate the optional field `advisoriesSeverity` (array)
        for (int i = 0; i < jsonArrayadvisoriesSeverity.size(); i++) {
          SuggestionSummaryAdvisoriesSeverityInner.validateJsonObject(jsonArrayadvisoriesSeverity.get(i).getAsJsonObject());
        };
      }
      JsonArray jsonArrayfieldNoticeSeverity = jsonObj.getAsJsonArray("fieldNoticeSeverity");
      if (jsonArrayfieldNoticeSeverity != null) {
        // ensure the json data is an array
        if (!jsonObj.get("fieldNoticeSeverity").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `fieldNoticeSeverity` to be an array in the JSON string but got `%s`", jsonObj.get("fieldNoticeSeverity").toString()));
        }

        // validate the optional field `fieldNoticeSeverity` (array)
        for (int i = 0; i < jsonArrayfieldNoticeSeverity.size(); i++) {
          SuggestionSummaryFieldNoticeSeverityInner.validateJsonObject(jsonArrayfieldNoticeSeverity.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SuggestionSummary.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SuggestionSummary' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SuggestionSummary> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SuggestionSummary.class));

       return (TypeAdapter<T>) new TypeAdapter<SuggestionSummary>() {
           @Override
           public void write(JsonWriter out, SuggestionSummary value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SuggestionSummary read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SuggestionSummary given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SuggestionSummary
  * @throws IOException if the JSON string is invalid with respect to SuggestionSummary
  */
  public static SuggestionSummary fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SuggestionSummary.class);
  }

 /**
  * Convert an instance of SuggestionSummary to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

