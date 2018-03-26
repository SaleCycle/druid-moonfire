package com.salecycle.moonfire.queries.models.aggregations;

public class FloatSumAggregation extends Aggregation {
    private String fieldName;

    public FloatSumAggregation() {
        setType("floatSum");
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }
}
