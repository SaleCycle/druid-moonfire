package com.salecycle.moonfire.queries.models.extractionfunctions;

public class TimeFormatExtractionFunction extends ExtractionFunction {
    private String format;
    private String timeZone;
    private String locale;
    private String granularity;
    private Boolean asMillis;

    public TimeFormatExtractionFunction() {
        setType("timeFormat");
    }

    public String getFormat() {
        return format;
    }

    public TimeFormatExtractionFunction setFormat(String format) {
        this.format = format;
        return this;
    }

    public String getTimeZone() {
        return timeZone;
    }

    public TimeFormatExtractionFunction setTimeZone(String timeZone) {
        this.timeZone = timeZone;
        return this;
    }

    public String getLocale() {
        return locale;
    }

    public TimeFormatExtractionFunction setLocale(String locale) {
        this.locale = locale;
        return this;
    }

    public String getGranularity() {
        return granularity;
    }

    public TimeFormatExtractionFunction setGranularity(String granularity) {
        this.granularity = granularity;
        return this;
    }

    public Boolean getAsMillis() {
        return asMillis;
    }

    public TimeFormatExtractionFunction setAsMillis(Boolean asMillis) {
        this.asMillis = asMillis;
        return this;
    }
}
