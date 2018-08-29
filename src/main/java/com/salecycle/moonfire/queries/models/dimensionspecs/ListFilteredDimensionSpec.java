package com.salecycle.moonfire.queries.models.dimensionspecs;

import java.util.List;

public class ListFilteredDimensionSpec extends DimensionSpec {
    private DimensionSpec delegate;
    private List<String> values;
    private boolean isWhitelist = true;

    public ListFilteredDimensionSpec() {
        super("listFiltered");
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

    public boolean getIsWhitelist() {
        return isWhitelist;
    }

    public ListFilteredDimensionSpec setIsWhitelist(boolean isWhitelist) {
        this.isWhitelist = isWhitelist;
        return this;
    }
}
