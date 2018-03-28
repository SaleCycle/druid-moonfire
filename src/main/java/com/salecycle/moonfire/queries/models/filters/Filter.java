package com.salecycle.moonfire.queries.models.filters;

import com.salecycle.moonfire.queries.models.extractionfunctions.ExtractionFunction;

public abstract class Filter {
    private String type;
    private ExtractionFunction extractionFn;

    protected Filter(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public ExtractionFunction getExtractionFn() {
        return extractionFn;
    }

    public <T extends Filter> T setExtractionFn(ExtractionFunction extractionFn) {
        this.extractionFn = extractionFn;
        return (T)this;
    }
}
