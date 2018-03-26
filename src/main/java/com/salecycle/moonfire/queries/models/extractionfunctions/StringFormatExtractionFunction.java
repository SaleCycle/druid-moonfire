package com.salecycle.moonfire.queries.models.extractionfunctions;

public class StringFormatExtractionFunction extends ExtractionFunction {
    private String format;
    private NullHandling nullHandling;

    public StringFormatExtractionFunction() {
        setType("stringFormat");
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public NullHandling getNullHandling() {
        return nullHandling;
    }

    public void setNullHandling(NullHandling nullHandling) {
        this.nullHandling = nullHandling;
    }
}
