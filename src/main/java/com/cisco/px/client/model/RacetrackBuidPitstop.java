
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
import com.cisco.px.client.model.RacetrackBuidPitstopAction;
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
 * RacetrackBuidPitstop
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-05T16:32:06.013598Z[GMT]")
public class RacetrackBuidPitstop {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_IS_COMPLETE = "isComplete";
  @SerializedName(SERIALIZED_NAME_IS_COMPLETE)
  private Boolean isComplete;

  public static final String SERIALIZED_NAME_PITSTOP_ACTIONS = "pitstopActions";
  @SerializedName(SERIALIZED_NAME_PITSTOP_ACTIONS)
  private List<RacetrackBuidPitstopAction> pitstopActions = new ArrayList<>();

  public static final String SERIALIZED_NAME_COMPLETION_PERCENTAGE = "completionPercentage";
  @SerializedName(SERIALIZED_NAME_COMPLETION_PERCENTAGE)
  private Integer completionPercentage;

  public RacetrackBuidPitstop() { 
  }

  public RacetrackBuidPitstop name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the pitstop (onboard | implement | use | engage | adopt | optimize)
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The name of the pitstop (onboard | implement | use | engage | adopt | optimize)")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public RacetrackBuidPitstop description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Brief description of the pitstop
   * @return description
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Brief description of the pitstop")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public RacetrackBuidPitstop isComplete(Boolean isComplete) {
    
    this.isComplete = isComplete;
    return this;
  }

   /**
   * When set to true it indicates that the pre-requisites for advancing to the next pitstop have been met by the customer. This determination may be done through manual input (customer) or automated (LifecycleJourney).
   * @return isComplete
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "When set to true it indicates that the pre-requisites for advancing to the next pitstop have been met by the customer. This determination may be done through manual input (customer) or automated (LifecycleJourney).")

  public Boolean getIsComplete() {
    return isComplete;
  }


  public void setIsComplete(Boolean isComplete) {
    this.isComplete = isComplete;
  }


  public RacetrackBuidPitstop pitstopActions(List<RacetrackBuidPitstopAction> pitstopActions) {
    
    this.pitstopActions = pitstopActions;
    return this;
  }

  public RacetrackBuidPitstop addPitstopActionsItem(RacetrackBuidPitstopAction pitstopActionsItem) {
    this.pitstopActions.add(pitstopActionsItem);
    return this;
  }

   /**
   * Get pitstopActions
   * @return pitstopActions
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<RacetrackBuidPitstopAction> getPitstopActions() {
    return pitstopActions;
  }


  public void setPitstopActions(List<RacetrackBuidPitstopAction> pitstopActions) {
    this.pitstopActions = pitstopActions;
  }


  public RacetrackBuidPitstop completionPercentage(Integer completionPercentage) {
    
    this.completionPercentage = completionPercentage;
    return this;
  }

   /**
   * Percentage completed checklist actions.
   * @return completionPercentage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Percentage completed checklist actions.")

  public Integer getCompletionPercentage() {
    return completionPercentage;
  }


  public void setCompletionPercentage(Integer completionPercentage) {
    this.completionPercentage = completionPercentage;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RacetrackBuidPitstop racetrackBuidPitstop = (RacetrackBuidPitstop) o;
    return Objects.equals(this.name, racetrackBuidPitstop.name) &&
        Objects.equals(this.description, racetrackBuidPitstop.description) &&
        Objects.equals(this.isComplete, racetrackBuidPitstop.isComplete) &&
        Objects.equals(this.pitstopActions, racetrackBuidPitstop.pitstopActions) &&
        Objects.equals(this.completionPercentage, racetrackBuidPitstop.completionPercentage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, isComplete, pitstopActions, completionPercentage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RacetrackBuidPitstop {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    isComplete: ").append(toIndentedString(isComplete)).append("\n");
    sb.append("    pitstopActions: ").append(toIndentedString(pitstopActions)).append("\n");
    sb.append("    completionPercentage: ").append(toIndentedString(completionPercentage)).append("\n");
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
    openapiFields.add("isComplete");
    openapiFields.add("pitstopActions");
    openapiFields.add("completionPercentage");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("description");
    openapiRequiredFields.add("isComplete");
    openapiRequiredFields.add("pitstopActions");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to RacetrackBuidPitstop
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (RacetrackBuidPitstop.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in RacetrackBuidPitstop is not found in the empty JSON string", RacetrackBuidPitstop.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!RacetrackBuidPitstop.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RacetrackBuidPitstop` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : RacetrackBuidPitstop.openapiRequiredFields) {
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
      JsonArray jsonArraypitstopActions = jsonObj.getAsJsonArray("pitstopActions");
      if (jsonArraypitstopActions != null) {
        // ensure the json data is an array
        if (!jsonObj.get("pitstopActions").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `pitstopActions` to be an array in the JSON string but got `%s`", jsonObj.get("pitstopActions").toString()));
        }

        // validate the optional field `pitstopActions` (array)
        for (int i = 0; i < jsonArraypitstopActions.size(); i++) {
          RacetrackBuidPitstopAction.validateJsonObject(jsonArraypitstopActions.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RacetrackBuidPitstop.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RacetrackBuidPitstop' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RacetrackBuidPitstop> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RacetrackBuidPitstop.class));

       return (TypeAdapter<T>) new TypeAdapter<RacetrackBuidPitstop>() {
           @Override
           public void write(JsonWriter out, RacetrackBuidPitstop value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RacetrackBuidPitstop read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RacetrackBuidPitstop given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RacetrackBuidPitstop
  * @throws IOException if the JSON string is invalid with respect to RacetrackBuidPitstop
  */
  public static RacetrackBuidPitstop fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RacetrackBuidPitstop.class);
  }

 /**
  * Convert an instance of RacetrackBuidPitstop to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

