package com.salecycle.moonfire.queries.models.havingspecs;

import com.salecycle.moonfire.queries.models.dimensionspecs.DimensionSpec;

public class DimensionSelectorHavingSpec extends HavingSpec {
    private DimensionSpec dimension;
    private Object value;

    public DimensionSelectorHavingSpec() {
        setType("dimSelector");
    }

    public DimensionSpec getDimension() {
        return dimension;
    }

    public DimensionSelectorHavingSpec setDimension(DimensionSpec dimension) {
        this.dimension = dimension;
        return this;
    }

    public Object getValue() {
        return value;
    }

    public DimensionSelectorHavingSpec setValue(Object value) {
        this.value = value;
        return this;
    }
}
