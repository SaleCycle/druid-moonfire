package com.salecycle.moonfire.queries.models.dimensionspecs;

public abstract class DimensionSpec {
    private String type;

    public String getType() {
        return type;
    }

    protected void setType(String type) {
        this.type = type;
    }
}
