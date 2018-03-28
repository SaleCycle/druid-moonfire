package com.salecycle.moonfire.queries;

import com.salecycle.moonfire.queries.models.aggregations.Aggregation;
import com.salecycle.moonfire.queries.models.contexts.Context;
import com.salecycle.moonfire.queries.models.filters.Filter;
import com.salecycle.moonfire.queries.models.granularities.Granularity;
import com.salecycle.moonfire.queries.models.postaggregations.PostAggregation;

import java.util.List;

public class TimeSeriesQuery {
    private final String queryType = "timeseries";
    private String dataSource;
    private Granularity granularity;
    private boolean descending;
    private List<String> intervals;
    private Filter filter;
    private List<Aggregation> aggregations;
    private List<PostAggregation> postAggregations;
    private Context context;

    public String getQueryType() {
        return queryType;
    }

    public String getDataSource() {
        return dataSource;
    }

    public TimeSeriesQuery setDataSource(String dataSource) {
        this.dataSource = dataSource;
        return this;
    }

    public Granularity getGranularity() {
        return granularity;
    }

    public TimeSeriesQuery setGranularity(Granularity granularity) {
        this.granularity = granularity;
        return this;
    }

    public boolean isDescending() {
        return descending;
    }

    public TimeSeriesQuery setDescending(boolean descending) {
        this.descending = descending;
        return this;
    }

    public List<String> getIntervals() {
        return intervals;
    }

    public TimeSeriesQuery setIntervals(List<String> intervals) {
        this.intervals = intervals;
        return this;
    }

    public Filter getFilter() {
        return filter;
    }

    public TimeSeriesQuery setFilter(Filter filter) {
        this.filter = filter;
        return this;
    }

    public List<Aggregation> getAggregations() {
        return aggregations;
    }

    public TimeSeriesQuery setAggregations(List<Aggregation> aggregations) {
        this.aggregations = aggregations;
        return this;
    }

    public List<PostAggregation> getPostAggregations() {
        return postAggregations;
    }

    public TimeSeriesQuery setPostAggregations(List<PostAggregation> postAggregations) {
        this.postAggregations = postAggregations;
        return this;
    }

    public Context getContext() {
        return context;
    }

    public TimeSeriesQuery setContext(Context context) {
        this.context = context;
        return this;
    }
}
