package com.salecycle.moonfire.queries.models.aggregations;

public class FloatFirstAggregation extends Aggregation {
    private String fieldName;

    public FloatFirstAggregation() {
        setType("floatFirst");
    }

    public String getFieldName() {
        return fieldName;
    }

    public FloatFirstAggregation setFieldName(String fieldName) {
        this.fieldName = fieldName;
        return this;
    }
}
