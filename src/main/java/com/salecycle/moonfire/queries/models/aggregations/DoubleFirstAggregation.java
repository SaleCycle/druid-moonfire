package com.salecycle.moonfire.queries.models.aggregations;

public class DoubleFirstAggregation extends Aggregation {
    private String fieldName;

    public DoubleFirstAggregation() {
        super("doubleFirst");
    }

    public String getFieldName() {
        return fieldName;
    }

    public DoubleFirstAggregation setFieldName(String fieldName) {
        this.fieldName = fieldName;
        return this;
    }
}
