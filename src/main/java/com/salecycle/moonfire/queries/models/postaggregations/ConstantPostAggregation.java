package com.salecycle.moonfire.queries.models.postaggregations;

public class ConstantPostAggregation extends PostAggregation {
    private Number value;

    public ConstantPostAggregation() {
        setType("constant");
    }

    public Number getValue() {
        return value;
    }

    public void setValue(Number value) {
        this.value = value;
    }
}
