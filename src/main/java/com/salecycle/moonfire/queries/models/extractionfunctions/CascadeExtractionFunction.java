package com.salecycle.moonfire.queries.models.extractionfunctions;

import java.util.List;

public class CascadeExtractionFunction extends ExtractionFunction {
    private List<ExtractionFunction> extractionFns;

    public CascadeExtractionFunction() {
        setType("cascade");
    }

    public List<ExtractionFunction> getExtractionFns() {
        return extractionFns;
    }

    public CascadeExtractionFunction setExtractionFns(List<ExtractionFunction> extractionFns) {
        this.extractionFns = extractionFns;
        return this;
    }
}
