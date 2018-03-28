package com.salecycle.moonfire.queries.models.postaggregations;

public class FieldAccessPostAggregation extends PostAggregation {
    private String fieldName;

    public FieldAccessPostAggregation() {
        super("fieldAccess");
    }

    public String getFieldName() {
        return fieldName;
    }

    public FieldAccessPostAggregation setFieldName(String fieldName) {
        this.fieldName = fieldName;
        return this;
    }
}
