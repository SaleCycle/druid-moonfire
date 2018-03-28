package com.salecycle.moonfire.queries.models.filters;

import com.salecycle.moonfire.queries.models.dimensionspecs.DimensionSpec;

import java.util.List;

public class ColumnComparisonFilter extends Filter {
    private List<DimensionSpec> dimensions;

    public ColumnComparisonFilter() {
        setType("columnComparison");
    }

    public List<DimensionSpec> getDimensions() {
        return dimensions;
    }

    public ColumnComparisonFilter setDimensions(List<DimensionSpec> dimensions) {
        this.dimensions = dimensions;
        return this;
    }
}
