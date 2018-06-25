package com.salecycle.moonfire.queries.models.havingspecs;

public class EqualToHavingSpec extends HavingSpec {
    private String aggregation;
    private Number value;

    public EqualToHavingSpec() {
        super("equalTo");
    }

    public String getAggregation() {
        return aggregation;
    }

    public EqualToHavingSpec setAggregation(String aggregation) {
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
