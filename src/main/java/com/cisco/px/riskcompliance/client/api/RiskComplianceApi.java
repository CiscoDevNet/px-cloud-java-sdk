

package com.cisco.px.riskcompliance.client.api;

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


import com.cisco.px.client.model.AssetViolationsResponse;
import com.cisco.px.client.model.AssetsViolationsResponse;
import com.cisco.px.client.model.AssetsWithViolationsResponse;
import com.cisco.px.client.model.ErrorResponse;
import java.time.OffsetDateTime;
import com.cisco.px.client.model.OptInResponse;
import com.cisco.px.client.model.PolicyRuleDetails;
import com.cisco.px.client.model.SuggestionsResponse;
import com.cisco.px.client.model.ViolationSummaryResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class RiskComplianceApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public RiskComplianceApi() {
        this(Configuration.getDefaultApiClient());
    }

    public RiskComplianceApi(ApiClient apiClient) {
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
     * Build call for getAssetViolationDetailsUsingGET
     * @param successTrackId  (required)
     * @param customerId  (required)
     * @param policyCategory  (required)
     * @param policyGroupId  (required)
     * @param policyId  (required)
     * @param ruleId  (required)
     * @param severity  (required)
     * @param offset  (optional, default to 1)
     * @param max  (optional, default to 10)
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
    public okhttp3.Call getAssetViolationDetailsUsingGETCall(String successTrackId, String customerId, String policyCategory, String policyGroupId, String policyId, String ruleId, String severity, Integer offset, Integer max, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/v1/customers/{customerId}/insights/compliance/violations/assets"
            .replaceAll("\\{" + "customerId" + "\\}", localVarApiClient.escapeString(customerId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (successTrackId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("successTrackId", successTrackId));
        }

        if (policyCategory != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("policyCategory", policyCategory));
        }

        if (policyGroupId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("policyGroupId", policyGroupId));
        }

        if (policyId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("policyId", policyId));
        }

        if (ruleId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("ruleId", ruleId));
        }

        if (severity != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("severity", severity));
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
    private okhttp3.Call getAssetViolationDetailsUsingGETValidateBeforeCall(String successTrackId, String customerId, String policyCategory, String policyGroupId, String policyId, String ruleId, String severity, Integer offset, Integer max, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'successTrackId' is set
        if (successTrackId == null) {
            throw new ApiException("Missing the required parameter 'successTrackId' when calling getAssetViolationDetailsUsingGET(Async)");
        }
        
        // verify the required parameter 'customerId' is set
        if (customerId == null) {
            throw new ApiException("Missing the required parameter 'customerId' when calling getAssetViolationDetailsUsingGET(Async)");
        }
        
        // verify the required parameter 'policyCategory' is set
        if (policyCategory == null) {
            throw new ApiException("Missing the required parameter 'policyCategory' when calling getAssetViolationDetailsUsingGET(Async)");
        }
        
        // verify the required parameter 'policyGroupId' is set
        if (policyGroupId == null) {
            throw new ApiException("Missing the required parameter 'policyGroupId' when calling getAssetViolationDetailsUsingGET(Async)");
        }
        
        // verify the required parameter 'policyId' is set
        if (policyId == null) {
            throw new ApiException("Missing the required parameter 'policyId' when calling getAssetViolationDetailsUsingGET(Async)");
        }
        
        // verify the required parameter 'ruleId' is set
        if (ruleId == null) {
            throw new ApiException("Missing the required parameter 'ruleId' when calling getAssetViolationDetailsUsingGET(Async)");
        }
        
        // verify the required parameter 'severity' is set
        if (severity == null) {
            throw new ApiException("Missing the required parameter 'severity' when calling getAssetViolationDetailsUsingGET(Async)");
        }
        

        okhttp3.Call localVarCall = getAssetViolationDetailsUsingGETCall(successTrackId, customerId, policyCategory, policyGroupId, policyId, ruleId, severity, offset, max, _callback);
        return localVarCall;

    }

    /**
     * Get the violation details of impacted assets for the customer, and selected policy Group, Policy and Rule
     * Returns information about the customer assets in violation of the rule based on the customer, policy, and rule information provided. Default sorting is, assetName(asc)
     * @param successTrackId  (required)
     * @param customerId  (required)
     * @param policyCategory  (required)
     * @param policyGroupId  (required)
     * @param policyId  (required)
     * @param ruleId  (required)
     * @param severity  (required)
     * @param offset  (optional, default to 1)
     * @param max  (optional, default to 10)
     * @return AssetsViolationsResponse
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
    public AssetsViolationsResponse getAssetViolationDetailsUsingGET(String successTrackId, String customerId, String policyCategory, String policyGroupId, String policyId, String ruleId, String severity, Integer offset, Integer max) throws ApiException {
        ApiResponse<AssetsViolationsResponse> localVarResp = getAssetViolationDetailsUsingGETWithHttpInfo(successTrackId, customerId, policyCategory, policyGroupId, policyId, ruleId, severity, offset, max);
        return localVarResp.getData();
    }

    /**
     * Get the violation details of impacted assets for the customer, and selected policy Group, Policy and Rule
     * Returns information about the customer assets in violation of the rule based on the customer, policy, and rule information provided. Default sorting is, assetName(asc)
     * @param successTrackId  (required)
     * @param customerId  (required)
     * @param policyCategory  (required)
     * @param policyGroupId  (required)
     * @param policyId  (required)
     * @param ruleId  (required)
     * @param severity  (required)
     * @param offset  (optional, default to 1)
     * @param max  (optional, default to 10)
     * @return ApiResponse&lt;AssetsViolationsResponse&gt;
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
    public ApiResponse<AssetsViolationsResponse> getAssetViolationDetailsUsingGETWithHttpInfo(String successTrackId, String customerId, String policyCategory, String policyGroupId, String policyId, String ruleId, String severity, Integer offset, Integer max) throws ApiException {
        okhttp3.Call localVarCall = getAssetViolationDetailsUsingGETValidateBeforeCall(successTrackId, customerId, policyCategory, policyGroupId, policyId, ruleId, severity, offset, max, null);
        Type localVarReturnType = new TypeToken<AssetsViolationsResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get the violation details of impacted assets for the customer, and selected policy Group, Policy and Rule (asynchronously)
     * Returns information about the customer assets in violation of the rule based on the customer, policy, and rule information provided. Default sorting is, assetName(asc)
     * @param successTrackId  (required)
     * @param customerId  (required)
     * @param policyCategory  (required)
     * @param policyGroupId  (required)
     * @param policyId  (required)
     * @param ruleId  (required)
     * @param severity  (required)
     * @param offset  (optional, default to 1)
     * @param max  (optional, default to 10)
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
    public okhttp3.Call getAssetViolationDetailsUsingGETAsync(String successTrackId, String customerId, String policyCategory, String policyGroupId, String policyId, String ruleId, String severity, Integer offset, Integer max, final ApiCallback<AssetsViolationsResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getAssetViolationDetailsUsingGETValidateBeforeCall(successTrackId, customerId, policyCategory, policyGroupId, policyId, ruleId, severity, offset, max, _callback);
        Type localVarReturnType = new TypeToken<AssetsViolationsResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getAssetViolationsUsingGET
     * @param successTrackId  (required)
     * @param sourceSystemId  (required)
     * @param customerId  (required)
     * @param assetId  (required)
     * @param offset  (optional, default to 1)
     * @param max  (optional, default to 10)
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
    public okhttp3.Call getAssetViolationsUsingGETCall(String successTrackId, String sourceSystemId, String customerId, String assetId, Integer offset, Integer max, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/v1/customers/{customerId}/insights/compliance/assetViolations"
            .replaceAll("\\{" + "customerId" + "\\}", localVarApiClient.escapeString(customerId.toString()));

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

        if (assetId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("assetId", assetId));
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
    private okhttp3.Call getAssetViolationsUsingGETValidateBeforeCall(String successTrackId, String sourceSystemId, String customerId, String assetId, Integer offset, Integer max, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'successTrackId' is set
        if (successTrackId == null) {
            throw new ApiException("Missing the required parameter 'successTrackId' when calling getAssetViolationsUsingGET(Async)");
        }
        
        // verify the required parameter 'sourceSystemId' is set
        if (sourceSystemId == null) {
            throw new ApiException("Missing the required parameter 'sourceSystemId' when calling getAssetViolationsUsingGET(Async)");
        }
        
        // verify the required parameter 'customerId' is set
        if (customerId == null) {
            throw new ApiException("Missing the required parameter 'customerId' when calling getAssetViolationsUsingGET(Async)");
        }
        
        // verify the required parameter 'assetId' is set
        if (assetId == null) {
            throw new ApiException("Missing the required parameter 'assetId' when calling getAssetViolationsUsingGET(Async)");
        }
        

        okhttp3.Call localVarCall = getAssetViolationsUsingGETCall(successTrackId, sourceSystemId, customerId, assetId, offset, max, _callback);
        return localVarCall;

    }

    /**
     * Get the violations of the asset
     * Returns information about the rules violated by an asset based on the customer and asset information provided. Default is ruleSeverityId(desc)
     * @param successTrackId  (required)
     * @param sourceSystemId  (required)
     * @param customerId  (required)
     * @param assetId  (required)
     * @param offset  (optional, default to 1)
     * @param max  (optional, default to 10)
     * @return AssetViolationsResponse
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
    public AssetViolationsResponse getAssetViolationsUsingGET(String successTrackId, String sourceSystemId, String customerId, String assetId, Integer offset, Integer max) throws ApiException {
        ApiResponse<AssetViolationsResponse> localVarResp = getAssetViolationsUsingGETWithHttpInfo(successTrackId, sourceSystemId, customerId, assetId, offset, max);
        return localVarResp.getData();
    }

    /**
     * Get the violations of the asset
     * Returns information about the rules violated by an asset based on the customer and asset information provided. Default is ruleSeverityId(desc)
     * @param successTrackId  (required)
     * @param sourceSystemId  (required)
     * @param customerId  (required)
     * @param assetId  (required)
     * @param offset  (optional, default to 1)
     * @param max  (optional, default to 10)
     * @return ApiResponse&lt;AssetViolationsResponse&gt;
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
    public ApiResponse<AssetViolationsResponse> getAssetViolationsUsingGETWithHttpInfo(String successTrackId, String sourceSystemId, String customerId, String assetId, Integer offset, Integer max) throws ApiException {
        okhttp3.Call localVarCall = getAssetViolationsUsingGETValidateBeforeCall(successTrackId, sourceSystemId, customerId, assetId, offset, max, null);
        Type localVarReturnType = new TypeToken<AssetViolationsResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get the violations of the asset (asynchronously)
     * Returns information about the rules violated by an asset based on the customer and asset information provided. Default is ruleSeverityId(desc)
     * @param successTrackId  (required)
     * @param sourceSystemId  (required)
     * @param customerId  (required)
     * @param assetId  (required)
     * @param offset  (optional, default to 1)
     * @param max  (optional, default to 10)
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
    public okhttp3.Call getAssetViolationsUsingGETAsync(String successTrackId, String sourceSystemId, String customerId, String assetId, Integer offset, Integer max, final ApiCallback<AssetViolationsResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getAssetViolationsUsingGETValidateBeforeCall(successTrackId, sourceSystemId, customerId, assetId, offset, max, _callback);
        Type localVarReturnType = new TypeToken<AssetViolationsResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getAssetWithViolationsUsingGET
     * @param successTrackId  (required)
     * @param customerId  (required)
     * @param offset  (optional, default to 1)
     * @param max  (optional, default to 10)
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
    public okhttp3.Call getAssetWithViolationsUsingGETCall(String successTrackId, String customerId, Integer offset, Integer max, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/v1/customers/{customerId}/insights/compliance/assetsWithViolations"
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
    private okhttp3.Call getAssetWithViolationsUsingGETValidateBeforeCall(String successTrackId, String customerId, Integer offset, Integer max, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'successTrackId' is set
        if (successTrackId == null) {
            throw new ApiException("Missing the required parameter 'successTrackId' when calling getAssetWithViolationsUsingGET(Async)");
        }
        
        // verify the required parameter 'customerId' is set
        if (customerId == null) {
            throw new ApiException("Missing the required parameter 'customerId' when calling getAssetWithViolationsUsingGET(Async)");
        }
        

        okhttp3.Call localVarCall = getAssetWithViolationsUsingGETCall(successTrackId, customerId, offset, max, _callback);
        return localVarCall;

    }

    /**
     * Get the asset summary
     * Returns information about assets that have at least one rule violation based on the customerId provided. Default is severityId(desc), violationCount(desc)
     * @param successTrackId  (required)
     * @param customerId  (required)
     * @param offset  (optional, default to 1)
     * @param max  (optional, default to 10)
     * @return AssetsWithViolationsResponse
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
    public AssetsWithViolationsResponse getAssetWithViolationsUsingGET(String successTrackId, String customerId, Integer offset, Integer max) throws ApiException {
        ApiResponse<AssetsWithViolationsResponse> localVarResp = getAssetWithViolationsUsingGETWithHttpInfo(successTrackId, customerId, offset, max);
        return localVarResp.getData();
    }

    /**
     * Get the asset summary
     * Returns information about assets that have at least one rule violation based on the customerId provided. Default is severityId(desc), violationCount(desc)
     * @param successTrackId  (required)
     * @param customerId  (required)
     * @param offset  (optional, default to 1)
     * @param max  (optional, default to 10)
     * @return ApiResponse&lt;AssetsWithViolationsResponse&gt;
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
    public ApiResponse<AssetsWithViolationsResponse> getAssetWithViolationsUsingGETWithHttpInfo(String successTrackId, String customerId, Integer offset, Integer max) throws ApiException {
        okhttp3.Call localVarCall = getAssetWithViolationsUsingGETValidateBeforeCall(successTrackId, customerId, offset, max, null);
        Type localVarReturnType = new TypeToken<AssetsWithViolationsResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get the asset summary (asynchronously)
     * Returns information about assets that have at least one rule violation based on the customerId provided. Default is severityId(desc), violationCount(desc)
     * @param successTrackId  (required)
     * @param customerId  (required)
     * @param offset  (optional, default to 1)
     * @param max  (optional, default to 10)
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
    public okhttp3.Call getAssetWithViolationsUsingGETAsync(String successTrackId, String customerId, Integer offset, Integer max, final ApiCallback<AssetsWithViolationsResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getAssetWithViolationsUsingGETValidateBeforeCall(successTrackId, customerId, offset, max, _callback);
        Type localVarReturnType = new TypeToken<AssetsWithViolationsResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getOptInUsingGET
     * @param successTrackId  (required)
     * @param customerId  (required)
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
    public okhttp3.Call getOptInUsingGETCall(String successTrackId, String customerId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/v1/customers/{customerId}/insights/compliance/optIn"
            .replaceAll("\\{" + "customerId" + "\\}", localVarApiClient.escapeString(customerId.toString()));

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
    private okhttp3.Call getOptInUsingGETValidateBeforeCall(String successTrackId, String customerId, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'successTrackId' is set
        if (successTrackId == null) {
            throw new ApiException("Missing the required parameter 'successTrackId' when calling getOptInUsingGET(Async)");
        }
        
        // verify the required parameter 'customerId' is set
        if (customerId == null) {
            throw new ApiException("Missing the required parameter 'customerId' when calling getOptInUsingGET(Async)");
        }
        

        okhttp3.Call localVarCall = getOptInUsingGETCall(successTrackId, customerId, _callback);
        return localVarCall;

    }

    /**
     * optIn status
     * Returns information about whether the customer has successfully configured the regulatory compliance feature and has assets that are qualified to be checked.
     * @param successTrackId  (required)
     * @param customerId  (required)
     * @return OptInResponse
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
    public OptInResponse getOptInUsingGET(String successTrackId, String customerId) throws ApiException {
        ApiResponse<OptInResponse> localVarResp = getOptInUsingGETWithHttpInfo(successTrackId, customerId);
        return localVarResp.getData();
    }

    /**
     * optIn status
     * Returns information about whether the customer has successfully configured the regulatory compliance feature and has assets that are qualified to be checked.
     * @param successTrackId  (required)
     * @param customerId  (required)
     * @return ApiResponse&lt;OptInResponse&gt;
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
    public ApiResponse<OptInResponse> getOptInUsingGETWithHttpInfo(String successTrackId, String customerId) throws ApiException {
        okhttp3.Call localVarCall = getOptInUsingGETValidateBeforeCall(successTrackId, customerId, null);
        Type localVarReturnType = new TypeToken<OptInResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * optIn status (asynchronously)
     * Returns information about whether the customer has successfully configured the regulatory compliance feature and has assets that are qualified to be checked.
     * @param successTrackId  (required)
     * @param customerId  (required)
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
    public okhttp3.Call getOptInUsingGETAsync(String successTrackId, String customerId, final ApiCallback<OptInResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getOptInUsingGETValidateBeforeCall(successTrackId, customerId, _callback);
        Type localVarReturnType = new TypeToken<OptInResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getPolicyRuleDetailsUsingGET
     * @param successTrackId  (required)
     * @param customerId Unique identifier of the customer (required)
     * @param policyCategory  (required)
     * @param policyGroupId  (required)
     * @param policyId  (required)
     * @param ruleId  (required)
     * @param severity  (required)
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
    public okhttp3.Call getPolicyRuleDetailsUsingGETCall(String successTrackId, String customerId, String policyCategory, String policyGroupId, String policyId, String ruleId, String severity, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/v1/customers/{customerId}/insights/compliance/policyRuleDetails"
            .replaceAll("\\{" + "customerId" + "\\}", localVarApiClient.escapeString(customerId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (successTrackId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("successTrackId", successTrackId));
        }

        if (policyCategory != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("policyCategory", policyCategory));
        }

        if (policyGroupId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("policyGroupId", policyGroupId));
        }

        if (policyId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("policyId", policyId));
        }

        if (ruleId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("ruleId", ruleId));
        }

        if (severity != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("severity", severity));
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
    private okhttp3.Call getPolicyRuleDetailsUsingGETValidateBeforeCall(String successTrackId, String customerId, String policyCategory, String policyGroupId, String policyId, String ruleId, String severity, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'successTrackId' is set
        if (successTrackId == null) {
            throw new ApiException("Missing the required parameter 'successTrackId' when calling getPolicyRuleDetailsUsingGET(Async)");
        }
        
        // verify the required parameter 'customerId' is set
        if (customerId == null) {
            throw new ApiException("Missing the required parameter 'customerId' when calling getPolicyRuleDetailsUsingGET(Async)");
        }
        
        // verify the required parameter 'policyCategory' is set
        if (policyCategory == null) {
            throw new ApiException("Missing the required parameter 'policyCategory' when calling getPolicyRuleDetailsUsingGET(Async)");
        }
        
        // verify the required parameter 'policyGroupId' is set
        if (policyGroupId == null) {
            throw new ApiException("Missing the required parameter 'policyGroupId' when calling getPolicyRuleDetailsUsingGET(Async)");
        }
        
        // verify the required parameter 'policyId' is set
        if (policyId == null) {
            throw new ApiException("Missing the required parameter 'policyId' when calling getPolicyRuleDetailsUsingGET(Async)");
        }
        
        // verify the required parameter 'ruleId' is set
        if (ruleId == null) {
            throw new ApiException("Missing the required parameter 'ruleId' when calling getPolicyRuleDetailsUsingGET(Async)");
        }
        
        // verify the required parameter 'severity' is set
        if (severity == null) {
            throw new ApiException("Missing the required parameter 'severity' when calling getPolicyRuleDetailsUsingGET(Async)");
        }
        

        okhttp3.Call localVarCall = getPolicyRuleDetailsUsingGETCall(successTrackId, customerId, policyCategory, policyGroupId, policyId, ruleId, severity, _callback);
        return localVarCall;

    }

    /**
     * Returns information about the policy the rule belongs to
     * Returns information about the policy the rule belongs to.
     * @param successTrackId  (required)
     * @param customerId Unique identifier of the customer (required)
     * @param policyCategory  (required)
     * @param policyGroupId  (required)
     * @param policyId  (required)
     * @param ruleId  (required)
     * @param severity  (required)
     * @return PolicyRuleDetails
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
    public PolicyRuleDetails getPolicyRuleDetailsUsingGET(String successTrackId, String customerId, String policyCategory, String policyGroupId, String policyId, String ruleId, String severity) throws ApiException {
        ApiResponse<PolicyRuleDetails> localVarResp = getPolicyRuleDetailsUsingGETWithHttpInfo(successTrackId, customerId, policyCategory, policyGroupId, policyId, ruleId, severity);
        return localVarResp.getData();
    }

    /**
     * Returns information about the policy the rule belongs to
     * Returns information about the policy the rule belongs to.
     * @param successTrackId  (required)
     * @param customerId Unique identifier of the customer (required)
     * @param policyCategory  (required)
     * @param policyGroupId  (required)
     * @param policyId  (required)
     * @param ruleId  (required)
     * @param severity  (required)
     * @return ApiResponse&lt;PolicyRuleDetails&gt;
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
    public ApiResponse<PolicyRuleDetails> getPolicyRuleDetailsUsingGETWithHttpInfo(String successTrackId, String customerId, String policyCategory, String policyGroupId, String policyId, String ruleId, String severity) throws ApiException {
        okhttp3.Call localVarCall = getPolicyRuleDetailsUsingGETValidateBeforeCall(successTrackId, customerId, policyCategory, policyGroupId, policyId, ruleId, severity, null);
        Type localVarReturnType = new TypeToken<PolicyRuleDetails>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Returns information about the policy the rule belongs to (asynchronously)
     * Returns information about the policy the rule belongs to.
     * @param successTrackId  (required)
     * @param customerId Unique identifier of the customer (required)
     * @param policyCategory  (required)
     * @param policyGroupId  (required)
     * @param policyId  (required)
     * @param ruleId  (required)
     * @param severity  (required)
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
    public okhttp3.Call getPolicyRuleDetailsUsingGETAsync(String successTrackId, String customerId, String policyCategory, String policyGroupId, String policyId, String ruleId, String severity, final ApiCallback<PolicyRuleDetails> _callback) throws ApiException {

        okhttp3.Call localVarCall = getPolicyRuleDetailsUsingGETValidateBeforeCall(successTrackId, customerId, policyCategory, policyGroupId, policyId, ruleId, severity, _callback);
        Type localVarReturnType = new TypeToken<PolicyRuleDetails>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getSuggestionsUsingGET
     * @param policyCategory  (required)
     * @param successTrackId  (required)
     * @param customerId  (required)
     * @param policyGroupId  (required)
     * @param policyId  (required)
     * @param ruleId  (required)
     * @param offset  (optional, default to 1)
     * @param max  (optional, default to 10)
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
    public okhttp3.Call getSuggestionsUsingGETCall(String policyCategory, String successTrackId, String customerId, String policyGroupId, String policyId, String ruleId, Integer offset, Integer max, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/v1/customers/{customerId}/insights/compliance/suggestions"
            .replaceAll("\\{" + "customerId" + "\\}", localVarApiClient.escapeString(customerId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (policyCategory != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("policyCategory", policyCategory));
        }

        if (successTrackId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("successTrackId", successTrackId));
        }

        if (policyGroupId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("policyGroupId", policyGroupId));
        }

        if (policyId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("policyId", policyId));
        }

        if (ruleId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("ruleId", ruleId));
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
    private okhttp3.Call getSuggestionsUsingGETValidateBeforeCall(String policyCategory, String successTrackId, String customerId, String policyGroupId, String policyId, String ruleId, Integer offset, Integer max, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'policyCategory' is set
        if (policyCategory == null) {
            throw new ApiException("Missing the required parameter 'policyCategory' when calling getSuggestionsUsingGET(Async)");
        }
        
        // verify the required parameter 'successTrackId' is set
        if (successTrackId == null) {
            throw new ApiException("Missing the required parameter 'successTrackId' when calling getSuggestionsUsingGET(Async)");
        }
        
        // verify the required parameter 'customerId' is set
        if (customerId == null) {
            throw new ApiException("Missing the required parameter 'customerId' when calling getSuggestionsUsingGET(Async)");
        }
        
        // verify the required parameter 'policyGroupId' is set
        if (policyGroupId == null) {
            throw new ApiException("Missing the required parameter 'policyGroupId' when calling getSuggestionsUsingGET(Async)");
        }
        
        // verify the required parameter 'policyId' is set
        if (policyId == null) {
            throw new ApiException("Missing the required parameter 'policyId' when calling getSuggestionsUsingGET(Async)");
        }
        
        // verify the required parameter 'ruleId' is set
        if (ruleId == null) {
            throw new ApiException("Missing the required parameter 'ruleId' when calling getSuggestionsUsingGET(Async)");
        }
        

        okhttp3.Call localVarCall = getSuggestionsUsingGETCall(policyCategory, successTrackId, customerId, policyGroupId, policyId, ruleId, offset, max, _callback);
        return localVarCall;

    }

    /**
     * Get the Suggestions filtered upon Severity (if given), for summary tab
     * Returns information about the violated rule conditions, including suggested remediation steps, based on the customer, policy, and rule information provided. Default sorting is severityId(desc)
     * @param policyCategory  (required)
     * @param successTrackId  (required)
     * @param customerId  (required)
     * @param policyGroupId  (required)
     * @param policyId  (required)
     * @param ruleId  (required)
     * @param offset  (optional, default to 1)
     * @param max  (optional, default to 10)
     * @return SuggestionsResponse
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
    public SuggestionsResponse getSuggestionsUsingGET(String policyCategory, String successTrackId, String customerId, String policyGroupId, String policyId, String ruleId, Integer offset, Integer max) throws ApiException {
        ApiResponse<SuggestionsResponse> localVarResp = getSuggestionsUsingGETWithHttpInfo(policyCategory, successTrackId, customerId, policyGroupId, policyId, ruleId, offset, max);
        return localVarResp.getData();
    }

    /**
     * Get the Suggestions filtered upon Severity (if given), for summary tab
     * Returns information about the violated rule conditions, including suggested remediation steps, based on the customer, policy, and rule information provided. Default sorting is severityId(desc)
     * @param policyCategory  (required)
     * @param successTrackId  (required)
     * @param customerId  (required)
     * @param policyGroupId  (required)
     * @param policyId  (required)
     * @param ruleId  (required)
     * @param offset  (optional, default to 1)
     * @param max  (optional, default to 10)
     * @return ApiResponse&lt;SuggestionsResponse&gt;
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
    public ApiResponse<SuggestionsResponse> getSuggestionsUsingGETWithHttpInfo(String policyCategory, String successTrackId, String customerId, String policyGroupId, String policyId, String ruleId, Integer offset, Integer max) throws ApiException {
        okhttp3.Call localVarCall = getSuggestionsUsingGETValidateBeforeCall(policyCategory, successTrackId, customerId, policyGroupId, policyId, ruleId, offset, max, null);
        Type localVarReturnType = new TypeToken<SuggestionsResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get the Suggestions filtered upon Severity (if given), for summary tab (asynchronously)
     * Returns information about the violated rule conditions, including suggested remediation steps, based on the customer, policy, and rule information provided. Default sorting is severityId(desc)
     * @param policyCategory  (required)
     * @param successTrackId  (required)
     * @param customerId  (required)
     * @param policyGroupId  (required)
     * @param policyId  (required)
     * @param ruleId  (required)
     * @param offset  (optional, default to 1)
     * @param max  (optional, default to 10)
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
    public okhttp3.Call getSuggestionsUsingGETAsync(String policyCategory, String successTrackId, String customerId, String policyGroupId, String policyId, String ruleId, Integer offset, Integer max, final ApiCallback<SuggestionsResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getSuggestionsUsingGETValidateBeforeCall(policyCategory, successTrackId, customerId, policyGroupId, policyId, ruleId, offset, max, _callback);
        Type localVarReturnType = new TypeToken<SuggestionsResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getViolationSummaryUsingGET
     * @param successTrackId  (required)
     * @param customerId Unique identifier of the customer (required)
     * @param offset The number of items to skip before starting to collect the result set. The default value is 1. (optional, default to 1)
     * @param max The maximum number of items to return. The default value is 10. (optional, default to 10)
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
    public okhttp3.Call getViolationSummaryUsingGETCall(String successTrackId, String customerId, Integer offset, Integer max, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/v1/customers/{customerId}/insights/compliance/violations"
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
    private okhttp3.Call getViolationSummaryUsingGETValidateBeforeCall(String successTrackId, String customerId, Integer offset, Integer max, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'successTrackId' is set
        if (successTrackId == null) {
            throw new ApiException("Missing the required parameter 'successTrackId' when calling getViolationSummaryUsingGET(Async)");
        }
        
        // verify the required parameter 'customerId' is set
        if (customerId == null) {
            throw new ApiException("Missing the required parameter 'customerId' when calling getViolationSummaryUsingGET(Async)");
        }
        

        okhttp3.Call localVarCall = getViolationSummaryUsingGETCall(successTrackId, customerId, offset, max, _callback);
        return localVarCall;

    }

    /**
     * Get the violation summary of a customer
     * Returns information about the rules violated for the customerId provided Default sorting is, severityId(asc), violationCount(desc)
     * @param successTrackId  (required)
     * @param customerId Unique identifier of the customer (required)
     * @param offset The number of items to skip before starting to collect the result set. The default value is 1. (optional, default to 1)
     * @param max The maximum number of items to return. The default value is 10. (optional, default to 10)
     * @return ViolationSummaryResponse
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
    public ViolationSummaryResponse getViolationSummaryUsingGET(String successTrackId, String customerId, Integer offset, Integer max) throws ApiException {
        ApiResponse<ViolationSummaryResponse> localVarResp = getViolationSummaryUsingGETWithHttpInfo(successTrackId, customerId, offset, max);
        return localVarResp.getData();
    }

    /**
     * Get the violation summary of a customer
     * Returns information about the rules violated for the customerId provided Default sorting is, severityId(asc), violationCount(desc)
     * @param successTrackId  (required)
     * @param customerId Unique identifier of the customer (required)
     * @param offset The number of items to skip before starting to collect the result set. The default value is 1. (optional, default to 1)
     * @param max The maximum number of items to return. The default value is 10. (optional, default to 10)
     * @return ApiResponse&lt;ViolationSummaryResponse&gt;
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
    public ApiResponse<ViolationSummaryResponse> getViolationSummaryUsingGETWithHttpInfo(String successTrackId, String customerId, Integer offset, Integer max) throws ApiException {
        okhttp3.Call localVarCall = getViolationSummaryUsingGETValidateBeforeCall(successTrackId, customerId, offset, max, null);
        Type localVarReturnType = new TypeToken<ViolationSummaryResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get the violation summary of a customer (asynchronously)
     * Returns information about the rules violated for the customerId provided Default sorting is, severityId(asc), violationCount(desc)
     * @param successTrackId  (required)
     * @param customerId Unique identifier of the customer (required)
     * @param offset The number of items to skip before starting to collect the result set. The default value is 1. (optional, default to 1)
     * @param max The maximum number of items to return. The default value is 10. (optional, default to 10)
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
    public okhttp3.Call getViolationSummaryUsingGETAsync(String successTrackId, String customerId, Integer offset, Integer max, final ApiCallback<ViolationSummaryResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getViolationSummaryUsingGETValidateBeforeCall(successTrackId, customerId, offset, max, _callback);
        Type localVarReturnType = new TypeToken<ViolationSummaryResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
