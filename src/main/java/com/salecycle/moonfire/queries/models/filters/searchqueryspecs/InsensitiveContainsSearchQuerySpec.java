package com.salecycle.moonfire.queries.models.filters.searchqueryspecs;

public class InsensitiveContainsSearchQuerySpec extends SearchQuerySpec {

    public InsensitiveContainsSearchQuerySpec(String value) {
        super("insensitive_contains", value);
    }
}
