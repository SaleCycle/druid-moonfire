package com.salecycle.moonfire.queries;

import com.salecycle.moonfire.queries.models.Ordering;
import com.salecycle.moonfire.queries.models.contexts.Context;
import com.salecycle.moonfire.queries.models.filters.Filter;
import com.salecycle.moonfire.queries.models.granularities.Granularity;
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

    public SearchQuery(String dataSource, List<String> intervals, Granularity granularity, SearchQuerySpec query) {
        this.dataSource = dataSource;
        this.intervals = intervals;
        this.granularity = granularity;
        this.query = query;
    }

    public String getQueryType() {
        return queryType;
    }

    public String getDataSource() {
        return dataSource;
    }

    public SearchQuery setDataSource(String dataSource) {
        this.dataSource = dataSource;
        return this;
    }

    public Granularity getGranularity() {
        return granularity;
    }

    public SearchQuery setGranularity(Granularity granularity) {
        this.granularity = granularity;
        return this;
    }

    public Filter getFilter() {
        return filter;
    }

    public SearchQuery setFilter(Filter filter) {
        this.filter = filter;
        return this;
    }

    public int getLimit() {
        return limit;
    }

    public SearchQuery setLimit(int limit) {
        this.limit = limit;
        return this;
    }

    public List<String> getIntervals() {
        return intervals;
    }

    public SearchQuery setIntervals(List<String> intervals) {
        this.intervals = intervals;
        return this;
    }

    public List<String> getSearchDimensions() {
        return searchDimensions;
    }

    public SearchQuery setSearchDimensions(List<String> searchDimensions) {
        this.searchDimensions = searchDimensions;
        return this;
    }

    public SearchQuerySpec getQuery() {
        return query;
    }

    public SearchQuery setQuery(SearchQuerySpec query) {
        this.query = query;
        return this;
    }

    public Ordering getSort() {
        return sort;
    }

    public SearchQuery setSort(Ordering sort) {
        this.sort = sort;
        return this;
    }

    public Context getContext() {
        return context;
    }

    public SearchQuery setContext(Context context) {
        this.context = context;
        return this;
    }
}
