package com.salecycle.moonfire.queries.models.datasources;

public abstract class DataSource {
    private String type;

    protected DataSource(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

}