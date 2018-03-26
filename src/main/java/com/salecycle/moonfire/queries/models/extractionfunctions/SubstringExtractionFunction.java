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

    public void setIndex(long index) {
        this.index = index;
    }

    public Long getLength() {
        return length;
    }

    public void setLength(Long length) {
        this.length = length;
    }
}
