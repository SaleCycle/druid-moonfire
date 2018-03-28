package com.salecycle.moonfire.results.models.segmentmetadata;

public class ColumnResult {
    private String type;
    private boolean hasMultipleValues;
    private long size;
    private Long cardinality;
    private String errorMessage;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isHasMultipleValues() {
        return hasMultipleValues;
    }

    public void setHasMultipleValues(boolean hasMultipleValues) {
        this.hasMultipleValues = hasMultipleValues;
    }

    public long getSize() {
        return size;
    }

    public void setSize(long size) {
        this.size = size;
    }

    public Long getCardinality() {
        return cardinality;
    }

    public void setCardinality(Long cardinality) {
        this.cardinality = cardinality;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
