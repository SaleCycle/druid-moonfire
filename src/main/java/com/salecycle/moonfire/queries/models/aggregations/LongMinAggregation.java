package com.salecycle.moonfire.queries.models.aggregations;

public class LongMinAggregation extends Aggregation {
    private String fieldName;

    public LongMinAggregation() {
        setType("longMin");
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }
}
