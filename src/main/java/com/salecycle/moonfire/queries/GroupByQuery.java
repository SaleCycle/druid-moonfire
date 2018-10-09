package com.salecycle.moonfire.queries;

import com.salecycle.moonfire.queries.models.aggregations.Aggregation;
import com.salecycle.moonfire.queries.models.contexts.Context;
import com.salecycle.moonfire.queries.models.datasources.DataSource;
import com.salecycle.moonfire.queries.models.dimensionspecs.DimensionSpec;
import com.salecycle.moonfire.queries.models.filters.Filter;
import com.salecycle.moonfire.queries.models.granularities.Granularity;
import com.salecycle.moonfire.queries.models.havingspecs.HavingSpec;
import com.salecycle.moonfire.queries.models.limits.LimitSpec;
import com.salecycle.moonfire.queries.models.postaggregations.PostAggregation;
import com.salecycle.moonfire.queries.models.virtualcolumns.VirtualColumn;

import java.util.List;

public class GroupByQuery {
    private final String queryType = "groupBy";
    private DataSource dataSource;
    private List<DimensionSpec> dimensions;
    private List<VirtualColumn> virtualColumns;
    private LimitSpec limitSpec;
    private HavingSpec having;
    private Granularity granularity;
    private Filter filter;
    private List<Aggregation> aggregations;
    private List<PostAggregation> postAggregations;
    private List<String> intervals;
    private Context context;


    public GroupByQuery(DataSource dataSource, List<String> intervals, Granularity granularity, List<DimensionSpec> dimensions) {
        this(intervals, granularity, dimensions);
        this.dataSource = dataSource;
    }

    private GroupByQuery(List<String> intervals, Granularity granularity, List<DimensionSpec> dimensions) {
        this.intervals = intervals;
        this.dimensions = dimensions;
        this.granularity = granularity;
    }

    public String getQueryType() {
        return queryType;
    }

    public Object getDataSource() {
        return dataSource;
    }

    public GroupByQuery setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        return this;
    }

    public List<DimensionSpec> getDimensions() {
        return dimensions;
    }

    public GroupByQuery setDimensions(List<DimensionSpec> dimensions) {
        this.dimensions = dimensions;
        return this;
    }

    public List<VirtualColumn> getVirtualColumns() {
        return virtualColumns;
    }

    public GroupByQuery setVirtualColumns(List<VirtualColumn> virtualColumns) {
        this.virtualColumns = virtualColumns;
        return this;
    }

    public LimitSpec getLimitSpec() {
        return limitSpec;
    }

    public GroupByQuery setLimitSpec(LimitSpec limitSpec) {
        this.limitSpec = limitSpec;
        return this;
    }

    public HavingSpec getHaving() {
        return having;
    }

    public GroupByQuery setHaving(HavingSpec having) {
        this.having = having;
        return this;
    }

    public Granularity getGranularity() {
        return granularity;
    }

    public GroupByQuery setGranularity(Granularity granularity) {
        this.granularity = granularity;
        return this;
    }

    public Filter getFilter() {
        return filter;
    }

    public GroupByQuery setFilter(Filter filter) {
        this.filter = filter;
        return this;
    }

    public List<Aggregation> getAggregations() {
        return aggregations;
    }

    public GroupByQuery setAggregations(List<Aggregation> aggregations) {
        this.aggregations = aggregations;
        return this;
    }

    public List<PostAggregation> getPostAggregations() {
        return postAggregations;
    }

    public GroupByQuery setPostAggregations(List<PostAggregation> postAggregations) {
        this.postAggregations = postAggregations;
        return this;
    }

    public List<String> getIntervals() {
        return intervals;
    }

    public GroupByQuery setIntervals(List<String> intervals) {
        this.intervals = intervals;
        return this;
    }

    public Context getContext() {
        return context;
    }

    public GroupByQuery setContext(Context context) {
        this.context = context;
        return this;
    }
}
