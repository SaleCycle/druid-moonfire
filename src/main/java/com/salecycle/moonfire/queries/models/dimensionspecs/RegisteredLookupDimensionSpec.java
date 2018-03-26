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

    public void setDimensionName(String dimensionName) {
        this.dimensionName = dimensionName;
    }

    public String getOutputName() {
        return outputName;
    }

    public void setOutputName(String outputName) {
        this.outputName = outputName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
