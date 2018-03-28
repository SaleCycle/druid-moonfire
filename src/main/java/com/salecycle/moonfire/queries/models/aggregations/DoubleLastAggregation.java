package com.salecycle.moonfire.queries.models.aggregations;

public class DoubleLastAggregation extends Aggregation {
    private String fieldName;

    public DoubleLastAggregation() {
        super("doubleLast");
    }

    public String getFieldName() {
        return fieldName;
    }

    public DoubleLastAggregation setFieldName(String fieldName) {
        this.fieldName = fieldName;
        return this;
    }
}
