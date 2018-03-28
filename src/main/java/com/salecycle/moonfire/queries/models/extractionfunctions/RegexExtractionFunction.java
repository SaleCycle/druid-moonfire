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

    public RegexExtractionFunction setExpr(String expr) {
        this.expr = expr;
        return this;
    }

    public long getIndex() {
        return index;
    }

    public RegexExtractionFunction setIndex(long index) {
        this.index = index;
        return this;
    }

    public boolean isReplaceMissingValue() {
        return replaceMissingValue;
    }

    public RegexExtractionFunction setReplaceMissingValue(boolean replaceMissingValue) {
        this.replaceMissingValue = replaceMissingValue;
        return this;
    }

    public String getReplaceMissingValueWith() {
        return replaceMissingValueWith;
    }

    public RegexExtractionFunction setReplaceMissingValueWith(String replaceMissingValueWith) {
        this.replaceMissingValueWith = replaceMissingValueWith;
        return this;
    }
}
