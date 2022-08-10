# PartnerOffersSessionsDataApi

All URIs are relative to *https://api-cx.cisco.com/px*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getPartnerOffersSessions**](PartnerOffersSessionsDataApi.md#getPartnerOffersSessions) | **GET** /v1/partnerOffersSessions | Get Info about Partner Offers Sessions |


<a name="getPartnerOffersSessions"></a>
# **getPartnerOffersSessions**
> PartnerOfferWithSessions getPartnerOffersSessions(customerId, offerId, offerStatus, offerType, page, paginationRequired, partnerId, rows, successTrackId)

Get Info about Partner Offers Sessions

Information about Partner offers sessions - Ask the Experts and Accelerator

### Example
```java
// Import classes:
import com.cisco.px.client.ApiClient;
import com.cisco.px.client.ApiException;
import com.cisco.px.client.Configuration;
import com.cisco.px.client.auth.*;
import com.cisco.px.client.models.*;
import com.cisco.px.client.api.PartnerOffersSessionsDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-cx.cisco.com/px");
    
    // Configure OAuth2 access token for authorization: oAuth2
    OAuth oAuth2 = (OAuth) defaultClient.getAuthentication("oAuth2");
    oAuth2.setAccessToken("YOUR ACCESS TOKEN");

    PartnerOffersSessionsDataApi apiInstance = new PartnerOffersSessionsDataApi(defaultClient);
    List<String> customerId = Arrays.asList(); // List<String> | Customer Id's for filtering the results
    String offerId = "offerId_example"; // String | published Asset Id from Path Params
    List<String> offerStatus = Arrays.asList(); // List<String> | Status for filtering the results
    List<String> offerType = Arrays.asList(); // List<String> | Asset Type for filtering the results
    Integer page = 1; // Integer | Page number. Default value is 1
    Boolean paginationRequired = true; // Boolean | Pagination data required flag
    List<Integer> partnerId = Arrays.asList(); // List<Integer> | Partner ID for filtering the results
    Integer rows = 10; // Integer | No of rows in a page. Default value is 10 and the maximum rows allowed per page is 100
    List<String> successTrackId = Arrays.asList(); // List<String> | Solution Id field for filtering the results
    try {
      PartnerOfferWithSessions result = apiInstance.getPartnerOffersSessions(customerId, offerId, offerStatus, offerType, page, paginationRequired, partnerId, rows, successTrackId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PartnerOffersSessionsDataApi#getPartnerOffersSessions");
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
| **customerId** | [**List&lt;String&gt;**](String.md)| Customer Id&#39;s for filtering the results | [optional] |
| **offerId** | **String**| published Asset Id from Path Params | [optional] |
| **offerStatus** | [**List&lt;String&gt;**](String.md)| Status for filtering the results | [optional] |
| **offerType** | [**List&lt;String&gt;**](String.md)| Asset Type for filtering the results | [optional] |
| **page** | **Integer**| Page number. Default value is 1 | [optional] [default to 1] |
| **paginationRequired** | **Boolean**| Pagination data required flag | [optional] [default to true] |
| **partnerId** | [**List&lt;Integer&gt;**](Integer.md)| Partner ID for filtering the results | [optional] |
| **rows** | **Integer**| No of rows in a page. Default value is 10 and the maximum rows allowed per page is 100 | [optional] [default to 10] |
| **successTrackId** | [**List&lt;String&gt;**](String.md)| Solution Id field for filtering the results | [optional] |

### Return type

[**PartnerOfferWithSessions**](PartnerOfferWithSessions.md)

### Authorization

[oAuth2](../README.md#oAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 response |  * Date -  <br>  |
| **400** | Bad Request |  * Date -  <br>  |
| **403** | Forbidden |  * Date -  <br>  |
| **500** | Internal server error |  * Date -  <br>  |
| **503** | Service Unavailable |  * Date -  <br>  |
| **504** | Gateway timeout |  * Date -  <br>  |

