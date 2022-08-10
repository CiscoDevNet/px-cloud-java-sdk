
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
import java.util.ArrayList;
import java.util.List;

import com.cisco.px.client.JSON;
import com.cisco.px.client.model.RacetrackUsecase;
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
 * RacetrackBuidSolution
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-05T16:32:06.013598Z[GMT]")
public class RacetrackBuidSolution {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_SOLUTION_ID = "solutionId";
  @SerializedName(SERIALIZED_NAME_SOLUTION_ID)
  private String solutionId;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_CX_LEVEL = "cxLevel";
  @SerializedName(SERIALIZED_NAME_CX_LEVEL)
  private BigDecimal cxLevel;

  public static final String SERIALIZED_NAME_USECASES = "usecases";
  @SerializedName(SERIALIZED_NAME_USECASES)
  private List<RacetrackUsecase> usecases = new ArrayList<>();

  public RacetrackBuidSolution() { 
  }

  public RacetrackBuidSolution name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Solution name
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Solution name")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public RacetrackBuidSolution solutionId(String solutionId) {
    
    this.solutionId = solutionId;
    return this;
  }

   /**
   * Solution Id
   * @return solutionId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Solution Id")

  public String getSolutionId() {
    return solutionId;
  }


  public void setSolutionId(String solutionId) {
    this.solutionId = solutionId;
  }


  public RacetrackBuidSolution description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Solution Description
   * @return description
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Solution Description")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public RacetrackBuidSolution cxLevel(BigDecimal cxLevel) {
    
    this.cxLevel = cxLevel;
    return this;
  }

   /**
   * Cx Level
   * @return cxLevel
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Cx Level")

  public BigDecimal getCxLevel() {
    return cxLevel;
  }


  public void setCxLevel(BigDecimal cxLevel) {
    this.cxLevel = cxLevel;
  }


  public RacetrackBuidSolution usecases(List<RacetrackUsecase> usecases) {
    
    this.usecases = usecases;
    return this;
  }

  public RacetrackBuidSolution addUsecasesItem(RacetrackUsecase usecasesItem) {
    this.usecases.add(usecasesItem);
    return this;
  }

   /**
   * Get usecases
   * @return usecases
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<RacetrackUsecase> getUsecases() {
    return usecases;
  }


  public void setUsecases(List<RacetrackUsecase> usecases) {
    this.usecases = usecases;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RacetrackBuidSolution racetrackBuidSolution = (RacetrackBuidSolution) o;
    return Objects.equals(this.name, racetrackBuidSolution.name) &&
        Objects.equals(this.solutionId, racetrackBuidSolution.solutionId) &&
        Objects.equals(this.description, racetrackBuidSolution.description) &&
        Objects.equals(this.cxLevel, racetrackBuidSolution.cxLevel) &&
        Objects.equals(this.usecases, racetrackBuidSolution.usecases);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, solutionId, description, cxLevel, usecases);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RacetrackBuidSolution {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    solutionId: ").append(toIndentedString(solutionId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    cxLevel: ").append(toIndentedString(cxLevel)).append("\n");
    sb.append("    usecases: ").append(toIndentedString(usecases)).append("\n");
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
    openapiFields.add("solutionId");
    openapiFields.add("description");
    openapiFields.add("cxLevel");
    openapiFields.add("usecases");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("solutionId");
    openapiRequiredFields.add("description");
    openapiRequiredFields.add("cxLevel");
    openapiRequiredFields.add("usecases");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to RacetrackBuidSolution
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (RacetrackBuidSolution.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in RacetrackBuidSolution is not found in the empty JSON string", RacetrackBuidSolution.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!RacetrackBuidSolution.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RacetrackBuidSolution` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : RacetrackBuidSolution.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("name") != null && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (jsonObj.get("solutionId") != null && !jsonObj.get("solutionId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `solutionId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("solutionId").toString()));
      }
      if (jsonObj.get("description") != null && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      JsonArray jsonArrayusecases = jsonObj.getAsJsonArray("usecases");
      if (jsonArrayusecases != null) {
        // ensure the json data is an array
        if (!jsonObj.get("usecases").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `usecases` to be an array in the JSON string but got `%s`", jsonObj.get("usecases").toString()));
        }

        // validate the optional field `usecases` (array)
        for (int i = 0; i < jsonArrayusecases.size(); i++) {
          RacetrackUsecase.validateJsonObject(jsonArrayusecases.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RacetrackBuidSolution.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RacetrackBuidSolution' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RacetrackBuidSolution> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RacetrackBuidSolution.class));

       return (TypeAdapter<T>) new TypeAdapter<RacetrackBuidSolution>() {
           @Override
           public void write(JsonWriter out, RacetrackBuidSolution value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RacetrackBuidSolution read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RacetrackBuidSolution given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RacetrackBuidSolution
  * @throws IOException if the JSON string is invalid with respect to RacetrackBuidSolution
  */
  public static RacetrackBuidSolution fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RacetrackBuidSolution.class);
  }

 /**
  * Convert an instance of RacetrackBuidSolution to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

