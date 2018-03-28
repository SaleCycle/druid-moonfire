package com.salecycle.moonfire.queries.models.aggregations;

public class FloatSumAggregation extends Aggregation {
    private String fieldName;

    public FloatSumAggregation() {
        super("floatSum");
    }

    public String getFieldName() {
        return fieldName;
    }

    public FloatSumAggregation setFieldName(String fieldName) {
        this.fieldName = fieldName;
        return this;
    }
}
