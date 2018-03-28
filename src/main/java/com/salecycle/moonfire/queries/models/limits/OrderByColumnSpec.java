package com.salecycle.moonfire.queries.models.limits;

import com.salecycle.moonfire.queries.models.dimensionspecs.DimensionSpec;

/**
 * note: this does not have a type field in the documentation
 */
public class OrderByColumnSpec {
    private DimensionSpec dimension;
    private Direction direction;
    private DimensionOrder dimensionOrder;

    public DimensionSpec getDimension() {
        return dimension;
    }

    public OrderByColumnSpec setDimension(DimensionSpec dimension) {
        this.dimension = dimension;
        return this;
    }

    public Direction getDirection() {
        return direction;
    }

    public OrderByColumnSpec setDirection(Direction direction) {
        this.direction = direction;
        return this;
    }

    public DimensionOrder getDimensionOrder() {
        return dimensionOrder;
    }

    public OrderByColumnSpec setDimensionOrder(DimensionOrder dimensionOrder) {
        this.dimensionOrder = dimensionOrder;
        return this;
    }
}
