package com.salecycle.moonfire.queries;

import com.salecycle.moonfire.queries.models.contexts.Context;

public class DataSourceMetadataQuery {
    private final String queryType = "dataSourceMetadata";
    private String dataSource;
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

    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }
}
