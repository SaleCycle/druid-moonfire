package com.salecycle.moonfire.queries.models.postaggregations;

import java.util.List;

public class ArithmeticPostAggregation extends PostAggregation {
    private String fn;
    private List<PostAggregation> fields;
    private Ordering ordering;

    public ArithmeticPostAggregation() {
        super("arithmetic");
    }

    public String getFn() {
        return fn;
    }

    public ArithmeticPostAggregation setFn(String fn) {
        this.fn = fn;
        return this;
    }

    public List<PostAggregation> getFields() {
        return fields;
    }

    public ArithmeticPostAggregation setFields(List<PostAggregation> fields) {
        this.fields = fields;
        return this;
    }

    public Ordering getOrdering() {
        return ordering;
    }

    public ArithmeticPostAggregation setOrdering(Ordering ordering) {
        this.ordering = ordering;
        return this;
    }
}
