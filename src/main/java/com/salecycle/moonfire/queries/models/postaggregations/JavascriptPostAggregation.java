package com.salecycle.moonfire.queries.models.postaggregations;

import java.util.List;

public class JavascriptPostAggregation extends PostAggregation {
    private List<String> fieldNames;
    private String function;

    public JavascriptPostAggregation() {
        super("javascript");
    }

    public List<String> getFieldNames() {
        return fieldNames;
    }

    public JavascriptPostAggregation setFieldNames(List<String> fieldNames) {
        this.fieldNames = fieldNames;
        return this;
    }

    public String getFunction() {
        return function;
    }

    public JavascriptPostAggregation setFunction(String function) {
        this.function = function;
        return this;
    }
}
