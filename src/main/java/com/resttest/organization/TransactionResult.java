package com.resttest.organization;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Zach Bricker on 03/12/14.
 */
public class TransactionResult {
    @JsonProperty("SeverityText")
    private String SeverityText;

    @JsonProperty("ResultID")
    private String ResultID;

    @JsonProperty("ResultText")
    private String ResultText;

    public String getSeverityText() {
        return SeverityText;
    }

    public void setSeverityText(String severityText) {
        SeverityText = severityText;
    }

    public String getResultID() {
        return ResultID;
    }

    public void setResultID(String resultID) {
        ResultID = resultID;
    }

    public String getResultText() {
        return ResultText;
    }

    public void setResultText(String resultText) {
        ResultText = resultText;
    }
}
