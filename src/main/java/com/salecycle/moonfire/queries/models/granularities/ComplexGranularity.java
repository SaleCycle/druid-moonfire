package com.salecycle.moonfire.queries.models.granularities;

public abstract class ComplexGranularity implements Granularity {
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

    public ComplexGranularity setOrigin(String origin) {
        this.origin = origin;
        return this;
    }
}
