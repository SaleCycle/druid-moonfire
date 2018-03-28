package com.salecycle.moonfire.results.models.topn;

import java.util.List;
import java.util.Map;

public class TopNQueryResult {
    private String timestamp;
    private List<Map<String, Object>> result;

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public List<Map<String, Object>> getResult() {
        return result;
    }

    public void setResult(List<Map<String, Object>> result) {
        this.result = result;
    }
}
