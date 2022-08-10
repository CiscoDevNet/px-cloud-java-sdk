

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
 * DeviceRiskFactors
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-03T16:34:07.228086Z[GMT]")
public class DeviceRiskFactors {
  public static final String SERIALIZED_NAME_FACTOR = "factor";
  @SerializedName(SERIALIZED_NAME_FACTOR)
  private String factor;

  public static final String SERIALIZED_NAME_FACTOR_TYPE = "factorType";
  @SerializedName(SERIALIZED_NAME_FACTOR_TYPE)
  private String factorType;

  public DeviceRiskFactors() { 
  }

  public DeviceRiskFactors factor(String factor) {
    
    this.factor = factor;
    return this;
  }

   /**
   * Get factor
   * @return factor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFactor() {
    return factor;
  }


  public void setFactor(String factor) {
    this.factor = factor;
  }


  public DeviceRiskFactors factorType(String factorType) {
    
    this.factorType = factorType;
    return this;
  }

   /**
   * Get factorType
   * @return factorType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFactorType() {
    return factorType;
  }


  public void setFactorType(String factorType) {
    this.factorType = factorType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeviceRiskFactors deviceRiskFactors = (DeviceRiskFactors) o;
    return Objects.equals(this.factor, deviceRiskFactors.factor) &&
        Objects.equals(this.factorType, deviceRiskFactors.factorType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(factor, factorType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeviceRiskFactors {\n");
    sb.append("    factor: ").append(toIndentedString(factor)).append("\n");
    sb.append("    factorType: ").append(toIndentedString(factorType)).append("\n");
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
    openapiFields.add("factor");
    openapiFields.add("factorType");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to DeviceRiskFactors
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (DeviceRiskFactors.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in DeviceRiskFactors is not found in the empty JSON string", DeviceRiskFactors.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!DeviceRiskFactors.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DeviceRiskFactors` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("factor") != null && !jsonObj.get("factor").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `factor` to be a primitive type in the JSON string but got `%s`", jsonObj.get("factor").toString()));
      }
      if (jsonObj.get("factorType") != null && !jsonObj.get("factorType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `factorType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("factorType").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DeviceRiskFactors.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DeviceRiskFactors' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DeviceRiskFactors> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DeviceRiskFactors.class));

       return (TypeAdapter<T>) new TypeAdapter<DeviceRiskFactors>() {
           @Override
           public void write(JsonWriter out, DeviceRiskFactors value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DeviceRiskFactors read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DeviceRiskFactors given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DeviceRiskFactors
  * @throws IOException if the JSON string is invalid with respect to DeviceRiskFactors
  */
  public static DeviceRiskFactors fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DeviceRiskFactors.class);
  }

 /**
  * Convert an instance of DeviceRiskFactors to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

