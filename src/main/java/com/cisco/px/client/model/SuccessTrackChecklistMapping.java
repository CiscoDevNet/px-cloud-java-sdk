

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

import com.cisco.px.client.JSON;
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
 * SuccessTrackChecklistMapping
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-05T16:32:06.013598Z[GMT]")
public class SuccessTrackChecklistMapping {
  public static final String SERIALIZED_NAME_CHECKLIST = "checklist";
  @SerializedName(SERIALIZED_NAME_CHECKLIST)
  private String checklist;

  public static final String SERIALIZED_NAME_CHECKLIST_ID = "checklistId";
  @SerializedName(SERIALIZED_NAME_CHECKLIST_ID)
  private String checklistId;

  public static final String SERIALIZED_NAME_MAPPING_CHECKLIST_ID = "mappingChecklistId";
  @SerializedName(SERIALIZED_NAME_MAPPING_CHECKLIST_ID)
  private String mappingChecklistId;

  public SuccessTrackChecklistMapping() { 
  }

  public SuccessTrackChecklistMapping checklist(String checklist) {
    
    this.checklist = checklist;
    return this;
  }

   /**
   * Get checklist
   * @return checklist
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getChecklist() {
    return checklist;
  }


  public void setChecklist(String checklist) {
    this.checklist = checklist;
  }


  public SuccessTrackChecklistMapping checklistId(String checklistId) {
    
    this.checklistId = checklistId;
    return this;
  }

   /**
   * Get checklistId
   * @return checklistId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getChecklistId() {
    return checklistId;
  }


  public void setChecklistId(String checklistId) {
    this.checklistId = checklistId;
  }


  public SuccessTrackChecklistMapping mappingChecklistId(String mappingChecklistId) {
    
    this.mappingChecklistId = mappingChecklistId;
    return this;
  }

   /**
   * Get mappingChecklistId
   * @return mappingChecklistId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMappingChecklistId() {
    return mappingChecklistId;
  }


  public void setMappingChecklistId(String mappingChecklistId) {
    this.mappingChecklistId = mappingChecklistId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SuccessTrackChecklistMapping successTrackChecklistMapping = (SuccessTrackChecklistMapping) o;
    return Objects.equals(this.checklist, successTrackChecklistMapping.checklist) &&
        Objects.equals(this.checklistId, successTrackChecklistMapping.checklistId) &&
        Objects.equals(this.mappingChecklistId, successTrackChecklistMapping.mappingChecklistId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(checklist, checklistId, mappingChecklistId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SuccessTrackChecklistMapping {\n");
    sb.append("    checklist: ").append(toIndentedString(checklist)).append("\n");
    sb.append("    checklistId: ").append(toIndentedString(checklistId)).append("\n");
    sb.append("    mappingChecklistId: ").append(toIndentedString(mappingChecklistId)).append("\n");
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
    openapiFields.add("checklist");
    openapiFields.add("checklistId");
    openapiFields.add("mappingChecklistId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SuccessTrackChecklistMapping
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (SuccessTrackChecklistMapping.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in SuccessTrackChecklistMapping is not found in the empty JSON string", SuccessTrackChecklistMapping.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!SuccessTrackChecklistMapping.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SuccessTrackChecklistMapping` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("checklist") != null && !jsonObj.get("checklist").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `checklist` to be a primitive type in the JSON string but got `%s`", jsonObj.get("checklist").toString()));
      }
      if (jsonObj.get("checklistId") != null && !jsonObj.get("checklistId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `checklistId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("checklistId").toString()));
      }
      if (jsonObj.get("mappingChecklistId") != null && !jsonObj.get("mappingChecklistId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mappingChecklistId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mappingChecklistId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SuccessTrackChecklistMapping.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SuccessTrackChecklistMapping' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SuccessTrackChecklistMapping> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SuccessTrackChecklistMapping.class));

       return (TypeAdapter<T>) new TypeAdapter<SuccessTrackChecklistMapping>() {
           @Override
           public void write(JsonWriter out, SuccessTrackChecklistMapping value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SuccessTrackChecklistMapping read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SuccessTrackChecklistMapping given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SuccessTrackChecklistMapping
  * @throws IOException if the JSON string is invalid with respect to SuccessTrackChecklistMapping
  */
  public static SuccessTrackChecklistMapping fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SuccessTrackChecklistMapping.class);
  }

 /**
  * Convert an instance of SuccessTrackChecklistMapping to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

