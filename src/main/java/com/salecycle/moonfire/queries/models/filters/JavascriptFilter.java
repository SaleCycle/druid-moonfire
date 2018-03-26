package com.salecycle.moonfire.queries.models.filters;

public class JavascriptFilter extends Filter {
    private String dimension;
    private String function;

    public JavascriptFilter() {
        setType("javascript");
    }

    public String getDimension() {
        return dimension;
    }

    public void setDimension(String dimension) {
        this.dimension = dimension;
    }

    public String getFunction() {
        return function;
    }

    public void setFunction(String function) {
        this.function = function;
    }
}
