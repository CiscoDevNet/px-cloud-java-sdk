
package com.cisco.px.client.api;

import java.time.OffsetDateTime;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import com.cisco.px.client.ApiException;
import com.cisco.px.client.api.CustomerDataApi;
import com.cisco.px.client.model.ContractsErrorResponse;
import com.cisco.px.client.model.DataPaginationResponse;
import com.cisco.px.client.model.ErrorResponse;
import com.cisco.px.client.model.RacetrackBuid;
import com.cisco.px.client.model.Report;
import com.cisco.px.client.model.ReportStatus;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CustomerDataApi
 */
@Disabled
public class CustomerDataApiTest {

    private final CustomerDataApi api = new CustomerDataApi();

    /**
     * Get the list of contracts Details from flat table. It supports pagination , filtering and sorting
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void fetchContractsDetailsUsingGETTest() throws ApiException {
        Integer contractNumber = null;
        Integer puid = null;
        String componentType = null;
        String customerId = null;
        Integer limit = null;
        Integer offset = null;
        Long successTrackId = null;
        DataPaginationResponse response = api.fetchContractsDetailsUsingGET(contractNumber, puid, componentType, customerId, limit, offset, successTrackId);
        // TODO: test validations
    }

    /**
     * Get the report
     *
     * Provides the status of resource. The status API provides additional info about the progress of the report. Partner application should poll periodically to get status of the report. When the report is complete the API responds with the 303 status pointing to final report in the Location header.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getCustomerReportTest() throws ApiException {
        String reportId = null;
        String customerId = null;
        List<ReportStatus> response = api.getCustomerReport(reportId, customerId);
        // TODO: test validations
    }

    /**
     * Get customer lifecycle
     *
     * Get customer lifecycle which will provide the CX solution, use case and pitstop information for the customer
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getCustomersLifeCycleTest() throws ApiException {
        String successTrackId = null;
        String customerId = null;
        RacetrackBuid response = api.getCustomersLifeCycle(successTrackId, customerId);
        // TODO: test validations
    }

    /**
     * Request customer data reports as bulk files
     *
     * Request customer data report. Creating a request for customer data sets like Assets, Hardware, Software and Advisories bulk json files
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void requestCustomerReportTest() throws ApiException {
        String customerId = null;
        Report report = null;
        api.requestCustomerReport(customerId, report);
        // TODO: test validations
    }

}
