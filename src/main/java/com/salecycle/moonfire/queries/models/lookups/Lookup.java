package com.salecycle.moonfire.queries.models.lookups;

public abstract class Lookup {
    private String type;

    protected Lookup(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
