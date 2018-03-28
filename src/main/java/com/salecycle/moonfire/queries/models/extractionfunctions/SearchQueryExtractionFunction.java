package com.salecycle.moonfire.queries.models.extractionfunctions;

public class SearchQueryExtractionFunction extends ExtractionFunction {
    private String query;

    public SearchQueryExtractionFunction() {
        super("searchQuery");
    }

    public String getQuery() {
        return query;
    }

    public SearchQueryExtractionFunction setQuery(String query) {
        this.query = query;
        return this;
    }
}
