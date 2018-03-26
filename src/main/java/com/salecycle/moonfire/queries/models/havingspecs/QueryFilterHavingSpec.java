package com.salecycle.moonfire.queries.models.havingspecs;

import com.salecycle.moonfire.queries.models.filters.Filter;

public class QueryFilterHavingSpec extends HavingSpec {
    private Filter filter;

    public QueryFilterHavingSpec() {
        setType("filter");
    }

    public Filter getFilter() {
        return filter;
    }

    public void setFilter(Filter filter) {
        this.filter = filter;
    }
}
