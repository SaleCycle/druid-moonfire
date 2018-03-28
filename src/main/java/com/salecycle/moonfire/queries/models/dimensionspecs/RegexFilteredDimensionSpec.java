package com.salecycle.moonfire.queries.models.dimensionspecs;

public class RegexFilteredDimensionSpec extends DimensionSpec {
    private DimensionSpec delegate;
    private String pattern;

    public RegexFilteredDimensionSpec() {
        setType("regexFiltered");
    }

    public DimensionSpec getDelegate() {
        return delegate;
    }

    public RegexFilteredDimensionSpec setDelegate(DimensionSpec delegate) {
        this.delegate = delegate;
        return this;
    }

    public String getPattern() {
        return pattern;
    }

    public RegexFilteredDimensionSpec setPattern(String pattern) {
        this.pattern = pattern;
        return this;
    }
}
