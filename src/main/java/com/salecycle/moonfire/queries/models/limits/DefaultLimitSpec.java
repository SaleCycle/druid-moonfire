package com.salecycle.moonfire.queries.models.limits;

import java.util.List;

public class DefaultLimitSpec extends LimitSpec {
    private int limit;
    private List<OrderByColumnSpec> columns;

    public DefaultLimitSpec() {
        setType("default");
    }
}
