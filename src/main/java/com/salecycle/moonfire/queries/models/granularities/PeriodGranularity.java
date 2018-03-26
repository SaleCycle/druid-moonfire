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

    public void setPeriod(String period) {
        this.period = period;
    }

    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }
}
