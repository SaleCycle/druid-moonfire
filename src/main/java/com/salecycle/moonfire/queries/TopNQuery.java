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

    public void setDataSource(String dataSource) {
        this.dataSource = dataSource;
    }

    public List<String> getIntervals() {
        return intervals;
    }

    public void setIntervals(List<String> intervals) {
        this.intervals = intervals;
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

    public List<Aggregation> getAggregations() {
        return aggregations;
    }

    public void setAggregations(List<Aggregation> aggregations) {
        this.aggregations = aggregations;
    }

    public List<PostAggregation> getPostAggregations() {
        return postAggregations;
    }

    public void setPostAggregations(List<PostAggregation> postAggregations) {
        this.postAggregations = postAggregations;
    }

    public DimensionSpec getDimension() {
        return dimension;
    }

    public void setDimension(DimensionSpec dimension) {
        this.dimension = dimension;
    }

    public int getThreshold() {
        return threshold;
    }

    public void setThreshold(int threshold) {
        this.threshold = threshold;
    }

    public TopNMetricSpec getMetric() {
        return metric;
    }

    public void setMetric(TopNMetricSpec metric) {
        this.metric = metric;
    }

    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }
}
