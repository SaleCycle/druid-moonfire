package com.salecycle.moonfire.queries.models.extractionfunctions;

public class UpperExtractionFunction extends ExtractionFunction {
    private String locale;

    public UpperExtractionFunction() {
        setType("upper");
    }

    public String getLocale() {
        return locale;
    }

    public UpperExtractionFunction setLocale(String locale) {
        this.locale = locale;
        return this;
    }
}
