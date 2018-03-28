package com.salecycle.moonfire.queries.models.filters;

import java.util.ArrayList;
import java.util.List;

public class AndFilter extends Filter {
    private List<Filter> fields = new ArrayList<Filter>();

    public AndFilter() {
        super("and");
    }

    public List<Filter> getFields() {
        return fields;
    }

    public AndFilter setFields(List<Filter> fields) {
        this.fields = fields;
        return this;
    }

    public AndFilter addField(Filter field) {
        this.fields.add(field);
        return this;
    }
}
