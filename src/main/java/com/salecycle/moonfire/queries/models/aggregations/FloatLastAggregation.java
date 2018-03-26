package com.salecycle.moonfire.queries.models.aggregations;

public class FloatLastAggregation extends Aggregation {
    private String fieldName;

    public FloatLastAggregation() {
        setType("floatLast");
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }
}
