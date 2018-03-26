package com.salecycle.moonfire.queries.models.aggregations;

public class LongSumAggregation extends Aggregation {
    private String fieldName;

    public LongSumAggregation() {
        setType("longSum");
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }
}
