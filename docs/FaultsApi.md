# FaultsApi

All URIs are relative to *https://api-cx.cisco.com/px*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAffectedAssetsDetailsUsingGET**](FaultsApi.md#getAffectedAssetsDetailsUsingGET) | **GET** /v1/customers/{customerId}/insights/faults/{faultId}/affectedAssets/{assetName}/faultHistory | Assets Fault History |
| [**getAffectedAssetsUsingGET**](FaultsApi.md#getAffectedAssetsUsingGET) | **GET** /v1/customers/{customerId}/insights/faults/{faultId}/affectedAssets | Affected Assets |
| [**getFaultsSummaryUsingGET**](FaultsApi.md#getFaultsSummaryUsingGET) | **GET** /v1/customers/{customerId}/insights/faults/{faultId}/summary | Fault summary |
| [**getFaultsUsingGET**](FaultsApi.md#getFaultsUsingGET) | **GET** /v1/customers/{customerId}/insights/faults | Faults details |


<a name="getAffectedAssetsDetailsUsingGET"></a>
# **getAffectedAssetsDetailsUsingGET**
> AssetsFaultHistoryResponse getAffectedAssetsDetailsUsingGET(successTrackId, customerId, faultId, assetName, days)

Assets Fault History

Returns information about the occurrences of a fault on an asset based on the fault signatureId, asset name, and customerId provided

### Example
```java
// Import classes:
import com.cisco.px.client.ApiClient;
import com.cisco.px.client.ApiException;
import com.cisco.px.client.Configuration;
import com.cisco.px.client.models.*;
import com.cisco.px.client.api.FaultsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-cx.cisco.com/px");

    FaultsApi apiInstance = new FaultsApi(defaultClient);
    String successTrackId = "successTrackId_example"; // String | 
    String customerId = "customerId_example"; // String | Unique identifier of the customer
    Integer faultId = 56; // Integer | Unique identifier used in CX Cloud to identify the fault
    String assetName = "assetName_example"; // String | Unique asset name
    Integer days = 1; // Integer | The number of days to retrieve fault data for. This value can be 1, 7, 15, 30. The default is 1.
    try {
      AssetsFaultHistoryResponse result = apiInstance.getAffectedAssetsDetailsUsingGET(successTrackId, customerId, faultId, assetName, days);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FaultsApi#getAffectedAssetsDetailsUsingGET");
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
| **customerId** | **String**| Unique identifier of the customer | |
| **faultId** | **Integer**| Unique identifier used in CX Cloud to identify the fault | |
| **assetName** | **String**| Unique asset name | |
| **days** | **Integer**| The number of days to retrieve fault data for. This value can be 1, 7, 15, 30. The default is 1. | [optional] [default to 1] |

### Return type

[**AssetsFaultHistoryResponse**](AssetsFaultHistoryResponse.md)

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

<a name="getAffectedAssetsUsingGET"></a>
# **getAffectedAssetsUsingGET**
> AffectedAssetsResponse getAffectedAssetsUsingGET(successTrackId, customerId, faultId, days, offset, max)

Affected Assets

Returns information about the customer assets affected by the fault, based on the fault signatureId and customerId provided

### Example
```java
// Import classes:
import com.cisco.px.client.ApiClient;
import com.cisco.px.client.ApiException;
import com.cisco.px.client.Configuration;
import com.cisco.px.client.models.*;
import com.cisco.px.client.api.FaultsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-cx.cisco.com/px");

    FaultsApi apiInstance = new FaultsApi(defaultClient);
    String successTrackId = "successTrackId_example"; // String | 
    String customerId = "customerId_example"; // String | Unique identifier of the customer
    Integer faultId = 56; // Integer | Unique identifier used in CX Cloud to identify the fault
    Integer days = 1; // Integer | The number of days to retrieve fault data for. This value can be 1, 7, 15, 30. The default is 1.
    Integer offset = 1; // Integer | The number of items to skip before starting to collect the result set. The default value is 1.
    Integer max = 10; // Integer | The maximum number of items to return.
    try {
      AffectedAssetsResponse result = apiInstance.getAffectedAssetsUsingGET(successTrackId, customerId, faultId, days, offset, max);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FaultsApi#getAffectedAssetsUsingGET");
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
| **customerId** | **String**| Unique identifier of the customer | |
| **faultId** | **Integer**| Unique identifier used in CX Cloud to identify the fault | |
| **days** | **Integer**| The number of days to retrieve fault data for. This value can be 1, 7, 15, 30. The default is 1. | [optional] [default to 1] |
| **offset** | **Integer**| The number of items to skip before starting to collect the result set. The default value is 1. | [optional] [default to 1] |
| **max** | **Integer**| The maximum number of items to return. | [optional] [default to 10] |

### Return type

[**AffectedAssetsResponse**](AffectedAssetsResponse.md)

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

<a name="getFaultsSummaryUsingGET"></a>
# **getFaultsSummaryUsingGET**
> FaultsSummaryResponse getFaultsSummaryUsingGET(successTrackId, customerId, faultId)

Fault summary

Returns detailed information for a fault based on the fault signatureId and customerId provided

### Example
```java
// Import classes:
import com.cisco.px.client.ApiClient;
import com.cisco.px.client.ApiException;
import com.cisco.px.client.Configuration;
import com.cisco.px.client.models.*;
import com.cisco.px.client.api.FaultsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-cx.cisco.com/px");

    FaultsApi apiInstance = new FaultsApi(defaultClient);
    String successTrackId = "successTrackId_example"; // String | 
    String customerId = "customerId_example"; // String | Unique identifier of the customer
    Integer faultId = 56; // Integer | Unique identifier used in CX Cloud to identify the fault
    try {
      FaultsSummaryResponse result = apiInstance.getFaultsSummaryUsingGET(successTrackId, customerId, faultId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FaultsApi#getFaultsSummaryUsingGET");
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
| **customerId** | **String**| Unique identifier of the customer | |
| **faultId** | **Integer**| Unique identifier used in CX Cloud to identify the fault | |

### Return type

[**FaultsSummaryResponse**](FaultsSummaryResponse.md)

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

<a name="getFaultsUsingGET"></a>
# **getFaultsUsingGET**
> FaultsResponse getFaultsUsingGET(successTrackId, customerId, days, offset, max)

Faults details

Returns fault information for the customerId provided.

### Example
```java
// Import classes:
import com.cisco.px.client.ApiClient;
import com.cisco.px.client.ApiException;
import com.cisco.px.client.Configuration;
import com.cisco.px.client.models.*;
import com.cisco.px.client.api.FaultsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-cx.cisco.com/px");

    FaultsApi apiInstance = new FaultsApi(defaultClient);
    String successTrackId = "successTrackId_example"; // String | 
    String customerId = "customerId_example"; // String | Unique identifier of the customer
    Integer days = 1; // Integer | The number of days to retrieve fault data for. This value can be 1, 7, 15, 30. The default is 1.
    Integer offset = 1; // Integer | The number of items to skip before starting to collect the result set. The default value is 1.
    Integer max = 10; // Integer | The maximum number of items to return
    try {
      FaultsResponse result = apiInstance.getFaultsUsingGET(successTrackId, customerId, days, offset, max);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FaultsApi#getFaultsUsingGET");
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
| **customerId** | **String**| Unique identifier of the customer | |
| **days** | **Integer**| The number of days to retrieve fault data for. This value can be 1, 7, 15, 30. The default is 1. | [optional] [default to 1] |
| **offset** | **Integer**| The number of items to skip before starting to collect the result set. The default value is 1. | [optional] [default to 1] |
| **max** | **Integer**| The maximum number of items to return | [optional] [default to 10] |

### Return type

[**FaultsResponse**](FaultsResponse.md)

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

