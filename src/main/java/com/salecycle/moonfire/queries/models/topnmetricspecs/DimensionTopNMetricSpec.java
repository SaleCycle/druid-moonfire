package com.salecycle.moonfire.queries.models.topnmetricspecs;

public class DimensionTopNMetricSpec extends TopNMetricSpec {
    private Ordering ordering;
    private String previousStop;

    public DimensionTopNMetricSpec() {
        super("dimension");
    }

    public Ordering getOrdering() {
        return ordering;
    }

    public DimensionTopNMetricSpec setOrdering(Ordering ordering) {
        this.ordering = ordering;
        return this;
    }

    public String getPreviousStop() {
        return previousStop;
    }

    public DimensionTopNMetricSpec setPreviousStop(String previousStop) {
        this.previousStop = previousStop;
        return this;
    }
}
