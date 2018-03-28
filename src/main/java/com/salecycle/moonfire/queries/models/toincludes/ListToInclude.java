package com.salecycle.moonfire.queries.models.toincludes;

import java.util.List;

public class ListToInclude extends ToInclude {
    private List<String> columns;

    public ListToInclude() {
        super("list");
    }

    public List<String> getColumns() {
        return columns;
    }

    public ListToInclude setColumns(List<String> columns) {
        this.columns = columns;
        return this;
    }
}
