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

    public void setAggregation(Aggregation aggregation) {
        this.aggregation = aggregation;
    }

    public Number getValue() {
        return value;
    }

    public void setValue(Number value) {
        this.value = value;
    }
}
