
package com.cisco.px.client.api;

import java.time.OffsetDateTime;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import com.cisco.px.client.ApiException;
import com.cisco.px.client.api.ContractsDataApi;
import com.cisco.px.client.model.ContractsErrorResponse;
import com.cisco.px.client.model.DataPaginationResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ContractsDataApi
 */
@Disabled
public class ContractsDataApiTest {

    private final ContractsDataApi api = new ContractsDataApi();

    /**
     * Get the list of contracts summary
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void fetchContractsSummaryUsingGETTest() throws ApiException {
        Integer successTrackId = null;
        Integer puid = null;
        String customerId = null;
        String guName = null;
        Integer limit = null;
        Integer offset = null;
        DataPaginationResponse response = api.fetchContractsSummaryUsingGET(successTrackId, puid, customerId, guName, limit, offset);
        // TODO: test validations
    }

}
