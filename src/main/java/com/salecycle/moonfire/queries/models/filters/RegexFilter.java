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

    public RegexFilter setDimension(String dimension) {
        this.dimension = dimension;
        return this;
    }

    public String getPattern() {
        return pattern;
    }

    public RegexFilter setPattern(String pattern) {
        this.pattern = pattern;
        return this;
    }
}
