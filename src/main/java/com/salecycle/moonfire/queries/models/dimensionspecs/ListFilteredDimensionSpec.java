package com.salecycle.moonfire.queries.models.dimensionspecs;

import java.util.List;

public class ListFilteredDimensionSpec extends DimensionSpec {
    private DimensionSpec delegate;
    private List<String> values;
    private boolean isWhitelist = true;

    public ListFilteredDimensionSpec() {
        setType("listFiltered");
    }

    public DimensionSpec getDelegate() {
        return delegate;
    }

    public ListFilteredDimensionSpec setDelegate(DimensionSpec delegate) {
        this.delegate = delegate;
        return this;
    }

    public List<String> getValues() {
        return values;
    }

    public ListFilteredDimensionSpec setValues(List<String> values) {
        this.values = values;
        return this;
    }

    public boolean isWhitelist() {
        return isWhitelist;
    }

    public ListFilteredDimensionSpec setWhitelist(boolean whitelist) {
        isWhitelist = whitelist;
        return this;
    }
}
