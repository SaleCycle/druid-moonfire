package com.salecycle.moonfire.queries.models.filters.searchqueryspecs;

public class FragmentSearchQuerySpec extends SearchQuerySpec {
    private boolean caseSentitive;

    public FragmentSearchQuerySpec() {
        setType("fragment");
    }

    public boolean isCaseSentitive() {
        return caseSentitive;
    }

    public void setCaseSentitive(boolean caseSentitive) {
        this.caseSentitive = caseSentitive;
    }
}
