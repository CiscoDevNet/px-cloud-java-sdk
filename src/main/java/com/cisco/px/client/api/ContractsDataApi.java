
package com.cisco.px.client.api;

import com.cisco.px.client.ApiCallback;
import com.cisco.px.client.ApiClient;
import com.cisco.px.client.ApiException;
import com.cisco.px.client.ApiResponse;
import com.cisco.px.client.Configuration;
import com.cisco.px.client.Pair;
import com.cisco.px.client.ProgressRequestBody;
import com.cisco.px.client.ProgressResponseBody;
import com.cisco.px.client.model.ContractsErrorResponse;
import com.cisco.px.client.model.DataPaginationResponse;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.time.OffsetDateTime;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class ContractsDataApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public ContractsDataApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ContractsDataApi(ApiClient apiClient) {
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
     * Build call for fetchContractsSummaryUsingGET
     * @param successTrackId successTrackId (required)
     * @param puid puid (required)
     * @param customerId customerId (optional)
     * @param guName guName (optional)
     * @param limit  (optional)
     * @param offset  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successfully Fetched Contract Summary for Given Partner </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 400 </td><td> Bad Input </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 404 </td><td> Entity Not Found </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 500 </td><td> Error during fetch </td><td>  * Date -  <br>  </td></tr>
     </table>
     */
    public okhttp3.Call fetchContractsSummaryUsingGETCall(Integer successTrackId, Integer puid, String customerId, String guName, Integer limit, Integer offset, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/v2/contracts";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (customerId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("customerId", customerId));
        }

        if (successTrackId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("successTrackId", successTrackId));
        }

        if (guName != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("guName", guName));
        }

        if (limit != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("limit", limit));
        }

        if (offset != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("offset", offset));
        }

        if (puid != null) {
            localVarHeaderParams.put("puid", localVarApiClient.parameterToString(puid));
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
    private okhttp3.Call fetchContractsSummaryUsingGETValidateBeforeCall(Integer successTrackId, Integer puid, String customerId, String guName, Integer limit, Integer offset, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'successTrackId' is set
        if (successTrackId == null) {
            throw new ApiException("Missing the required parameter 'successTrackId' when calling fetchContractsSummaryUsingGET(Async)");
        }
        
        // verify the required parameter 'puid' is set
        if (puid == null) {
            throw new ApiException("Missing the required parameter 'puid' when calling fetchContractsSummaryUsingGET(Async)");
        }
        

        okhttp3.Call localVarCall = fetchContractsSummaryUsingGETCall(successTrackId, puid, customerId, guName, limit, offset, _callback);
        return localVarCall;

    }

    /**
     * Get the list of contracts summary
     * 
     * @param successTrackId successTrackId (required)
     * @param puid puid (required)
     * @param customerId customerId (optional)
     * @param guName guName (optional)
     * @param limit  (optional)
     * @param offset  (optional)
     * @return DataPaginationResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successfully Fetched Contract Summary for Given Partner </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 400 </td><td> Bad Input </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 404 </td><td> Entity Not Found </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 500 </td><td> Error during fetch </td><td>  * Date -  <br>  </td></tr>
     </table>
     */
    public DataPaginationResponse fetchContractsSummaryUsingGET(Integer successTrackId, Integer puid, String customerId, String guName, Integer limit, Integer offset) throws ApiException {
        ApiResponse<DataPaginationResponse> localVarResp = fetchContractsSummaryUsingGETWithHttpInfo(successTrackId, puid, customerId, guName, limit, offset);
        return localVarResp.getData();
    }

    /**
     * Get the list of contracts summary
     * 
     * @param successTrackId successTrackId (required)
     * @param puid puid (required)
     * @param customerId customerId (optional)
     * @param guName guName (optional)
     * @param limit  (optional)
     * @param offset  (optional)
     * @return ApiResponse&lt;DataPaginationResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successfully Fetched Contract Summary for Given Partner </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 400 </td><td> Bad Input </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 404 </td><td> Entity Not Found </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 500 </td><td> Error during fetch </td><td>  * Date -  <br>  </td></tr>
     </table>
     */
    public ApiResponse<DataPaginationResponse> fetchContractsSummaryUsingGETWithHttpInfo(Integer successTrackId, Integer puid, String customerId, String guName, Integer limit, Integer offset) throws ApiException {
        okhttp3.Call localVarCall = fetchContractsSummaryUsingGETValidateBeforeCall(successTrackId, puid, customerId, guName, limit, offset, null);
        Type localVarReturnType = new TypeToken<DataPaginationResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get the list of contracts summary (asynchronously)
     * 
     * @param successTrackId successTrackId (required)
     * @param puid puid (required)
     * @param customerId customerId (optional)
     * @param guName guName (optional)
     * @param limit  (optional)
     * @param offset  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successfully Fetched Contract Summary for Given Partner </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 400 </td><td> Bad Input </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 404 </td><td> Entity Not Found </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 500 </td><td> Error during fetch </td><td>  * Date -  <br>  </td></tr>
     </table>
     */
    public okhttp3.Call fetchContractsSummaryUsingGETAsync(Integer successTrackId, Integer puid, String customerId, String guName, Integer limit, Integer offset, final ApiCallback<DataPaginationResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = fetchContractsSummaryUsingGETValidateBeforeCall(successTrackId, puid, customerId, guName, limit, offset, _callback);
        Type localVarReturnType = new TypeToken<DataPaginationResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
