package com.salecycle.moonfire.queries.models.filters;

public class RegexFilter extends Filter {
    private String dimension;
    private String pattern;

    public RegexFilter() {
        setType("regex");
    }

    public String getDimension() {
        return dimension;
    }

    public void setDimension(String dimension) {
        this.dimension = dimension;
    }

    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }
}
