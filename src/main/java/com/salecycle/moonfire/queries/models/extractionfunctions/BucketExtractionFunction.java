package com.salecycle.moonfire.queries.models.extractionfunctions;

public class BucketExtractionFunction extends ExtractionFunction {
    private Long size;
    private Long offset;

    public BucketExtractionFunction() {
        super("bucket");
    }

    public Long getSize() {
        return size;
    }

    public BucketExtractionFunction setSize(Long size) {
        this.size = size;
        return this;
    }

    public Long getOffset() {
        return offset;
    }

    public BucketExtractionFunction setOffset(Long offset) {
        this.offset = offset;
        return this;
    }
}
