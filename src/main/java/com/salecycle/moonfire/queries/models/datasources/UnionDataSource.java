package com.salecycle.moonfire.queries.models.datasources;

import java.util.List;

public class UnionDataSource extends DataSource {
    private List<String> names;

    public UnionDataSource(List<String> names) {
        super("union");
        this.names = names;
    }

    public List<String> getNames() {
        return names;
    }
}
