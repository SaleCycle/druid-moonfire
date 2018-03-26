package com.salecycle.moonfire.queries.models.granularities;

public class DurationGranularity extends ComplexGranularity {
    private long duration;

    public DurationGranularity() {
        setType("duration");
    }

    public long getDuration() {
        return duration;
    }

    public void setDuration(long duration) {
        this.duration = duration;
    }
}
