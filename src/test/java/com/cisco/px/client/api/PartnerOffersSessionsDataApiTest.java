
package com.cisco.px.client.api;

import java.time.OffsetDateTime;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import com.cisco.px.client.ApiException;
import com.cisco.px.client.api.PartnerOffersSessionsDataApi;
import com.cisco.px.client.model.ErrorResponse;
import com.cisco.px.client.model.PartnerOfferWithSessions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PartnerOffersSessionsDataApi
 */
@Disabled
public class PartnerOffersSessionsDataApiTest {

    private final PartnerOffersSessionsDataApi api = new PartnerOffersSessionsDataApi();

    /**
     * Get Info about Partner Offers Sessions
     *
     * Information about Partner offers sessions - Ask the Experts and Accelerator
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getPartnerOffersSessionsTest() throws ApiException {
        List<String> customerId = null;
        String offerId = null;
        List<String> offerStatus = null;
        List<String> offerType = null;
        Integer page = null;
        Boolean paginationRequired = null;
        List<Integer> partnerId = null;
        Integer rows = null;
        List<String> successTrackId = null;
        PartnerOfferWithSessions response = api.getPartnerOffersSessions(customerId, offerId, offerStatus, offerType, page, paginationRequired, partnerId, rows, successTrackId);
        // TODO: test validations
    }

}
