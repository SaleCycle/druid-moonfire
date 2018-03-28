package com.salecycle.moonfire.queries.models.havingspecs;

public abstract class HavingSpec {
    private String type;

    protected HavingSpec(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
