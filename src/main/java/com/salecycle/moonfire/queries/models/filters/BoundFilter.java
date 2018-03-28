package com.salecycle.moonfire.queries.models.filters;

import com.salecycle.moonfire.queries.models.extractionfunctions.ExtractionFunction;

public class BoundFilter extends Filter {
    private String dimension;
    private String lower;
    private String upper;
    private boolean lowerScrict;
    private boolean upperStrict;
    private Ordering ordering;

    public BoundFilter() {
        setType("bound");
    }

    public String getDimension() {
        return dimension;
    }

    public BoundFilter setDimension(String dimension) {
        this.dimension = dimension;
        return this;
    }

    public String getLower() {
        return lower;
    }

    public BoundFilter setLower(String lower) {
        this.lower = lower;
        return this;
    }

    public String getUpper() {
        return upper;
    }

    public BoundFilter setUpper(String upper) {
        this.upper = upper;
        return this;
    }

    public boolean isLowerScrict() {
        return lowerScrict;
    }

    public BoundFilter setLowerScrict(boolean lowerScrict) {
        this.lowerScrict = lowerScrict;
        return this;
    }

    public boolean isUpperStrict() {
        return upperStrict;
    }

    public BoundFilter setUpperStrict(boolean upperStrict) {
        this.upperStrict = upperStrict;
        return this;
    }

    public Ordering getOrdering() {
        return ordering;
    }

    public BoundFilter setOrdering(Ordering ordering) {
        this.ordering = ordering;
        return this;
    }
}
