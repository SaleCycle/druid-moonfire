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

    public void setDelegate(DimensionSpec delegate) {
        this.delegate = delegate;
    }

    public List<String> getValues() {
        return values;
    }

    public void setValues(List<String> values) {
        this.values = values;
    }

    public boolean isWhitelist() {
        return isWhitelist;
    }

    public void setWhitelist(boolean whitelist) {
        isWhitelist = whitelist;
    }
}
