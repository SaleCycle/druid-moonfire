package com.salecycle.moonfire.queries.models.postaggregations;

import java.util.List;

public class JavascriptPostAggregation extends PostAggregation {
    private List<String> fieldNames;
    private String function;

    public JavascriptPostAggregation() {
        setType("javascript");
    }

    public List<String> getFieldNames() {
        return fieldNames;
    }

    public void setFieldNames(List<String> fieldNames) {
        this.fieldNames = fieldNames;
    }

    public String getFunction() {
        return function;
    }

    public void setFunction(String function) {
        this.function = function;
    }
}
