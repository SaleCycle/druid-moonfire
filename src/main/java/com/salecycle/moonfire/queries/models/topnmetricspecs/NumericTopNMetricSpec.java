package com.salecycle.moonfire.queries.models.topnmetricspecs;

public class NumericTopNMetricSpec extends TopNMetricSpec {
    private String metric;

    public NumericTopNMetricSpec(String metric) {
        super("numeric");
        this.metric = metric;
    }

    public String getMetric() {
        return metric;
    }

    public NumericTopNMetricSpec setMetric(String metric) {
        this.metric = metric;
        return this;
    }
}
