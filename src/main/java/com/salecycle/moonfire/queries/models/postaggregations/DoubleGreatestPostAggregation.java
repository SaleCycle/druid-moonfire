package com.salecycle.moonfire.queries.models.postaggregations;

import java.util.List;

public class DoubleGreatestPostAggregation extends PostAggregation {
    private List<PostAggregation> fields;

    public DoubleGreatestPostAggregation() {
        super("doubleGreatest");
    }

    public List<PostAggregation> getFields() {
        return fields;
    }

    public DoubleGreatestPostAggregation setFields(List<PostAggregation> fields) {
        this.fields = fields;
        return this;
    }
}
