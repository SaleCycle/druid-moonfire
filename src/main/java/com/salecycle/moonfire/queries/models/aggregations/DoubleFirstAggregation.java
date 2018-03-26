package com.salecycle.moonfire.queries.models.aggregations;

public class DoubleFirstAggregation extends Aggregation {
    private String fieldName;

    public DoubleFirstAggregation() {
        setType("doubleFirst");
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }
}
