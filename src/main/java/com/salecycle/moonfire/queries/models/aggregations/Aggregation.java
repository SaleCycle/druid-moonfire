package com.salecycle.moonfire.queries.models.aggregations;

public abstract class Aggregation {
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

    public Aggregation setName(String name) {
        this.name = name;
        return this;
    }
}
