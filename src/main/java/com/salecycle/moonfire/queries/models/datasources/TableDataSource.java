package com.salecycle.moonfire.queries.models.datasources;

public class TableDataSource extends DataSource {
    private String name;

    public TableDataSource(String name) {
        super("table");
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
