package com.salecycle.moonfire.queries.models.postaggregations;

import java.util.List;

public class DoubleLeastPostAggregation extends PostAggregation {
    private List<PostAggregation> fields;

    public DoubleLeastPostAggregation() {
        setType("doubleLeast");
    }

    public List<PostAggregation> getFields() {
        return fields;
    }

    public DoubleLeastPostAggregation setFields(List<PostAggregation> fields) {
        this.fields = fields;
        return this;
    }
}
