
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
import com.cisco.px.client.model.ErrorResponse;
import com.cisco.px.client.model.RacetrackBuid;
import com.cisco.px.client.model.Report;
import com.cisco.px.client.model.ReportStatus;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.time.OffsetDateTime;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class CustomerDataApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public CustomerDataApi() {
        this(Configuration.getDefaultApiClient());
    }

    public CustomerDataApi(ApiClient apiClient) {
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
     * Build call for fetchContractsDetailsUsingGET
     * @param contractNumber contractNumber (required)
     * @param puid puid (required)
     * @param componentType componentType (optional)
     * @param customerId customerId (optional)
     * @param limit  (optional)
     * @param offset  (optional)
     * @param successTrackId successTrackId (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successfully Fetched Contract Details for Given Partner </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 400 </td><td> Bad Input </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 404 </td><td> Entity Not Found </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 500 </td><td> Error during fetch </td><td>  * Date -  <br>  </td></tr>
     </table>
     */
    public okhttp3.Call fetchContractsDetailsUsingGETCall(Integer contractNumber, Integer puid, String componentType, String customerId, Integer limit, Integer offset, Long successTrackId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/v1/contract/details";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (componentType != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("componentType", componentType));
        }

        if (contractNumber != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("contractNumber", contractNumber));
        }

        if (customerId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("customerId", customerId));
        }

        if (limit != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("limit", limit));
        }

        if (offset != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("offset", offset));
        }

        if (successTrackId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("successTrackId", successTrackId));
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
    private okhttp3.Call fetchContractsDetailsUsingGETValidateBeforeCall(Integer contractNumber, Integer puid, String componentType, String customerId, Integer limit, Integer offset, Long successTrackId, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'contractNumber' is set
        if (contractNumber == null) {
            throw new ApiException("Missing the required parameter 'contractNumber' when calling fetchContractsDetailsUsingGET(Async)");
        }
        
        // verify the required parameter 'puid' is set
        if (puid == null) {
            throw new ApiException("Missing the required parameter 'puid' when calling fetchContractsDetailsUsingGET(Async)");
        }
        

        okhttp3.Call localVarCall = fetchContractsDetailsUsingGETCall(contractNumber, puid, componentType, customerId, limit, offset, successTrackId, _callback);
        return localVarCall;

    }

    /**
     * Get the list of contracts Details from flat table. It supports pagination , filtering and sorting
     * 
     * @param contractNumber contractNumber (required)
     * @param puid puid (required)
     * @param componentType componentType (optional)
     * @param customerId customerId (optional)
     * @param limit  (optional)
     * @param offset  (optional)
     * @param successTrackId successTrackId (optional)
     * @return DataPaginationResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successfully Fetched Contract Details for Given Partner </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 400 </td><td> Bad Input </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 404 </td><td> Entity Not Found </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 500 </td><td> Error during fetch </td><td>  * Date -  <br>  </td></tr>
     </table>
     */
    public DataPaginationResponse fetchContractsDetailsUsingGET(Integer contractNumber, Integer puid, String componentType, String customerId, Integer limit, Integer offset, Long successTrackId) throws ApiException {
        ApiResponse<DataPaginationResponse> localVarResp = fetchContractsDetailsUsingGETWithHttpInfo(contractNumber, puid, componentType, customerId, limit, offset, successTrackId);
        return localVarResp.getData();
    }

    /**
     * Get the list of contracts Details from flat table. It supports pagination , filtering and sorting
     * 
     * @param contractNumber contractNumber (required)
     * @param puid puid (required)
     * @param componentType componentType (optional)
     * @param customerId customerId (optional)
     * @param limit  (optional)
     * @param offset  (optional)
     * @param successTrackId successTrackId (optional)
     * @return ApiResponse&lt;DataPaginationResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successfully Fetched Contract Details for Given Partner </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 400 </td><td> Bad Input </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 404 </td><td> Entity Not Found </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 500 </td><td> Error during fetch </td><td>  * Date -  <br>  </td></tr>
     </table>
     */
    public ApiResponse<DataPaginationResponse> fetchContractsDetailsUsingGETWithHttpInfo(Integer contractNumber, Integer puid, String componentType, String customerId, Integer limit, Integer offset, Long successTrackId) throws ApiException {
        okhttp3.Call localVarCall = fetchContractsDetailsUsingGETValidateBeforeCall(contractNumber, puid, componentType, customerId, limit, offset, successTrackId, null);
        Type localVarReturnType = new TypeToken<DataPaginationResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get the list of contracts Details from flat table. It supports pagination , filtering and sorting (asynchronously)
     * 
     * @param contractNumber contractNumber (required)
     * @param puid puid (required)
     * @param componentType componentType (optional)
     * @param customerId customerId (optional)
     * @param limit  (optional)
     * @param offset  (optional)
     * @param successTrackId successTrackId (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successfully Fetched Contract Details for Given Partner </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 400 </td><td> Bad Input </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 404 </td><td> Entity Not Found </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 500 </td><td> Error during fetch </td><td>  * Date -  <br>  </td></tr>
     </table>
     */
    public okhttp3.Call fetchContractsDetailsUsingGETAsync(Integer contractNumber, Integer puid, String componentType, String customerId, Integer limit, Integer offset, Long successTrackId, final ApiCallback<DataPaginationResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = fetchContractsDetailsUsingGETValidateBeforeCall(contractNumber, puid, componentType, customerId, limit, offset, successTrackId, _callback);
        Type localVarReturnType = new TypeToken<DataPaginationResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getCustomerReport
     * @param reportId Report id (required)
     * @param customerId Unique identifier for the Customer (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Provides the status of the report </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 303 </td><td> Provides the final report resource to download the file </td><td>  * Date -  <br>  * Location - downloadable URL <br>  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 500 </td><td> Internal server error </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 503 </td><td> Service Unavailable </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 504 </td><td> Gateway timeout </td><td>  * Date -  <br>  </td></tr>
     </table>
     */
    public okhttp3.Call getCustomerReportCall(String reportId, String customerId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/v1/customers/{customerId}/reports/{reportId}"
            .replaceAll("\\{" + "reportId" + "\\}", localVarApiClient.escapeString(reportId.toString()))
            .replaceAll("\\{" + "customerId" + "\\}", localVarApiClient.escapeString(customerId.toString()));

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
    private okhttp3.Call getCustomerReportValidateBeforeCall(String reportId, String customerId, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'reportId' is set
        if (reportId == null) {
            throw new ApiException("Missing the required parameter 'reportId' when calling getCustomerReport(Async)");
        }
        
        // verify the required parameter 'customerId' is set
        if (customerId == null) {
            throw new ApiException("Missing the required parameter 'customerId' when calling getCustomerReport(Async)");
        }
        

        okhttp3.Call localVarCall = getCustomerReportCall(reportId, customerId, _callback);
        return localVarCall;

    }

    /**
     * Get the report
     * Provides the status of resource. The status API provides additional info about the progress of the report. Partner application should poll periodically to get status of the report. When the report is complete the API responds with the 303 status pointing to final report in the Location header.
     * @param reportId Report id (required)
     * @param customerId Unique identifier for the Customer (required)
     * @return List&lt;ReportStatus&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Provides the status of the report </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 303 </td><td> Provides the final report resource to download the file </td><td>  * Date -  <br>  * Location - downloadable URL <br>  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 500 </td><td> Internal server error </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 503 </td><td> Service Unavailable </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 504 </td><td> Gateway timeout </td><td>  * Date -  <br>  </td></tr>
     </table>
     */
    public List<ReportStatus> getCustomerReport(String reportId, String customerId) throws ApiException {
        ApiResponse<List<ReportStatus>> localVarResp = getCustomerReportWithHttpInfo(reportId, customerId);
        return localVarResp.getData();
    }

    /**
     * Get the report
     * Provides the status of resource. The status API provides additional info about the progress of the report. Partner application should poll periodically to get status of the report. When the report is complete the API responds with the 303 status pointing to final report in the Location header.
     * @param reportId Report id (required)
     * @param customerId Unique identifier for the Customer (required)
     * @return ApiResponse&lt;List&lt;ReportStatus&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Provides the status of the report </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 303 </td><td> Provides the final report resource to download the file </td><td>  * Date -  <br>  * Location - downloadable URL <br>  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 500 </td><td> Internal server error </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 503 </td><td> Service Unavailable </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 504 </td><td> Gateway timeout </td><td>  * Date -  <br>  </td></tr>
     </table>
     */
    public ApiResponse<List<ReportStatus>> getCustomerReportWithHttpInfo(String reportId, String customerId) throws ApiException {
        okhttp3.Call localVarCall = getCustomerReportValidateBeforeCall(reportId, customerId, null);
        Type localVarReturnType = new TypeToken<List<ReportStatus>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get the report (asynchronously)
     * Provides the status of resource. The status API provides additional info about the progress of the report. Partner application should poll periodically to get status of the report. When the report is complete the API responds with the 303 status pointing to final report in the Location header.
     * @param reportId Report id (required)
     * @param customerId Unique identifier for the Customer (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Provides the status of the report </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 303 </td><td> Provides the final report resource to download the file </td><td>  * Date -  <br>  * Location - downloadable URL <br>  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 500 </td><td> Internal server error </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 503 </td><td> Service Unavailable </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 504 </td><td> Gateway timeout </td><td>  * Date -  <br>  </td></tr>
     </table>
     */
    public okhttp3.Call getCustomerReportAsync(String reportId, String customerId, final ApiCallback<List<ReportStatus>> _callback) throws ApiException {

        okhttp3.Call localVarCall = getCustomerReportValidateBeforeCall(reportId, customerId, _callback);
        Type localVarReturnType = new TypeToken<List<ReportStatus>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getCustomersLifeCycle
     * @param successTrackId  (required)
     * @param customerId Unique identifier for the Customer (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 500 </td><td> Internal server error </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 503 </td><td> Service Unavailable </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 504 </td><td> Gateway timeout </td><td>  * Date -  <br>  </td></tr>
     </table>
     */
    public okhttp3.Call getCustomersLifeCycleCall(String successTrackId, String customerId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/v1/customers/{customerId}/lifecycle"
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

        String[] localVarAuthNames = new String[] { "oAuth2" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getCustomersLifeCycleValidateBeforeCall(String successTrackId, String customerId, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'successTrackId' is set
        if (successTrackId == null) {
            throw new ApiException("Missing the required parameter 'successTrackId' when calling getCustomersLifeCycle(Async)");
        }
        
        // verify the required parameter 'customerId' is set
        if (customerId == null) {
            throw new ApiException("Missing the required parameter 'customerId' when calling getCustomersLifeCycle(Async)");
        }
        

        okhttp3.Call localVarCall = getCustomersLifeCycleCall(successTrackId, customerId, _callback);
        return localVarCall;

    }

    /**
     * Get customer lifecycle
     * Get customer lifecycle which will provide the CX solution, use case and pitstop information for the customer
     * @param successTrackId  (required)
     * @param customerId Unique identifier for the Customer (required)
     * @return RacetrackBuid
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 500 </td><td> Internal server error </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 503 </td><td> Service Unavailable </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 504 </td><td> Gateway timeout </td><td>  * Date -  <br>  </td></tr>
     </table>
     */
    public RacetrackBuid getCustomersLifeCycle(String successTrackId, String customerId) throws ApiException {
        ApiResponse<RacetrackBuid> localVarResp = getCustomersLifeCycleWithHttpInfo(successTrackId, customerId);
        return localVarResp.getData();
    }

    /**
     * Get customer lifecycle
     * Get customer lifecycle which will provide the CX solution, use case and pitstop information for the customer
     * @param successTrackId  (required)
     * @param customerId Unique identifier for the Customer (required)
     * @return ApiResponse&lt;RacetrackBuid&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 500 </td><td> Internal server error </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 503 </td><td> Service Unavailable </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 504 </td><td> Gateway timeout </td><td>  * Date -  <br>  </td></tr>
     </table>
     */
    public ApiResponse<RacetrackBuid> getCustomersLifeCycleWithHttpInfo(String successTrackId, String customerId) throws ApiException {
        okhttp3.Call localVarCall = getCustomersLifeCycleValidateBeforeCall(successTrackId, customerId, null);
        Type localVarReturnType = new TypeToken<RacetrackBuid>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get customer lifecycle (asynchronously)
     * Get customer lifecycle which will provide the CX solution, use case and pitstop information for the customer
     * @param successTrackId  (required)
     * @param customerId Unique identifier for the Customer (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 500 </td><td> Internal server error </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 503 </td><td> Service Unavailable </td><td>  * Date -  <br>  </td></tr>
        <tr><td> 504 </td><td> Gateway timeout </td><td>  * Date -  <br>  </td></tr>
     </table>
     */
    public okhttp3.Call getCustomersLifeCycleAsync(String successTrackId, String customerId, final ApiCallback<RacetrackBuid> _callback) throws ApiException {

        okhttp3.Call localVarCall = getCustomersLifeCycleValidateBeforeCall(successTrackId, customerId, _callback);
        Type localVarReturnType = new TypeToken<RacetrackBuid>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for requestCustomerReport
     * @param customerId Unique identifier for the Customer (required)
     * @param report report infromation (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 202 </td><td> Accepted </td><td>  * Location - downloadable URL <br>  * Date -  <br>  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  * Location - downloadable URL <br>  * Date -  <br>  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  * Location - downloadable URL <br>  * Date -  <br>  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  * Location - downloadable URL <br>  * Date -  <br>  </td></tr>
        <tr><td> 500 </td><td> Internal server error </td><td>  * Location - downloadable URL <br>  * Date -  <br>  </td></tr>
        <tr><td> 503 </td><td> Service Unavailable </td><td>  * Location - downloadable URL <br>  * Date -  <br>  </td></tr>
        <tr><td> 504 </td><td> Gateway timeout </td><td>  * Location - downloadable URL <br>  * Date -  <br>  </td></tr>
     </table>
     */
    public okhttp3.Call requestCustomerReportCall(String customerId, Report report, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = report;

        // create path and map variables
        String localVarPath = "/v1/customers/{customerId}/reports"
            .replaceAll("\\{" + "customerId" + "\\}", localVarApiClient.escapeString(customerId.toString()));

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
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "oAuth2" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call requestCustomerReportValidateBeforeCall(String customerId, Report report, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'customerId' is set
        if (customerId == null) {
            throw new ApiException("Missing the required parameter 'customerId' when calling requestCustomerReport(Async)");
        }
        

        okhttp3.Call localVarCall = requestCustomerReportCall(customerId, report, _callback);
        return localVarCall;

    }

    /**
     * Request customer data reports as bulk files
     * Request customer data report. Creating a request for customer data sets like Assets, Hardware, Software and Advisories bulk json files
     * @param customerId Unique identifier for the Customer (required)
     * @param report report infromation (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 202 </td><td> Accepted </td><td>  * Location - downloadable URL <br>  * Date -  <br>  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  * Location - downloadable URL <br>  * Date -  <br>  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  * Location - downloadable URL <br>  * Date -  <br>  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  * Location - downloadable URL <br>  * Date -  <br>  </td></tr>
        <tr><td> 500 </td><td> Internal server error </td><td>  * Location - downloadable URL <br>  * Date -  <br>  </td></tr>
        <tr><td> 503 </td><td> Service Unavailable </td><td>  * Location - downloadable URL <br>  * Date -  <br>  </td></tr>
        <tr><td> 504 </td><td> Gateway timeout </td><td>  * Location - downloadable URL <br>  * Date -  <br>  </td></tr>
     </table>
     */
    public void requestCustomerReport(String customerId, Report report) throws ApiException {
        requestCustomerReportWithHttpInfo(customerId, report);
    }

    /**
     * Request customer data reports as bulk files
     * Request customer data report. Creating a request for customer data sets like Assets, Hardware, Software and Advisories bulk json files
     * @param customerId Unique identifier for the Customer (required)
     * @param report report infromation (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 202 </td><td> Accepted </td><td>  * Location - downloadable URL <br>  * Date -  <br>  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  * Location - downloadable URL <br>  * Date -  <br>  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  * Location - downloadable URL <br>  * Date -  <br>  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  * Location - downloadable URL <br>  * Date -  <br>  </td></tr>
        <tr><td> 500 </td><td> Internal server error </td><td>  * Location - downloadable URL <br>  * Date -  <br>  </td></tr>
        <tr><td> 503 </td><td> Service Unavailable </td><td>  * Location - downloadable URL <br>  * Date -  <br>  </td></tr>
        <tr><td> 504 </td><td> Gateway timeout </td><td>  * Location - downloadable URL <br>  * Date -  <br>  </td></tr>
     </table>
     */
    public ApiResponse<Void> requestCustomerReportWithHttpInfo(String customerId, Report report) throws ApiException {
        okhttp3.Call localVarCall = requestCustomerReportValidateBeforeCall(customerId, report, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Request customer data reports as bulk files (asynchronously)
     * Request customer data report. Creating a request for customer data sets like Assets, Hardware, Software and Advisories bulk json files
     * @param customerId Unique identifier for the Customer (required)
     * @param report report infromation (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 202 </td><td> Accepted </td><td>  * Location - downloadable URL <br>  * Date -  <br>  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  * Location - downloadable URL <br>  * Date -  <br>  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  * Location - downloadable URL <br>  * Date -  <br>  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  * Location - downloadable URL <br>  * Date -  <br>  </td></tr>
        <tr><td> 500 </td><td> Internal server error </td><td>  * Location - downloadable URL <br>  * Date -  <br>  </td></tr>
        <tr><td> 503 </td><td> Service Unavailable </td><td>  * Location - downloadable URL <br>  * Date -  <br>  </td></tr>
        <tr><td> 504 </td><td> Gateway timeout </td><td>  * Location - downloadable URL <br>  * Date -  <br>  </td></tr>
     </table>
     */
    public okhttp3.Call requestCustomerReportAsync(String customerId, Report report, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = requestCustomerReportValidateBeforeCall(customerId, report, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
}
