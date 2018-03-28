package com.salecycle.moonfire.queries.models.filters;

public class LikeFilter extends Filter {
    private String dimension;
    private String pattern;
    private String escape;

    public LikeFilter(String dimension, String pattern) {
        super("like");
        this.dimension = dimension;
        this.pattern = pattern;
    }

    public String getDimension() {
        return dimension;
    }

    public LikeFilter setDimension(String dimension) {
        this.dimension = dimension;
        return this;
    }

    public String getPattern() {
        return pattern;
    }

    public LikeFilter setPattern(String pattern) {
        this.pattern = pattern;
        return this;
    }

    public String getEscape() {
        return escape;
    }

    public LikeFilter setEscape(String escape) {
        this.escape = escape;
        return this;
    }
}
