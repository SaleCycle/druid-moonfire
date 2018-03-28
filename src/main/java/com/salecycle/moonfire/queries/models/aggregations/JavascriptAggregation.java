package com.salecycle.moonfire.queries.models.aggregations;

import java.util.List;

public class JavascriptAggregation extends Aggregation {
    private List<String> fieldNames;
    private String fnAggregate;
    private String fnCombine;
    private String fnReset;

    public JavascriptAggregation() {
        setType("javascript");
    }

    public List<String> getFieldNames() {
        return fieldNames;
    }

    public JavascriptAggregation setFieldNames(List<String> fieldNames) {
        this.fieldNames = fieldNames;
        return this;
    }

    public String getFnAggregate() {
        return fnAggregate;
    }

    public JavascriptAggregation setFnAggregate(String fnAggregate) {
        this.fnAggregate = fnAggregate;
        return this;
    }

    public String getFnCombine() {
        return fnCombine;
    }

    public JavascriptAggregation setFnCombine(String fnCombine) {
        this.fnCombine = fnCombine;
        return this;
    }

    public String getFnReset() {
        return fnReset;
    }

    public JavascriptAggregation setFnReset(String fnReset) {
        this.fnReset = fnReset;
        return this;
    }
}
