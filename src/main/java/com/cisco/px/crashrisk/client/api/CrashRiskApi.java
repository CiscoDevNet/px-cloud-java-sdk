
package com.cisco.px.crashrisk.client.api;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.cisco.px.client.ApiCallback;
import com.cisco.px.client.ApiClient;
import com.cisco.px.client.ApiException;
import com.cisco.px.client.ApiResponse;
import com.cisco.px.client.Configuration;
import com.cisco.px.client.Pair;
import com.cisco.px.client.model.CrashRiskDevices;
import com.cisco.px.client.model.DeviceCrashDetail;
import com.cisco.px.client.model.DeviceRiskFactors;
import com.cisco.px.client.model.InventoryCrashDetails;
import com.cisco.px.client.model.SimilarDevices;
import com.google.gson.reflect.TypeToken;

public class CrashRiskApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public CrashRiskApi() {
        this(Configuration.getDefaultApiClient());
    }

    public CrashRiskApi(ApiClient apiClient) {
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
     * Build call for assetRiskFactorsUsingGet
     * @param successTrackId  (required)
     * @param customerId  (required)
     * @param assetIdBase64 base64 encoded value of the assetId (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 403 </td><td> Forbidden error </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  * Date -  <br>  </td></tr>
     </table>
     */
    public okhttp3.Call assetRiskFactorsUsingGetCall(String successTrackId, String customerId, String assetIdBase64, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/v1/customers/{customerId}/insights/crashRisk/assets/{assetIdBase64}/riskFactors"
            .replaceAll("\\{" + "customerId" + "\\}", localVarApiClient.escapeString(customerId.toString()))
            .replaceAll("\\{" + "assetIdBase64" + "\\}", localVarApiClient.escapeString(assetIdBase64.toString()));

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
    private okhttp3.Call assetRiskFactorsUsingGetValidateBeforeCall(String successTrackId, String customerId, String assetIdBase64, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'successTrackId' is set
        if (successTrackId == null) {
            throw new ApiException("Missing the required parameter 'successTrackId' when calling assetRiskFactorsUsingGet(Async)");
        }
        
        // verify the required parameter 'customerId' is set
        if (customerId == null) {
            throw new ApiException("Missing the required parameter 'customerId' when calling assetRiskFactorsUsingGet(Async)");
        }
        
        // verify the required parameter 'assetIdBase64' is set
        if (assetIdBase64 == null) {
            throw new ApiException("Missing the required parameter 'assetIdBase64' when calling assetRiskFactorsUsingGet(Async)");
        }
        

        okhttp3.Call localVarCall = assetRiskFactorsUsingGetCall(successTrackId, customerId, assetIdBase64, _callback);
        return localVarCall;

    }

    /**
     * Get risk factors of a device
     * This API provides list of risk factors that contribute to the high risk score. Default sorting is factorWeight
     * @param successTrackId  (required)
     * @param customerId  (required)
     * @param assetIdBase64 base64 encoded value of the assetId (required)
     * @return DeviceRiskFactors
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 403 </td><td> Forbidden error </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  * Date -  <br>  </td></tr>
     </table>
     */
    public DeviceRiskFactors assetRiskFactorsUsingGet(String successTrackId, String customerId, String assetIdBase64) throws ApiException {
        ApiResponse<DeviceRiskFactors> localVarResp = assetRiskFactorsUsingGetWithHttpInfo(successTrackId, customerId, assetIdBase64);
        return localVarResp.getData();
    }

    /**
     * Get risk factors of a device
     * This API provides list of risk factors that contribute to the high risk score. Default sorting is factorWeight
     * @param successTrackId  (required)
     * @param customerId  (required)
     * @param assetIdBase64 base64 encoded value of the assetId (required)
     * @return ApiResponse&lt;DeviceRiskFactors&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 403 </td><td> Forbidden error </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  * Date -  <br>  </td></tr>
     </table>
     */
    public ApiResponse<DeviceRiskFactors> assetRiskFactorsUsingGetWithHttpInfo(String successTrackId, String customerId, String assetIdBase64) throws ApiException {
        okhttp3.Call localVarCall = assetRiskFactorsUsingGetValidateBeforeCall(successTrackId, customerId, assetIdBase64, null);
        Type localVarReturnType = new TypeToken<DeviceRiskFactors>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get risk factors of a device (asynchronously)
     * This API provides list of risk factors that contribute to the high risk score. Default sorting is factorWeight
     * @param successTrackId  (required)
     * @param customerId  (required)
     * @param assetIdBase64 base64 encoded value of the assetId (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 403 </td><td> Forbidden error </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  * Date -  <br>  </td></tr>
     </table>
     */
    public okhttp3.Call assetRiskFactorsUsingGetAsync(String successTrackId, String customerId, String assetIdBase64, final ApiCallback<DeviceRiskFactors> _callback) throws ApiException {

        okhttp3.Call localVarCall = assetRiskFactorsUsingGetValidateBeforeCall(successTrackId, customerId, assetIdBase64, _callback);
        Type localVarReturnType = new TypeToken<DeviceRiskFactors>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for assetsCrashedUsingGET
     * @param successTrackId  (required)
     * @param customerId customerId (required)
     * @param timePeriod timePeriod (optional, default to 1)
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
    public okhttp3.Call assetsCrashedUsingGETCall(String successTrackId, String customerId, String timePeriod, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/v1/customers/{customerId}/insights/crashRisk/assetsCrashed"
            .replaceAll("\\{" + "customerId" + "\\}", localVarApiClient.escapeString(customerId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (successTrackId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("successTrackId", successTrackId));
        }

        if (timePeriod != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("timePeriod", timePeriod));
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
    private okhttp3.Call assetsCrashedUsingGETValidateBeforeCall(String successTrackId, String customerId, String timePeriod, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'successTrackId' is set
        if (successTrackId == null) {
            throw new ApiException("Missing the required parameter 'successTrackId' when calling assetsCrashedUsingGET(Async)");
        }
        
        // verify the required parameter 'customerId' is set
        if (customerId == null) {
            throw new ApiException("Missing the required parameter 'customerId' when calling assetsCrashedUsingGET(Async)");
        }
        

        okhttp3.Call localVarCall = assetsCrashedUsingGETCall(successTrackId, customerId, timePeriod, _callback);
        return localVarCall;

    }

    /**
     * Get the list of crashed devices for last given time period
     * This API provides the list of devices with details (i.e. Asset, Product Id, Product Family, Software Version, Crash Count, First Occurrence and Last Occurrence) by customer Id that have crashed in the last 1d,7d,15d,90d based on the filter input. Default sort is by lastCrashDate
     * @param successTrackId  (required)
     * @param customerId customerId (required)
     * @param timePeriod timePeriod (optional, default to 1)
     * @return InventoryCrashDetails
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
    public InventoryCrashDetails assetsCrashedUsingGET(String successTrackId, String customerId, String timePeriod) throws ApiException {
        ApiResponse<InventoryCrashDetails> localVarResp = assetsCrashedUsingGETWithHttpInfo(successTrackId, customerId, timePeriod);
        return localVarResp.getData();
    }

    /**
     * Get the list of crashed devices for last given time period
     * This API provides the list of devices with details (i.e. Asset, Product Id, Product Family, Software Version, Crash Count, First Occurrence and Last Occurrence) by customer Id that have crashed in the last 1d,7d,15d,90d based on the filter input. Default sort is by lastCrashDate
     * @param successTrackId  (required)
     * @param customerId customerId (required)
     * @param timePeriod timePeriod (optional, default to 1)
     * @return ApiResponse&lt;InventoryCrashDetails&gt;
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
    public ApiResponse<InventoryCrashDetails> assetsCrashedUsingGETWithHttpInfo(String successTrackId, String customerId, String timePeriod) throws ApiException {
        okhttp3.Call localVarCall = assetsCrashedUsingGETValidateBeforeCall(successTrackId, customerId, timePeriod, null);
        Type localVarReturnType = new TypeToken<InventoryCrashDetails>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get the list of crashed devices for last given time period (asynchronously)
     * This API provides the list of devices with details (i.e. Asset, Product Id, Product Family, Software Version, Crash Count, First Occurrence and Last Occurrence) by customer Id that have crashed in the last 1d,7d,15d,90d based on the filter input. Default sort is by lastCrashDate
     * @param successTrackId  (required)
     * @param customerId customerId (required)
     * @param timePeriod timePeriod (optional, default to 1)
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
    public okhttp3.Call assetsCrashedUsingGETAsync(String successTrackId, String customerId, String timePeriod, final ApiCallback<InventoryCrashDetails> _callback) throws ApiException {

        okhttp3.Call localVarCall = assetsCrashedUsingGETValidateBeforeCall(successTrackId, customerId, timePeriod, _callback);
        Type localVarReturnType = new TypeToken<InventoryCrashDetails>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for crashHistoryUsingGET
     * @param successTrackId  (required)
     * @param customerId customerId (required)
     * @param assetIdBase64 base64 encoded value of the assetId (required)
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
    public okhttp3.Call crashHistoryUsingGETCall(String successTrackId, String customerId, String assetIdBase64, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/v1/customers/{customerId}/insights/crashRisk/asset/{assetIdBase64}/crashHistory"
            .replaceAll("\\{" + "customerId" + "\\}", localVarApiClient.escapeString(customerId.toString()))
            .replaceAll("\\{" + "assetIdBase64" + "\\}", localVarApiClient.escapeString(assetIdBase64.toString()));

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
    private okhttp3.Call crashHistoryUsingGETValidateBeforeCall(String successTrackId, String customerId, String assetIdBase64, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'successTrackId' is set
        if (successTrackId == null) {
            throw new ApiException("Missing the required parameter 'successTrackId' when calling crashHistoryUsingGET(Async)");
        }
        
        // verify the required parameter 'customerId' is set
        if (customerId == null) {
            throw new ApiException("Missing the required parameter 'customerId' when calling crashHistoryUsingGET(Async)");
        }
        
        // verify the required parameter 'assetIdBase64' is set
        if (assetIdBase64 == null) {
            throw new ApiException("Missing the required parameter 'assetIdBase64' when calling crashHistoryUsingGET(Async)");
        }
        

        okhttp3.Call localVarCall = crashHistoryUsingGETCall(successTrackId, customerId, assetIdBase64, _callback);
        return localVarCall;

    }

    /**
     * Get the device crash-detail - Asset 360(time stamp, reset reason)
     * Details of the number of times the device crashed in the last 365 days with reset reason. Default sort is by timeStamp
     * @param successTrackId  (required)
     * @param customerId customerId (required)
     * @param assetIdBase64 base64 encoded value of the assetId (required)
     * @return DeviceCrashDetail
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
    public DeviceCrashDetail crashHistoryUsingGET(String successTrackId, String customerId, String assetIdBase64) throws ApiException {
        ApiResponse<DeviceCrashDetail> localVarResp = crashHistoryUsingGETWithHttpInfo(successTrackId, customerId, assetIdBase64);
        return localVarResp.getData();
    }

    /**
     * Get the device crash-detail - Asset 360(time stamp, reset reason)
     * Details of the number of times the device crashed in the last 365 days with reset reason. Default sort is by timeStamp
     * @param successTrackId  (required)
     * @param customerId customerId (required)
     * @param assetIdBase64 base64 encoded value of the assetId (required)
     * @return ApiResponse&lt;DeviceCrashDetail&gt;
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
    public ApiResponse<DeviceCrashDetail> crashHistoryUsingGETWithHttpInfo(String successTrackId, String customerId, String assetIdBase64) throws ApiException {
        okhttp3.Call localVarCall = crashHistoryUsingGETValidateBeforeCall(successTrackId, customerId, assetIdBase64, null);
        Type localVarReturnType = new TypeToken<DeviceCrashDetail>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get the device crash-detail - Asset 360(time stamp, reset reason) (asynchronously)
     * Details of the number of times the device crashed in the last 365 days with reset reason. Default sort is by timeStamp
     * @param successTrackId  (required)
     * @param customerId customerId (required)
     * @param assetIdBase64 base64 encoded value of the assetId (required)
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
    public okhttp3.Call crashHistoryUsingGETAsync(String successTrackId, String customerId, String assetIdBase64, final ApiCallback<DeviceCrashDetail> _callback) throws ApiException {

        okhttp3.Call localVarCall = crashHistoryUsingGETValidateBeforeCall(successTrackId, customerId, assetIdBase64, _callback);
        Type localVarReturnType = new TypeToken<DeviceCrashDetail>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for crashRiskAssetsUsingGet
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
        <tr><td> 200 </td><td> Ok </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 403 </td><td> Forbidden error </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  * Date -  <br>  </td></tr>
     </table>
     */
    public okhttp3.Call crashRiskAssetsUsingGetCall(String successTrackId, String customerId, Integer offset, Integer max, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/v1/customers/{customerId}/insights/crashRisk/assets"
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
    private okhttp3.Call crashRiskAssetsUsingGetValidateBeforeCall(String successTrackId, String customerId, Integer offset, Integer max, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'successTrackId' is set
        if (successTrackId == null) {
            throw new ApiException("Missing the required parameter 'successTrackId' when calling crashRiskAssetsUsingGet(Async)");
        }
        
        // verify the required parameter 'customerId' is set
        if (customerId == null) {
            throw new ApiException("Missing the required parameter 'customerId' when calling crashRiskAssetsUsingGet(Async)");
        }
        

        okhttp3.Call localVarCall = crashRiskAssetsUsingGetCall(successTrackId, customerId, offset, max, _callback);
        return localVarCall;

    }

    /**
     * Get devices which are at risk of crash owned by a customer, sorted by risk score in descending order by default
     * This API provides details of the devices that have a probability of crash with crash score rating as High, Medium and Low. Default sorting is End date
     * @param successTrackId  (required)
     * @param customerId  (required)
     * @param offset  (optional, default to 1)
     * @param max  (optional, default to 10)
     * @return CrashRiskDevices
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 403 </td><td> Forbidden error </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  * Date -  <br>  </td></tr>
     </table>
     */
    public CrashRiskDevices crashRiskAssetsUsingGet(String successTrackId, String customerId, Integer offset, Integer max) throws ApiException {
        ApiResponse<CrashRiskDevices> localVarResp = crashRiskAssetsUsingGetWithHttpInfo(successTrackId, customerId, offset, max);
        return localVarResp.getData();
    }

    /**
     * Get devices which are at risk of crash owned by a customer, sorted by risk score in descending order by default
     * This API provides details of the devices that have a probability of crash with crash score rating as High, Medium and Low. Default sorting is End date
     * @param successTrackId  (required)
     * @param customerId  (required)
     * @param offset  (optional, default to 1)
     * @param max  (optional, default to 10)
     * @return ApiResponse&lt;CrashRiskDevices&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 403 </td><td> Forbidden error </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  * Date -  <br>  </td></tr>
     </table>
     */
    public ApiResponse<CrashRiskDevices> crashRiskAssetsUsingGetWithHttpInfo(String successTrackId, String customerId, Integer offset, Integer max) throws ApiException {
        okhttp3.Call localVarCall = crashRiskAssetsUsingGetValidateBeforeCall(successTrackId, customerId, offset, max, null);
        Type localVarReturnType = new TypeToken<CrashRiskDevices>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get devices which are at risk of crash owned by a customer, sorted by risk score in descending order by default (asynchronously)
     * This API provides details of the devices that have a probability of crash with crash score rating as High, Medium and Low. Default sorting is End date
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
        <tr><td> 200 </td><td> Ok </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 403 </td><td> Forbidden error </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  * Date -  <br>  </td></tr>
     </table>
     */
    public okhttp3.Call crashRiskAssetsUsingGetAsync(String successTrackId, String customerId, Integer offset, Integer max, final ApiCallback<CrashRiskDevices> _callback) throws ApiException {

        okhttp3.Call localVarCall = crashRiskAssetsUsingGetValidateBeforeCall(successTrackId, customerId, offset, max, _callback);
        Type localVarReturnType = new TypeToken<CrashRiskDevices>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for similarAssetsUsingGet
     * @param successTrackId  (required)
     * @param customerId  (required)
     * @param assetIdBase64 base64 encoded value of the assetId (required)
     * @param similarityCriteria should be one of the following values features,fingerprint,softwares_features (required)
     * @param offset  (optional, default to 1)
     * @param max  (optional, default to 10)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 403 </td><td> Forbidden error </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  * Date -  <br>  </td></tr>
     </table>
     */
    public okhttp3.Call similarAssetsUsingGetCall(String successTrackId, String customerId, String assetIdBase64, String similarityCriteria, Integer offset, Integer max, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/v1/customers/{customerId}/insights/crashRisk/assets/{assetIdBase64}/similarAssets"
            .replaceAll("\\{" + "customerId" + "\\}", localVarApiClient.escapeString(customerId.toString()))
            .replaceAll("\\{" + "assetIdBase64" + "\\}", localVarApiClient.escapeString(assetIdBase64.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (successTrackId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("successTrackId", successTrackId));
        }

        if (similarityCriteria != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("similarityCriteria", similarityCriteria));
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
    private okhttp3.Call similarAssetsUsingGetValidateBeforeCall(String successTrackId, String customerId, String assetIdBase64, String similarityCriteria, Integer offset, Integer max, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'successTrackId' is set
        if (successTrackId == null) {
            throw new ApiException("Missing the required parameter 'successTrackId' when calling similarAssetsUsingGet(Async)");
        }
        
        // verify the required parameter 'customerId' is set
        if (customerId == null) {
            throw new ApiException("Missing the required parameter 'customerId' when calling similarAssetsUsingGet(Async)");
        }
        
        // verify the required parameter 'assetIdBase64' is set
        if (assetIdBase64 == null) {
            throw new ApiException("Missing the required parameter 'assetIdBase64' when calling similarAssetsUsingGet(Async)");
        }
        
        // verify the required parameter 'similarityCriteria' is set
        if (similarityCriteria == null) {
            throw new ApiException("Missing the required parameter 'similarityCriteria' when calling similarAssetsUsingGet(Async)");
        }
        

        okhttp3.Call localVarCall = similarAssetsUsingGetCall(successTrackId, customerId, assetIdBase64, similarityCriteria, offset, max, _callback);
        return localVarCall;

    }

    /**
     * Get similar assets based on the similarity score
     * This API provides details of other devices in the network that are similar to the current device pre in terms of features , prodict familiy and hardware. Default sort is similarityScore
     * @param successTrackId  (required)
     * @param customerId  (required)
     * @param assetIdBase64 base64 encoded value of the assetId (required)
     * @param similarityCriteria should be one of the following values features,fingerprint,softwares_features (required)
     * @param offset  (optional, default to 1)
     * @param max  (optional, default to 10)
     * @return SimilarDevices
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 403 </td><td> Forbidden error </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  * Date -  <br>  </td></tr>
     </table>
     */
    public SimilarDevices similarAssetsUsingGet(String successTrackId, String customerId, String assetIdBase64, String similarityCriteria, Integer offset, Integer max) throws ApiException {
        ApiResponse<SimilarDevices> localVarResp = similarAssetsUsingGetWithHttpInfo(successTrackId, customerId, assetIdBase64, similarityCriteria, offset, max);
        return localVarResp.getData();
    }

    /**
     * Get similar assets based on the similarity score
     * This API provides details of other devices in the network that are similar to the current device pre in terms of features , prodict familiy and hardware. Default sort is similarityScore
     * @param successTrackId  (required)
     * @param customerId  (required)
     * @param assetIdBase64 base64 encoded value of the assetId (required)
     * @param similarityCriteria should be one of the following values features,fingerprint,softwares_features (required)
     * @param offset  (optional, default to 1)
     * @param max  (optional, default to 10)
     * @return ApiResponse&lt;SimilarDevices&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 403 </td><td> Forbidden error </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  * Date -  <br>  </td></tr>
     </table>
     */
    public ApiResponse<SimilarDevices> similarAssetsUsingGetWithHttpInfo(String successTrackId, String customerId, String assetIdBase64, String similarityCriteria, Integer offset, Integer max) throws ApiException {
        okhttp3.Call localVarCall = similarAssetsUsingGetValidateBeforeCall(successTrackId, customerId, assetIdBase64, similarityCriteria, offset, max, null);
        Type localVarReturnType = new TypeToken<SimilarDevices>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get similar assets based on the similarity score (asynchronously)
     * This API provides details of other devices in the network that are similar to the current device pre in terms of features , prodict familiy and hardware. Default sort is similarityScore
     * @param successTrackId  (required)
     * @param customerId  (required)
     * @param assetIdBase64 base64 encoded value of the assetId (required)
     * @param similarityCriteria should be one of the following values features,fingerprint,softwares_features (required)
     * @param offset  (optional, default to 1)
     * @param max  (optional, default to 10)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 403 </td><td> Forbidden error </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  * Date -  <br>  </td></tr>
     </table>
     */
    public okhttp3.Call similarAssetsUsingGetAsync(String successTrackId, String customerId, String assetIdBase64, String similarityCriteria, Integer offset, Integer max, final ApiCallback<SimilarDevices> _callback) throws ApiException {

        okhttp3.Call localVarCall = similarAssetsUsingGetValidateBeforeCall(successTrackId, customerId, assetIdBase64, similarityCriteria, offset, max, _callback);
        Type localVarReturnType = new TypeToken<SimilarDevices>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
