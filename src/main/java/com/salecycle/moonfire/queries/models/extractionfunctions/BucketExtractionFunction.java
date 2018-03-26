package com.salecycle.moonfire.queries.models.extractionfunctions;

public class BucketExtractionFunction extends ExtractionFunction {
    private Long size;
    private Long offset;

    public BucketExtractionFunction() {
        setType("bucket");
    }

    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    public Long getOffset() {
        return offset;
    }

    public void setOffset(Long offset) {
        this.offset = offset;
    }
}
