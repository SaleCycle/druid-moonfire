package com.salecycle.moonfire.queries;

import com.salecycle.moonfire.queries.models.contexts.Context;

public class DataSourceMetadataQuery {
    private final String queryType = "dataSourceMetadata";
    private String dataSource;
    private Context context;

    public DataSourceMetadataQuery(String dataSource) {
        this.dataSource = dataSource;
    }

    public String getQueryType() {
        return queryType;
    }

    public String getDataSource() {
        return dataSource;
    }

    public DataSourceMetadataQuery setDataSource(String dataSource) {
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
