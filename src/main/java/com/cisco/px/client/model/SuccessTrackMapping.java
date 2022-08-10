
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
import com.cisco.px.client.model.SuccessTrackChecklistMapping;
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
 * SuccessTrackMapping
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-05T16:32:06.013598Z[GMT]")
public class SuccessTrackMapping {
  public static final String SERIALIZED_NAME_CHECKLISTS = "checklists";
  @SerializedName(SERIALIZED_NAME_CHECKLISTS)
  private List<SuccessTrackChecklistMapping> checklists = null;

  public static final String SERIALIZED_NAME_MAPPING_ID = "mappingId";
  @SerializedName(SERIALIZED_NAME_MAPPING_ID)
  private String mappingId;

  public static final String SERIALIZED_NAME_PITSTOP = "pitstop";
  @SerializedName(SERIALIZED_NAME_PITSTOP)
  private String pitstop;

  public static final String SERIALIZED_NAME_PITSTOP_ID = "pitstopId";
  @SerializedName(SERIALIZED_NAME_PITSTOP_ID)
  private String pitstopId;

  public static final String SERIALIZED_NAME_SUCCESS_TRACK_ID = "successTrackId";
  @SerializedName(SERIALIZED_NAME_SUCCESS_TRACK_ID)
  private String successTrackId;

  public static final String SERIALIZED_NAME_SUCCESS_TRACK_NAME = "successTrackName";
  @SerializedName(SERIALIZED_NAME_SUCCESS_TRACK_NAME)
  private String successTrackName;

  public static final String SERIALIZED_NAME_USECASE = "usecase";
  @SerializedName(SERIALIZED_NAME_USECASE)
  private String usecase;

  public static final String SERIALIZED_NAME_USECASE_ID = "usecaseId";
  @SerializedName(SERIALIZED_NAME_USECASE_ID)
  private String usecaseId;

  public SuccessTrackMapping() { 
  }

  public SuccessTrackMapping checklists(List<SuccessTrackChecklistMapping> checklists) {
    
    this.checklists = checklists;
    return this;
  }

  public SuccessTrackMapping addChecklistsItem(SuccessTrackChecklistMapping checklistsItem) {
    if (this.checklists == null) {
      this.checklists = new ArrayList<>();
    }
    this.checklists.add(checklistsItem);
    return this;
  }

   /**
   * Get checklists
   * @return checklists
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<SuccessTrackChecklistMapping> getChecklists() {
    return checklists;
  }


  public void setChecklists(List<SuccessTrackChecklistMapping> checklists) {
    this.checklists = checklists;
  }


  public SuccessTrackMapping mappingId(String mappingId) {
    
    this.mappingId = mappingId;
    return this;
  }

   /**
   * Get mappingId
   * @return mappingId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMappingId() {
    return mappingId;
  }


  public void setMappingId(String mappingId) {
    this.mappingId = mappingId;
  }


  public SuccessTrackMapping pitstop(String pitstop) {
    
    this.pitstop = pitstop;
    return this;
  }

   /**
   * Get pitstop
   * @return pitstop
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPitstop() {
    return pitstop;
  }


  public void setPitstop(String pitstop) {
    this.pitstop = pitstop;
  }


  public SuccessTrackMapping pitstopId(String pitstopId) {
    
    this.pitstopId = pitstopId;
    return this;
  }

   /**
   * Get pitstopId
   * @return pitstopId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPitstopId() {
    return pitstopId;
  }


  public void setPitstopId(String pitstopId) {
    this.pitstopId = pitstopId;
  }


  public SuccessTrackMapping successTrackId(String successTrackId) {
    
    this.successTrackId = successTrackId;
    return this;
  }

   /**
   * Get successTrackId
   * @return successTrackId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSuccessTrackId() {
    return successTrackId;
  }


  public void setSuccessTrackId(String successTrackId) {
    this.successTrackId = successTrackId;
  }


  public SuccessTrackMapping successTrackName(String successTrackName) {
    
    this.successTrackName = successTrackName;
    return this;
  }

   /**
   * Get successTrackName
   * @return successTrackName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSuccessTrackName() {
    return successTrackName;
  }


  public void setSuccessTrackName(String successTrackName) {
    this.successTrackName = successTrackName;
  }


  public SuccessTrackMapping usecase(String usecase) {
    
    this.usecase = usecase;
    return this;
  }

   /**
   * Get usecase
   * @return usecase
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUsecase() {
    return usecase;
  }


  public void setUsecase(String usecase) {
    this.usecase = usecase;
  }


  public SuccessTrackMapping usecaseId(String usecaseId) {
    
    this.usecaseId = usecaseId;
    return this;
  }

   /**
   * Get usecaseId
   * @return usecaseId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUsecaseId() {
    return usecaseId;
  }


  public void setUsecaseId(String usecaseId) {
    this.usecaseId = usecaseId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SuccessTrackMapping successTrackMapping = (SuccessTrackMapping) o;
    return Objects.equals(this.checklists, successTrackMapping.checklists) &&
        Objects.equals(this.mappingId, successTrackMapping.mappingId) &&
        Objects.equals(this.pitstop, successTrackMapping.pitstop) &&
        Objects.equals(this.pitstopId, successTrackMapping.pitstopId) &&
        Objects.equals(this.successTrackId, successTrackMapping.successTrackId) &&
        Objects.equals(this.successTrackName, successTrackMapping.successTrackName) &&
        Objects.equals(this.usecase, successTrackMapping.usecase) &&
        Objects.equals(this.usecaseId, successTrackMapping.usecaseId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(checklists, mappingId, pitstop, pitstopId, successTrackId, successTrackName, usecase, usecaseId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SuccessTrackMapping {\n");
    sb.append("    checklists: ").append(toIndentedString(checklists)).append("\n");
    sb.append("    mappingId: ").append(toIndentedString(mappingId)).append("\n");
    sb.append("    pitstop: ").append(toIndentedString(pitstop)).append("\n");
    sb.append("    pitstopId: ").append(toIndentedString(pitstopId)).append("\n");
    sb.append("    successTrackId: ").append(toIndentedString(successTrackId)).append("\n");
    sb.append("    successTrackName: ").append(toIndentedString(successTrackName)).append("\n");
    sb.append("    usecase: ").append(toIndentedString(usecase)).append("\n");
    sb.append("    usecaseId: ").append(toIndentedString(usecaseId)).append("\n");
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
    openapiFields.add("checklists");
    openapiFields.add("mappingId");
    openapiFields.add("pitstop");
    openapiFields.add("pitstopId");
    openapiFields.add("successTrackId");
    openapiFields.add("successTrackName");
    openapiFields.add("usecase");
    openapiFields.add("usecaseId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SuccessTrackMapping
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (SuccessTrackMapping.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in SuccessTrackMapping is not found in the empty JSON string", SuccessTrackMapping.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!SuccessTrackMapping.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SuccessTrackMapping` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      JsonArray jsonArraychecklists = jsonObj.getAsJsonArray("checklists");
      if (jsonArraychecklists != null) {
        // ensure the json data is an array
        if (!jsonObj.get("checklists").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `checklists` to be an array in the JSON string but got `%s`", jsonObj.get("checklists").toString()));
        }

        // validate the optional field `checklists` (array)
        for (int i = 0; i < jsonArraychecklists.size(); i++) {
          SuccessTrackChecklistMapping.validateJsonObject(jsonArraychecklists.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("mappingId") != null && !jsonObj.get("mappingId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mappingId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mappingId").toString()));
      }
      if (jsonObj.get("pitstop") != null && !jsonObj.get("pitstop").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pitstop` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pitstop").toString()));
      }
      if (jsonObj.get("pitstopId") != null && !jsonObj.get("pitstopId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pitstopId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pitstopId").toString()));
      }
      if (jsonObj.get("successTrackId") != null && !jsonObj.get("successTrackId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `successTrackId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("successTrackId").toString()));
      }
      if (jsonObj.get("successTrackName") != null && !jsonObj.get("successTrackName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `successTrackName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("successTrackName").toString()));
      }
      if (jsonObj.get("usecase") != null && !jsonObj.get("usecase").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `usecase` to be a primitive type in the JSON string but got `%s`", jsonObj.get("usecase").toString()));
      }
      if (jsonObj.get("usecaseId") != null && !jsonObj.get("usecaseId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `usecaseId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("usecaseId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SuccessTrackMapping.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SuccessTrackMapping' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SuccessTrackMapping> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SuccessTrackMapping.class));

       return (TypeAdapter<T>) new TypeAdapter<SuccessTrackMapping>() {
           @Override
           public void write(JsonWriter out, SuccessTrackMapping value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SuccessTrackMapping read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SuccessTrackMapping given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SuccessTrackMapping
  * @throws IOException if the JSON string is invalid with respect to SuccessTrackMapping
  */
  public static SuccessTrackMapping fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SuccessTrackMapping.class);
  }

 /**
  * Convert an instance of SuccessTrackMapping to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

