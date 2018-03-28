package com.salecycle.moonfire.queries.models.toincludes;

public abstract class ToInclude {
    private String type;

    protected ToInclude(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
