package com.salecycle.moonfire.queries.models.aggregations;

public class LongFirstAggregation extends Aggregation {
    private String fieldName;

    public LongFirstAggregation() {
        setType("longFirst");
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }
}
