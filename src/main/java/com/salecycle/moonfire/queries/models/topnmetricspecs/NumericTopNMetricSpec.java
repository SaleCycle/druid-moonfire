package com.salecycle.moonfire.queries.models.topnmetricspecs;

public class NumericTopNMetricSpec extends TopNMetricSpec {
    private String metric;

    public NumericTopNMetricSpec() {
        setType("numeric");
    }

    public String getMetric() {
        return metric;
    }

    public NumericTopNMetricSpec setMetric(String metric) {
        this.metric = metric;
        return this;
    }
}
