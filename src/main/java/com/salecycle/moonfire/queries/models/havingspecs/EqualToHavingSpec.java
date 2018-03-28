package com.salecycle.moonfire.queries.models.havingspecs;

import com.salecycle.moonfire.queries.models.aggregations.Aggregation;

public class EqualToHavingSpec extends HavingSpec {
    private Aggregation aggregation;
    private Number value;

    public EqualToHavingSpec() {
        setType("equalTo");
    }

    public Aggregation getAggregation() {
        return aggregation;
    }

    public EqualToHavingSpec setAggregation(Aggregation aggregation) {
        this.aggregation = aggregation;
        return this;
    }

    public Number getValue() {
        return value;
    }

    public EqualToHavingSpec setValue(Number value) {
        this.value = value;
        return this;
    }
}
