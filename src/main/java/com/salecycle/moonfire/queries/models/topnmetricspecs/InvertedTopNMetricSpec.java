package com.salecycle.moonfire.queries.models.topnmetricspecs;

public class InvertedTopNMetricSpec extends TopNMetricSpec {
    private String metric;

    public InvertedTopNMetricSpec(String metric) {
        super("inverted");
        this.metric = metric;
    }

    public String getMetric() {
        return metric;
    }

    public InvertedTopNMetricSpec setMetric(String metric) {
        this.metric = metric;
        return this;
    }
}
