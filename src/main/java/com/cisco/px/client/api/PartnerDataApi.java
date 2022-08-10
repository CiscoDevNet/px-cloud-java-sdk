
package com.cisco.px.client.api;

import com.cisco.px.client.ApiCallback;
import com.cisco.px.client.ApiClient;
import com.cisco.px.client.ApiException;
import com.cisco.px.client.ApiResponse;
import com.cisco.px.client.Configuration;
import com.cisco.px.client.Pair;
import com.cisco.px.client.ProgressRequestBody;
import com.cisco.px.client.ProgressResponseBody;
import com.cisco.px.client.model.ContractResponse;
import com.cisco.px.client.model.CustomerResponse;
import com.cisco.px.client.model.ErrorResponse;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.time.OffsetDateTime;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class PartnerDataApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public PartnerDataApi() {
        this(Configuration.getDefaultApiClient());
    }

    public PartnerDataApi(ApiClient apiClient) {
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
     * Build call for getContracts
     * @param offset The number of items to skip before starting to collect the result set (optional)
     * @param max The numbers of items to return. (optional, default to 10)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 500 </td><td> Internal server error </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 503 </td><td> Service Unavailable </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 504 </td><td> Gateway timeout </td><td>  * Date -  <br>  </td></tr>
     </table>
     */
    public okhttp3.Call getContractsCall(Integer offset, Integer max, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/v1/contracts";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

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

        String[] localVarAuthNames = new String[] { "oAuth2" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getContractsValidateBeforeCall(Integer offset, Integer max, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = getContractsCall(offset, max, _callback);
        return localVarCall;

    }

    /**
     * List of contracts
     * Partner CX contracts transacted in cisco
     * @param offset The number of items to skip before starting to collect the result set (optional)
     * @param max The numbers of items to return. (optional, default to 10)
     * @return ContractResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 500 </td><td> Internal server error </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 503 </td><td> Service Unavailable </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 504 </td><td> Gateway timeout </td><td>  * Date -  <br>  </td></tr>
     </table>
     */
    public ContractResponse getContracts(Integer offset, Integer max) throws ApiException {
        ApiResponse<ContractResponse> localVarResp = getContractsWithHttpInfo(offset, max);
        return localVarResp.getData();
    }

    /**
     * List of contracts
     * Partner CX contracts transacted in cisco
     * @param offset The number of items to skip before starting to collect the result set (optional)
     * @param max The numbers of items to return. (optional, default to 10)
     * @return ApiResponse&lt;ContractResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 500 </td><td> Internal server error </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 503 </td><td> Service Unavailable </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 504 </td><td> Gateway timeout </td><td>  * Date -  <br>  </td></tr>
     </table>
     */
    public ApiResponse<ContractResponse> getContractsWithHttpInfo(Integer offset, Integer max) throws ApiException {
        okhttp3.Call localVarCall = getContractsValidateBeforeCall(offset, max, null);
        Type localVarReturnType = new TypeToken<ContractResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * List of contracts (asynchronously)
     * Partner CX contracts transacted in cisco
     * @param offset The number of items to skip before starting to collect the result set (optional)
     * @param max The numbers of items to return. (optional, default to 10)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 500 </td><td> Internal server error </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 503 </td><td> Service Unavailable </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 504 </td><td> Gateway timeout </td><td>  * Date -  <br>  </td></tr>
     </table>
     */
    public okhttp3.Call getContractsAsync(Integer offset, Integer max, final ApiCallback<ContractResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getContractsValidateBeforeCall(offset, max, _callback);
        Type localVarReturnType = new TypeToken<ContractResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getCustomers
     * @param offset The number of items to skip before starting to collect the result set (optional)
     * @param max The numbers of items to return. (optional, default to 10)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 500 </td><td> Internal server error </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 503 </td><td> Service Unavailable </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 504 </td><td> Gateway timeout </td><td>  * Date -  <br>  </td></tr>
     </table>
     */
    public okhttp3.Call getCustomersCall(Integer offset, Integer max, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/v1/customers";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

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

        String[] localVarAuthNames = new String[] { "oAuth2" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getCustomersValidateBeforeCall(Integer offset, Integer max, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = getCustomersCall(offset, max, _callback);
        return localVarCall;

    }

    /**
     * List of customers
     * Get list of Customers
     * @param offset The number of items to skip before starting to collect the result set (optional)
     * @param max The numbers of items to return. (optional, default to 10)
     * @return CustomerResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 500 </td><td> Internal server error </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 503 </td><td> Service Unavailable </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 504 </td><td> Gateway timeout </td><td>  * Date -  <br>  </td></tr>
     </table>
     */
    public CustomerResponse getCustomers(Integer offset, Integer max) throws ApiException {
        ApiResponse<CustomerResponse> localVarResp = getCustomersWithHttpInfo(offset, max);
        return localVarResp.getData();
    }

    /**
     * List of customers
     * Get list of Customers
     * @param offset The number of items to skip before starting to collect the result set (optional)
     * @param max The numbers of items to return. (optional, default to 10)
     * @return ApiResponse&lt;CustomerResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 500 </td><td> Internal server error </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 503 </td><td> Service Unavailable </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 504 </td><td> Gateway timeout </td><td>  * Date -  <br>  </td></tr>
     </table>
     */
    public ApiResponse<CustomerResponse> getCustomersWithHttpInfo(Integer offset, Integer max) throws ApiException {
        okhttp3.Call localVarCall = getCustomersValidateBeforeCall(offset, max, null);
        Type localVarReturnType = new TypeToken<CustomerResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * List of customers (asynchronously)
     * Get list of Customers
     * @param offset The number of items to skip before starting to collect the result set (optional)
     * @param max The numbers of items to return. (optional, default to 10)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 500 </td><td> Internal server error </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 503 </td><td> Service Unavailable </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 504 </td><td> Gateway timeout </td><td>  * Date -  <br>  </td></tr>
     </table>
     */
    public okhttp3.Call getCustomersAsync(Integer offset, Integer max, final ApiCallback<CustomerResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getCustomersValidateBeforeCall(offset, max, _callback);
        Type localVarReturnType = new TypeToken<CustomerResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getSuccessTracks
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 200 response </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 500 </td><td> Internal server error </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 503 </td><td> Service Unavailable </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 504 </td><td> Gateway timeout </td><td>  * Date -  <br>  </td></tr>
     </table>
     */
    public okhttp3.Call getSuccessTracksCall(final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/v1/successTracks";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

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

        String[] localVarAuthNames = new String[] { "oAuth2" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getSuccessTracksValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = getSuccessTracksCall(_callback);
        return localVarCall;

    }

    /**
     * Success Tracks
     * Partner Success Tracks
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 200 response </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 500 </td><td> Internal server error </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 503 </td><td> Service Unavailable </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 504 </td><td> Gateway timeout </td><td>  * Date -  <br>  </td></tr>
     </table>
     */
    public void getSuccessTracks() throws ApiException {
        getSuccessTracksWithHttpInfo();
    }

    /**
     * Success Tracks
     * Partner Success Tracks
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 200 response </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 500 </td><td> Internal server error </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 503 </td><td> Service Unavailable </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 504 </td><td> Gateway timeout </td><td>  * Date -  <br>  </td></tr>
     </table>
     */
    public ApiResponse<Void> getSuccessTracksWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = getSuccessTracksValidateBeforeCall(null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Success Tracks (asynchronously)
     * Partner Success Tracks
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 200 response </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 500 </td><td> Internal server error </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 503 </td><td> Service Unavailable </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 504 </td><td> Gateway timeout </td><td>  * Date -  <br>  </td></tr>
     </table>
     */
    public okhttp3.Call getSuccessTracksAsync(final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = getSuccessTracksValidateBeforeCall(_callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
}
