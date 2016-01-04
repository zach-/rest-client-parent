package com.resttest.organization;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Zach Bricker on 03/12/14.
 */
public class TransactionDetail {
    @JsonProperty("ServiceTransactionID")
    private String ServiceTransactionID;
    @JsonProperty("TransactionTimestamp")
    private String TransactionTimestamp;

    @JsonProperty("ApplicationTransactionID")
    private String ApplicationTransactionID;

    public String getServiceTransactionID() {
        return ServiceTransactionID;
    }

    public void setServiceTransactionID(String serviceTransactionID) {
        ServiceTransactionID = serviceTransactionID;
    }

    public String getTransactionTimestamp() {
        return TransactionTimestamp;
    }

    public void setTransactionTimestamp(String transactionTimestamp) {
        TransactionTimestamp = transactionTimestamp;
    }

    public String getApplicationTransactionID() {
        return ApplicationTransactionID;
    }

    public void setApplicationTransactionID(String applicationTransactionID) {
        ApplicationTransactionID = applicationTransactionID;
    }
}
