package com.salecycle.moonfire.queries.models.aggregations;

public class DoubleSumAggregation extends Aggregation {
    private String fieldName;

    public DoubleSumAggregation() {
        super("doubleSum");
    }

    public String getFieldName() {
        return fieldName;
    }

    public DoubleSumAggregation setFieldName(String fieldName) {
        this.fieldName = fieldName;
        return this;
    }
}
