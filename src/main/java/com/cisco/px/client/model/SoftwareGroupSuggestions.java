
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
import java.util.ArrayList;
import java.util.List;
import com.cisco.px.client.model.ReleaseSummary;
import com.cisco.px.client.model.SoftwareGroupRisk;
import com.cisco.px.client.model.SuggestionSummary;

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
 * SoftwareGroupSuggestions
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-03T16:36:10.038229Z[GMT]")
public class SoftwareGroupSuggestions {
  public static final String SERIALIZED_NAME_SOURCE_ID = "sourceId";
  @SerializedName(SERIALIZED_NAME_SOURCE_ID)
  private String sourceId;

  public static final String SERIALIZED_NAME_BASIC_SUGGESTED_DATE = "basicSuggestedDate";
  @SerializedName(SERIALIZED_NAME_BASIC_SUGGESTED_DATE)
  private LocalDate basicSuggestedDate;

  public static final String SERIALIZED_NAME_SOFTWARE_GROUP_NAME = "softwareGroupName";
  @SerializedName(SERIALIZED_NAME_SOFTWARE_GROUP_NAME)
  private String softwareGroupName;

  public static final String SERIALIZED_NAME_SUGGESTION_UPDATED_DATE = "suggestionUpdatedDate";
  @SerializedName(SERIALIZED_NAME_SUGGESTION_UPDATED_DATE)
  private LocalDate suggestionUpdatedDate;

  public static final String SERIALIZED_NAME_SUGGESTIONS_INTERVAL = "suggestionsInterval";
  @SerializedName(SERIALIZED_NAME_SUGGESTIONS_INTERVAL)
  private Integer suggestionsInterval;

  public static final String SERIALIZED_NAME_SELECTED_RELEASE = "selectedRelease";
  @SerializedName(SERIALIZED_NAME_SELECTED_RELEASE)
  private String selectedRelease;

  public static final String SERIALIZED_NAME_SUGGESTION_SELECTED_DATE = "suggestionSelectedDate";
  @SerializedName(SERIALIZED_NAME_SUGGESTION_SELECTED_DATE)
  private LocalDate suggestionSelectedDate;

  public static final String SERIALIZED_NAME_SOFTWARE_GROUP_RISK_TREND = "softwareGroupRiskTrend";
  @SerializedName(SERIALIZED_NAME_SOFTWARE_GROUP_RISK_TREND)
  private List<SoftwareGroupRisk> softwareGroupRiskTrend = null;

  public static final String SERIALIZED_NAME_SUGGESTION_SUMMARIES = "suggestionSummaries";
  @SerializedName(SERIALIZED_NAME_SUGGESTION_SUMMARIES)
  private List<SuggestionSummary> suggestionSummaries = null;

  public static final String SERIALIZED_NAME_RELEASE_SUMMARY = "releaseSummary";
  @SerializedName(SERIALIZED_NAME_RELEASE_SUMMARY)
  private List<ReleaseSummary> releaseSummary = null;

  public SoftwareGroupSuggestions() { 
  }

  public SoftwareGroupSuggestions sourceId(String sourceId) {
    
    this.sourceId = sourceId;
    return this;
  }

   /**
   * IP address of the Cisco network management system that manages the assets in the Software Group.
   * @return sourceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "IP address of the Cisco network management system that manages the assets in the Software Group.")

  public String getSourceId() {
    return sourceId;
  }


  public void setSourceId(String sourceId) {
    this.sourceId = sourceId;
  }


  public SoftwareGroupSuggestions basicSuggestedDate(LocalDate basicSuggestedDate) {
    
    this.basicSuggestedDate = basicSuggestedDate;
    return this;
  }

   /**
   * Date the basic suggestions were updated for the Software Group
   * @return basicSuggestedDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Date the basic suggestions were updated for the Software Group")

  public LocalDate getBasicSuggestedDate() {
    return basicSuggestedDate;
  }


  public void setBasicSuggestedDate(LocalDate basicSuggestedDate) {
    this.basicSuggestedDate = basicSuggestedDate;
  }


  public SoftwareGroupSuggestions softwareGroupName(String softwareGroupName) {
    
    this.softwareGroupName = softwareGroupName;
    return this;
  }

   /**
   * Name of the Software Group whose data is being retrieved
   * @return softwareGroupName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of the Software Group whose data is being retrieved")

  public String getSoftwareGroupName() {
    return softwareGroupName;
  }


  public void setSoftwareGroupName(String softwareGroupName) {
    this.softwareGroupName = softwareGroupName;
  }


  public SoftwareGroupSuggestions suggestionUpdatedDate(LocalDate suggestionUpdatedDate) {
    
    this.suggestionUpdatedDate = suggestionUpdatedDate;
    return this;
  }

   /**
   * Date the machine learning suggestions were updated for the Software Group
   * @return suggestionUpdatedDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Date the machine learning suggestions were updated for the Software Group")

  public LocalDate getSuggestionUpdatedDate() {
    return suggestionUpdatedDate;
  }


  public void setSuggestionUpdatedDate(LocalDate suggestionUpdatedDate) {
    this.suggestionUpdatedDate = suggestionUpdatedDate;
  }


  public SoftwareGroupSuggestions suggestionsInterval(Integer suggestionsInterval) {
    
    this.suggestionsInterval = suggestionsInterval;
    return this;
  }

   /**
   * How often, in months, Cisco software release suggestions will be provided. The customer can configure this value in CX Cloud.
   * @return suggestionsInterval
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "How often, in months, Cisco software release suggestions will be provided. The customer can configure this value in CX Cloud.")

  public Integer getSuggestionsInterval() {
    return suggestionsInterval;
  }


  public void setSuggestionsInterval(Integer suggestionsInterval) {
    this.suggestionsInterval = suggestionsInterval;
  }


  public SoftwareGroupSuggestions selectedRelease(String selectedRelease) {
    
    this.selectedRelease = selectedRelease;
    return this;
  }

   /**
   * The suggested Cisco software release the customer has selected to use the next time a software update is performed on the assets in the Software Group
   * @return selectedRelease
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The suggested Cisco software release the customer has selected to use the next time a software update is performed on the assets in the Software Group")

  public String getSelectedRelease() {
    return selectedRelease;
  }


  public void setSelectedRelease(String selectedRelease) {
    this.selectedRelease = selectedRelease;
  }


  public SoftwareGroupSuggestions suggestionSelectedDate(LocalDate suggestionSelectedDate) {
    
    this.suggestionSelectedDate = suggestionSelectedDate;
    return this;
  }

   /**
   * Date the customer selected a suggested Cisco software release in CX Cloud
   * @return suggestionSelectedDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Date the customer selected a suggested Cisco software release in CX Cloud")

  public LocalDate getSuggestionSelectedDate() {
    return suggestionSelectedDate;
  }


  public void setSuggestionSelectedDate(LocalDate suggestionSelectedDate) {
    this.suggestionSelectedDate = suggestionSelectedDate;
  }


  public SoftwareGroupSuggestions softwareGroupRiskTrend(List<SoftwareGroupRisk> softwareGroupRiskTrend) {
    
    this.softwareGroupRiskTrend = softwareGroupRiskTrend;
    return this;
  }

  public SoftwareGroupSuggestions addSoftwareGroupRiskTrendItem(SoftwareGroupRisk softwareGroupRiskTrendItem) {
    if (this.softwareGroupRiskTrend == null) {
      this.softwareGroupRiskTrend = new ArrayList<>();
    }
    this.softwareGroupRiskTrend.add(softwareGroupRiskTrendItem);
    return this;
  }

   /**
   * List of weekly risk scores for the current Cisco software releases calculated over a period of time
   * @return softwareGroupRiskTrend
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of weekly risk scores for the current Cisco software releases calculated over a period of time")

  public List<SoftwareGroupRisk> getSoftwareGroupRiskTrend() {
    return softwareGroupRiskTrend;
  }


  public void setSoftwareGroupRiskTrend(List<SoftwareGroupRisk> softwareGroupRiskTrend) {
    this.softwareGroupRiskTrend = softwareGroupRiskTrend;
  }


  public SoftwareGroupSuggestions suggestionSummaries(List<SuggestionSummary> suggestionSummaries) {
    
    this.suggestionSummaries = suggestionSummaries;
    return this;
  }

  public SoftwareGroupSuggestions addSuggestionSummariesItem(SuggestionSummary suggestionSummariesItem) {
    if (this.suggestionSummaries == null) {
      this.suggestionSummaries = new ArrayList<>();
    }
    this.suggestionSummaries.add(suggestionSummariesItem);
    return this;
  }

   /**
   * Information about the Cisco software releases running on, and suggested for, the assets in the Software Group
   * @return suggestionSummaries
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Information about the Cisco software releases running on, and suggested for, the assets in the Software Group")

  public List<SuggestionSummary> getSuggestionSummaries() {
    return suggestionSummaries;
  }


  public void setSuggestionSummaries(List<SuggestionSummary> suggestionSummaries) {
    this.suggestionSummaries = suggestionSummaries;
  }


  public SoftwareGroupSuggestions releaseSummary(List<ReleaseSummary> releaseSummary) {
    
    this.releaseSummary = releaseSummary;
    return this;
  }

  public SoftwareGroupSuggestions addReleaseSummaryItem(ReleaseSummary releaseSummaryItem) {
    if (this.releaseSummary == null) {
      this.releaseSummary = new ArrayList<>();
    }
    this.releaseSummary.add(releaseSummaryItem);
    return this;
  }

   /**
   * List of the following Cisco software releases for the Software Group - • Latest release available from Cisco Software Central • Suggested releases • Cisco DNA Center golden release • Cisco DNA Center Compatibility Matrix minimum release
   * @return releaseSummary
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of the following Cisco software releases for the Software Group - • Latest release available from Cisco Software Central • Suggested releases • Cisco DNA Center golden release • Cisco DNA Center Compatibility Matrix minimum release")

  public List<ReleaseSummary> getReleaseSummary() {
    return releaseSummary;
  }


  public void setReleaseSummary(List<ReleaseSummary> releaseSummary) {
    this.releaseSummary = releaseSummary;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SoftwareGroupSuggestions softwareGroupSuggestions = (SoftwareGroupSuggestions) o;
    return Objects.equals(this.sourceId, softwareGroupSuggestions.sourceId) &&
        Objects.equals(this.basicSuggestedDate, softwareGroupSuggestions.basicSuggestedDate) &&
        Objects.equals(this.softwareGroupName, softwareGroupSuggestions.softwareGroupName) &&
        Objects.equals(this.suggestionUpdatedDate, softwareGroupSuggestions.suggestionUpdatedDate) &&
        Objects.equals(this.suggestionsInterval, softwareGroupSuggestions.suggestionsInterval) &&
        Objects.equals(this.selectedRelease, softwareGroupSuggestions.selectedRelease) &&
        Objects.equals(this.suggestionSelectedDate, softwareGroupSuggestions.suggestionSelectedDate) &&
        Objects.equals(this.softwareGroupRiskTrend, softwareGroupSuggestions.softwareGroupRiskTrend) &&
        Objects.equals(this.suggestionSummaries, softwareGroupSuggestions.suggestionSummaries) &&
        Objects.equals(this.releaseSummary, softwareGroupSuggestions.releaseSummary);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sourceId, basicSuggestedDate, softwareGroupName, suggestionUpdatedDate, suggestionsInterval, selectedRelease, suggestionSelectedDate, softwareGroupRiskTrend, suggestionSummaries, releaseSummary);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SoftwareGroupSuggestions {\n");
    sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
    sb.append("    basicSuggestedDate: ").append(toIndentedString(basicSuggestedDate)).append("\n");
    sb.append("    softwareGroupName: ").append(toIndentedString(softwareGroupName)).append("\n");
    sb.append("    suggestionUpdatedDate: ").append(toIndentedString(suggestionUpdatedDate)).append("\n");
    sb.append("    suggestionsInterval: ").append(toIndentedString(suggestionsInterval)).append("\n");
    sb.append("    selectedRelease: ").append(toIndentedString(selectedRelease)).append("\n");
    sb.append("    suggestionSelectedDate: ").append(toIndentedString(suggestionSelectedDate)).append("\n");
    sb.append("    softwareGroupRiskTrend: ").append(toIndentedString(softwareGroupRiskTrend)).append("\n");
    sb.append("    suggestionSummaries: ").append(toIndentedString(suggestionSummaries)).append("\n");
    sb.append("    releaseSummary: ").append(toIndentedString(releaseSummary)).append("\n");
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
    openapiFields.add("sourceId");
    openapiFields.add("basicSuggestedDate");
    openapiFields.add("softwareGroupName");
    openapiFields.add("suggestionUpdatedDate");
    openapiFields.add("suggestionsInterval");
    openapiFields.add("selectedRelease");
    openapiFields.add("suggestionSelectedDate");
    openapiFields.add("softwareGroupRiskTrend");
    openapiFields.add("suggestionSummaries");
    openapiFields.add("releaseSummary");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SoftwareGroupSuggestions
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (SoftwareGroupSuggestions.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in SoftwareGroupSuggestions is not found in the empty JSON string", SoftwareGroupSuggestions.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!SoftwareGroupSuggestions.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SoftwareGroupSuggestions` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("sourceId") != null && !jsonObj.get("sourceId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sourceId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sourceId").toString()));
      }
      if (jsonObj.get("softwareGroupName") != null && !jsonObj.get("softwareGroupName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `softwareGroupName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("softwareGroupName").toString()));
      }
      if (jsonObj.get("selectedRelease") != null && !jsonObj.get("selectedRelease").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `selectedRelease` to be a primitive type in the JSON string but got `%s`", jsonObj.get("selectedRelease").toString()));
      }
      JsonArray jsonArraysoftwareGroupRiskTrend = jsonObj.getAsJsonArray("softwareGroupRiskTrend");
      if (jsonArraysoftwareGroupRiskTrend != null) {
        // ensure the json data is an array
        if (!jsonObj.get("softwareGroupRiskTrend").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `softwareGroupRiskTrend` to be an array in the JSON string but got `%s`", jsonObj.get("softwareGroupRiskTrend").toString()));
        }

        // validate the optional field `softwareGroupRiskTrend` (array)
        for (int i = 0; i < jsonArraysoftwareGroupRiskTrend.size(); i++) {
          SoftwareGroupRisk.validateJsonObject(jsonArraysoftwareGroupRiskTrend.get(i).getAsJsonObject());
        };
      }
      JsonArray jsonArraysuggestionSummaries = jsonObj.getAsJsonArray("suggestionSummaries");
      if (jsonArraysuggestionSummaries != null) {
        // ensure the json data is an array
        if (!jsonObj.get("suggestionSummaries").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `suggestionSummaries` to be an array in the JSON string but got `%s`", jsonObj.get("suggestionSummaries").toString()));
        }

        // validate the optional field `suggestionSummaries` (array)
        for (int i = 0; i < jsonArraysuggestionSummaries.size(); i++) {
          SuggestionSummary.validateJsonObject(jsonArraysuggestionSummaries.get(i).getAsJsonObject());
        };
      }
      JsonArray jsonArrayreleaseSummary = jsonObj.getAsJsonArray("releaseSummary");
      if (jsonArrayreleaseSummary != null) {
        // ensure the json data is an array
        if (!jsonObj.get("releaseSummary").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `releaseSummary` to be an array in the JSON string but got `%s`", jsonObj.get("releaseSummary").toString()));
        }

        // validate the optional field `releaseSummary` (array)
        for (int i = 0; i < jsonArrayreleaseSummary.size(); i++) {
          ReleaseSummary.validateJsonObject(jsonArrayreleaseSummary.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SoftwareGroupSuggestions.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SoftwareGroupSuggestions' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SoftwareGroupSuggestions> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SoftwareGroupSuggestions.class));

       return (TypeAdapter<T>) new TypeAdapter<SoftwareGroupSuggestions>() {
           @Override
           public void write(JsonWriter out, SoftwareGroupSuggestions value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SoftwareGroupSuggestions read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SoftwareGroupSuggestions given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SoftwareGroupSuggestions
  * @throws IOException if the JSON string is invalid with respect to SoftwareGroupSuggestions
  */
  public static SoftwareGroupSuggestions fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SoftwareGroupSuggestions.class);
  }

 /**
  * Convert an instance of SoftwareGroupSuggestions to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

