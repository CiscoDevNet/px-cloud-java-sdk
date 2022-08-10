
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
import com.cisco.px.client.model.RacetrackBuidPitstop;
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
 * RacetrackUsecase
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-05T16:32:06.013598Z[GMT]")
public class RacetrackUsecase {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_USECASE_ID = "usecaseId";
  @SerializedName(SERIALIZED_NAME_USECASE_ID)
  private String usecaseId;

  public static final String SERIALIZED_NAME_CURRENT_PITSTOP = "currentPitstop";
  @SerializedName(SERIALIZED_NAME_CURRENT_PITSTOP)
  private String currentPitstop;

  public static final String SERIALIZED_NAME_PITSTOPS = "pitstops";
  @SerializedName(SERIALIZED_NAME_PITSTOPS)
  private List<RacetrackBuidPitstop> pitstops = new ArrayList<>();

  public static final String SERIALIZED_NAME_ADOPTION_PERCENTAGE = "adoptionPercentage";
  @SerializedName(SERIALIZED_NAME_ADOPTION_PERCENTAGE)
  private Integer adoptionPercentage;

  public RacetrackUsecase() { 
  }

  public RacetrackUsecase name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Usecase name
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Usecase name")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public RacetrackUsecase description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Usecase description
   * @return description
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Usecase description")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public RacetrackUsecase usecaseId(String usecaseId) {
    
    this.usecaseId = usecaseId;
    return this;
  }

   /**
   * Usecase description
   * @return usecaseId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Usecase description")

  public String getUsecaseId() {
    return usecaseId;
  }


  public void setUsecaseId(String usecaseId) {
    this.usecaseId = usecaseId;
  }


  public RacetrackUsecase currentPitstop(String currentPitstop) {
    
    this.currentPitstop = currentPitstop;
    return this;
  }

   /**
   * The current customer&#39;s pitstop for this solution&#39;s use case
   * @return currentPitstop
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The current customer's pitstop for this solution's use case")

  public String getCurrentPitstop() {
    return currentPitstop;
  }


  public void setCurrentPitstop(String currentPitstop) {
    this.currentPitstop = currentPitstop;
  }


  public RacetrackUsecase pitstops(List<RacetrackBuidPitstop> pitstops) {
    
    this.pitstops = pitstops;
    return this;
  }

  public RacetrackUsecase addPitstopsItem(RacetrackBuidPitstop pitstopsItem) {
    this.pitstops.add(pitstopsItem);
    return this;
  }

   /**
   * Get pitstops
   * @return pitstops
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<RacetrackBuidPitstop> getPitstops() {
    return pitstops;
  }


  public void setPitstops(List<RacetrackBuidPitstop> pitstops) {
    this.pitstops = pitstops;
  }


  public RacetrackUsecase adoptionPercentage(Integer adoptionPercentage) {
    
    this.adoptionPercentage = adoptionPercentage;
    return this;
  }

   /**
   * Percentage completed checklist actions across all pitstops.
   * @return adoptionPercentage
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Percentage completed checklist actions across all pitstops.")

  public Integer getAdoptionPercentage() {
    return adoptionPercentage;
  }


  public void setAdoptionPercentage(Integer adoptionPercentage) {
    this.adoptionPercentage = adoptionPercentage;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RacetrackUsecase racetrackUsecase = (RacetrackUsecase) o;
    return Objects.equals(this.name, racetrackUsecase.name) &&
        Objects.equals(this.description, racetrackUsecase.description) &&
        Objects.equals(this.usecaseId, racetrackUsecase.usecaseId) &&
        Objects.equals(this.currentPitstop, racetrackUsecase.currentPitstop) &&
        Objects.equals(this.pitstops, racetrackUsecase.pitstops) &&
        Objects.equals(this.adoptionPercentage, racetrackUsecase.adoptionPercentage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, usecaseId, currentPitstop, pitstops, adoptionPercentage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RacetrackUsecase {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    usecaseId: ").append(toIndentedString(usecaseId)).append("\n");
    sb.append("    currentPitstop: ").append(toIndentedString(currentPitstop)).append("\n");
    sb.append("    pitstops: ").append(toIndentedString(pitstops)).append("\n");
    sb.append("    adoptionPercentage: ").append(toIndentedString(adoptionPercentage)).append("\n");
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
    openapiFields.add("usecaseId");
    openapiFields.add("currentPitstop");
    openapiFields.add("pitstops");
    openapiFields.add("adoptionPercentage");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("description");
    openapiRequiredFields.add("usecaseId");
    openapiRequiredFields.add("currentPitstop");
    openapiRequiredFields.add("pitstops");
    openapiRequiredFields.add("adoptionPercentage");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to RacetrackUsecase
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (RacetrackUsecase.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in RacetrackUsecase is not found in the empty JSON string", RacetrackUsecase.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!RacetrackUsecase.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RacetrackUsecase` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : RacetrackUsecase.openapiRequiredFields) {
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
      if (jsonObj.get("usecaseId") != null && !jsonObj.get("usecaseId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `usecaseId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("usecaseId").toString()));
      }
      if (jsonObj.get("currentPitstop") != null && !jsonObj.get("currentPitstop").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currentPitstop` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currentPitstop").toString()));
      }
      JsonArray jsonArraypitstops = jsonObj.getAsJsonArray("pitstops");
      if (jsonArraypitstops != null) {
        // ensure the json data is an array
        if (!jsonObj.get("pitstops").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `pitstops` to be an array in the JSON string but got `%s`", jsonObj.get("pitstops").toString()));
        }

        // validate the optional field `pitstops` (array)
        for (int i = 0; i < jsonArraypitstops.size(); i++) {
          RacetrackBuidPitstop.validateJsonObject(jsonArraypitstops.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RacetrackUsecase.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RacetrackUsecase' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RacetrackUsecase> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RacetrackUsecase.class));

       return (TypeAdapter<T>) new TypeAdapter<RacetrackUsecase>() {
           @Override
           public void write(JsonWriter out, RacetrackUsecase value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RacetrackUsecase read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RacetrackUsecase given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RacetrackUsecase
  * @throws IOException if the JSON string is invalid with respect to RacetrackUsecase
  */
  public static RacetrackUsecase fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RacetrackUsecase.class);
  }

 /**
  * Convert an instance of RacetrackUsecase to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

