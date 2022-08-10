
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
import java.util.ArrayList;
import java.util.List;

import com.cisco.px.client.JSON;
import com.cisco.px.client.model.RacetrackTooltip;
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
 * RacetrackBuidPitstopAction
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-05T16:32:06.013598Z[GMT]")
public class RacetrackBuidPitstopAction {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_IS_MANUAL_CHECK_ALLOWED = "isManualCheckAllowed";
  @SerializedName(SERIALIZED_NAME_IS_MANUAL_CHECK_ALLOWED)
  private Boolean isManualCheckAllowed;

  public static final String SERIALIZED_NAME_IS_COMPLETE = "isComplete";
  @SerializedName(SERIALIZED_NAME_IS_COMPLETE)
  private Boolean isComplete;

  /**
   * The method by which the the completion status was updated (MANUAL user input, AUTO Lifecycle Journey). This value must be set when isActionComplete is set to true and cleared if isActionComplte is set to false
   */
  @JsonAdapter(UpdateMethodEnum.Adapter.class)
  public enum UpdateMethodEnum {
    NA("NA"),
    
    MANUAL("MANUAL"),
    
    AUTO("AUTO");

    private String value;

    UpdateMethodEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static UpdateMethodEnum fromValue(String value) {
      for (UpdateMethodEnum b : UpdateMethodEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<UpdateMethodEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final UpdateMethodEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public UpdateMethodEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return UpdateMethodEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_UPDATE_METHOD = "updateMethod";
  @SerializedName(SERIALIZED_NAME_UPDATE_METHOD)
  private UpdateMethodEnum updateMethod;

  public static final String SERIALIZED_NAME_IS_COMPLETE_AUTO = "isCompleteAuto";
  @SerializedName(SERIALIZED_NAME_IS_COMPLETE_AUTO)
  private Boolean isCompleteAuto;

  public static final String SERIALIZED_NAME_IS_COMPLETE_MANUAL = "isCompleteManual";
  @SerializedName(SERIALIZED_NAME_IS_COMPLETE_MANUAL)
  private Boolean isCompleteManual;

  public static final String SERIALIZED_NAME_IS_MANAUAL_OVERRIDE = "isManaualOverride";
  @SerializedName(SERIALIZED_NAME_IS_MANAUAL_OVERRIDE)
  private Boolean isManaualOverride;

  public static final String SERIALIZED_NAME_TOOLTIPS = "tooltips";
  @SerializedName(SERIALIZED_NAME_TOOLTIPS)
  private List<RacetrackTooltip> tooltips = new ArrayList<>();

  public RacetrackBuidPitstopAction() { 
  }

  public RacetrackBuidPitstopAction name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * A label identifying the action to be completed by the customer.  A set of actions identifies the exit criteria that must be met before proceeding to the next stage
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "A label identifying the action to be completed by the customer.  A set of actions identifies the exit criteria that must be met before proceeding to the next stage")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public RacetrackBuidPitstopAction description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * A brief description of the action to be taken by the customer
   * @return description
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "A brief description of the action to be taken by the customer")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public RacetrackBuidPitstopAction isManualCheckAllowed(Boolean isManualCheckAllowed) {
    
    this.isManualCheckAllowed = isManualCheckAllowed;
    return this;
  }

   /**
   * When set to true it indicates that this action may be manually checked as completed/met. Otherwise completion must be automatically determined via analysis of collected data
   * @return isManualCheckAllowed
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "When set to true it indicates that this action may be manually checked as completed/met. Otherwise completion must be automatically determined via analysis of collected data")

  public Boolean getIsManualCheckAllowed() {
    return isManualCheckAllowed;
  }


  public void setIsManualCheckAllowed(Boolean isManualCheckAllowed) {
    this.isManualCheckAllowed = isManualCheckAllowed;
  }


  public RacetrackBuidPitstopAction isComplete(Boolean isComplete) {
    
    this.isComplete = isComplete;
    return this;
  }

   /**
   * When set to true it indicates that this action has been completed by the customer.  This is the reported status and it is set from one of isActionCompleteAuto (Auto determined), isActionCompleteManual (Manually determined). Manual input takes precedence over the automated means and once set to manual it cannot be changed by automated means. It requires manual input
   * @return isComplete
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "When set to true it indicates that this action has been completed by the customer.  This is the reported status and it is set from one of isActionCompleteAuto (Auto determined), isActionCompleteManual (Manually determined). Manual input takes precedence over the automated means and once set to manual it cannot be changed by automated means. It requires manual input")

  public Boolean getIsComplete() {
    return isComplete;
  }


  public void setIsComplete(Boolean isComplete) {
    this.isComplete = isComplete;
  }


  public RacetrackBuidPitstopAction updateMethod(UpdateMethodEnum updateMethod) {
    
    this.updateMethod = updateMethod;
    return this;
  }

   /**
   * The method by which the the completion status was updated (MANUAL user input, AUTO Lifecycle Journey). This value must be set when isActionComplete is set to true and cleared if isActionComplte is set to false
   * @return updateMethod
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The method by which the the completion status was updated (MANUAL user input, AUTO Lifecycle Journey). This value must be set when isActionComplete is set to true and cleared if isActionComplte is set to false")

  public UpdateMethodEnum getUpdateMethod() {
    return updateMethod;
  }


  public void setUpdateMethod(UpdateMethodEnum updateMethod) {
    this.updateMethod = updateMethod;
  }


  public RacetrackBuidPitstopAction isCompleteAuto(Boolean isCompleteAuto) {
    
    this.isCompleteAuto = isCompleteAuto;
    return this;
  }

   /**
   * When set to true it indicates that this action was found to be completed/met through automated means.  An action manually set to completion takes precedence over the automated means.  An action set to completion via automated means may be manually overridden
   * @return isCompleteAuto
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "When set to true it indicates that this action was found to be completed/met through automated means.  An action manually set to completion takes precedence over the automated means.  An action set to completion via automated means may be manually overridden")

  public Boolean getIsCompleteAuto() {
    return isCompleteAuto;
  }


  public void setIsCompleteAuto(Boolean isCompleteAuto) {
    this.isCompleteAuto = isCompleteAuto;
  }


  public RacetrackBuidPitstopAction isCompleteManual(Boolean isCompleteManual) {
    
    this.isCompleteManual = isCompleteManual;
    return this;
  }

   /**
   * When set to true it indicates that action was manually set to completed / met
   * @return isCompleteManual
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "When set to true it indicates that action was manually set to completed / met")

  public Boolean getIsCompleteManual() {
    return isCompleteManual;
  }


  public void setIsCompleteManual(Boolean isCompleteManual) {
    this.isCompleteManual = isCompleteManual;
  }


  public RacetrackBuidPitstopAction isManaualOverride(Boolean isManaualOverride) {
    
    this.isManaualOverride = isManaualOverride;
    return this;
  }

   /**
   * When set to true it indicates that the automated result was overriden manually by a user
   * @return isManaualOverride
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "When set to true it indicates that the automated result was overriden manually by a user")

  public Boolean getIsManaualOverride() {
    return isManaualOverride;
  }


  public void setIsManaualOverride(Boolean isManaualOverride) {
    this.isManaualOverride = isManaualOverride;
  }


  public RacetrackBuidPitstopAction tooltips(List<RacetrackTooltip> tooltips) {
    
    this.tooltips = tooltips;
    return this;
  }

  public RacetrackBuidPitstopAction addTooltipsItem(RacetrackTooltip tooltipsItem) {
    this.tooltips.add(tooltipsItem);
    return this;
  }

   /**
   * Get tooltips
   * @return tooltips
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<RacetrackTooltip> getTooltips() {
    return tooltips;
  }


  public void setTooltips(List<RacetrackTooltip> tooltips) {
    this.tooltips = tooltips;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RacetrackBuidPitstopAction racetrackBuidPitstopAction = (RacetrackBuidPitstopAction) o;
    return Objects.equals(this.name, racetrackBuidPitstopAction.name) &&
        Objects.equals(this.description, racetrackBuidPitstopAction.description) &&
        Objects.equals(this.isManualCheckAllowed, racetrackBuidPitstopAction.isManualCheckAllowed) &&
        Objects.equals(this.isComplete, racetrackBuidPitstopAction.isComplete) &&
        Objects.equals(this.updateMethod, racetrackBuidPitstopAction.updateMethod) &&
        Objects.equals(this.isCompleteAuto, racetrackBuidPitstopAction.isCompleteAuto) &&
        Objects.equals(this.isCompleteManual, racetrackBuidPitstopAction.isCompleteManual) &&
        Objects.equals(this.isManaualOverride, racetrackBuidPitstopAction.isManaualOverride) &&
        Objects.equals(this.tooltips, racetrackBuidPitstopAction.tooltips);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, isManualCheckAllowed, isComplete, updateMethod, isCompleteAuto, isCompleteManual, isManaualOverride, tooltips);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RacetrackBuidPitstopAction {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    isManualCheckAllowed: ").append(toIndentedString(isManualCheckAllowed)).append("\n");
    sb.append("    isComplete: ").append(toIndentedString(isComplete)).append("\n");
    sb.append("    updateMethod: ").append(toIndentedString(updateMethod)).append("\n");
    sb.append("    isCompleteAuto: ").append(toIndentedString(isCompleteAuto)).append("\n");
    sb.append("    isCompleteManual: ").append(toIndentedString(isCompleteManual)).append("\n");
    sb.append("    isManaualOverride: ").append(toIndentedString(isManaualOverride)).append("\n");
    sb.append("    tooltips: ").append(toIndentedString(tooltips)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("description");
    openapiFields.add("isManualCheckAllowed");
    openapiFields.add("isComplete");
    openapiFields.add("updateMethod");
    openapiFields.add("isCompleteAuto");
    openapiFields.add("isCompleteManual");
    openapiFields.add("isManaualOverride");
    openapiFields.add("tooltips");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("description");
    openapiRequiredFields.add("isManualCheckAllowed");
    openapiRequiredFields.add("isComplete");
    openapiRequiredFields.add("updateMethod");
    openapiRequiredFields.add("isCompleteAuto");
    openapiRequiredFields.add("isCompleteManual");
    openapiRequiredFields.add("isManaualOverride");
    openapiRequiredFields.add("tooltips");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to RacetrackBuidPitstopAction
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (RacetrackBuidPitstopAction.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in RacetrackBuidPitstopAction is not found in the empty JSON string", RacetrackBuidPitstopAction.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!RacetrackBuidPitstopAction.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RacetrackBuidPitstopAction` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : RacetrackBuidPitstopAction.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("name") != null && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (jsonObj.get("description") != null && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if (jsonObj.get("updateMethod") != null && !jsonObj.get("updateMethod").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `updateMethod` to be a primitive type in the JSON string but got `%s`", jsonObj.get("updateMethod").toString()));
      }
      JsonArray jsonArraytooltips = jsonObj.getAsJsonArray("tooltips");
      if (jsonArraytooltips != null) {
        // ensure the json data is an array
        if (!jsonObj.get("tooltips").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `tooltips` to be an array in the JSON string but got `%s`", jsonObj.get("tooltips").toString()));
        }

        // validate the optional field `tooltips` (array)
        for (int i = 0; i < jsonArraytooltips.size(); i++) {
          RacetrackTooltip.validateJsonObject(jsonArraytooltips.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RacetrackBuidPitstopAction.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RacetrackBuidPitstopAction' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RacetrackBuidPitstopAction> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RacetrackBuidPitstopAction.class));

       return (TypeAdapter<T>) new TypeAdapter<RacetrackBuidPitstopAction>() {
           @Override
           public void write(JsonWriter out, RacetrackBuidPitstopAction value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RacetrackBuidPitstopAction read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RacetrackBuidPitstopAction given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RacetrackBuidPitstopAction
  * @throws IOException if the JSON string is invalid with respect to RacetrackBuidPitstopAction
  */
  public static RacetrackBuidPitstopAction fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RacetrackBuidPitstopAction.class);
  }

 /**
  * Convert an instance of RacetrackBuidPitstopAction to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

