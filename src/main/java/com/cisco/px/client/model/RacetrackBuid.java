
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
import com.cisco.px.client.model.RacetrackBuidSolution;
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
 * RacetrackBuid
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-05T16:32:06.013598Z[GMT]")
public class RacetrackBuid {
  public static final String SERIALIZED_NAME_BU_ID = "buId";
  @SerializedName(SERIALIZED_NAME_BU_ID)
  private String buId;

  public static final String SERIALIZED_NAME_CAV_ID = "cavId";
  @SerializedName(SERIALIZED_NAME_CAV_ID)
  private String cavId;

  public static final String SERIALIZED_NAME_BU_NAME = "buName";
  @SerializedName(SERIALIZED_NAME_BU_NAME)
  private String buName;

  public static final String SERIALIZED_NAME_CUSTOMER_ID = "customerId";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_ID)
  private String customerId;

  public static final String SERIALIZED_NAME_ITEMS = "items";
  @SerializedName(SERIALIZED_NAME_ITEMS)
  private List<RacetrackBuidSolution> items = null;

  public RacetrackBuid() { 
  }

  public RacetrackBuid buId(String buId) {
    
    this.buId = buId;
    return this;
  }

   /**
   * Customer buId
   * @return buId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Customer buId")

  public String getBuId() {
    return buId;
  }


  public void setBuId(String buId) {
    this.buId = buId;
  }


  public RacetrackBuid cavId(String cavId) {
    
    this.cavId = cavId;
    return this;
  }

   /**
   * Customer cavId
   * @return cavId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Customer cavId")

  public String getCavId() {
    return cavId;
  }


  public void setCavId(String cavId) {
    this.cavId = cavId;
  }


  public RacetrackBuid buName(String buName) {
    
    this.buName = buName;
    return this;
  }

   /**
   * BuName
   * @return buName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "BuName")

  public String getBuName() {
    return buName;
  }


  public void setBuName(String buName) {
    this.buName = buName;
  }


  public RacetrackBuid customerId(String customerId) {
    
    this.customerId = customerId;
    return this;
  }

   /**
   * Customer Id
   * @return customerId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Customer Id")

  public String getCustomerId() {
    return customerId;
  }


  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }


  public RacetrackBuid items(List<RacetrackBuidSolution> items) {
    
    this.items = items;
    return this;
  }

  public RacetrackBuid addItemsItem(RacetrackBuidSolution itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Get items
   * @return items
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<RacetrackBuidSolution> getItems() {
    return items;
  }


  public void setItems(List<RacetrackBuidSolution> items) {
    this.items = items;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RacetrackBuid racetrackBuid = (RacetrackBuid) o;
    return Objects.equals(this.buId, racetrackBuid.buId) &&
        Objects.equals(this.cavId, racetrackBuid.cavId) &&
        Objects.equals(this.buName, racetrackBuid.buName) &&
        Objects.equals(this.customerId, racetrackBuid.customerId) &&
        Objects.equals(this.items, racetrackBuid.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(buId, cavId, buName, customerId, items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RacetrackBuid {\n");
    sb.append("    buId: ").append(toIndentedString(buId)).append("\n");
    sb.append("    cavId: ").append(toIndentedString(cavId)).append("\n");
    sb.append("    buName: ").append(toIndentedString(buName)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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
    openapiFields.add("buId");
    openapiFields.add("cavId");
    openapiFields.add("buName");
    openapiFields.add("customerId");
    openapiFields.add("items");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("buId");
    openapiRequiredFields.add("cavId");
    openapiRequiredFields.add("buName");
    openapiRequiredFields.add("customerId");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to RacetrackBuid
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (RacetrackBuid.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in RacetrackBuid is not found in the empty JSON string", RacetrackBuid.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!RacetrackBuid.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RacetrackBuid` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : RacetrackBuid.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("buId") != null && !jsonObj.get("buId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `buId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("buId").toString()));
      }
      if (jsonObj.get("cavId") != null && !jsonObj.get("cavId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cavId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cavId").toString()));
      }
      if (jsonObj.get("buName") != null && !jsonObj.get("buName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `buName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("buName").toString()));
      }
      if (jsonObj.get("customerId") != null && !jsonObj.get("customerId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customerId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customerId").toString()));
      }
      JsonArray jsonArrayitems = jsonObj.getAsJsonArray("items");
      if (jsonArrayitems != null) {
        // ensure the json data is an array
        if (!jsonObj.get("items").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `items` to be an array in the JSON string but got `%s`", jsonObj.get("items").toString()));
        }

        // validate the optional field `items` (array)
        for (int i = 0; i < jsonArrayitems.size(); i++) {
          RacetrackBuidSolution.validateJsonObject(jsonArrayitems.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RacetrackBuid.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RacetrackBuid' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RacetrackBuid> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RacetrackBuid.class));

       return (TypeAdapter<T>) new TypeAdapter<RacetrackBuid>() {
           @Override
           public void write(JsonWriter out, RacetrackBuid value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RacetrackBuid read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RacetrackBuid given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RacetrackBuid
  * @throws IOException if the JSON string is invalid with respect to RacetrackBuid
  */
  public static RacetrackBuid fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RacetrackBuid.class);
  }

 /**
  * Convert an instance of RacetrackBuid to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

