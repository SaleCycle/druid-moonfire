package com.salecycle.moonfire.queries.models.extractionfunctions;

public abstract class ExtractionFunction {
    private String type;

    public String getType() {
        return type;
    }

    protected void setType(String type) {
        this.type = type;
    }
}
