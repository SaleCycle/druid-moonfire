package com.salecycle.moonfire.queries.models.granularities;

public class DurationGranularity extends ComplexGranularity {
    private long duration;

    public DurationGranularity() {
        super("duration");
    }

    public long getDuration() {
        return duration;
    }

    public DurationGranularity setDuration(long duration) {
        this.duration = duration;
        return this;
    }
}
