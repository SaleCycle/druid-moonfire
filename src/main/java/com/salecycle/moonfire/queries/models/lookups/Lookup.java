package com.salecycle.moonfire.queries.models.lookups;

public abstract class Lookup {
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
