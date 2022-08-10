# PartnerDataApi

All URIs are relative to *https://api-cx.cisco.com/px*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getContracts**](PartnerDataApi.md#getContracts) | **GET** /v1/contracts | List of contracts |
| [**getCustomers**](PartnerDataApi.md#getCustomers) | **GET** /v1/customers | List of customers |
| [**getSuccessTracks**](PartnerDataApi.md#getSuccessTracks) | **GET** /v1/successTracks | Success Tracks |


<a name="getContracts"></a>
# **getContracts**
> ContractResponse getContracts(offset, max)

List of contracts

Partner CX contracts transacted in cisco

### Example
```java
// Import classes:
import com.cisco.px.client.ApiClient;
import com.cisco.px.client.ApiException;
import com.cisco.px.client.Configuration;
import com.cisco.px.client.auth.*;
import com.cisco.px.client.models.*;
import com.cisco.px.client.api.PartnerDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-cx.cisco.com/px");
    
    // Configure OAuth2 access token for authorization: oAuth2
    OAuth oAuth2 = (OAuth) defaultClient.getAuthentication("oAuth2");
    oAuth2.setAccessToken("YOUR ACCESS TOKEN");

    PartnerDataApi apiInstance = new PartnerDataApi(defaultClient);
    Integer offset = 56; // Integer | The number of items to skip before starting to collect the result set
    Integer max = 10; // Integer | The numbers of items to return.
    try {
      ContractResponse result = apiInstance.getContracts(offset, max);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PartnerDataApi#getContracts");
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
| **offset** | **Integer**| The number of items to skip before starting to collect the result set | [optional] |
| **max** | **Integer**| The numbers of items to return. | [optional] [default to 10] |

### Return type

[**ContractResponse**](ContractResponse.md)

### Authorization

[oAuth2](../README.md#oAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  * Date -  <br>  |
| **400** | Bad Request |  * Date -  <br>  |
| **403** | Forbidden |  * Date -  <br>  |
| **500** | Internal server error |  * Date -  <br>  |
| **503** | Service Unavailable |  * Date -  <br>  |
| **504** | Gateway timeout |  * Date -  <br>  |

<a name="getCustomers"></a>
# **getCustomers**
> CustomerResponse getCustomers(offset, max)

List of customers

Get list of Customers

### Example
```java
// Import classes:
import com.cisco.px.client.ApiClient;
import com.cisco.px.client.ApiException;
import com.cisco.px.client.Configuration;
import com.cisco.px.client.auth.*;
import com.cisco.px.client.models.*;
import com.cisco.px.client.api.PartnerDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-cx.cisco.com/px");
    
    // Configure OAuth2 access token for authorization: oAuth2
    OAuth oAuth2 = (OAuth) defaultClient.getAuthentication("oAuth2");
    oAuth2.setAccessToken("YOUR ACCESS TOKEN");

    PartnerDataApi apiInstance = new PartnerDataApi(defaultClient);
    Integer offset = 56; // Integer | The number of items to skip before starting to collect the result set
    Integer max = 10; // Integer | The numbers of items to return.
    try {
      CustomerResponse result = apiInstance.getCustomers(offset, max);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PartnerDataApi#getCustomers");
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
| **offset** | **Integer**| The number of items to skip before starting to collect the result set | [optional] |
| **max** | **Integer**| The numbers of items to return. | [optional] [default to 10] |

### Return type

[**CustomerResponse**](CustomerResponse.md)

### Authorization

[oAuth2](../README.md#oAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  * Date -  <br>  |
| **400** | Bad Request |  * Date -  <br>  |
| **403** | Forbidden |  * Date -  <br>  |
| **500** | Internal server error |  * Date -  <br>  |
| **503** | Service Unavailable |  * Date -  <br>  |
| **504** | Gateway timeout |  * Date -  <br>  |

<a name="getSuccessTracks"></a>
# **getSuccessTracks**
> getSuccessTracks()

Success Tracks

Partner Success Tracks

### Example
```java
// Import classes:
import com.cisco.px.client.ApiClient;
import com.cisco.px.client.ApiException;
import com.cisco.px.client.Configuration;
import com.cisco.px.client.auth.*;
import com.cisco.px.client.models.*;
import com.cisco.px.client.api.PartnerDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-cx.cisco.com/px");
    
    // Configure OAuth2 access token for authorization: oAuth2
    OAuth oAuth2 = (OAuth) defaultClient.getAuthentication("oAuth2");
    oAuth2.setAccessToken("YOUR ACCESS TOKEN");

    PartnerDataApi apiInstance = new PartnerDataApi(defaultClient);
    try {
      apiInstance.getSuccessTracks();
    } catch (ApiException e) {
      System.err.println("Exception when calling PartnerDataApi#getSuccessTracks");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

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

