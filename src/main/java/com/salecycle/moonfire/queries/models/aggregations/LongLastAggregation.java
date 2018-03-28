package com.salecycle.moonfire.queries.models.aggregations;

public class LongLastAggregation extends Aggregation {
    private String fieldName;

    public LongLastAggregation() {
        super("longLast");
    }

    public String getFieldName() {
        return fieldName;
    }

    public LongLastAggregation setFieldName(String fieldName) {
        this.fieldName = fieldName;
        return this;
    }
}
