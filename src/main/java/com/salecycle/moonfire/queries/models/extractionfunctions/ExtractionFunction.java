package com.salecycle.moonfire.queries.models.extractionfunctions;

public abstract class ExtractionFunction {
    private String type;

    protected ExtractionFunction(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
