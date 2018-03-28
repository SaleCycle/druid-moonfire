package com.salecycle.moonfire.queries.models.dimensionspecs;

import com.salecycle.moonfire.queries.models.OutputType;
import com.salecycle.moonfire.queries.models.extractionfunctions.ExtractionFunction;

public class ExtractionDimension extends DimensionSpec {
    private String dimension;
    private String outputName;
    private OutputType outputType;
    private ExtractionFunction extractionFn;

    public ExtractionDimension() {
        super("extraction");
    }

    public String getDimension() {
        return dimension;
    }

    public ExtractionDimension setDimension(String dimension) {
        this.dimension = dimension;
        return this;
    }

    public String getOutputName() {
        return outputName;
    }

    public ExtractionDimension setOutputName(String outputName) {
        this.outputName = outputName;
        return this;
    }

    public OutputType getOutputType() {
        return outputType;
    }

    public ExtractionDimension setOutputType(OutputType outputType) {
        this.outputType = outputType;
        return this;
    }

    public ExtractionFunction getExtractionFn() {
        return extractionFn;
    }

    public ExtractionDimension setExtractionFn(ExtractionFunction extractionFn) {
        this.extractionFn = extractionFn;
        return this;
    }
}
