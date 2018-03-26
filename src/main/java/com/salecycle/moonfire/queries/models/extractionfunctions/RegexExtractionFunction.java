package com.salecycle.moonfire.queries.models.extractionfunctions;

public class RegexExtractionFunction extends ExtractionFunction {
    private String expr;
    private long index;
    private boolean replaceMissingValue;
    private String replaceMissingValueWith;

    public RegexExtractionFunction() {
        setType("regex");
    }

    public String getExpr() {
        return expr;
    }

    public void setExpr(String expr) {
        this.expr = expr;
    }

    public long getIndex() {
        return index;
    }

    public void setIndex(long index) {
        this.index = index;
    }

    public boolean isReplaceMissingValue() {
        return replaceMissingValue;
    }

    public void setReplaceMissingValue(boolean replaceMissingValue) {
        this.replaceMissingValue = replaceMissingValue;
    }

    public String getReplaceMissingValueWith() {
        return replaceMissingValueWith;
    }

    public void setReplaceMissingValueWith(String replaceMissingValueWith) {
        this.replaceMissingValueWith = replaceMissingValueWith;
    }
}
