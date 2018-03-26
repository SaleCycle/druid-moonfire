package com.salecycle.moonfire.queries.models.filters;

public class SelectorFilter extends Filter {
    private String dimension;
    private String value;

    public SelectorFilter() {
        setType("selector");
    }

    public String getDimension() {
        return dimension;
    }

    public void setDimension(String dimension) {
        this.dimension = dimension;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
