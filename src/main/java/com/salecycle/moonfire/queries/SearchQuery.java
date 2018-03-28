package com.salecycle.moonfire.queries;

import com.salecycle.moonfire.queries.models.contexts.Context;
import com.salecycle.moonfire.queries.models.filters.Filter;
import com.salecycle.moonfire.queries.models.granularities.Granularity;
import com.salecycle.moonfire.queries.models.Ordering;
import com.salecycle.moonfire.queries.models.searchqueryspecs.SearchQuerySpec;

import java.util.ArrayList;
import java.util.List;

public class SearchQuery {
    private final String queryType = "search";
    private String dataSource;
    private Granularity granularity;
    private Filter filter;
    private int limit = 1000;
    private List<String> intervals;
    private List<String> searchDimensions = new ArrayList<String>();
    private SearchQuerySpec query;
    private Ordering sort;
    private Context context;

    public String getQueryType() {
        return queryType;
    }

    public String getDataSource() {
        return dataSource;
    }

    public void setDataSource(String dataSource) {
        this.dataSource = dataSource;
    }

    public Granularity getGranularity() {
        return granularity;
    }

    public void setGranularity(Granularity granularity) {
        this.granularity = granularity;
    }

    public Filter getFilter() {
        return filter;
    }

    public void setFilter(Filter filter) {
        this.filter = filter;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public List<String> getIntervals() {
        return intervals;
    }

    public void setIntervals(List<String> intervals) {
        this.intervals = intervals;
    }

    public List<String> getSearchDimensions() {
        return searchDimensions;
    }

    public void setSearchDimensions(List<String> searchDimensions) {
        this.searchDimensions = searchDimensions;
    }

    public SearchQuerySpec getQuery() {
        return query;
    }

    public void setQuery(SearchQuerySpec query) {
        this.query = query;
    }

    public Ordering getSort() {
        return sort;
    }

    public void setSort(Ordering sort) {
        this.sort = sort;
    }

    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }
}
