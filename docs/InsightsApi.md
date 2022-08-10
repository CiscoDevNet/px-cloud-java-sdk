# SoftwareSuggestionsAPI

All URIs are relative to *https://api-cx.cisco.com/px*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getSoftwareGroupAssetsUsingGET**](InsightsApi.md#getSoftwareGroupAssetsUsingGET) | **GET** /v1/customers/{customerId}/insights/software/softwareGroups/{softwareGroupId}/assets | Asset information in the Software Group |
| [**getSoftwareGroupSuggestionsUsingGET**](InsightsApi.md#getSoftwareGroupSuggestionsUsingGET) | **GET** /v1/customers/{customerId}/insights/software/softwareGroups/{softwareGroupName}/suggestions | Software Group suggestions |
| [**getSoftwareGroupsUsingGET**](InsightsApi.md#getSoftwareGroupsUsingGET) | **GET** /v1/customers/{customerId}/insights/software/softwareGroups | Software Group information |


<a name="getSoftwareGroupAssetsUsingGET"></a>
# **getSoftwareGroupAssetsUsingGET**
> AssetResponse getSoftwareGroupAssetsUsingGET(successTrackId, customerId, softwareGroupId, offset, max)

Asset information in the Software Group

Returns information about assets in the Software Group based on the customerId and softwareGroupId provided

### Example
```java
// Import classes:
import com.cisco.px.client.ApiClient;
import com.cisco.px.client.ApiException;
import com.cisco.px.client.Configuration;
import com.cisco.px.client.models.*;
import com.cisco.px.client.api.SoftwareSuggestionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-cx.cisco.com/px");

    SoftwareSuggestionsApi apiInstance = new SoftwareSuggestionsApi(defaultClient);
    String successTrackId = "successTrackId_example"; // String | 
    String customerId = "customerId_example"; // String | Unique identifier of the customer
    String softwareGroupId = "softwareGroupId_example"; // String | Unique identifier used in CX Cloud to identify the Software Group
    Integer offset = 56; // Integer | The number of items to skip before starting to collect the result set. The default value is 1.
    Integer max = 50; // Integer | The maximum number of items to return
    try {
      AssetResponse result = apiInstance.getSoftwareGroupAssetsUsingGET(successTrackId, customerId, softwareGroupId, offset, max);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InsightsApi#getSoftwareGroupAssetsUsingGET");
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
| **softwareGroupId** | **String**| Unique identifier used in CX Cloud to identify the Software Group | |
| **offset** | **Integer**| The number of items to skip before starting to collect the result set. The default value is 1. | [optional] |
| **max** | **Integer**| The maximum number of items to return | [optional] [default to 50] |

### Return type

[**AssetResponse**](AssetResponse.md)

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

<a name="getSoftwareGroupSuggestionsUsingGET"></a>
# **getSoftwareGroupSuggestionsUsingGET**
> SoftwareGroupSuggestions getSoftwareGroupSuggestionsUsingGET(successTrackId, customerId, softwareGroupName, sourceSystemId, softwareType)

Software Group suggestions

Returns Software Group suggestions, including detailed information about Cisco software release recommendations and current Cisco software releases running on assets in the Software Group

### Example
```java
// Import classes:
import com.cisco.px.client.ApiClient;
import com.cisco.px.client.ApiException;
import com.cisco.px.client.Configuration;
import com.cisco.px.client.models.*;
import com.cisco.px.client.api.InsightsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-cx.cisco.com/px");

    InsightsApi apiInstance = new InsightsApi(defaultClient);
    String successTrackId = "successTrackId_example"; // String | 
    String customerId = "customerId_example"; // String | Unique identifier of the customer
    String softwareGroupName = "softwareGroupName_example"; // String | Name of the Software Group, which is based on the Cisco product ID of the assets in the Software Group
    String sourceSystemId = "sourceSystemId_example"; // String | UUID of the Cisco network management system that manages the assets in the Software Group
    String softwareType = "softwareType_example"; // String | Cisco software type running on the assets in the Software Group
    try {
      SoftwareGroupSuggestions result = apiInstance.getSoftwareGroupSuggestionsUsingGET(successTrackId, customerId, softwareGroupName, sourceSystemId, softwareType);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InsightsApi#getSoftwareGroupSuggestionsUsingGET");
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
| **softwareGroupName** | **String**| Name of the Software Group, which is based on the Cisco product ID of the assets in the Software Group | |
| **sourceSystemId** | **String**| UUID of the Cisco network management system that manages the assets in the Software Group | |
| **softwareType** | **String**| Cisco software type running on the assets in the Software Group | |

### Return type

[**SoftwareGroupSuggestions**](SoftwareGroupSuggestions.md)

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

<a name="getSoftwareGroupsUsingGET"></a>
# **getSoftwareGroupsUsingGET**
> SoftwareGroupResponse getSoftwareGroupsUsingGET(successTrackId, customerId, offset, max)

Software Group information

Returns Software Group information for the customerId provided

### Example
```java
// Import classes:
import com.cisco.px.client.ApiClient;
import com.cisco.px.client.ApiException;
import com.cisco.px.client.Configuration;
import com.cisco.px.client.models.*;
import com.cisco.px.client.api.InsightsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-cx.cisco.com/px");

    InsightsApi apiInstance = new InsightsApi(defaultClient);
    String successTrackId = "successTrackId_example"; // String | 
    String customerId = "customerId_example"; // String | Unique identifier of the customer
    Integer offset = 56; // Integer | The number of items to skip before starting to collect the result set. The default value is 1.
    Integer max = 50; // Integer | The maximum number of items to return
    try {
      SoftwareGroupResponse result = apiInstance.getSoftwareGroupsUsingGET(successTrackId, customerId, offset, max);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InsightsApi#getSoftwareGroupsUsingGET");
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
| **offset** | **Integer**| The number of items to skip before starting to collect the result set. The default value is 1. | [optional] |
| **max** | **Integer**| The maximum number of items to return | [optional] [default to 50] |

### Return type

[**SoftwareGroupResponse**](SoftwareGroupResponse.md)

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

