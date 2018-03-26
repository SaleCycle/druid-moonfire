package com.salecycle.moonfire.queries.models.granularities;

public abstract class ComplexGranularity {
    private String type;
    private String origin;

    public String getType() {
        return type;
    }

    protected void setType(String type) {
        this.type = type;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }
}
