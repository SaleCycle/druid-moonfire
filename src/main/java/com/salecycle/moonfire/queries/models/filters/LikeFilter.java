package com.salecycle.moonfire.queries.models.filters;

public class LikeFilter extends Filter {
    private String dimension;
    private String pattern;
    private String escape;

    public LikeFilter() {
        setType("like");
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

    public String getEscape() {
        return escape;
    }

    public void setEscape(String escape) {
        this.escape = escape;
    }
}
