package com.salecycle.moonfire.queries.models.limits;

import com.salecycle.moonfire.queries.models.dimensionspecs.DimensionSpec;

public class OrderByColumnSpec {
    private DimensionSpec dimension;
    private Direction direction;
    private DimensionOrder dimensionOrder;

    public DimensionSpec getDimension() {
        return dimension;
    }

    public void setDimension(DimensionSpec dimension) {
        this.dimension = dimension;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public DimensionOrder getDimensionOrder() {
        return dimensionOrder;
    }

    public void setDimensionOrder(DimensionOrder dimensionOrder) {
        this.dimensionOrder = dimensionOrder;
    }
}
