package com.salecycle.moonfire.queries;

import com.salecycle.moonfire.queries.models.Bound;
import com.salecycle.moonfire.queries.models.contexts.Context;
import com.salecycle.moonfire.queries.models.datasources.DataSource;
import com.salecycle.moonfire.queries.models.filters.Filter;

public class TimeBoundaryQuery {
    private final String queryType = "timeBoundary";
    private DataSource dataSource;
    private Bound bound;
    private Filter filter;
    private Context context;

    public TimeBoundaryQuery(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public String getQueryType() {
        return queryType;
    }

    public DataSource getDataSource() {
        return dataSource;
    }

    public TimeBoundaryQuery setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        return this;
    }

    public Bound getBound() {
        return bound;
    }

    public TimeBoundaryQuery setBound(Bound bound) {
        this.bound = bound;
        return this;
    }

    public Filter getFilter() {
        return filter;
    }

    public TimeBoundaryQuery setFilter(Filter filter) {
        this.filter = filter;
        return this;
    }

    public Context getContext() {
        return context;
    }

    public TimeBoundaryQuery setContext(Context context) {
        this.context = context;
        return this;
    }
}
