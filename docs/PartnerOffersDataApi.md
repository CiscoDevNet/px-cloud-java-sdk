# PartnerOffersDataApi

All URIs are relative to *https://api-cx.cisco.com/px*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getPartnerOffers**](PartnerOffersDataApi.md#getPartnerOffers) | **GET** /v1/partnerOffers | Get Partner Offers |


<a name="getPartnerOffers"></a>
# **getPartnerOffers**
> PartnerOffersInfo getPartnerOffers(customerId, offerStatus, offerType, page, paginationRequired, partnerId, rows, successTrackId)

Get Partner Offers

Partner Offers

### Example
```java
// Import classes:
import com.cisco.px.client.ApiClient;
import com.cisco.px.client.ApiException;
import com.cisco.px.client.Configuration;
import com.cisco.px.client.auth.*;
import com.cisco.px.client.models.*;
import com.cisco.px.client.api.PartnerOffersDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-cx.cisco.com/px");
    
    // Configure OAuth2 access token for authorization: oAuth2
    OAuth oAuth2 = (OAuth) defaultClient.getAuthentication("oAuth2");
    oAuth2.setAccessToken("YOUR ACCESS TOKEN");

    PartnerOffersDataApi apiInstance = new PartnerOffersDataApi(defaultClient);
    List<String> customerId = Arrays.asList(); // List<String> | Customer Id's for filtering the results
    List<String> offerStatus = Arrays.asList(); // List<String> | Status for filtering the results
    List<String> offerType = Arrays.asList(); // List<String> | Asset Type for filtering the results
    Integer page = 1; // Integer | Page number. Default value is 1
    Boolean paginationRequired = true; // Boolean | Pagination data required flag
    List<Integer> partnerId = Arrays.asList(); // List<Integer> | Partner ID for filtering the results
    Integer rows = 10; // Integer | No of rows in a page. Default value is 10 and the maximum rows allowed per page is 100
    List<String> successTrackId = Arrays.asList(); // List<String> | Solution Id field for filtering the results
    try {
      PartnerOffersInfo result = apiInstance.getPartnerOffers(customerId, offerStatus, offerType, page, paginationRequired, partnerId, rows, successTrackId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PartnerOffersDataApi#getPartnerOffers");
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
| **offerStatus** | [**List&lt;String&gt;**](String.md)| Status for filtering the results | [optional] |
| **offerType** | [**List&lt;String&gt;**](String.md)| Asset Type for filtering the results | [optional] |
| **page** | **Integer**| Page number. Default value is 1 | [optional] [default to 1] |
| **paginationRequired** | **Boolean**| Pagination data required flag | [optional] [default to true] |
| **partnerId** | [**List&lt;Integer&gt;**](Integer.md)| Partner ID for filtering the results | [optional] |
| **rows** | **Integer**| No of rows in a page. Default value is 10 and the maximum rows allowed per page is 100 | [optional] [default to 10] |
| **successTrackId** | [**List&lt;String&gt;**](String.md)| Solution Id field for filtering the results | [optional] |

### Return type

[**PartnerOffersInfo**](PartnerOffersInfo.md)

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

