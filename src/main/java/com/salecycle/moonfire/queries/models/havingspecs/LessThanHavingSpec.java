package com.salecycle.moonfire.queries.models.havingspecs;

import com.salecycle.moonfire.queries.models.aggregations.Aggregation;

public class LessThanHavingSpec extends HavingSpec {
    private String aggregation;
    private Number value;

    public LessThanHavingSpec() {
        super("lessThan");
    }

    public String getAggregation() {
        return aggregation;
    }

    public LessThanHavingSpec setAggregation(String aggregation) {
        this.aggregation = aggregation;
        return this;
    }

    public Number getValue() {
        return value;
    }

    public LessThanHavingSpec setValue(Number value) {
        this.value = value;
        return this;
    }
}
