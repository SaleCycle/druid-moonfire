package com.salecycle.moonfire.queries.models.dimensionspecs;

import com.salecycle.moonfire.queries.models.OutputType;
import com.salecycle.moonfire.queries.models.extractionfunctions.ExtractionFunction;

public class ExtractionDimension extends DimensionSpec {
    private String dimension;
    private String outputName;
    private OutputType outputType;
    private ExtractionFunction extractionFn;

    public ExtractionDimension() {
        setType("extraction");
    }

    public String getDimension() {
        return dimension;
    }

    public void setDimension(String dimension) {
        this.dimension = dimension;
    }

    public String getOutputName() {
        return outputName;
    }

    public void setOutputName(String outputName) {
        this.outputName = outputName;
    }

    public OutputType getOutputType() {
        return outputType;
    }

    public void setOutputType(OutputType outputType) {
        this.outputType = outputType;
    }

    public ExtractionFunction getExtractionFn() {
        return extractionFn;
    }

    public void setExtractionFn(ExtractionFunction extractionFn) {
        this.extractionFn = extractionFn;
    }
}
