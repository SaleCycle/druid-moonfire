package com.salecycle.moonfire.queries.models.granularities;

public class PeriodGranularity extends ComplexGranularity {
    private String period;
    private String timeZone;

    public PeriodGranularity() {
        setType("period");
    }

    public String getPeriod() {
        return period;
    }

    public PeriodGranularity setPeriod(String period) {
        this.period = period;
        return this;
    }

    public String getTimeZone() {
        return timeZone;
    }

    public PeriodGranularity setTimeZone(String timeZone) {
        this.timeZone = timeZone;
        return this;
    }
}
