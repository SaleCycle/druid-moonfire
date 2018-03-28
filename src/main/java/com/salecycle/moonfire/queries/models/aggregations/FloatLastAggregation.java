package com.salecycle.moonfire.queries.models.aggregations;

public class FloatLastAggregation extends Aggregation {
    private String fieldName;

    public FloatLastAggregation() {
        super("floatLast");
    }

    public String getFieldName() {
        return fieldName;
    }

    public FloatLastAggregation setFieldName(String fieldName) {
        this.fieldName = fieldName;
        return this;
    }
}
