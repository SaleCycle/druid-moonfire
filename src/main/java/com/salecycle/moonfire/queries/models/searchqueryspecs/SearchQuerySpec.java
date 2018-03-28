package com.salecycle.moonfire.queries.models.searchqueryspecs;

public abstract class SearchQuerySpec {
    private String type;

    protected SearchQuerySpec(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
