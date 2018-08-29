package com.salecycle.moonfire.queries.models.datasources;

import java.util.List;

public class UnionDataSource extends DataSource {
    private List<String> dataSources;

    public UnionDataSource(List<String> dataSources) {
        super("union");
        this.dataSources = dataSources;
    }

    public List<String> getDataSources() {
        return dataSources;
    }
}
