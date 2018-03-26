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

    public void setTimeFormat(String timeFormat) {
        this.timeFormat = timeFormat;
    }

    public String getResultFormat() {
        return resultFormat;
    }

    public void setResultFormat(String resultFormat) {
        this.resultFormat = resultFormat;
    }
}
