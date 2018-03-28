package com.salecycle.moonfire.queries.models.searchqueryspecs;

public abstract class SearchQuerySpec {
    private String type;

    public String getType() {
        return type;
    }

    protected void setType(String type) {
        this.type = type;
    }
}
