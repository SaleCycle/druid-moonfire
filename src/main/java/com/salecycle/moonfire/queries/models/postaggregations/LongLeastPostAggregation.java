package com.salecycle.moonfire.queries.models.postaggregations;

import java.util.List;

public class LongLeastPostAggregation extends PostAggregation {
    private List<PostAggregation> fields;

    public LongLeastPostAggregation() {
        setType("longLeast");
    }

    public List<PostAggregation> getFields() {
        return fields;
    }

    public void setFields(List<PostAggregation> fields) {
        this.fields = fields;
    }
}
