# ComplianceApi

All URIs are relative to *https://api.pxcloud-stg.cisco.com/torii*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAssetViolationDetailsUsingGET**](ComplianceApi.md#getAssetViolationDetailsUsingGET) | **GET** /v1/customers/{customerId}/insights/compliance/violations/assets | Get the violation details of impacted assets for the customer, and selected policy Group, Policy and Rule |
| [**getAssetViolationsUsingGET**](ComplianceApi.md#getAssetViolationsUsingGET) | **GET** /v1/customers/{customerId}/insights/compliance/assetViolations | Get the violations of the asset |
| [**getAssetWithViolationsUsingGET**](ComplianceApi.md#getAssetWithViolationsUsingGET) | **GET** /v1/customers/{customerId}/insights/compliance/assetsWithViolations | Get the asset summary |
| [**getOptInUsingGET**](ComplianceApi.md#getOptInUsingGET) | **GET** /v1/customers/{customerId}/insights/compliance/optIn | optIn status |
| [**getPolicyRuleDetailsUsingGET**](ComplianceApi.md#getPolicyRuleDetailsUsingGET) | **GET** /v1/customers/{customerId}/insights/compliance/policyRuleDetails | Returns information about the policy the rule belongs to |
| [**getSuggestionsUsingGET**](ComplianceApi.md#getSuggestionsUsingGET) | **GET** /v1/customers/{customerId}/insights/compliance/suggestions | Get the Suggestions filtered upon Severity (if given), for summary tab |
| [**getViolationSummaryUsingGET**](ComplianceApi.md#getViolationSummaryUsingGET) | **GET** /v1/customers/{customerId}/insights/compliance/violations | Get the violation summary of a customer |


<a name="getAssetViolationDetailsUsingGET"></a>
# **getAssetViolationDetailsUsingGET**
> AssetsViolationsResponse getAssetViolationDetailsUsingGET(successTrackId, customerId, policyCategory, policyGroupId, policyId, ruleId, severity, offset, max)

Get the violation details of impacted assets for the customer, and selected policy Group, Policy and Rule

Returns information about the customer assets in violation of the rule based on the customer, policy, and rule information provided. Default sorting is, assetName(asc)

### Example
```java
// Import classes:
import com.cisco.px.client.ApiClient;
import com.cisco.px.client.ApiException;
import com.cisco.px.client.Configuration;
import com.cisco.px.client.models.*;
import com.cisco.px.client.api.ComplianceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.pxcloud-stg.cisco.com/torii");

    ComplianceApi apiInstance = new ComplianceApi(defaultClient);
    String successTrackId = "successTrackId_example"; // String | 
    String customerId = "customerId_example"; // String | 
    String policyCategory = "policyCategory_example"; // String | 
    String policyGroupId = "policyGroupId_example"; // String | 
    String policyId = "policyId_example"; // String | 
    String ruleId = "ruleId_example"; // String | 
    String severity = "severity_example"; // String | 
    Integer offset = 1; // Integer | 
    Integer max = 10; // Integer | 
    try {
      AssetsViolationsResponse result = apiInstance.getAssetViolationDetailsUsingGET(successTrackId, customerId, policyCategory, policyGroupId, policyId, ruleId, severity, offset, max);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ComplianceApi#getAssetViolationDetailsUsingGET");
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
| **policyCategory** | **String**|  | |
| **policyGroupId** | **String**|  | |
| **policyId** | **String**|  | |
| **ruleId** | **String**|  | |
| **severity** | **String**|  | |
| **offset** | **Integer**|  | [optional] [default to 1] |
| **max** | **Integer**|  | [optional] [default to 10] |

### Return type

[**AssetsViolationsResponse**](AssetsViolationsResponse.md)

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

<a name="getAssetViolationsUsingGET"></a>
# **getAssetViolationsUsingGET**
> AssetViolationsResponse getAssetViolationsUsingGET(successTrackId, sourceSystemId, customerId, assetId, offset, max)

Get the violations of the asset

Returns information about the rules violated by an asset based on the customer and asset information provided. Default is ruleSeverityId(desc)

### Example
```java
// Import classes:
import com.cisco.px.client.ApiClient;
import com.cisco.px.client.ApiException;
import com.cisco.px.client.Configuration;
import com.cisco.px.client.models.*;
import com.cisco.px.client.api.ComplianceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.pxcloud-stg.cisco.com/torii");

    ComplianceApi apiInstance = new ComplianceApi(defaultClient);
    String successTrackId = "successTrackId_example"; // String | 
    String sourceSystemId = "sourceSystemId_example"; // String | 
    String customerId = "customerId_example"; // String | 
    String assetId = "assetId_example"; // String | 
    Integer offset = 1; // Integer | 
    Integer max = 10; // Integer | 
    try {
      AssetViolationsResponse result = apiInstance.getAssetViolationsUsingGET(successTrackId, sourceSystemId, customerId, assetId, offset, max);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ComplianceApi#getAssetViolationsUsingGET");
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
| **sourceSystemId** | **String**|  | |
| **customerId** | **String**|  | |
| **assetId** | **String**|  | |
| **offset** | **Integer**|  | [optional] [default to 1] |
| **max** | **Integer**|  | [optional] [default to 10] |

### Return type

[**AssetViolationsResponse**](AssetViolationsResponse.md)

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

<a name="getAssetWithViolationsUsingGET"></a>
# **getAssetWithViolationsUsingGET**
> AssetsWithViolationsResponse getAssetWithViolationsUsingGET(successTrackId, customerId, offset, max)

Get the asset summary

Returns information about assets that have at least one rule violation based on the customerId provided. Default is severityId(desc), violationCount(desc)

### Example
```java
// Import classes:
import com.cisco.px.client.ApiClient;
import com.cisco.px.client.ApiException;
import com.cisco.px.client.Configuration;
import com.cisco.px.client.models.*;
import com.cisco.px.client.api.ComplianceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.pxcloud-stg.cisco.com/torii");

    ComplianceApi apiInstance = new ComplianceApi(defaultClient);
    String successTrackId = "successTrackId_example"; // String | 
    String customerId = "customerId_example"; // String | 
    Integer offset = 1; // Integer | 
    Integer max = 10; // Integer | 
    try {
      AssetsWithViolationsResponse result = apiInstance.getAssetWithViolationsUsingGET(successTrackId, customerId, offset, max);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ComplianceApi#getAssetWithViolationsUsingGET");
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

[**AssetsWithViolationsResponse**](AssetsWithViolationsResponse.md)

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

<a name="getOptInUsingGET"></a>
# **getOptInUsingGET**
> OptInResponse getOptInUsingGET(successTrackId, customerId)

optIn status

Returns information about whether the customer has successfully configured the regulatory compliance feature and has assets that are qualified to be checked.

### Example
```java
// Import classes:
import com.cisco.px.client.ApiClient;
import com.cisco.px.client.ApiException;
import com.cisco.px.client.Configuration;
import com.cisco.px.client.models.*;
import com.cisco.px.client.api.ComplianceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.pxcloud-stg.cisco.com/torii");

    ComplianceApi apiInstance = new ComplianceApi(defaultClient);
    String successTrackId = "successTrackId_example"; // String | 
    String customerId = "customerId_example"; // String | 
    try {
      OptInResponse result = apiInstance.getOptInUsingGET(successTrackId, customerId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ComplianceApi#getOptInUsingGET");
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

### Return type

[**OptInResponse**](OptInResponse.md)

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

<a name="getPolicyRuleDetailsUsingGET"></a>
# **getPolicyRuleDetailsUsingGET**
> PolicyRuleDetails getPolicyRuleDetailsUsingGET(successTrackId, customerId, policyCategory, policyGroupId, policyId, ruleId, severity)

Returns information about the policy the rule belongs to

Returns information about the policy the rule belongs to.

### Example
```java
// Import classes:
import com.cisco.px.client.ApiClient;
import com.cisco.px.client.ApiException;
import com.cisco.px.client.Configuration;
import com.cisco.px.client.models.*;
import com.cisco.px.client.api.ComplianceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.pxcloud-stg.cisco.com/torii");

    ComplianceApi apiInstance = new ComplianceApi(defaultClient);
    String successTrackId = "successTrackId_example"; // String | 
    String customerId = "customerId_example"; // String | Unique identifier of the customer
    String policyCategory = "policyCategory_example"; // String | 
    String policyGroupId = "policyGroupId_example"; // String | 
    String policyId = "policyId_example"; // String | 
    String ruleId = "ruleId_example"; // String | 
    String severity = "severity_example"; // String | 
    try {
      PolicyRuleDetails result = apiInstance.getPolicyRuleDetailsUsingGET(successTrackId, customerId, policyCategory, policyGroupId, policyId, ruleId, severity);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ComplianceApi#getPolicyRuleDetailsUsingGET");
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
| **policyCategory** | **String**|  | |
| **policyGroupId** | **String**|  | |
| **policyId** | **String**|  | |
| **ruleId** | **String**|  | |
| **severity** | **String**|  | |

### Return type

[**PolicyRuleDetails**](PolicyRuleDetails.md)

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

<a name="getSuggestionsUsingGET"></a>
# **getSuggestionsUsingGET**
> SuggestionsResponse getSuggestionsUsingGET(policyCategory, successTrackId, customerId, policyGroupId, policyId, ruleId, offset, max)

Get the Suggestions filtered upon Severity (if given), for summary tab

Returns information about the violated rule conditions, including suggested remediation steps, based on the customer, policy, and rule information provided. Default sorting is severityId(desc)

### Example
```java
// Import classes:
import com.cisco.px.client.ApiClient;
import com.cisco.px.client.ApiException;
import com.cisco.px.client.Configuration;
import com.cisco.px.client.models.*;
import com.cisco.px.client.api.ComplianceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.pxcloud-stg.cisco.com/torii");

    ComplianceApi apiInstance = new ComplianceApi(defaultClient);
    String policyCategory = "policyCategory_example"; // String | 
    String successTrackId = "successTrackId_example"; // String | 
    String customerId = "customerId_example"; // String | 
    String policyGroupId = "policyGroupId_example"; // String | 
    String policyId = "policyId_example"; // String | 
    String ruleId = "ruleId_example"; // String | 
    Integer offset = 1; // Integer | 
    Integer max = 10; // Integer | 
    try {
      SuggestionsResponse result = apiInstance.getSuggestionsUsingGET(policyCategory, successTrackId, customerId, policyGroupId, policyId, ruleId, offset, max);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ComplianceApi#getSuggestionsUsingGET");
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
| **policyCategory** | **String**|  | |
| **successTrackId** | **String**|  | |
| **customerId** | **String**|  | |
| **policyGroupId** | **String**|  | |
| **policyId** | **String**|  | |
| **ruleId** | **String**|  | |
| **offset** | **Integer**|  | [optional] [default to 1] |
| **max** | **Integer**|  | [optional] [default to 10] |

### Return type

[**SuggestionsResponse**](SuggestionsResponse.md)

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

<a name="getViolationSummaryUsingGET"></a>
# **getViolationSummaryUsingGET**
> ViolationSummaryResponse getViolationSummaryUsingGET(successTrackId, customerId, offset, max)

Get the violation summary of a customer

Returns information about the rules violated for the customerId provided Default sorting is, severityId(asc), violationCount(desc)

### Example
```java
// Import classes:
import com.cisco.px.client.ApiClient;
import com.cisco.px.client.ApiException;
import com.cisco.px.client.Configuration;
import com.cisco.px.client.models.*;
import com.cisco.px.client.api.ComplianceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.pxcloud-stg.cisco.com/torii");

    ComplianceApi apiInstance = new ComplianceApi(defaultClient);
    String successTrackId = "successTrackId_example"; // String | 
    String customerId = "customerId_example"; // String | Unique identifier of the customer
    Integer offset = 1; // Integer | The number of items to skip before starting to collect the result set. The default value is 1.
    Integer max = 10; // Integer | The maximum number of items to return. The default value is 10.
    try {
      ViolationSummaryResponse result = apiInstance.getViolationSummaryUsingGET(successTrackId, customerId, offset, max);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ComplianceApi#getViolationSummaryUsingGET");
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
| **offset** | **Integer**| The number of items to skip before starting to collect the result set. The default value is 1. | [optional] [default to 1] |
| **max** | **Integer**| The maximum number of items to return. The default value is 10. | [optional] [default to 10] |

### Return type

[**ViolationSummaryResponse**](ViolationSummaryResponse.md)

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

