package com.salecycle.moonfire.queries.models.topnmetricspecs;

public abstract class TopNMetricSpec {
    private String type;

    public String getType() {
        return type;
    }

    protected void setType(String type) {
        this.type = type;
    }
}
