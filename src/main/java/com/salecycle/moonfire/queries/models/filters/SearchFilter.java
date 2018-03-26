package com.salecycle.moonfire.queries.models.filters;

import com.salecycle.moonfire.queries.models.queryspecs.SearchQuerySpec;

public class SearchFilter extends Filter {
    private String dimension;
    private SearchQuerySpec query;

    public SearchFilter() {
        setType("search");
    }

    public String getDimension() {
        return dimension;
    }

    public void setDimension(String dimension) {
        this.dimension = dimension;
    }

    public SearchQuerySpec getQuery() {
        return query;
    }

    public void setQuery(SearchQuerySpec query) {
        this.query = query;
    }
}
