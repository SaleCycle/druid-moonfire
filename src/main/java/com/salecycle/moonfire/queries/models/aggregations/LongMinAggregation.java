package com.salecycle.moonfire.queries.models.aggregations;

public class LongMinAggregation extends Aggregation {
    private String fieldName;

    public LongMinAggregation() {
        setType("longMin");
    }

    public String getFieldName() {
        return fieldName;
    }

    public LongMinAggregation setFieldName(String fieldName) {
        this.fieldName = fieldName;
        return this;
    }
}
