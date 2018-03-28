package com.salecycle.moonfire.queries.models.dimensionspecs;

public class RegisteredLookupDimensionSpec extends DimensionSpec {
    private String dimensionName;
    private String outputName;
    private String name;

    public RegisteredLookupDimensionSpec() {
        setType("lookup");
    }

    public String getDimensionName() {
        return dimensionName;
    }

    public RegisteredLookupDimensionSpec setDimensionName(String dimensionName) {
        this.dimensionName = dimensionName;
        return this;
    }

    public String getOutputName() {
        return outputName;
    }

    public RegisteredLookupDimensionSpec setOutputName(String outputName) {
        this.outputName = outputName;
        return this;
    }

    public String getName() {
        return name;
    }

    public RegisteredLookupDimensionSpec setName(String name) {
        this.name = name;
        return this;
    }
}
