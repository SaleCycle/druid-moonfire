package com.salecycle.moonfire.queries.models.filters;

public class JavascriptFilter extends Filter {
    private String dimension;
    private String function;

    public JavascriptFilter() {
        super("javascript");
    }

    public String getDimension() {
        return dimension;
    }

    public JavascriptFilter setDimension(String dimension) {
        this.dimension = dimension;
        return this;
    }

    public String getFunction() {
        return function;
    }

    public JavascriptFilter setFunction(String function) {
        this.function = function;
        return this;
    }
}
