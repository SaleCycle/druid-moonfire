package com.salecycle.moonfire.queries.models.searchqueryspecs;

public class ContainsSearchQuerySpec extends SearchQuerySpec {
    private String value;
    private boolean case_sensitive = true;

    public ContainsSearchQuerySpec() {
        setType("contains");
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public boolean isCase_sensitive() {
        return case_sensitive;
    }

    public void setCase_sensitive(boolean case_sensitive) {
        this.case_sensitive = case_sensitive;
    }
}
