package com.salecycle.moonfire.queries.models.filters.searchqueryspecs;

public abstract class SearchQuerySpec {
    private String type;
    private String value;

    protected SearchQuerySpec(String type, String value) {
        this.type = type;
        this.value = value;
    }

    public String getType() {
        return type;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
