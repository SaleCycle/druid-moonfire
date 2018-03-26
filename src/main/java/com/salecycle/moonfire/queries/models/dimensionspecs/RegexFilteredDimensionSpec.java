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

    public void setDelegate(DimensionSpec delegate) {
        this.delegate = delegate;
    }

    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }
}
