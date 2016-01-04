package com.resttest.organization;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Zach Bricker on 03/12/14.
 */
public class InquiryReferenceDetail {
    @JsonProperty("CustomerReferenceText")
    private String[] CustomerReferenceText;
    @JsonProperty("CustomerBillingEndorsementText")
    private String CustomerBillingEndorsementText;

    public String[] getCustomerReferenceText() {
        return CustomerReferenceText;
    }

    public void setCustomerReferenceText(String[] customerReferenceText) {
        CustomerReferenceText = customerReferenceText;
    }

    public String getCustomerBillingEndorsementText() {
        return CustomerBillingEndorsementText;
    }

    public void setCustomerBillingEndorsementText(String customerBillingEndorsementText) {
        CustomerBillingEndorsementText = customerBillingEndorsementText;
    }
}
