package com.salecycle.moonfire.queries.models.extractionfunctions;

public class SubstringExtractionFunction extends ExtractionFunction {
    private long index;
    private Long length;

    public SubstringExtractionFunction() {
        setType("substring");
    }

    public long getIndex() {
        return index;
    }

    public SubstringExtractionFunction setIndex(long index) {
        this.index = index;
        return this;
    }

    public Long getLength() {
        return length;
    }

    public SubstringExtractionFunction setLength(Long length) {
        this.length = length;
        return this;
    }
}
