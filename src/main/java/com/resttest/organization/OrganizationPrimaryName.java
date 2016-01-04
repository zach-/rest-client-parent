package com.resttest.organization;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Zach Bricker on 03/12/14.
 */
public class OrganizationPrimaryName {
    @JsonProperty("OrganizationName")
    private String OrganizationName;

    public String getOrganizationName() {
        return OrganizationName;
    }

    public void setOrganizationName(String organizationName) {
        OrganizationName = organizationName;
    }
}
