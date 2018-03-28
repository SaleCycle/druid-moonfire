package com.salecycle.moonfire.queries.models.searchqueryspecs;

public class ContainsSearchQuerySpec extends SearchQuerySpec {
    private String value;
    private boolean case_sensitive = true;

    public ContainsSearchQuerySpec() {
        super("contains");
    }

    public String getValue() {
        return value;
    }

    public ContainsSearchQuerySpec setValue(String value) {
        this.value = value;
        return this;
    }

    public boolean isCase_sensitive() {
        return case_sensitive;
    }

    public ContainsSearchQuerySpec setCase_sensitive(boolean case_sensitive) {
        this.case_sensitive = case_sensitive;
        return this;
    }
}
