package com.salecycle.moonfire.queries.models.postaggregations;

import java.util.List;

public class LongGreatestPostAggregation extends PostAggregation {
    private List<PostAggregation> fields;

    public LongGreatestPostAggregation() {
        setType("longGreatest");
    }

    public List<PostAggregation> getFields() {
        return fields;
    }

    public void setFields(List<PostAggregation> fields) {
        this.fields = fields;
    }
}
