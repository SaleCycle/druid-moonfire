package com.salecycle.moonfire.queries.models.postaggregations;

public abstract class PostAggregation {
    private String type;
    private String name;

    public String getType() {
        return type;
    }

    protected void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public PostAggregation setName(String name) {
        this.name = name;
        return this;
    }
}
