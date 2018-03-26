package com.salecycle.moonfire.queries.models.aggregations;

public class DoubleSumAggregation extends Aggregation {
    private String fieldName;

    public DoubleSumAggregation() {
        setType("doubleSum");
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }
}
