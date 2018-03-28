package com.salecycle.moonfire.queries.models.havingspecs;

import com.salecycle.moonfire.queries.models.filters.Filter;

public class QueryFilterHavingSpec extends HavingSpec {
    private Filter filter;

    public QueryFilterHavingSpec() {
        super("filter");
    }

    public Filter getFilter() {
        return filter;
    }

    public QueryFilterHavingSpec setFilter(Filter filter) {
        this.filter = filter;
        return this;
    }
}
