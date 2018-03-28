package com.salecycle.moonfire.queries.models.aggregations;

public class FloatMinAggregation extends Aggregation {
    private String fieldName;

    public FloatMinAggregation() {
        setType("floatMin");
    }

    public String getFieldName() {
        return fieldName;
    }

    public FloatMinAggregation setFieldName(String fieldName) {
        this.fieldName = fieldName;
        return this;
    }
}
