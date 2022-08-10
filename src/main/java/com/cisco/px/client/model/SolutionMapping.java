
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
 * SolutionMapping
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-05T16:32:06.013598Z[GMT]")
public class SolutionMapping {
  public static final String SERIALIZED_NAME_PITSTOP = "pitstop";
  @SerializedName(SERIALIZED_NAME_PITSTOP)
  private String pitstop;

  public static final String SERIALIZED_NAME_SOLUTION = "solution";
  @SerializedName(SERIALIZED_NAME_SOLUTION)
  private String solution;

  public static final String SERIALIZED_NAME_USECASE = "usecase";
  @SerializedName(SERIALIZED_NAME_USECASE)
  private String usecase;

  public SolutionMapping() { 
  }

  public SolutionMapping pitstop(String pitstop) {
    
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


  public SolutionMapping solution(String solution) {
    
    this.solution = solution;
    return this;
  }

   /**
   * Get solution
   * @return solution
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSolution() {
    return solution;
  }


  public void setSolution(String solution) {
    this.solution = solution;
  }


  public SolutionMapping usecase(String usecase) {
    
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SolutionMapping solutionMapping = (SolutionMapping) o;
    return Objects.equals(this.pitstop, solutionMapping.pitstop) &&
        Objects.equals(this.solution, solutionMapping.solution) &&
        Objects.equals(this.usecase, solutionMapping.usecase);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pitstop, solution, usecase);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SolutionMapping {\n");
    sb.append("    pitstop: ").append(toIndentedString(pitstop)).append("\n");
    sb.append("    solution: ").append(toIndentedString(solution)).append("\n");
    sb.append("    usecase: ").append(toIndentedString(usecase)).append("\n");
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
    openapiFields.add("pitstop");
    openapiFields.add("solution");
    openapiFields.add("usecase");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SolutionMapping
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (SolutionMapping.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in SolutionMapping is not found in the empty JSON string", SolutionMapping.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!SolutionMapping.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SolutionMapping` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("pitstop") != null && !jsonObj.get("pitstop").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pitstop` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pitstop").toString()));
      }
      if (jsonObj.get("solution") != null && !jsonObj.get("solution").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `solution` to be a primitive type in the JSON string but got `%s`", jsonObj.get("solution").toString()));
      }
      if (jsonObj.get("usecase") != null && !jsonObj.get("usecase").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `usecase` to be a primitive type in the JSON string but got `%s`", jsonObj.get("usecase").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SolutionMapping.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SolutionMapping' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SolutionMapping> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SolutionMapping.class));

       return (TypeAdapter<T>) new TypeAdapter<SolutionMapping>() {
           @Override
           public void write(JsonWriter out, SolutionMapping value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SolutionMapping read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SolutionMapping given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SolutionMapping
  * @throws IOException if the JSON string is invalid with respect to SolutionMapping
  */
  public static SolutionMapping fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SolutionMapping.class);
  }

 /**
  * Convert an instance of SolutionMapping to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

