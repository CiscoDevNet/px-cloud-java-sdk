# CustomerDataApi

All URIs are relative to *https://api-cx.cisco.com/px*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**fetchContractsDetailsUsingGET**](CustomerDataApi.md#fetchContractsDetailsUsingGET) | **GET** /v1/contract/details | Get the list of contracts Details from flat table. It supports pagination , filtering and sorting |
| [**getCustomerReport**](CustomerDataApi.md#getCustomerReport) | **GET** /v1/customers/{customerId}/reports/{reportId} | Get the report |
| [**getCustomersLifeCycle**](CustomerDataApi.md#getCustomersLifeCycle) | **GET** /v1/customers/{customerId}/lifecycle | Get customer lifecycle |
| [**requestCustomerReport**](CustomerDataApi.md#requestCustomerReport) | **POST** /v1/customers/{customerId}/reports | Request customer data reports as bulk files |


<a name="fetchContractsDetailsUsingGET"></a>
# **fetchContractsDetailsUsingGET**
> DataPaginationResponse fetchContractsDetailsUsingGET(contractNumber, puid, componentType, customerId, limit, offset, successTrackId)

Get the list of contracts Details from flat table. It supports pagination , filtering and sorting

### Example
```java
// Import classes:
import com.cisco.px.client.ApiClient;
import com.cisco.px.client.ApiException;
import com.cisco.px.client.Configuration;
import com.cisco.px.client.auth.*;
import com.cisco.px.client.models.*;
import com.cisco.px.client.api.CustomerDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-cx.cisco.com/px");
    
    // Configure OAuth2 access token for authorization: oAuth2
    OAuth oAuth2 = (OAuth) defaultClient.getAuthentication("oAuth2");
    oAuth2.setAccessToken("YOUR ACCESS TOKEN");

    CustomerDataApi apiInstance = new CustomerDataApi(defaultClient);
    Integer contractNumber = 56; // Integer | contractNumber
    Integer puid = 56; // Integer | puid
    String componentType = "componentType_example"; // String | componentType
    String customerId = "customerId_example"; // String | customerId
    Integer limit = 56; // Integer | 
    Integer offset = 56; // Integer | 
    Long successTrackId = 56L; // Long | successTrackId
    try {
      DataPaginationResponse result = apiInstance.fetchContractsDetailsUsingGET(contractNumber, puid, componentType, customerId, limit, offset, successTrackId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomerDataApi#fetchContractsDetailsUsingGET");
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
| **contractNumber** | **Integer**| contractNumber | |
| **puid** | **Integer**| puid | |
| **componentType** | **String**| componentType | [optional] |
| **customerId** | **String**| customerId | [optional] |
| **limit** | **Integer**|  | [optional] |
| **offset** | **Integer**|  | [optional] |
| **successTrackId** | **Long**| successTrackId | [optional] |

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
| **200** | Successfully Fetched Contract Details for Given Partner |  * Date -  <br>  |
| **400** | Bad Input |  * Date -  <br>  |
| **401** | Unauthorized |  * Date -  <br>  |
| **403** | Forbidden |  * Date -  <br>  |
| **404** | Entity Not Found |  * Date -  <br>  |
| **500** | Error during fetch |  * Date -  <br>  |

<a name="getCustomerReport"></a>
# **getCustomerReport**
> List&lt;ReportStatus&gt; getCustomerReport(reportId, customerId)

Get the report

Provides the status of resource. The status API provides additional info about the progress of the report. Partner application should poll periodically to get status of the report. When the report is complete the API responds with the 303 status pointing to final report in the Location header.

### Example
```java
// Import classes:
import com.cisco.px.client.ApiClient;
import com.cisco.px.client.ApiException;
import com.cisco.px.client.Configuration;
import com.cisco.px.client.auth.*;
import com.cisco.px.client.models.*;
import com.cisco.px.client.api.CustomerDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-cx.cisco.com/px");
    
    // Configure OAuth2 access token for authorization: oAuth2
    OAuth oAuth2 = (OAuth) defaultClient.getAuthentication("oAuth2");
    oAuth2.setAccessToken("YOUR ACCESS TOKEN");

    CustomerDataApi apiInstance = new CustomerDataApi(defaultClient);
    String reportId = "reportId_example"; // String | Report id
    String customerId = "customerId_example"; // String | Unique identifier for the Customer
    try {
      List<ReportStatus> result = apiInstance.getCustomerReport(reportId, customerId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomerDataApi#getCustomerReport");
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
| **reportId** | **String**| Report id | |
| **customerId** | **String**| Unique identifier for the Customer | |

### Return type

[**List&lt;ReportStatus&gt;**](ReportStatus.md)

### Authorization

[oAuth2](../README.md#oAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Provides the status of the report |  * Date -  <br>  |
| **303** | Provides the final report resource to download the file |  * Date -  <br>  * Location - downloadable URL <br>  |
| **400** | Bad Request |  * Date -  <br>  |
| **403** | Forbidden |  * Date -  <br>  |
| **404** | Not Found |  * Date -  <br>  |
| **500** | Internal server error |  * Date -  <br>  |
| **503** | Service Unavailable |  * Date -  <br>  |
| **504** | Gateway timeout |  * Date -  <br>  |

<a name="getCustomersLifeCycle"></a>
# **getCustomersLifeCycle**
> RacetrackBuid getCustomersLifeCycle(successTrackId, customerId)

Get customer lifecycle

Get customer lifecycle which will provide the CX solution, use case and pitstop information for the customer

### Example
```java
// Import classes:
import com.cisco.px.client.ApiClient;
import com.cisco.px.client.ApiException;
import com.cisco.px.client.Configuration;
import com.cisco.px.client.auth.*;
import com.cisco.px.client.models.*;
import com.cisco.px.client.api.CustomerDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-cx.cisco.com/px");
    
    // Configure OAuth2 access token for authorization: oAuth2
    OAuth oAuth2 = (OAuth) defaultClient.getAuthentication("oAuth2");
    oAuth2.setAccessToken("YOUR ACCESS TOKEN");

    CustomerDataApi apiInstance = new CustomerDataApi(defaultClient);
    String successTrackId = "successTrackId_example"; // String | 
    String customerId = "customerId_example"; // String | Unique identifier for the Customer
    try {
      RacetrackBuid result = apiInstance.getCustomersLifeCycle(successTrackId, customerId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomerDataApi#getCustomersLifeCycle");
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
| **customerId** | **String**| Unique identifier for the Customer | |

### Return type

[**RacetrackBuid**](RacetrackBuid.md)

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
| **404** | Not Found |  * Date -  <br>  |
| **500** | Internal server error |  * Date -  <br>  |
| **503** | Service Unavailable |  * Date -  <br>  |
| **504** | Gateway timeout |  * Date -  <br>  |

<a name="requestCustomerReport"></a>
# **requestCustomerReport**
> requestCustomerReport(customerId, report)

Request customer data reports as bulk files

Request customer data report. Creating a request for customer data sets like Assets, Hardware, Software and Advisories bulk json files

### Example
```java
// Import classes:
import com.cisco.px.client.ApiClient;
import com.cisco.px.client.ApiException;
import com.cisco.px.client.Configuration;
import com.cisco.px.client.auth.*;
import com.cisco.px.client.models.*;
import com.cisco.px.client.api.CustomerDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-cx.cisco.com/px");
    
    // Configure OAuth2 access token for authorization: oAuth2
    OAuth oAuth2 = (OAuth) defaultClient.getAuthentication("oAuth2");
    oAuth2.setAccessToken("YOUR ACCESS TOKEN");

    CustomerDataApi apiInstance = new CustomerDataApi(defaultClient);
    String customerId = "customerId_example"; // String | Unique identifier for the Customer
    Report report = new Report(); // Report | report infromation
    try {
      apiInstance.requestCustomerReport(customerId, report);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomerDataApi#requestCustomerReport");
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
| **customerId** | **String**| Unique identifier for the Customer | |
| **report** | [**Report**](Report.md)| report infromation | [optional] |

### Return type

null (empty response body)

### Authorization

[oAuth2](../README.md#oAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Accepted |  * Location - downloadable URL <br>  * Date -  <br>  |
| **400** | Bad Request |  * Location - downloadable URL <br>  * Date -  <br>  |
| **403** | Forbidden |  * Location - downloadable URL <br>  * Date -  <br>  |
| **404** | Not Found |  * Location - downloadable URL <br>  * Date -  <br>  |
| **500** | Internal server error |  * Location - downloadable URL <br>  * Date -  <br>  |
| **503** | Service Unavailable |  * Location - downloadable URL <br>  * Date -  <br>  |
| **504** | Gateway timeout |  * Location - downloadable URL <br>  * Date -  <br>  |

