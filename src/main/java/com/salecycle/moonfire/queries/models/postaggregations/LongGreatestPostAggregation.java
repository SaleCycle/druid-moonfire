package com.salecycle.moonfire.queries.models.postaggregations;

import java.util.List;

public class LongGreatestPostAggregation extends PostAggregation {
    private List<PostAggregation> fields;

    public LongGreatestPostAggregation() {
        super("longGreatest");
    }

    public List<PostAggregation> getFields() {
        return fields;
    }

    public LongGreatestPostAggregation setFields(List<PostAggregation> fields) {
        this.fields = fields;
        return this;
    }
}
