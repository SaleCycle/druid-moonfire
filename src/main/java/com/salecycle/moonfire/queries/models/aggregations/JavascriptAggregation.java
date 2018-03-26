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

    public void setFieldNames(List<String> fieldNames) {
        this.fieldNames = fieldNames;
    }

    public String getFnAggregate() {
        return fnAggregate;
    }

    public void setFnAggregate(String fnAggregate) {
        this.fnAggregate = fnAggregate;
    }

    public String getFnCombine() {
        return fnCombine;
    }

    public void setFnCombine(String fnCombine) {
        this.fnCombine = fnCombine;
    }

    public String getFnReset() {
        return fnReset;
    }

    public void setFnReset(String fnReset) {
        this.fnReset = fnReset;
    }
}
