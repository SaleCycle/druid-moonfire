package com.salecycle.moonfire.queries.models.queryspecs;

public class ContainsSearchQuerySpec extends SearchQuerySpec {
    private boolean caseSentitive;

    public ContainsSearchQuerySpec() {
        setType("contains");
    }

    public boolean isCaseSentitive() {
        return caseSentitive;
    }

    public void setCaseSentitive(boolean caseSentitive) {
        this.caseSentitive = caseSentitive;
    }
}
