package com.salecycle.moonfire.queries.models.extractionfunctions;

public class PartialExtractionFunction extends ExtractionFunction {
    private String expr;

    public PartialExtractionFunction() {
        setType("partial");
    }

    public String getExpr() {
        return expr;
    }

    public void setExpr(String expr) {
        this.expr = expr;
    }
}
