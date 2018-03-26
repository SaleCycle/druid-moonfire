package com.salecycle.moonfire.queries.models.limits;

public abstract class LimitSpec {
    private String type;

    public String getType() {
        return type;
    }

    protected void setType(String type) {
        this.type = type;
    }
}
