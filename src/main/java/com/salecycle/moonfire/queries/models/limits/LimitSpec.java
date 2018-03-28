package com.salecycle.moonfire.queries.models.limits;

public abstract class LimitSpec {
    private String type;

    protected LimitSpec(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

}
