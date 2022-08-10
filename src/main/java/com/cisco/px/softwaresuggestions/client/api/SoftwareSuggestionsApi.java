
package com.cisco.px.softwaresuggestions.client.api;

import com.cisco.px.client.ApiCallback;
import com.cisco.px.client.ApiClient;
import com.cisco.px.client.ApiException;
import com.cisco.px.client.ApiResponse;
import com.cisco.px.client.Configuration;
import com.cisco.px.client.Pair;
import com.cisco.px.client.ProgressRequestBody;
import com.cisco.px.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.cisco.px.client.model.AssetResponse;
import com.cisco.px.client.model.ErrorResponse;
import java.time.OffsetDateTime;
import com.cisco.px.client.model.SoftwareGroupResponse;
import com.cisco.px.client.model.SoftwareGroupSuggestions;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class SoftwareSuggestionsApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public SoftwareSuggestionsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public SoftwareSuggestionsApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    /**
     * Build call for getSoftwareGroupAssetsUsingGET
     * @param successTrackId  (required)
     * @param customerId Unique identifier of the customer (required)
     * @param softwareGroupId Unique identifier used in CX Cloud to identify the Software Group (required)
     * @param offset The number of items to skip before starting to collect the result set. The default value is 1. (optional)
     * @param max The maximum number of items to return (optional, default to 50)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  * Date -  <br>  </td></tr>
     </table>
     */
    public okhttp3.Call getSoftwareGroupAssetsUsingGETCall(String successTrackId, String customerId, String softwareGroupId, Integer offset, Integer max, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v1/customers/{customerId}/insights/software/softwareGroups/{softwareGroupId}/assets"
            .replaceAll("\\{" + "customerId" + "\\}", localVarApiClient.escapeString(customerId.toString()))
            .replaceAll("\\{" + "softwareGroupId" + "\\}", localVarApiClient.escapeString(softwareGroupId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (successTrackId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("successTrackId", successTrackId));
        }

        if (offset != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("offset", offset));
        }

        if (max != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("max", max));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getSoftwareGroupAssetsUsingGETValidateBeforeCall(String successTrackId, String customerId, String softwareGroupId, Integer offset, Integer max, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'successTrackId' is set
        if (successTrackId == null) {
            throw new ApiException("Missing the required parameter 'successTrackId' when calling getSoftwareGroupAssetsUsingGET(Async)");
        }
        
        // verify the required parameter 'customerId' is set
        if (customerId == null) {
            throw new ApiException("Missing the required parameter 'customerId' when calling getSoftwareGroupAssetsUsingGET(Async)");
        }
        
        // verify the required parameter 'softwareGroupId' is set
        if (softwareGroupId == null) {
            throw new ApiException("Missing the required parameter 'softwareGroupId' when calling getSoftwareGroupAssetsUsingGET(Async)");
        }
        

        okhttp3.Call localVarCall = getSoftwareGroupAssetsUsingGETCall(successTrackId, customerId, softwareGroupId, offset, max, _callback);
        return localVarCall;

    }

    /**
     * Asset information in the Software Group
     * Returns information about assets in the Software Group based on the customerId and softwareGroupId provided
     * @param successTrackId  (required)
     * @param customerId Unique identifier of the customer (required)
     * @param softwareGroupId Unique identifier used in CX Cloud to identify the Software Group (required)
     * @param offset The number of items to skip before starting to collect the result set. The default value is 1. (optional)
     * @param max The maximum number of items to return (optional, default to 50)
     * @return AssetResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  * Date -  <br>  </td></tr>
     </table>
     */
    public AssetResponse getSoftwareGroupAssetsUsingGET(String successTrackId, String customerId, String softwareGroupId, Integer offset, Integer max) throws ApiException {
        ApiResponse<AssetResponse> localVarResp = getSoftwareGroupAssetsUsingGETWithHttpInfo(successTrackId, customerId, softwareGroupId, offset, max);
        return localVarResp.getData();
    }

    /**
     * Asset information in the Software Group
     * Returns information about assets in the Software Group based on the customerId and softwareGroupId provided
     * @param successTrackId  (required)
     * @param customerId Unique identifier of the customer (required)
     * @param softwareGroupId Unique identifier used in CX Cloud to identify the Software Group (required)
     * @param offset The number of items to skip before starting to collect the result set. The default value is 1. (optional)
     * @param max The maximum number of items to return (optional, default to 50)
     * @return ApiResponse&lt;AssetResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  * Date -  <br>  </td></tr>
     </table>
     */
    public ApiResponse<AssetResponse> getSoftwareGroupAssetsUsingGETWithHttpInfo(String successTrackId, String customerId, String softwareGroupId, Integer offset, Integer max) throws ApiException {
        okhttp3.Call localVarCall = getSoftwareGroupAssetsUsingGETValidateBeforeCall(successTrackId, customerId, softwareGroupId, offset, max, null);
        Type localVarReturnType = new TypeToken<AssetResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Asset information in the Software Group (asynchronously)
     * Returns information about assets in the Software Group based on the customerId and softwareGroupId provided
     * @param successTrackId  (required)
     * @param customerId Unique identifier of the customer (required)
     * @param softwareGroupId Unique identifier used in CX Cloud to identify the Software Group (required)
     * @param offset The number of items to skip before starting to collect the result set. The default value is 1. (optional)
     * @param max The maximum number of items to return (optional, default to 50)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  * Date -  <br>  </td></tr>
     </table>
     */
    public okhttp3.Call getSoftwareGroupAssetsUsingGETAsync(String successTrackId, String customerId, String softwareGroupId, Integer offset, Integer max, final ApiCallback<AssetResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getSoftwareGroupAssetsUsingGETValidateBeforeCall(successTrackId, customerId, softwareGroupId, offset, max, _callback);
        Type localVarReturnType = new TypeToken<AssetResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getSoftwareGroupSuggestionsUsingGET
     * @param successTrackId  (required)
     * @param customerId Unique identifier of the customer (required)
     * @param softwareGroupName Name of the Software Group, which is based on the Cisco product ID of the assets in the Software Group (required)
     * @param sourceSystemId UUID of the Cisco network management system that manages the assets in the Software Group (required)
     * @param softwareType Cisco software type running on the assets in the Software Group (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  * Date -  <br>  </td></tr>
     </table>
     */
    public okhttp3.Call getSoftwareGroupSuggestionsUsingGETCall(String successTrackId, String customerId, String softwareGroupName, String sourceSystemId, String softwareType, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v1/customers/{customerId}/insights/software/softwareGroups/{softwareGroupName}/suggestions"
            .replaceAll("\\{" + "customerId" + "\\}", localVarApiClient.escapeString(customerId.toString()))
            .replaceAll("\\{" + "softwareGroupName" + "\\}", localVarApiClient.escapeString(softwareGroupName.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (successTrackId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("successTrackId", successTrackId));
        }

        if (sourceSystemId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("sourceSystemId", sourceSystemId));
        }

        if (softwareType != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("softwareType", softwareType));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getSoftwareGroupSuggestionsUsingGETValidateBeforeCall(String successTrackId, String customerId, String softwareGroupName, String sourceSystemId, String softwareType, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'successTrackId' is set
        if (successTrackId == null) {
            throw new ApiException("Missing the required parameter 'successTrackId' when calling getSoftwareGroupSuggestionsUsingGET(Async)");
        }
        
        // verify the required parameter 'customerId' is set
        if (customerId == null) {
            throw new ApiException("Missing the required parameter 'customerId' when calling getSoftwareGroupSuggestionsUsingGET(Async)");
        }
        
        // verify the required parameter 'softwareGroupName' is set
        if (softwareGroupName == null) {
            throw new ApiException("Missing the required parameter 'softwareGroupName' when calling getSoftwareGroupSuggestionsUsingGET(Async)");
        }
        
        // verify the required parameter 'sourceSystemId' is set
        if (sourceSystemId == null) {
            throw new ApiException("Missing the required parameter 'sourceSystemId' when calling getSoftwareGroupSuggestionsUsingGET(Async)");
        }
        
        // verify the required parameter 'softwareType' is set
        if (softwareType == null) {
            throw new ApiException("Missing the required parameter 'softwareType' when calling getSoftwareGroupSuggestionsUsingGET(Async)");
        }
        

        okhttp3.Call localVarCall = getSoftwareGroupSuggestionsUsingGETCall(successTrackId, customerId, softwareGroupName, sourceSystemId, softwareType, _callback);
        return localVarCall;

    }

    /**
     * Software Group suggestions
     * Returns Software Group suggestions, including detailed information about Cisco software release recommendations and current Cisco software releases running on assets in the Software Group
     * @param successTrackId  (required)
     * @param customerId Unique identifier of the customer (required)
     * @param softwareGroupName Name of the Software Group, which is based on the Cisco product ID of the assets in the Software Group (required)
     * @param sourceSystemId UUID of the Cisco network management system that manages the assets in the Software Group (required)
     * @param softwareType Cisco software type running on the assets in the Software Group (required)
     * @return SoftwareGroupSuggestions
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  * Date -  <br>  </td></tr>
     </table>
     */
    public SoftwareGroupSuggestions getSoftwareGroupSuggestionsUsingGET(String successTrackId, String customerId, String softwareGroupName, String sourceSystemId, String softwareType) throws ApiException {
        ApiResponse<SoftwareGroupSuggestions> localVarResp = getSoftwareGroupSuggestionsUsingGETWithHttpInfo(successTrackId, customerId, softwareGroupName, sourceSystemId, softwareType);
        return localVarResp.getData();
    }

    /**
     * Software Group suggestions
     * Returns Software Group suggestions, including detailed information about Cisco software release recommendations and current Cisco software releases running on assets in the Software Group
     * @param successTrackId  (required)
     * @param customerId Unique identifier of the customer (required)
     * @param softwareGroupName Name of the Software Group, which is based on the Cisco product ID of the assets in the Software Group (required)
     * @param sourceSystemId UUID of the Cisco network management system that manages the assets in the Software Group (required)
     * @param softwareType Cisco software type running on the assets in the Software Group (required)
     * @return ApiResponse&lt;SoftwareGroupSuggestions&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  * Date -  <br>  </td></tr>
     </table>
     */
    public ApiResponse<SoftwareGroupSuggestions> getSoftwareGroupSuggestionsUsingGETWithHttpInfo(String successTrackId, String customerId, String softwareGroupName, String sourceSystemId, String softwareType) throws ApiException {
        okhttp3.Call localVarCall = getSoftwareGroupSuggestionsUsingGETValidateBeforeCall(successTrackId, customerId, softwareGroupName, sourceSystemId, softwareType, null);
        Type localVarReturnType = new TypeToken<SoftwareGroupSuggestions>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Software Group suggestions (asynchronously)
     * Returns Software Group suggestions, including detailed information about Cisco software release recommendations and current Cisco software releases running on assets in the Software Group
     * @param successTrackId  (required)
     * @param customerId Unique identifier of the customer (required)
     * @param softwareGroupName Name of the Software Group, which is based on the Cisco product ID of the assets in the Software Group (required)
     * @param sourceSystemId UUID of the Cisco network management system that manages the assets in the Software Group (required)
     * @param softwareType Cisco software type running on the assets in the Software Group (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  * Date -  <br>  </td></tr>
     </table>
     */
    public okhttp3.Call getSoftwareGroupSuggestionsUsingGETAsync(String successTrackId, String customerId, String softwareGroupName, String sourceSystemId, String softwareType, final ApiCallback<SoftwareGroupSuggestions> _callback) throws ApiException {

        okhttp3.Call localVarCall = getSoftwareGroupSuggestionsUsingGETValidateBeforeCall(successTrackId, customerId, softwareGroupName, sourceSystemId, softwareType, _callback);
        Type localVarReturnType = new TypeToken<SoftwareGroupSuggestions>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getSoftwareGroupsUsingGET
     * @param successTrackId  (required)
     * @param customerId Unique identifier of the customer (required)
     * @param offset The number of items to skip before starting to collect the result set. The default value is 1. (optional)
     * @param max The maximum number of items to return (optional, default to 50)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  * Date -  <br>  </td></tr>
     </table>
     */
    public okhttp3.Call getSoftwareGroupsUsingGETCall(String successTrackId, String customerId, Integer offset, Integer max, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v1/customers/{customerId}/insights/software/softwareGroups"
            .replaceAll("\\{" + "customerId" + "\\}", localVarApiClient.escapeString(customerId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (successTrackId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("successTrackId", successTrackId));
        }

        if (offset != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("offset", offset));
        }

        if (max != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("max", max));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getSoftwareGroupsUsingGETValidateBeforeCall(String successTrackId, String customerId, Integer offset, Integer max, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'successTrackId' is set
        if (successTrackId == null) {
            throw new ApiException("Missing the required parameter 'successTrackId' when calling getSoftwareGroupsUsingGET(Async)");
        }
        
        // verify the required parameter 'customerId' is set
        if (customerId == null) {
            throw new ApiException("Missing the required parameter 'customerId' when calling getSoftwareGroupsUsingGET(Async)");
        }
        

        okhttp3.Call localVarCall = getSoftwareGroupsUsingGETCall(successTrackId, customerId, offset, max, _callback);
        return localVarCall;

    }

    /**
     * Software Group information
     * Returns Software Group information for the customerId provided
     * @param successTrackId  (required)
     * @param customerId Unique identifier of the customer (required)
     * @param offset The number of items to skip before starting to collect the result set. The default value is 1. (optional)
     * @param max The maximum number of items to return (optional, default to 50)
     * @return SoftwareGroupResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  * Date -  <br>  </td></tr>
     </table>
     */
    public SoftwareGroupResponse getSoftwareGroupsUsingGET(String successTrackId, String customerId, Integer offset, Integer max) throws ApiException {
        ApiResponse<SoftwareGroupResponse> localVarResp = getSoftwareGroupsUsingGETWithHttpInfo(successTrackId, customerId, offset, max);
        return localVarResp.getData();
    }

    /**
     * Software Group information
     * Returns Software Group information for the customerId provided
     * @param successTrackId  (required)
     * @param customerId Unique identifier of the customer (required)
     * @param offset The number of items to skip before starting to collect the result set. The default value is 1. (optional)
     * @param max The maximum number of items to return (optional, default to 50)
     * @return ApiResponse&lt;SoftwareGroupResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  * Date -  <br>  </td></tr>
     </table>
     */
    public ApiResponse<SoftwareGroupResponse> getSoftwareGroupsUsingGETWithHttpInfo(String successTrackId, String customerId, Integer offset, Integer max) throws ApiException {
        okhttp3.Call localVarCall = getSoftwareGroupsUsingGETValidateBeforeCall(successTrackId, customerId, offset, max, null);
        Type localVarReturnType = new TypeToken<SoftwareGroupResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Software Group information (asynchronously)
     * Returns Software Group information for the customerId provided
     * @param successTrackId  (required)
     * @param customerId Unique identifier of the customer (required)
     * @param offset The number of items to skip before starting to collect the result set. The default value is 1. (optional)
     * @param max The maximum number of items to return (optional, default to 50)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  * Date -  <br>  </td></tr>
     </table>
     */
    public okhttp3.Call getSoftwareGroupsUsingGETAsync(String successTrackId, String customerId, Integer offset, Integer max, final ApiCallback<SoftwareGroupResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getSoftwareGroupsUsingGETValidateBeforeCall(successTrackId, customerId, offset, max, _callback);
        Type localVarReturnType = new TypeToken<SoftwareGroupResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
