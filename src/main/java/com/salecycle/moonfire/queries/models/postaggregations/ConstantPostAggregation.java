package com.salecycle.moonfire.queries.models.postaggregations;

public class ConstantPostAggregation extends PostAggregation {
    private Number value;

    public ConstantPostAggregation() {
        super("constant");
    }

    public Number getValue() {
        return value;
    }

    public ConstantPostAggregation setValue(Number value) {
        this.value = value;
        return this;
    }
}
