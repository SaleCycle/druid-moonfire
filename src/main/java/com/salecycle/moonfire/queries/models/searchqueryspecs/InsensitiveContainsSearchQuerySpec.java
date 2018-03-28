package com.salecycle.moonfire.queries.models.searchqueryspecs;

public class InsensitiveContainsSearchQuerySpec extends SearchQuerySpec {
    private String value;

    public InsensitiveContainsSearchQuerySpec() {
        setType("insensitive_contains");
    }

    public String getValue() {
        return value;
    }

    public InsensitiveContainsSearchQuerySpec setValue(String value) {
        this.value = value;
        return this;
    }
}
