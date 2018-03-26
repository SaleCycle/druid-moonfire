package com.salecycle.moonfire.queries.models.topnmetricspecs;

public class DimensionTopNMetricSpec extends TopNMetricSpec {
    private Ordering ordering;
    private String previousStop;

    public DimensionTopNMetricSpec() {
        setType("dimension");
    }

    public Ordering getOrdering() {
        return ordering;
    }

    public void setOrdering(Ordering ordering) {
        this.ordering = ordering;
    }

    public String getPreviousStop() {
        return previousStop;
    }

    public void setPreviousStop(String previousStop) {
        this.previousStop = previousStop;
    }
}
