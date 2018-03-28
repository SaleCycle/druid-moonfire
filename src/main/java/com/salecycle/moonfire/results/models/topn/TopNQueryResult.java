package com.salecycle.moonfire.results.models.topn;

import java.util.Map;

public class TopNQueryResult {
    private String timestamp;
    private Map<String, Object> result;

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public Map<String, Object> getResult() {
        return result;
    }

    public void setResult(Map<String, Object> result) {
        this.result = result;
    }
}
