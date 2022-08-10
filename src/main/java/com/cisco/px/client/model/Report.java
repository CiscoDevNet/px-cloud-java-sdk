
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
 * Report
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-05T16:32:06.013598Z[GMT]")
public class Report {
  /**
   * Report containing data for the given customer
   */
  @JsonAdapter(ReportNameEnum.Adapter.class)
  public enum ReportNameEnum {
    ASSETS("Assets"),
    
    HARDWARE("Hardware"),
    
    SOFTWARE("Software"),
    
    ADVISORIES("Advisories");

    private String value;

    ReportNameEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ReportNameEnum fromValue(String value) {
      for (ReportNameEnum b : ReportNameEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ReportNameEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ReportNameEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ReportNameEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ReportNameEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_REPORT_NAME = "reportName";
  @SerializedName(SERIALIZED_NAME_REPORT_NAME)
  private ReportNameEnum reportName;

  public Report() { 
  }

  public Report reportName(ReportNameEnum reportName) {
    
    this.reportName = reportName;
    return this;
  }

   /**
   * Report containing data for the given customer
   * @return reportName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Report containing data for the given customer")

  public ReportNameEnum getReportName() {
    return reportName;
  }


  public void setReportName(ReportNameEnum reportName) {
    this.reportName = reportName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Report report = (Report) o;
    return Objects.equals(this.reportName, report.reportName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reportName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Report {\n");
    sb.append("    reportName: ").append(toIndentedString(reportName)).append("\n");
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
    openapiFields.add("reportName");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Report
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (Report.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in Report is not found in the empty JSON string", Report.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Report.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Report` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("reportName") != null && !jsonObj.get("reportName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reportName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reportName").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Report.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Report' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Report> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Report.class));

       return (TypeAdapter<T>) new TypeAdapter<Report>() {
           @Override
           public void write(JsonWriter out, Report value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Report read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Report given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Report
  * @throws IOException if the JSON string is invalid with respect to Report
  */
  public static Report fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Report.class);
  }

 /**
  * Convert an instance of Report to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

