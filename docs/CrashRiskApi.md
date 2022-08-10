# CrashRiskApi

All URIs are relative to *https://api-cx.cisco.com/px*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**assetRiskFactorsUsingGet**](CrashRiskApi.md#assetRiskFactorsUsingGet) | **GET** /v1/customers/{customerId}/insights/crashRisk/assets/{assetIdBase64}/riskFactors | Get risk factors of a device |
| [**assetsCrashedUsingGET**](CrashRiskApi.md#assetsCrashedUsingGET) | **GET** /v1/customers/{customerId}/insights/crashRisk/assetsCrashed | Get the list of crashed devices for last given time period |
| [**crashHistoryUsingGET**](CrashRiskApi.md#crashHistoryUsingGET) | **GET** /v1/customers/{customerId}/insights/crashRisk/asset/{assetIdBase64}/crashHistory | Get the device crash-detail - Asset 360(time stamp, reset reason) |
| [**crashRiskAssetsUsingGet**](CrashRiskApi.md#crashRiskAssetsUsingGet) | **GET** /v1/customers/{customerId}/insights/crashRisk/assets | Get devices which are at risk of crash owned by a customer, sorted by risk score in descending order by default |
| [**similarAssetsUsingGet**](CrashRiskApi.md#similarAssetsUsingGet) | **GET** /v1/customers/{customerId}/insights/crashRisk/assets/{assetIdBase64}/similarAssets | Get similar assets based on the similarity score |


<a name="assetRiskFactorsUsingGet"></a>
# **assetRiskFactorsUsingGet**
> DeviceRiskFactors assetRiskFactorsUsingGet(successTrackId, customerId, assetIdBase64)

Get risk factors of a device

This API provides list of risk factors that contribute to the high risk score. Default sorting is factorWeight

### Example
```java
// Import classes:
import com.cisco.px.client.ApiClient;
import com.cisco.px.client.ApiException;
import com.cisco.px.client.Configuration;
import com.cisco.px.client.models.*;
import com.cisco.px.client.api.CrashRiskApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-cx.cisco.com/px");

    CrashRiskApi apiInstance = new CrashRiskApi(defaultClient);
    String successTrackId = "successTrackId_example"; // String | 
    String customerId = "customerId_example"; // String | 
    String assetIdBase64 = "assetIdBase64_example"; // String | base64 encoded value of the assetId
    try {
      DeviceRiskFactors result = apiInstance.assetRiskFactorsUsingGet(successTrackId, customerId, assetIdBase64);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CrashRiskApi#assetRiskFactorsUsingGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **successTrackId** | **String**|  | |
| **customerId** | **String**|  | |
| **assetIdBase64** | **String**| base64 encoded value of the assetId | |

### Return type

[**DeviceRiskFactors**](DeviceRiskFactors.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  * Date -  <br>  |
| **400** | Bad Request |  * Date -  <br>  |
| **401** | Unauthorized |  * Date -  <br>  |
| **403** | Forbidden error |  * Date -  <br>  |
| **404** | Not Found |  * Date -  <br>  |

<a name="assetsCrashedUsingGET"></a>
# **assetsCrashedUsingGET**
> InventoryCrashDetails assetsCrashedUsingGET(successTrackId, customerId, timePeriod)

Get the list of crashed devices for last given time period

This API provides the list of devices with details (i.e. Asset, Product Id, Product Family, Software Version, Crash Count, First Occurrence and Last Occurrence) by customer Id that have crashed in the last 1d,7d,15d,90d based on the filter input. Default sort is by lastCrashDate

### Example
```java
// Import classes:
import com.cisco.px.client.ApiClient;
import com.cisco.px.client.ApiException;
import com.cisco.px.client.Configuration;
import com.cisco.px.client.models.*;
import com.cisco.px.client.api.CrashRiskApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-cx.cisco.com/px");

    CrashRiskApi apiInstance = new CrashRiskApi(defaultClient);
    String successTrackId = "successTrackId_example"; // String | 
    String customerId = "customerId_example"; // String | customerId
    String timePeriod = "1"; // String | timePeriod
    try {
      InventoryCrashDetails result = apiInstance.assetsCrashedUsingGET(successTrackId, customerId, timePeriod);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CrashRiskApi#assetsCrashedUsingGET");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **successTrackId** | **String**|  | |
| **customerId** | **String**| customerId | |
| **timePeriod** | **String**| timePeriod | [optional] [default to 1] |

### Return type

[**InventoryCrashDetails**](InventoryCrashDetails.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  * Date -  <br>  |
| **401** | Unauthorized |  * Date -  <br>  |
| **403** | Forbidden |  * Date -  <br>  |
| **404** | Not Found |  * Date -  <br>  |

<a name="crashHistoryUsingGET"></a>
# **crashHistoryUsingGET**
> DeviceCrashDetail crashHistoryUsingGET(successTrackId, customerId, assetIdBase64)

Get the device crash-detail - Asset 360(time stamp, reset reason)

Details of the number of times the device crashed in the last 365 days with reset reason. Default sort is by timeStamp

### Example
```java
// Import classes:
import com.cisco.px.client.ApiClient;
import com.cisco.px.client.ApiException;
import com.cisco.px.client.Configuration;
import com.cisco.px.client.models.*;
import com.cisco.px.client.api.CrashRiskApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-cx.cisco.com/px");

    CrashRiskApi apiInstance = new CrashRiskApi(defaultClient);
    String successTrackId = "successTrackId_example"; // String | 
    String customerId = "customerId_example"; // String | customerId
    String assetIdBase64 = "assetIdBase64_example"; // String | base64 encoded value of the assetId
    try {
      DeviceCrashDetail result = apiInstance.crashHistoryUsingGET(successTrackId, customerId, assetIdBase64);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CrashRiskApi#crashHistoryUsingGET");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **successTrackId** | **String**|  | |
| **customerId** | **String**| customerId | |
| **assetIdBase64** | **String**| base64 encoded value of the assetId | |

### Return type

[**DeviceCrashDetail**](DeviceCrashDetail.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  * Date -  <br>  |
| **401** | Unauthorized |  * Date -  <br>  |
| **403** | Forbidden |  * Date -  <br>  |
| **404** | Not Found |  * Date -  <br>  |

<a name="crashRiskAssetsUsingGet"></a>
# **crashRiskAssetsUsingGet**
> CrashRiskDevices crashRiskAssetsUsingGet(successTrackId, customerId, offset, max)

Get devices which are at risk of crash owned by a customer, sorted by risk score in descending order by default

This API provides details of the devices that have a probability of crash with crash score rating as High, Medium and Low. Default sorting is End date

### Example
```java
// Import classes:
import com.cisco.px.client.ApiClient;
import com.cisco.px.client.ApiException;
import com.cisco.px.client.Configuration;
import com.cisco.px.client.models.*;
import com.cisco.px.client.api.CrashRiskApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-cx.cisco.com/px");

    CrashRiskApi apiInstance = new CrashRiskApi(defaultClient);
    String successTrackId = "successTrackId_example"; // String | 
    String customerId = "customerId_example"; // String | 
    Integer offset = 1; // Integer | 
    Integer max = 10; // Integer | 
    try {
      CrashRiskDevices result = apiInstance.crashRiskAssetsUsingGet(successTrackId, customerId, offset, max);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CrashRiskApi#crashRiskAssetsUsingGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **successTrackId** | **String**|  | |
| **customerId** | **String**|  | |
| **offset** | **Integer**|  | [optional] [default to 1] |
| **max** | **Integer**|  | [optional] [default to 10] |

### Return type

[**CrashRiskDevices**](CrashRiskDevices.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  * Date -  <br>  |
| **400** | Bad Request |  * Date -  <br>  |
| **401** | Unauthorized |  * Date -  <br>  |
| **403** | Forbidden error |  * Date -  <br>  |
| **404** | Not Found |  * Date -  <br>  |

<a name="similarAssetsUsingGet"></a>
# **similarAssetsUsingGet**
> SimilarDevices similarAssetsUsingGet(successTrackId, customerId, assetIdBase64, similarityCriteria, offset, max)

Get similar assets based on the similarity score

This API provides details of other devices in the network that are similar to the current device pre in terms of features , prodict familiy and hardware. Default sort is similarityScore

### Example
```java
// Import classes:
import com.cisco.px.client.ApiClient;
import com.cisco.px.client.ApiException;
import com.cisco.px.client.Configuration;
import com.cisco.px.client.models.*;
import com.cisco.px.client.api.CrashRiskApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-cx.cisco.com/px");

    CrashRiskApi apiInstance = new CrashRiskApi(defaultClient);
    String successTrackId = "successTrackId_example"; // String | 
    String customerId = "customerId_example"; // String | 
    String assetIdBase64 = "assetIdBase64_example"; // String | base64 encoded value of the assetId
    String similarityCriteria = "similarityCriteria_example"; // String | should be one of the following values features,fingerprint,softwares_features
    Integer offset = 1; // Integer | 
    Integer max = 10; // Integer | 
    try {
      SimilarDevices result = apiInstance.similarAssetsUsingGet(successTrackId, customerId, assetIdBase64, similarityCriteria, offset, max);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CrashRiskApi#similarAssetsUsingGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **successTrackId** | **String**|  | |
| **customerId** | **String**|  | |
| **assetIdBase64** | **String**| base64 encoded value of the assetId | |
| **similarityCriteria** | **String**| should be one of the following values features,fingerprint,softwares_features | |
| **offset** | **Integer**|  | [optional] [default to 1] |
| **max** | **Integer**|  | [optional] [default to 10] |

### Return type

[**SimilarDevices**](SimilarDevices.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  * Date -  <br>  |
| **400** | Bad Request |  * Date -  <br>  |
| **401** | Unauthorized |  * Date -  <br>  |
| **403** | Forbidden error |  * Date -  <br>  |
| **404** | Not Found |  * Date -  <br>  |

