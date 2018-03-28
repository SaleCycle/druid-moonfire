package com.salecycle.moonfire.queries.models.filters.searchqueryspecs;

public class ContainsSearchQuerySpec extends SearchQuerySpec {
    private boolean caseSentitive;

    public ContainsSearchQuerySpec() {
        setType("contains");
    }

    public boolean isCaseSentitive() {
        return caseSentitive;
    }

    public ContainsSearchQuerySpec setCaseSentitive(boolean caseSentitive) {
        this.caseSentitive = caseSentitive;
        return this;
    }
}
