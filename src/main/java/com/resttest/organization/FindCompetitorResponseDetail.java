package com.resttest.organization;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Zach Bricker on 03/12/14.
 */

public class FindCompetitorResponseDetail {

    @JsonProperty("Competitor")
    private List<Competitor> Competitor = new ArrayList<Competitor>();

    @JsonProperty("InquiryReferenceDetail")
    private com.resttest.organization.InquiryReferenceDetail InquiryReferenceDetail;



    public List<Competitor> getCompetitor() {
        return Competitor;
    }

    public void setCompetitor(List<Competitor> competitor) {
        this.Competitor = competitor;
    }

    public com.resttest.organization.InquiryReferenceDetail getInquiryReferenceDetail() {
        return InquiryReferenceDetail;
    }

    public void setInquiryReferenceDetail(com.resttest.organization.InquiryReferenceDetail inquiryReferenceDetail) {
        InquiryReferenceDetail = inquiryReferenceDetail;
    }
}
