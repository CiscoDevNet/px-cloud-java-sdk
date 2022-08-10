# ContractsDataApi

All URIs are relative to *https://api-cx.cisco.com/px*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**fetchContractsSummaryUsingGET**](ContractsDataApi.md#fetchContractsSummaryUsingGET) | **GET** /v2/contracts | Get the list of contracts summary |


<a name="fetchContractsSummaryUsingGET"></a>
# **fetchContractsSummaryUsingGET**
> DataPaginationResponse fetchContractsSummaryUsingGET(successTrackId, puid, customerId, guName, limit, offset)

Get the list of contracts summary

### Example
```java
// Import classes:
import com.cisco.px.client.ApiClient;
import com.cisco.px.client.ApiException;
import com.cisco.px.client.Configuration;
import com.cisco.px.client.auth.*;
import com.cisco.px.client.models.*;
import com.cisco.px.client.api.ContractsDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-cx.cisco.com/px");
    
    // Configure OAuth2 access token for authorization: oAuth2
    OAuth oAuth2 = (OAuth) defaultClient.getAuthentication("oAuth2");
    oAuth2.setAccessToken("YOUR ACCESS TOKEN");

    ContractsDataApi apiInstance = new ContractsDataApi(defaultClient);
    Integer successTrackId = 56; // Integer | successTrackId
    Integer puid = 56; // Integer | puid
    String customerId = "customerId_example"; // String | customerId
    String guName = "guName_example"; // String | guName
    Integer limit = 56; // Integer | 
    Integer offset = 56; // Integer | 
    try {
      DataPaginationResponse result = apiInstance.fetchContractsSummaryUsingGET(successTrackId, puid, customerId, guName, limit, offset);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContractsDataApi#fetchContractsSummaryUsingGET");
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
| **successTrackId** | **Integer**| successTrackId | |
| **puid** | **Integer**| puid | |
| **customerId** | **String**| customerId | [optional] |
| **guName** | **String**| guName | [optional] |
| **limit** | **Integer**|  | [optional] |
| **offset** | **Integer**|  | [optional] |

### Return type

[**DataPaginationResponse**](DataPaginationResponse.md)

### Authorization

[oAuth2](../README.md#oAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully Fetched Contract Summary for Given Partner |  * Date -  <br>  |
| **400** | Bad Input |  * Date -  <br>  |
| **401** | Unauthorized |  * Date -  <br>  |
| **403** | Forbidden |  * Date -  <br>  |
| **404** | Entity Not Found |  * Date -  <br>  |
| **500** | Error during fetch |  * Date -  <br>  |

