
package com.cisco.px.client.api;

import java.time.OffsetDateTime;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import com.cisco.px.client.ApiException;
import com.cisco.px.client.api.PartnerDataApi;
import com.cisco.px.client.model.ContractResponse;
import com.cisco.px.client.model.CustomerResponse;
import com.cisco.px.client.model.ErrorResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PartnerDataApi
 */
@Disabled
public class PartnerDataApiTest {

    private final PartnerDataApi api = new PartnerDataApi();

    /**
     * List of contracts
     *
     * Partner CX contracts transacted in cisco
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getContractsTest() throws ApiException {
        Integer offset = null;
        Integer max = null;
        ContractResponse response = api.getContracts(offset, max);
        // TODO: test validations
    }

    /**
     * List of customers
     *
     * Get list of Customers
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getCustomersTest() throws ApiException {
        Integer offset = null;
        Integer max = null;
        CustomerResponse response = api.getCustomers(offset, max);
        // TODO: test validations
    }

    /**
     * Success Tracks
     *
     * Partner Success Tracks
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getSuccessTracksTest() throws ApiException {
        api.getSuccessTracks();
        // TODO: test validations
    }

}
