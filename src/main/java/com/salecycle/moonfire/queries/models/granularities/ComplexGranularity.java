package com.salecycle.moonfire.queries.models.granularities;

public abstract class ComplexGranularity {
    private String type;
    private String origin;

    protected ComplexGranularity(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }
}
