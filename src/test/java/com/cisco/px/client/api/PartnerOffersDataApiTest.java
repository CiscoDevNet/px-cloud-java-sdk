
package com.cisco.px.client.api;

import java.time.OffsetDateTime;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import com.cisco.px.client.ApiException;
import com.cisco.px.client.api.PartnerOffersDataApi;
import com.cisco.px.client.model.ErrorResponse;
import com.cisco.px.client.model.PartnerOffersInfo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PartnerOffersDataApi
 */
@Disabled
public class PartnerOffersDataApiTest {

    private final PartnerOffersDataApi api = new PartnerOffersDataApi();

    /**
     * Get Partner Offers
     *
     * Partner Offers
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getPartnerOffersTest() throws ApiException {
        List<String> customerId = null;
        List<String> offerStatus = null;
        List<String> offerType = null;
        Integer page = null;
        Boolean paginationRequired = null;
        List<Integer> partnerId = null;
        Integer rows = null;
        List<String> successTrackId = null;
        PartnerOffersInfo response = api.getPartnerOffers(customerId, offerStatus, offerType, page, paginationRequired, partnerId, rows, successTrackId);
        // TODO: test validations
    }

}
