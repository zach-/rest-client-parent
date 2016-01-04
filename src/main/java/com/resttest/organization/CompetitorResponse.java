package com.resttest.organization;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Zach Bricker on 03/12/14.
 */
public class CompetitorResponse {
    @JsonProperty("FindCompetitorResponse")
    private FindCompetitorResponse findCompetitorResponse;

    public FindCompetitorResponse getFindCompetitorResponse() {
        return findCompetitorResponse;
    }

    public void setFindCompetitorResponse(FindCompetitorResponse findCompetitorResponse) {
        this.findCompetitorResponse = findCompetitorResponse;
    }

}
