package com.salecycle.moonfire.queries.models.aggregations;

import com.salecycle.moonfire.queries.models.filters.Filter;

public class FilteredAggregation extends Aggregation {
    private Filter filter;
    private Aggregation aggregator;

    public FilteredAggregation() {
        setType("filtered");
    }

    public Filter getFilter() {
        return filter;
    }

    public FilteredAggregation setFilter(Filter filter) {
        this.filter = filter;
        return this;
    }

    public Aggregation getAggregator() {
        return aggregator;
    }

    public FilteredAggregation setAggregator(Aggregation aggregator) {
        this.aggregator = aggregator;
        return this;
    }
}
