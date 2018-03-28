package com.salecycle.moonfire.queries.models.dimensionspecs;

import com.salecycle.moonfire.queries.models.OutputType;

public class DefaultDimension extends DimensionSpec {
    private String dimension;
    private String outputName;
    private OutputType outputType;

    public DefaultDimension() {
        setType("default");
    }

    public String getDimension() {
        return dimension;
    }

    public DefaultDimension setDimension(String dimension) {
        this.dimension = dimension;
        return this;
    }

    public String getOutputName() {
        return outputName;
    }

    public DefaultDimension setOutputName(String outputName) {
        this.outputName = outputName;
        return this;
    }

    public OutputType getOutputType() {
        return outputType;
    }

    public DefaultDimension setOutputType(OutputType outputType) {
        this.outputType = outputType;
        return this;
    }
}
