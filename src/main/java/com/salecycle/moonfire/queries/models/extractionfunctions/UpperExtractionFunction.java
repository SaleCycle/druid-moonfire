package com.salecycle.moonfire.queries.models.extractionfunctions;

public class UpperExtractionFunction extends ExtractionFunction {
    private String locale;

    public UpperExtractionFunction() {
        setType("upper");
    }

    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }
}
