package com.salecycle.moonfire.queries.models.postaggregations;

import java.util.List;

public class ArithmeticPostAggregation extends PostAggregation {
    private String fn;
    private List<PostAggregation> fields;
    private Ordering ordering;

    public ArithmeticPostAggregation() {
        setType("arithmetic");
    }

    public String getFn() {
        return fn;
    }

    public void setFn(String fn) {
        this.fn = fn;
    }

    public List<PostAggregation> getFields() {
        return fields;
    }

    public void setFields(List<PostAggregation> fields) {
        this.fields = fields;
    }

    public Ordering getOrdering() {
        return ordering;
    }

    public void setOrdering(Ordering ordering) {
        this.ordering = ordering;
    }
}
