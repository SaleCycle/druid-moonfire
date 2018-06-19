package com.salecycle.moonfire.queries.models.filters;

import java.util.ArrayList;
import java.util.List;

public class OrFilter extends Filter {
    private List<Filter> fields = new ArrayList<Filter>();

    public OrFilter() {
        super("or");
    }

    public List<Filter> getFields() {
        return fields;
    }

    public OrFilter setFields(List<Filter> fields) {
        this.fields = fields;
        return this;
    }

    public OrFilter addField(Filter field) {
        this.fields.add(field);
        return this;
    }
}
