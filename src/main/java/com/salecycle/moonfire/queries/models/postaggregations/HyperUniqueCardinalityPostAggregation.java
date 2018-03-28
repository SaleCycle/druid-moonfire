package com.salecycle.moonfire.queries.models.postaggregations;

public class HyperUniqueCardinalityPostAggregation extends PostAggregation {
    private String fieldName;

    public HyperUniqueCardinalityPostAggregation() {
        setType("hyperUniqueCardinality");
    }

    public String getFieldName() {
        return fieldName;
    }

    public HyperUniqueCardinalityPostAggregation setFieldName(String fieldName) {
        this.fieldName = fieldName;
        return this;
    }
}
