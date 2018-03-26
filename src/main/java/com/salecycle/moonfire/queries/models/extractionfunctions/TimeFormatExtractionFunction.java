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

    public void setFormat(String format) {
        this.format = format;
    }

    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

    public String getGranularity() {
        return granularity;
    }

    public void setGranularity(String granularity) {
        this.granularity = granularity;
    }

    public Boolean getAsMillis() {
        return asMillis;
    }

    public void setAsMillis(Boolean asMillis) {
        this.asMillis = asMillis;
    }
}
