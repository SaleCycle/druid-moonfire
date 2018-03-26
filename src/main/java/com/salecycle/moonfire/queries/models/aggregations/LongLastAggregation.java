package com.salecycle.moonfire.queries.models.aggregations;

public class LongLastAggregation extends Aggregation {
    private String fieldName;

    public LongLastAggregation() {
        setType("longLast");
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }
}
