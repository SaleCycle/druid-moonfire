package com.salecycle.moonfire.queries.models.topnmetricspecs;

public abstract class TopNMetricSpec {
    private String type;

    protected TopNMetricSpec(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
