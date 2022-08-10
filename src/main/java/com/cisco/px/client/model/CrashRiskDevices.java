
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
import com.cisco.px.client.model.CrashRiskDevice;
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
 * CrashRiskDevices
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-03T16:34:07.228086Z[GMT]")
public class CrashRiskDevices {
  public static final String SERIALIZED_NAME_TOTAL_COUNT = "totalCount";
  @SerializedName(SERIALIZED_NAME_TOTAL_COUNT)
  private Long totalCount;

  public static final String SERIALIZED_NAME_CRASH_PREDICTED = "crashPredicted";
  @SerializedName(SERIALIZED_NAME_CRASH_PREDICTED)
  private Boolean crashPredicted;

  public static final String SERIALIZED_NAME_DEVICES = "devices";
  @SerializedName(SERIALIZED_NAME_DEVICES)
  private List<CrashRiskDevice> devices = null;

  public CrashRiskDevices() { 
  }

  public CrashRiskDevices totalCount(Long totalCount) {
    
    this.totalCount = totalCount;
    return this;
  }

   /**
   * Get totalCount
   * @return totalCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getTotalCount() {
    return totalCount;
  }


  public void setTotalCount(Long totalCount) {
    this.totalCount = totalCount;
  }


  public CrashRiskDevices crashPredicted(Boolean crashPredicted) {
    
    this.crashPredicted = crashPredicted;
    return this;
  }

   /**
   * Get crashPredicted
   * @return crashPredicted
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getCrashPredicted() {
    return crashPredicted;
  }


  public void setCrashPredicted(Boolean crashPredicted) {
    this.crashPredicted = crashPredicted;
  }


  public CrashRiskDevices devices(List<CrashRiskDevice> devices) {
    
    this.devices = devices;
    return this;
  }

  public CrashRiskDevices addDevicesItem(CrashRiskDevice devicesItem) {
    if (this.devices == null) {
      this.devices = new ArrayList<>();
    }
    this.devices.add(devicesItem);
    return this;
  }

   /**
   * Get devices
   * @return devices
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<CrashRiskDevice> getDevices() {
    return devices;
  }


  public void setDevices(List<CrashRiskDevice> devices) {
    this.devices = devices;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CrashRiskDevices crashRiskDevices = (CrashRiskDevices) o;
    return Objects.equals(this.totalCount, crashRiskDevices.totalCount) &&
        Objects.equals(this.crashPredicted, crashRiskDevices.crashPredicted) &&
        Objects.equals(this.devices, crashRiskDevices.devices);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalCount, crashPredicted, devices);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CrashRiskDevices {\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
    sb.append("    crashPredicted: ").append(toIndentedString(crashPredicted)).append("\n");
    sb.append("    devices: ").append(toIndentedString(devices)).append("\n");
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
    openapiFields.add("totalCount");
    openapiFields.add("crashPredicted");
    openapiFields.add("devices");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CrashRiskDevices
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (CrashRiskDevices.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in CrashRiskDevices is not found in the empty JSON string", CrashRiskDevices.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CrashRiskDevices.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CrashRiskDevices` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      JsonArray jsonArraydevices = jsonObj.getAsJsonArray("devices");
      if (jsonArraydevices != null) {
        // ensure the json data is an array
        if (!jsonObj.get("devices").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `devices` to be an array in the JSON string but got `%s`", jsonObj.get("devices").toString()));
        }

        // validate the optional field `devices` (array)
        for (int i = 0; i < jsonArraydevices.size(); i++) {
          CrashRiskDevice.validateJsonObject(jsonArraydevices.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CrashRiskDevices.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CrashRiskDevices' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CrashRiskDevices> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CrashRiskDevices.class));

       return (TypeAdapter<T>) new TypeAdapter<CrashRiskDevices>() {
           @Override
           public void write(JsonWriter out, CrashRiskDevices value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CrashRiskDevices read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CrashRiskDevices given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CrashRiskDevices
  * @throws IOException if the JSON string is invalid with respect to CrashRiskDevices
  */
  public static CrashRiskDevices fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CrashRiskDevices.class);
  }

 /**
  * Convert an instance of CrashRiskDevices to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

