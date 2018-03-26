package com.salecycle.moonfire.queries.models.postaggregations;

public class FieldAccessPostAggregation extends PostAggregation {
    private String fieldName;

    public FieldAccessPostAggregation() {
        setType("fieldAccess");
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }
}
