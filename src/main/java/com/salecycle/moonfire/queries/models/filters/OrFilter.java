package com.salecycle.moonfire.queries.models.filters;

import java.util.ArrayList;
import java.util.List;

public class OrFilter extends Filter {
    private List<Filter> fields = new ArrayList<Filter>();

    public OrFilter() {
        setType("or");
    }

    public List<Filter> getFields() {
        return fields;
    }

    public void setFields(List<Filter> fields) {
        this.fields = fields;
    }
}
