package com.salecycle.moonfire.queries.models.aggregations;

public class FloatMaxAggregation extends Aggregation {
    private String fieldName;

    public FloatMaxAggregation() {
        setType("floatMax");
    }

    public String getFieldName() {
        return fieldName;
    }

    public FloatMaxAggregation setFieldName(String fieldName) {
        this.fieldName = fieldName;
        return this;
    }
}
