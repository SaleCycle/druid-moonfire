package com.salecycle.moonfire.queries.models.extractionfunctions;

public class SearchQueryExtractionFunction extends ExtractionFunction {
    private String query;

    public SearchQueryExtractionFunction() {
        setType("searchQuery");
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }
}
