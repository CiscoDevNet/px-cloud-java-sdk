
package com.cisco.px.client.api;

import com.cisco.px.client.ApiCallback;
import com.cisco.px.client.ApiClient;
import com.cisco.px.client.ApiException;
import com.cisco.px.client.ApiResponse;
import com.cisco.px.client.Configuration;
import com.cisco.px.client.Pair;
import com.cisco.px.client.ProgressRequestBody;
import com.cisco.px.client.ProgressResponseBody;
import com.cisco.px.client.model.ErrorResponse;
import com.cisco.px.client.model.PartnerOfferWithSessions;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.time.OffsetDateTime;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class PartnerOffersSessionsDataApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public PartnerOffersSessionsDataApi() {
        this(Configuration.getDefaultApiClient());
    }

    public PartnerOffersSessionsDataApi(ApiClient apiClient) {
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
     * Build call for getPartnerOffersSessions
     * @param customerId Customer Id&#39;s for filtering the results (optional)
     * @param offerId published Asset Id from Path Params (optional)
     * @param offerStatus Status for filtering the results (optional)
     * @param offerType Asset Type for filtering the results (optional)
     * @param page Page number. Default value is 1 (optional, default to 1)
     * @param paginationRequired Pagination data required flag (optional, default to true)
     * @param partnerId Partner ID for filtering the results (optional)
     * @param rows No of rows in a page. Default value is 10 and the maximum rows allowed per page is 100 (optional, default to 10)
     * @param successTrackId Solution Id field for filtering the results (optional)
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
    public okhttp3.Call getPartnerOffersSessionsCall(List<String> customerId, String offerId, List<String> offerStatus, List<String> offerType, Integer page, Boolean paginationRequired, List<Integer> partnerId, Integer rows, List<String> successTrackId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/v1/partnerOffersSessions";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (customerId != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("multi", "customerId", customerId));
        }

        if (offerId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("offerId", offerId));
        }

        if (offerStatus != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("multi", "offerStatus", offerStatus));
        }

        if (offerType != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("multi", "offerType", offerType));
        }

        if (page != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page", page));
        }

        if (paginationRequired != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("paginationRequired", paginationRequired));
        }

        if (rows != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("rows", rows));
        }

        if (successTrackId != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("multi", "successTrackId", successTrackId));
        }

        if (partnerId != null) {
            localVarHeaderParams.put("partnerId", localVarApiClient.parameterToString(partnerId));
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
    private okhttp3.Call getPartnerOffersSessionsValidateBeforeCall(List<String> customerId, String offerId, List<String> offerStatus, List<String> offerType, Integer page, Boolean paginationRequired, List<Integer> partnerId, Integer rows, List<String> successTrackId, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = getPartnerOffersSessionsCall(customerId, offerId, offerStatus, offerType, page, paginationRequired, partnerId, rows, successTrackId, _callback);
        return localVarCall;

    }

    /**
     * Get Info about Partner Offers Sessions
     * Information about Partner offers sessions - Ask the Experts and Accelerator
     * @param customerId Customer Id&#39;s for filtering the results (optional)
     * @param offerId published Asset Id from Path Params (optional)
     * @param offerStatus Status for filtering the results (optional)
     * @param offerType Asset Type for filtering the results (optional)
     * @param page Page number. Default value is 1 (optional, default to 1)
     * @param paginationRequired Pagination data required flag (optional, default to true)
     * @param partnerId Partner ID for filtering the results (optional)
     * @param rows No of rows in a page. Default value is 10 and the maximum rows allowed per page is 100 (optional, default to 10)
     * @param successTrackId Solution Id field for filtering the results (optional)
     * @return PartnerOfferWithSessions
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
    public PartnerOfferWithSessions getPartnerOffersSessions(List<String> customerId, String offerId, List<String> offerStatus, List<String> offerType, Integer page, Boolean paginationRequired, List<Integer> partnerId, Integer rows, List<String> successTrackId) throws ApiException {
        ApiResponse<PartnerOfferWithSessions> localVarResp = getPartnerOffersSessionsWithHttpInfo(customerId, offerId, offerStatus, offerType, page, paginationRequired, partnerId, rows, successTrackId);
        return localVarResp.getData();
    }

    /**
     * Get Info about Partner Offers Sessions
     * Information about Partner offers sessions - Ask the Experts and Accelerator
     * @param customerId Customer Id&#39;s for filtering the results (optional)
     * @param offerId published Asset Id from Path Params (optional)
     * @param offerStatus Status for filtering the results (optional)
     * @param offerType Asset Type for filtering the results (optional)
     * @param page Page number. Default value is 1 (optional, default to 1)
     * @param paginationRequired Pagination data required flag (optional, default to true)
     * @param partnerId Partner ID for filtering the results (optional)
     * @param rows No of rows in a page. Default value is 10 and the maximum rows allowed per page is 100 (optional, default to 10)
     * @param successTrackId Solution Id field for filtering the results (optional)
     * @return ApiResponse&lt;PartnerOfferWithSessions&gt;
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
    public ApiResponse<PartnerOfferWithSessions> getPartnerOffersSessionsWithHttpInfo(List<String> customerId, String offerId, List<String> offerStatus, List<String> offerType, Integer page, Boolean paginationRequired, List<Integer> partnerId, Integer rows, List<String> successTrackId) throws ApiException {
        okhttp3.Call localVarCall = getPartnerOffersSessionsValidateBeforeCall(customerId, offerId, offerStatus, offerType, page, paginationRequired, partnerId, rows, successTrackId, null);
        Type localVarReturnType = new TypeToken<PartnerOfferWithSessions>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get Info about Partner Offers Sessions (asynchronously)
     * Information about Partner offers sessions - Ask the Experts and Accelerator
     * @param customerId Customer Id&#39;s for filtering the results (optional)
     * @param offerId published Asset Id from Path Params (optional)
     * @param offerStatus Status for filtering the results (optional)
     * @param offerType Asset Type for filtering the results (optional)
     * @param page Page number. Default value is 1 (optional, default to 1)
     * @param paginationRequired Pagination data required flag (optional, default to true)
     * @param partnerId Partner ID for filtering the results (optional)
     * @param rows No of rows in a page. Default value is 10 and the maximum rows allowed per page is 100 (optional, default to 10)
     * @param successTrackId Solution Id field for filtering the results (optional)
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
    public okhttp3.Call getPartnerOffersSessionsAsync(List<String> customerId, String offerId, List<String> offerStatus, List<String> offerType, Integer page, Boolean paginationRequired, List<Integer> partnerId, Integer rows, List<String> successTrackId, final ApiCallback<PartnerOfferWithSessions> _callback) throws ApiException {

        okhttp3.Call localVarCall = getPartnerOffersSessionsValidateBeforeCall(customerId, offerId, offerStatus, offerType, page, paginationRequired, partnerId, rows, successTrackId, _callback);
        Type localVarReturnType = new TypeToken<PartnerOfferWithSessions>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
