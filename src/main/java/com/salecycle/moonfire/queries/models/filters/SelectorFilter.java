package com.salecycle.moonfire.queries.models.filters;

public class SelectorFilter extends Filter {
    private String dimension;
    private String value;

    public SelectorFilter() {
        super("selector");
    }

    public String getDimension() {
        return dimension;
    }

    public SelectorFilter setDimension(String dimension) {
        this.dimension = dimension;
        return this;
    }

    public String getValue() {
        return value;
    }

    public SelectorFilter setValue(String value) {
        this.value = value;
        return this;
    }
}
