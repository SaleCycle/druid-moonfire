package com.salecycle.moonfire.queries.models.extractionfunctions;

public class LowerExtractionFunction extends ExtractionFunction {
    private String locale;

    public LowerExtractionFunction() {
        setType("lower");
    }

    public String getLocale() {
        return locale;
    }

    public LowerExtractionFunction setLocale(String locale) {
        this.locale = locale;
        return this;
    }
}
