package com.salecycle.moonfire.results.models.timeboundary;

public class TimeBoundaryQueryResult {
    private String timestamp;
    private TimeBoundaryResult result;

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public TimeBoundaryResult getResult() {
        return result;
    }

    public void setResult(TimeBoundaryResult result) {
        this.result = result;
    }
}
