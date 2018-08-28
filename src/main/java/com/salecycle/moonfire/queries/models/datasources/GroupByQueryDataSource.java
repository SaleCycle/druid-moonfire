package com.salecycle.moonfire.queries.models.datasources;

import com.salecycle.moonfire.queries.GroupByQuery;

public class GroupByQueryDataSource extends DataSource {
    private GroupByQuery query;

    public GroupByQueryDataSource(GroupByQuery query) {
        super("query");
        this.query = query;
    }

    public GroupByQuery getQuery() {
        return query;
    }
}
