package com.resttest.organization;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Zach Bricker on 03/12/14.
 *
 */
//this annotation is required to prevent from unexpected crash if schema changes
@JsonIgnoreProperties(ignoreUnknown = true)
public class FindCompetitorResponse {
    @JsonProperty("@ServiceVersionNumber")
   private String serviceVersion;

    @JsonProperty("TransactionDetail")
    private TransactionDetail TransactionDetail;
    @JsonProperty("TransactionResult")
    private TransactionResult TransactionResult;

    @JsonProperty("FindCompetitorResponseDetail")
    FindCompetitorResponseDetail FindCompetitorResponseDetail;

    public FindCompetitorResponseDetail getFindCompetitorResponseDetail() {
        return FindCompetitorResponseDetail;
    }

    public void setFindCompetitorResponseDetail(FindCompetitorResponseDetail findCompetitorResponseDetail) {
        this.FindCompetitorResponseDetail = findCompetitorResponseDetail;
    }

    public String getServiceVersion() {
        return serviceVersion;
    }

    public void setServiceVersion(String serviceVersion) {
        this.serviceVersion = serviceVersion;
    }

    public TransactionDetail getTransactionDetail() {
        return TransactionDetail;
    }

    public void setTransactionDetail(TransactionDetail transactionDetail) {
        TransactionDetail = transactionDetail;
    }

    public TransactionResult getTransactionResult() {
        return TransactionResult;
    }

    public void setTransactionResult(TransactionResult transactionResult) {
        TransactionResult = transactionResult;
    }
}
