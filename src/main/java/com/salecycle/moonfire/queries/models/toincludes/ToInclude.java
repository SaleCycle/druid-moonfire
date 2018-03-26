package com.salecycle.moonfire.queries.models.toincludes;

public abstract class ToInclude {
    private String type;

    public String getType() {
        return type;
    }

    protected void setType(String type) {
        this.type = type;
    }
}
