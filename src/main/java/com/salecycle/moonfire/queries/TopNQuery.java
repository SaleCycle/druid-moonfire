package com.salecycle.moonfire.queries;

import com.salecycle.moonfire.queries.models.aggregations.Aggregation;
import com.salecycle.moonfire.queries.models.contexts.Context;
import com.salecycle.moonfire.queries.models.dimensionspecs.DimensionSpec;
import com.salecycle.moonfire.queries.models.filters.Filter;
import com.salecycle.moonfire.queries.models.granularities.Granularity;
import com.salecycle.moonfire.queries.models.postaggregations.PostAggregation;
import com.salecycle.moonfire.queries.models.topnmetricspecs.TopNMetricSpec;

import java.util.List;

public class TopNQuery {
    private final String queryType = "topN";
    private String dataSource;
    private List<String> intervals;
    private Granularity granularity;
    private Filter filter;
    private List<Aggregation> aggregations;
    private List<PostAggregation> postAggregations;
    private DimensionSpec dimension;
    private int threshold;
    private TopNMetricSpec metric;
    private Context context;

    public String getQueryType() {
        return queryType;
    }

    public String getDataSource() {
        return dataSource;
    }

    public TopNQuery setDataSource(String dataSource) {
        this.dataSource = dataSource;
        return this;
    }

    public List<String> getIntervals() {
        return intervals;
    }

    public TopNQuery setIntervals(List<String> intervals) {
        this.intervals = intervals;
        return this;
    }

    public Granularity getGranularity() {
        return granularity;
    }

    public TopNQuery setGranularity(Granularity granularity) {
        this.granularity = granularity;
        return this;
    }

    public Filter getFilter() {
        return filter;
    }

    public TopNQuery setFilter(Filter filter) {
        this.filter = filter;
        return this;
    }

    public List<Aggregation> getAggregations() {
        return aggregations;
    }

    public TopNQuery setAggregations(List<Aggregation> aggregations) {
        this.aggregations = aggregations;
        return this;
    }

    public List<PostAggregation> getPostAggregations() {
        return postAggregations;
    }

    public TopNQuery setPostAggregations(List<PostAggregation> postAggregations) {
        this.postAggregations = postAggregations;
        return this;
    }

    public DimensionSpec getDimension() {
        return dimension;
    }

    public TopNQuery setDimension(DimensionSpec dimension) {
        this.dimension = dimension;
        return this;
    }

    public int getThreshold() {
        return threshold;
    }

    public TopNQuery setThreshold(int threshold) {
        this.threshold = threshold;
        return this;
    }

    public TopNMetricSpec getMetric() {
        return metric;
    }

    public TopNQuery setMetric(TopNMetricSpec metric) {
        this.metric = metric;
        return this;
    }

    public Context getContext() {
        return context;
    }

    public TopNQuery setContext(Context context) {
        this.context = context;
        return this;
    }
}
