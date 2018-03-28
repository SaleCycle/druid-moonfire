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

    public StringFormatExtractionFunction setFormat(String format) {
        this.format = format;
        return this;
    }

    public NullHandling getNullHandling() {
        return nullHandling;
    }

    public StringFormatExtractionFunction setNullHandling(NullHandling nullHandling) {
        this.nullHandling = nullHandling;
        return this;
    }
}
