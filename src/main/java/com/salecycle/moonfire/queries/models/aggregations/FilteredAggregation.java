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

    public void setFilter(Filter filter) {
        this.filter = filter;
    }

    public Aggregation getAggregator() {
        return aggregator;
    }

    public void setAggregator(Aggregation aggregator) {
        this.aggregator = aggregator;
    }
}
