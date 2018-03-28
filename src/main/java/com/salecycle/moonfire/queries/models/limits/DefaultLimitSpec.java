package com.salecycle.moonfire.queries.models.limits;

import java.util.List;

public class DefaultLimitSpec extends LimitSpec {
    private int limit;
    private List<OrderByColumnSpec> columns;

    public DefaultLimitSpec() {
        super("default");
    }

    public int getLimit() {
        return limit;
    }

    public DefaultLimitSpec setLimit(int limit) {
        this.limit = limit;
        return this;
    }

    public List<OrderByColumnSpec> getColumns() {
        return columns;
    }

    public DefaultLimitSpec setColumns(List<OrderByColumnSpec> columns) {
        this.columns = columns;
        return this;
    }
}
