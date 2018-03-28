package com.salecycle.moonfire.results.models.search;

import java.util.ArrayList;
import java.util.List;

public class SearchQueryResult {
    private String timestamp;
    private List<SearchResult> result = new ArrayList<SearchResult>();

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public List<SearchResult> getResult() {
        return result;
    }

    public void setResult(List<SearchResult> result) {
        this.result = result;
    }
}
