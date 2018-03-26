package com.salecycle.moonfire.queries.models.havingspecs;

public abstract class HavingSpec {
    private String type;

    public String getType() {
        return type;
    }

    protected void setType(String type) {
        this.type = type;
    }
}
