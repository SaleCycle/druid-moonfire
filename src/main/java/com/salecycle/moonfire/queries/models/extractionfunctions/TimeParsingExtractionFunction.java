package com.salecycle.moonfire.queries.models.extractionfunctions;

public class TimeParsingExtractionFunction extends ExtractionFunction {
    private String timeFormat;
    private String resultFormat;

    public TimeParsingExtractionFunction() {
        setType("time");
    }

    public String getTimeFormat() {
        return timeFormat;
    }

    public TimeParsingExtractionFunction setTimeFormat(String timeFormat) {
        this.timeFormat = timeFormat;
        return this;
    }

    public String getResultFormat() {
        return resultFormat;
    }

    public TimeParsingExtractionFunction setResultFormat(String resultFormat) {
        this.resultFormat = resultFormat;
        return this;
    }
}
