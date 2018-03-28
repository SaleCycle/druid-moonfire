package com.salecycle.moonfire.queries.models.aggregations;

public class DoubleMaxAggregation extends Aggregation {
    private String fieldName;

    public DoubleMaxAggregation() {
        setType("doubleMax");
    }

    public String getFieldName() {
        return fieldName;
    }

    public DoubleMaxAggregation setFieldName(String fieldName) {
        this.fieldName = fieldName;
        return this;
    }
}
