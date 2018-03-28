package com.salecycle.moonfire.queries.models.aggregations;

public class LongMaxAggregation extends Aggregation {
    private String fieldName;

    public LongMaxAggregation() {
        super("longMax");
    }

    public String getFieldName() {
        return fieldName;
    }

    public LongMaxAggregation setFieldName(String fieldName) {
        this.fieldName = fieldName;
        return this;
    }
}
