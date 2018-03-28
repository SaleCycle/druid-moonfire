package com.salecycle.moonfire.queries.models.postaggregations;

public abstract class PostAggregation {
    private String type;
    private String name;

    protected PostAggregation(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public <T extends PostAggregation> T setName(String name) {
        this.name = name;
        return (T)this;
    }
}
