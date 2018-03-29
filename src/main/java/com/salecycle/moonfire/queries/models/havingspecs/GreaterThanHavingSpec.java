package com.salecycle.moonfire.queries.models.havingspecs;

import com.salecycle.moonfire.queries.models.aggregations.Aggregation;

import java.math.BigDecimal;

public class GreaterThanHavingSpec extends HavingSpec {
    private String aggregation;
    private Number value;

    public GreaterThanHavingSpec() {
        super("greaterThan");
    }

    public String getAggregation() {
        return aggregation;
    }

    public GreaterThanHavingSpec setAggregation(String aggregation) {
        this.aggregation = aggregation;
        return this;
    }

    public Number getValue() {
        return value;
    }

    public GreaterThanHavingSpec setValue(Number value) {
        this.value = value;
        return this;
    }
}
