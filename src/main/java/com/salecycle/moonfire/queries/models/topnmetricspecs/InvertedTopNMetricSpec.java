package com.salecycle.moonfire.queries.models.topnmetricspecs;

public class InvertedTopNMetricSpec extends TopNMetricSpec {
    private String metric;

    public InvertedTopNMetricSpec() {
        setType("inverted");
    }

    public String getMetric() {
        return metric;
    }

    public void setMetric(String metric) {
        this.metric = metric;
    }
}
