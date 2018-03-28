package com.salecycle.moonfire.queries.models.filters;

import java.util.List;

public class IntervalFilter extends Filter {
    private String dimension;
    private List<String> intervals;

    public IntervalFilter(List<String> intervals, String dimension) {
        super("interval");
        this.intervals = intervals;
        this.dimension = dimension;
    }

    public String getDimension() {
        return dimension;
    }

    public IntervalFilter setDimension(String dimension) {
        this.dimension = dimension;
        return this;
    }

    public List<String> getIntervals() {
        return intervals;
    }

    public IntervalFilter setIntervals(List<String> intervals) {
        this.intervals = intervals;
        return this;
    }
}
