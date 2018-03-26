package com.salecycle.moonfire.queries.models.toincludes;

import java.util.List;

public class ListToInclude extends ToInclude {
    private List<String> columns;

    public ListToInclude() {
        setType("list");
    }

    public List<String> getColumns() {
        return columns;
    }

    public void setColumns(List<String> columns) {
        this.columns = columns;
    }
}
