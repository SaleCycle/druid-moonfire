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

    public void setDimension(String dimension) {
        this.dimension = dimension;
    }

    public String getLower() {
        return lower;
    }

    public void setLower(String lower) {
        this.lower = lower;
    }

    public String getUpper() {
        return upper;
    }

    public void setUpper(String upper) {
        this.upper = upper;
    }

    public boolean isLowerScrict() {
        return lowerScrict;
    }

    public void setLowerScrict(boolean lowerScrict) {
        this.lowerScrict = lowerScrict;
    }

    public boolean isUpperStrict() {
        return upperStrict;
    }

    public void setUpperStrict(boolean upperStrict) {
        this.upperStrict = upperStrict;
    }

    public Ordering getOrdering() {
        return ordering;
    }

    public void setOrdering(Ordering ordering) {
        this.ordering = ordering;
    }
}
