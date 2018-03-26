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

    public void setDimension(DimensionSpec dimension) {
        this.dimension = dimension;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}
