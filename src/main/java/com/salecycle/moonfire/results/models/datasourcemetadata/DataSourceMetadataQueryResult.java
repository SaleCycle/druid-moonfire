package com.salecycle.moonfire.results.models.datasourcemetadata;

public class DataSourceMetadataQueryResult {
    private String timestamp;
    private DataSourceMetadataResult result;

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public DataSourceMetadataResult getResult() {
        return result;
    }

    public void setResult(DataSourceMetadataResult result) {
        this.result = result;
    }
}
