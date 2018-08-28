package com.salecycle.moonfire.queries;

import com.salecycle.moonfire.queries.models.contexts.Context;
import com.salecycle.moonfire.queries.models.datasources.DataSource;

public class DataSourceMetadataQuery {
    private final String queryType = "dataSourceMetadata";
    private DataSource dataSource;
    private Context context;

    public DataSourceMetadataQuery(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public String getQueryType() {
        return queryType;
    }

    public DataSource getDataSource() {
        return dataSource;
    }

    public DataSourceMetadataQuery setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        return this;
    }

    public Context getContext() {
        return context;
    }

    public DataSourceMetadataQuery setContext(Context context) {
        this.context = context;
        return this;
    }
}
