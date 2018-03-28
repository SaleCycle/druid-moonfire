package com.salecycle.moonfire.queries.models.filters;

import com.salecycle.moonfire.queries.models.filters.searchqueryspecs.SearchQuerySpec;

public class SearchFilter extends Filter {
    private String dimension;
    private SearchQuerySpec query;

    public SearchFilter(String dimension, SearchQuerySpec query) {
        super("search");
        this.dimension = dimension;
        this.query = query;
    }

    public String getDimension() {
        return dimension;
    }

    public SearchFilter setDimension(String dimension) {
        this.dimension = dimension;
        return this;
    }

    public SearchQuerySpec getQuery() {
        return query;
    }

    public SearchFilter setQuery(SearchQuerySpec query) {
        this.query = query;
        return this;
    }
}
