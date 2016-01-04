package com.resttest.organization;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.Map;

/**
 * @author Zach Bricker on 03/12/14.
 */
public class Competitor {
    @JsonProperty("DUNSNumber")
    private String DUNSNumber;

    @JsonProperty("OrganizationPrimaryName")
    private Map<String, Object> OrganizationPrimaryName;

    @JsonProperty("GlobalUltimateDUNSNumber")
    private String GlobalUltimateDUNSNumber;

    @JsonProperty("ParentDUNSNumber")
    private String ParentDUNSNumber;


    @JsonProperty("TopCompetitorIndicator")
    private boolean TopCompetitorIndicator;

    @JsonProperty("PrimaryAddress")
    private PrimaryAddress PrimaryAddress;

    @JsonProperty("SalesRevenueAmount")
    private List<Map<String, Object>> SalesRevenueAmount;

    public String getDUNSNumber() {
        return DUNSNumber;
    }

    public void setDUNSNumber(String DUNSNumber) {
        this.DUNSNumber = DUNSNumber;
    }

    public Map<String, Object> getOrganizationPrimaryName() {
        return OrganizationPrimaryName;
    }

    public void setOrganizationPrimaryName(Map<String, Object> organizationPrimaryName) {
        OrganizationPrimaryName = organizationPrimaryName;
    }

    public String getGlobalUltimateDUNSNumber() {
        return GlobalUltimateDUNSNumber;
    }

    public void setGlobalUltimateDUNSNumber(String globalUltimateDUNSNumber) {
        GlobalUltimateDUNSNumber = globalUltimateDUNSNumber;
    }

    public String getParentDUNSNumber() {
        return ParentDUNSNumber;
    }

    public void setParentDUNSNumber(String parentDUNSNumber) {
        ParentDUNSNumber = parentDUNSNumber;
    }

    public List<Map<String, Object>> getSalesRevenueAmount() {
        return SalesRevenueAmount;
    }

    public void setSalesRevenueAmount(List<Map<String, Object>> salesRevenueAmount) {
        SalesRevenueAmount = salesRevenueAmount;
    }

    public boolean isTopCompetitorIndicator() {
        return TopCompetitorIndicator;
    }

    public void setTopCompetitorIndicator(boolean topCompetitorIndicator) {
        TopCompetitorIndicator = topCompetitorIndicator;
    }

    public PrimaryAddress getPrimaryAddress() {
        return PrimaryAddress;
    }

    public void setPrimaryAddress(PrimaryAddress primaryAddress) {
        PrimaryAddress = primaryAddress;
    }
}
