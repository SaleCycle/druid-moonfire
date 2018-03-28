package com.salecycle.moonfire.queries.models.postaggregations;

public class FinalizingFieldAccessPostAggregation extends PostAggregation {
    private String fieldName;

    public FinalizingFieldAccessPostAggregation() {
        setType("finalizingFieldAccess");
    }

    public String getFieldName() {
        return fieldName;
    }

    public FinalizingFieldAccessPostAggregation setFieldName(String fieldName) {
        this.fieldName = fieldName;
        return this;
    }
}
