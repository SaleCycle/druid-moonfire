package com.salecycle.moonfire.queries;

import com.salecycle.moonfire.queries.models.aggregations.Aggregation;
import com.salecycle.moonfire.queries.models.contexts.Context;
import com.salecycle.moonfire.queries.models.dimensionspecs.DimensionSpec;
import com.salecycle.moonfire.queries.models.filters.Filter;
import com.salecycle.moonfire.queries.models.granularities.Granularity;
import com.salecycle.moonfire.queries.models.havingspecs.HavingSpec;
import com.salecycle.moonfire.queries.models.limits.LimitSpec;
import com.salecycle.moonfire.queries.models.postaggregations.PostAggregation;

import java.util.ArrayList;
import java.util.List;

public class GroupByQuery {
    private final String queryType = "groupBy";
    private String dataSource;
    private List<DimensionSpec> dimensions = new ArrayList<DimensionSpec>();
    private LimitSpec limitSpec;
    private HavingSpec having;
    private Granularity granularity;
    private Filter filter;
    private List<Aggregation> aggregations;
    private List<PostAggregation> postAggregations;
    private List<String> intervals;
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

    public List<DimensionSpec> getDimensions() {
        return dimensions;
    }

    public void setDimensions(List<DimensionSpec> dimensions) {
        this.dimensions = dimensions;
    }

    public LimitSpec getLimitSpec() {
        return limitSpec;
    }

    public void setLimitSpec(LimitSpec limitSpec) {
        this.limitSpec = limitSpec;
    }

    public HavingSpec getHaving() {
        return having;
    }

    public void setHaving(HavingSpec having) {
        this.having = having;
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

    public List<String> getIntervals() {
        return intervals;
    }

    public void setIntervals(List<String> intervals) {
        this.intervals = intervals;
    }

    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }
}
