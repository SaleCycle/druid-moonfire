package com.salecycle.moonfire.queries.models.searchqueryspecs;

import java.util.ArrayList;
import java.util.List;

public class FragmentSearchQuerySpec extends SearchQuerySpec {
    private boolean case_sensitive;
    private List<String> values = new ArrayList<String>();

    public FragmentSearchQuerySpec() {
        setType("fragment");
    }

    public boolean isCase_sensitive() {
        return case_sensitive;
    }

    public FragmentSearchQuerySpec setCase_sensitive(boolean case_sensitive) {
        this.case_sensitive = case_sensitive;
        return this;
    }

    public List<String> getValues() {
        return values;
    }

    public FragmentSearchQuerySpec setValues(List<String> values) {
        this.values = values;
        return this;
    }
}
