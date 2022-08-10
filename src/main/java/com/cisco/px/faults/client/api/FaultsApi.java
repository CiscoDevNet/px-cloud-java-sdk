
package com.cisco.px.faults.client.api;

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


import com.cisco.px.client.model.AffectedAssetsResponse;
import com.cisco.px.client.model.AssetsFaultHistoryResponse;
import com.cisco.px.client.model.ErrorResponse;
import com.cisco.px.client.model.FaultsResponse;
import com.cisco.px.client.model.FaultsSummaryResponse;
import java.time.OffsetDateTime;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class FaultsApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public FaultsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public FaultsApi(ApiClient apiClient) {
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
     * Build call for getAffectedAssetsDetailsUsingGET
     * @param successTrackId  (required)
     * @param customerId Unique identifier of the customer (required)
     * @param faultId Unique identifier used in CX Cloud to identify the fault (required)
     * @param assetName Unique asset name (required)
     * @param days The number of days to retrieve fault data for. This value can be 1, 7, 15, 30. The default is 1. (optional, default to 1)
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
    public okhttp3.Call getAffectedAssetsDetailsUsingGETCall(String successTrackId, String customerId, Integer faultId, String assetName, Integer days, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/v1/customers/{customerId}/insights/faults/{faultId}/affectedAssets/{assetName}/faultHistory"
            .replaceAll("\\{" + "customerId" + "\\}", localVarApiClient.escapeString(customerId.toString()))
            .replaceAll("\\{" + "faultId" + "\\}", localVarApiClient.escapeString(faultId.toString()))
            .replaceAll("\\{" + "assetName" + "\\}", localVarApiClient.escapeString(assetName.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (successTrackId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("successTrackId", successTrackId));
        }

        if (days != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("days", days));
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
    private okhttp3.Call getAffectedAssetsDetailsUsingGETValidateBeforeCall(String successTrackId, String customerId, Integer faultId, String assetName, Integer days, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'successTrackId' is set
        if (successTrackId == null) {
            throw new ApiException("Missing the required parameter 'successTrackId' when calling getAffectedAssetsDetailsUsingGET(Async)");
        }
        
        // verify the required parameter 'customerId' is set
        if (customerId == null) {
            throw new ApiException("Missing the required parameter 'customerId' when calling getAffectedAssetsDetailsUsingGET(Async)");
        }
        
        // verify the required parameter 'faultId' is set
        if (faultId == null) {
            throw new ApiException("Missing the required parameter 'faultId' when calling getAffectedAssetsDetailsUsingGET(Async)");
        }
        
        // verify the required parameter 'assetName' is set
        if (assetName == null) {
            throw new ApiException("Missing the required parameter 'assetName' when calling getAffectedAssetsDetailsUsingGET(Async)");
        }
        

        okhttp3.Call localVarCall = getAffectedAssetsDetailsUsingGETCall(successTrackId, customerId, faultId, assetName, days, _callback);
        return localVarCall;

    }

    /**
     * Assets Fault History
     * Returns information about the occurrences of a fault on an asset based on the fault signatureId, asset name, and customerId provided
     * @param successTrackId  (required)
     * @param customerId Unique identifier of the customer (required)
     * @param faultId Unique identifier used in CX Cloud to identify the fault (required)
     * @param assetName Unique asset name (required)
     * @param days The number of days to retrieve fault data for. This value can be 1, 7, 15, 30. The default is 1. (optional, default to 1)
     * @return AssetsFaultHistoryResponse
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
    public AssetsFaultHistoryResponse getAffectedAssetsDetailsUsingGET(String successTrackId, String customerId, Integer faultId, String assetName, Integer days) throws ApiException {
        ApiResponse<AssetsFaultHistoryResponse> localVarResp = getAffectedAssetsDetailsUsingGETWithHttpInfo(successTrackId, customerId, faultId, assetName, days);
        return localVarResp.getData();
    }

    /**
     * Assets Fault History
     * Returns information about the occurrences of a fault on an asset based on the fault signatureId, asset name, and customerId provided
     * @param successTrackId  (required)
     * @param customerId Unique identifier of the customer (required)
     * @param faultId Unique identifier used in CX Cloud to identify the fault (required)
     * @param assetName Unique asset name (required)
     * @param days The number of days to retrieve fault data for. This value can be 1, 7, 15, 30. The default is 1. (optional, default to 1)
     * @return ApiResponse&lt;AssetsFaultHistoryResponse&gt;
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
    public ApiResponse<AssetsFaultHistoryResponse> getAffectedAssetsDetailsUsingGETWithHttpInfo(String successTrackId, String customerId, Integer faultId, String assetName, Integer days) throws ApiException {
        okhttp3.Call localVarCall = getAffectedAssetsDetailsUsingGETValidateBeforeCall(successTrackId, customerId, faultId, assetName, days, null);
        Type localVarReturnType = new TypeToken<AssetsFaultHistoryResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Assets Fault History (asynchronously)
     * Returns information about the occurrences of a fault on an asset based on the fault signatureId, asset name, and customerId provided
     * @param successTrackId  (required)
     * @param customerId Unique identifier of the customer (required)
     * @param faultId Unique identifier used in CX Cloud to identify the fault (required)
     * @param assetName Unique asset name (required)
     * @param days The number of days to retrieve fault data for. This value can be 1, 7, 15, 30. The default is 1. (optional, default to 1)
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
    public okhttp3.Call getAffectedAssetsDetailsUsingGETAsync(String successTrackId, String customerId, Integer faultId, String assetName, Integer days, final ApiCallback<AssetsFaultHistoryResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getAffectedAssetsDetailsUsingGETValidateBeforeCall(successTrackId, customerId, faultId, assetName, days, _callback);
        Type localVarReturnType = new TypeToken<AssetsFaultHistoryResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getAffectedAssetsUsingGET
     * @param successTrackId  (required)
     * @param customerId Unique identifier of the customer (required)
     * @param faultId Unique identifier used in CX Cloud to identify the fault (required)
     * @param days The number of days to retrieve fault data for. This value can be 1, 7, 15, 30. The default is 1. (optional, default to 1)
     * @param offset The number of items to skip before starting to collect the result set. The default value is 1. (optional, default to 1)
     * @param max The maximum number of items to return. (optional, default to 10)
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
    public okhttp3.Call getAffectedAssetsUsingGETCall(String successTrackId, String customerId, Integer faultId, Integer days, Integer offset, Integer max, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/v1/customers/{customerId}/insights/faults/{faultId}/affectedAssets"
            .replaceAll("\\{" + "customerId" + "\\}", localVarApiClient.escapeString(customerId.toString()))
            .replaceAll("\\{" + "faultId" + "\\}", localVarApiClient.escapeString(faultId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (successTrackId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("successTrackId", successTrackId));
        }

        if (days != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("days", days));
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
    private okhttp3.Call getAffectedAssetsUsingGETValidateBeforeCall(String successTrackId, String customerId, Integer faultId, Integer days, Integer offset, Integer max, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'successTrackId' is set
        if (successTrackId == null) {
            throw new ApiException("Missing the required parameter 'successTrackId' when calling getAffectedAssetsUsingGET(Async)");
        }
        
        // verify the required parameter 'customerId' is set
        if (customerId == null) {
            throw new ApiException("Missing the required parameter 'customerId' when calling getAffectedAssetsUsingGET(Async)");
        }
        
        // verify the required parameter 'faultId' is set
        if (faultId == null) {
            throw new ApiException("Missing the required parameter 'faultId' when calling getAffectedAssetsUsingGET(Async)");
        }
        

        okhttp3.Call localVarCall = getAffectedAssetsUsingGETCall(successTrackId, customerId, faultId, days, offset, max, _callback);
        return localVarCall;

    }

    /**
     * Affected Assets
     * Returns information about the customer assets affected by the fault, based on the fault signatureId and customerId provided
     * @param successTrackId  (required)
     * @param customerId Unique identifier of the customer (required)
     * @param faultId Unique identifier used in CX Cloud to identify the fault (required)
     * @param days The number of days to retrieve fault data for. This value can be 1, 7, 15, 30. The default is 1. (optional, default to 1)
     * @param offset The number of items to skip before starting to collect the result set. The default value is 1. (optional, default to 1)
     * @param max The maximum number of items to return. (optional, default to 10)
     * @return AffectedAssetsResponse
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
    public AffectedAssetsResponse getAffectedAssetsUsingGET(String successTrackId, String customerId, Integer faultId, Integer days, Integer offset, Integer max) throws ApiException {
        ApiResponse<AffectedAssetsResponse> localVarResp = getAffectedAssetsUsingGETWithHttpInfo(successTrackId, customerId, faultId, days, offset, max);
        return localVarResp.getData();
    }

    /**
     * Affected Assets
     * Returns information about the customer assets affected by the fault, based on the fault signatureId and customerId provided
     * @param successTrackId  (required)
     * @param customerId Unique identifier of the customer (required)
     * @param faultId Unique identifier used in CX Cloud to identify the fault (required)
     * @param days The number of days to retrieve fault data for. This value can be 1, 7, 15, 30. The default is 1. (optional, default to 1)
     * @param offset The number of items to skip before starting to collect the result set. The default value is 1. (optional, default to 1)
     * @param max The maximum number of items to return. (optional, default to 10)
     * @return ApiResponse&lt;AffectedAssetsResponse&gt;
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
    public ApiResponse<AffectedAssetsResponse> getAffectedAssetsUsingGETWithHttpInfo(String successTrackId, String customerId, Integer faultId, Integer days, Integer offset, Integer max) throws ApiException {
        okhttp3.Call localVarCall = getAffectedAssetsUsingGETValidateBeforeCall(successTrackId, customerId, faultId, days, offset, max, null);
        Type localVarReturnType = new TypeToken<AffectedAssetsResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Affected Assets (asynchronously)
     * Returns information about the customer assets affected by the fault, based on the fault signatureId and customerId provided
     * @param successTrackId  (required)
     * @param customerId Unique identifier of the customer (required)
     * @param faultId Unique identifier used in CX Cloud to identify the fault (required)
     * @param days The number of days to retrieve fault data for. This value can be 1, 7, 15, 30. The default is 1. (optional, default to 1)
     * @param offset The number of items to skip before starting to collect the result set. The default value is 1. (optional, default to 1)
     * @param max The maximum number of items to return. (optional, default to 10)
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
    public okhttp3.Call getAffectedAssetsUsingGETAsync(String successTrackId, String customerId, Integer faultId, Integer days, Integer offset, Integer max, final ApiCallback<AffectedAssetsResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getAffectedAssetsUsingGETValidateBeforeCall(successTrackId, customerId, faultId, days, offset, max, _callback);
        Type localVarReturnType = new TypeToken<AffectedAssetsResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getFaultsSummaryUsingGET
     * @param successTrackId  (required)
     * @param customerId Unique identifier of the customer (required)
     * @param faultId Unique identifier used in CX Cloud to identify the fault (required)
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
    public okhttp3.Call getFaultsSummaryUsingGETCall(String successTrackId, String customerId, Integer faultId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/v1/customers/{customerId}/insights/faults/{faultId}/summary"
            .replaceAll("\\{" + "customerId" + "\\}", localVarApiClient.escapeString(customerId.toString()))
            .replaceAll("\\{" + "faultId" + "\\}", localVarApiClient.escapeString(faultId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (successTrackId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("successTrackId", successTrackId));
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
    private okhttp3.Call getFaultsSummaryUsingGETValidateBeforeCall(String successTrackId, String customerId, Integer faultId, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'successTrackId' is set
        if (successTrackId == null) {
            throw new ApiException("Missing the required parameter 'successTrackId' when calling getFaultsSummaryUsingGET(Async)");
        }
        
        // verify the required parameter 'customerId' is set
        if (customerId == null) {
            throw new ApiException("Missing the required parameter 'customerId' when calling getFaultsSummaryUsingGET(Async)");
        }
        
        // verify the required parameter 'faultId' is set
        if (faultId == null) {
            throw new ApiException("Missing the required parameter 'faultId' when calling getFaultsSummaryUsingGET(Async)");
        }
        

        okhttp3.Call localVarCall = getFaultsSummaryUsingGETCall(successTrackId, customerId, faultId, _callback);
        return localVarCall;

    }

    /**
     * Fault summary
     * Returns detailed information for a fault based on the fault signatureId and customerId provided
     * @param successTrackId  (required)
     * @param customerId Unique identifier of the customer (required)
     * @param faultId Unique identifier used in CX Cloud to identify the fault (required)
     * @return FaultsSummaryResponse
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
    public FaultsSummaryResponse getFaultsSummaryUsingGET(String successTrackId, String customerId, Integer faultId) throws ApiException {
        ApiResponse<FaultsSummaryResponse> localVarResp = getFaultsSummaryUsingGETWithHttpInfo(successTrackId, customerId, faultId);
        return localVarResp.getData();
    }

    /**
     * Fault summary
     * Returns detailed information for a fault based on the fault signatureId and customerId provided
     * @param successTrackId  (required)
     * @param customerId Unique identifier of the customer (required)
     * @param faultId Unique identifier used in CX Cloud to identify the fault (required)
     * @return ApiResponse&lt;FaultsSummaryResponse&gt;
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
    public ApiResponse<FaultsSummaryResponse> getFaultsSummaryUsingGETWithHttpInfo(String successTrackId, String customerId, Integer faultId) throws ApiException {
        okhttp3.Call localVarCall = getFaultsSummaryUsingGETValidateBeforeCall(successTrackId, customerId, faultId, null);
        Type localVarReturnType = new TypeToken<FaultsSummaryResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Fault summary (asynchronously)
     * Returns detailed information for a fault based on the fault signatureId and customerId provided
     * @param successTrackId  (required)
     * @param customerId Unique identifier of the customer (required)
     * @param faultId Unique identifier used in CX Cloud to identify the fault (required)
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
    public okhttp3.Call getFaultsSummaryUsingGETAsync(String successTrackId, String customerId, Integer faultId, final ApiCallback<FaultsSummaryResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getFaultsSummaryUsingGETValidateBeforeCall(successTrackId, customerId, faultId, _callback);
        Type localVarReturnType = new TypeToken<FaultsSummaryResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getFaultsUsingGET
     * @param successTrackId  (required)
     * @param customerId Unique identifier of the customer (required)
     * @param days The number of days to retrieve fault data for. This value can be 1, 7, 15, 30. The default is 1. (optional, default to 1)
     * @param offset The number of items to skip before starting to collect the result set. The default value is 1. (optional, default to 1)
     * @param max The maximum number of items to return (optional, default to 10)
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
    public okhttp3.Call getFaultsUsingGETCall(String successTrackId, String customerId, Integer days, Integer offset, Integer max, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/v1/customers/{customerId}/insights/faults"
            .replaceAll("\\{" + "customerId" + "\\}", localVarApiClient.escapeString(customerId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (successTrackId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("successTrackId", successTrackId));
        }

        if (days != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("days", days));
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
    private okhttp3.Call getFaultsUsingGETValidateBeforeCall(String successTrackId, String customerId, Integer days, Integer offset, Integer max, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'successTrackId' is set
        if (successTrackId == null) {
            throw new ApiException("Missing the required parameter 'successTrackId' when calling getFaultsUsingGET(Async)");
        }
        
        // verify the required parameter 'customerId' is set
        if (customerId == null) {
            throw new ApiException("Missing the required parameter 'customerId' when calling getFaultsUsingGET(Async)");
        }
        

        okhttp3.Call localVarCall = getFaultsUsingGETCall(successTrackId, customerId, days, offset, max, _callback);
        return localVarCall;

    }

    /**
     * Faults details
     * Returns fault information for the customerId provided.
     * @param successTrackId  (required)
     * @param customerId Unique identifier of the customer (required)
     * @param days The number of days to retrieve fault data for. This value can be 1, 7, 15, 30. The default is 1. (optional, default to 1)
     * @param offset The number of items to skip before starting to collect the result set. The default value is 1. (optional, default to 1)
     * @param max The maximum number of items to return (optional, default to 10)
     * @return FaultsResponse
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
    public FaultsResponse getFaultsUsingGET(String successTrackId, String customerId, Integer days, Integer offset, Integer max) throws ApiException {
        ApiResponse<FaultsResponse> localVarResp = getFaultsUsingGETWithHttpInfo(successTrackId, customerId, days, offset, max);
        return localVarResp.getData();
    }

    /**
     * Faults details
     * Returns fault information for the customerId provided.
     * @param successTrackId  (required)
     * @param customerId Unique identifier of the customer (required)
     * @param days The number of days to retrieve fault data for. This value can be 1, 7, 15, 30. The default is 1. (optional, default to 1)
     * @param offset The number of items to skip before starting to collect the result set. The default value is 1. (optional, default to 1)
     * @param max The maximum number of items to return (optional, default to 10)
     * @return ApiResponse&lt;FaultsResponse&gt;
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
    public ApiResponse<FaultsResponse> getFaultsUsingGETWithHttpInfo(String successTrackId, String customerId, Integer days, Integer offset, Integer max) throws ApiException {
        okhttp3.Call localVarCall = getFaultsUsingGETValidateBeforeCall(successTrackId, customerId, days, offset, max, null);
        Type localVarReturnType = new TypeToken<FaultsResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Faults details (asynchronously)
     * Returns fault information for the customerId provided.
     * @param successTrackId  (required)
     * @param customerId Unique identifier of the customer (required)
     * @param days The number of days to retrieve fault data for. This value can be 1, 7, 15, 30. The default is 1. (optional, default to 1)
     * @param offset The number of items to skip before starting to collect the result set. The default value is 1. (optional, default to 1)
     * @param max The maximum number of items to return (optional, default to 10)
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
    public okhttp3.Call getFaultsUsingGETAsync(String successTrackId, String customerId, Integer days, Integer offset, Integer max, final ApiCallback<FaultsResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getFaultsUsingGETValidateBeforeCall(successTrackId, customerId, days, offset, max, _callback);
        Type localVarReturnType = new TypeToken<FaultsResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
