package com.salecycle.moonfire.queries.models.filters.searchqueryspecs;

public class FragmentSearchQuerySpec extends SearchQuerySpec {
    private boolean caseSentitive;

    public FragmentSearchQuerySpec(String value) {
        super("fragment", value);
    }

    public boolean isCaseSentitive() {
        return caseSentitive;
    }

    public FragmentSearchQuerySpec setCaseSentitive(boolean caseSentitive) {
        this.caseSentitive = caseSentitive;
        return this;
    }
}
