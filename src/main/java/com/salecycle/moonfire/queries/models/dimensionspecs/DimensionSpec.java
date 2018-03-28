package com.salecycle.moonfire.queries.models.dimensionspecs;

public abstract class DimensionSpec {
    private String type;

    protected DimensionSpec(String type) {
        this.type = type;
    }
    public String getType() {
        return type;
    }

}
