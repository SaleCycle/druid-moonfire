package com.salecycle.moonfire.queries.models.aggregations;

public class DoubleMinAggregation extends Aggregation {
    private String fieldName;

    public DoubleMinAggregation() {
        super("doubleMin");
    }

    public String getFieldName() {
        return fieldName;
    }

    public DoubleMinAggregation setFieldName(String fieldName) {
        this.fieldName = fieldName;
        return this;
    }
}
