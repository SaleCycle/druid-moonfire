package com.salecycle.moonfire.queries.models.dimensionspecs;

import com.salecycle.moonfire.queries.models.lookups.Lookup;

public class LookupDimensionSpec extends DimensionSpec {
    private String dimension;
    private String outputName;
    private String replaceMissingValueWith;
    private boolean retainMissingValue;
    private Lookup lookup;
    private boolean injective;
    private boolean optimize = true;

    public LookupDimensionSpec() {
        setType("lookup");
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

    public String getReplaceMissingValueWith() {
        return replaceMissingValueWith;
    }

    public void setReplaceMissingValueWith(String replaceMissingValueWith) {
        this.replaceMissingValueWith = replaceMissingValueWith;
    }

    public boolean getRetainMissingValue() {
        return retainMissingValue;
    }

    public void setRetainMissingValue(boolean retainMissingValue) {
        this.retainMissingValue = retainMissingValue;
    }

    public Lookup getLookup() {
        return lookup;
    }

    public void setLookup(Lookup lookup) {
        this.lookup = lookup;
    }

    public boolean isRetainMissingValue() {
        return retainMissingValue;
    }

    public boolean isInjective() {
        return injective;
    }

    public void setInjective(boolean injective) {
        this.injective = injective;
    }

    public boolean isOptimize() {
        return optimize;
    }

    public void setOptimize(boolean optimize) {
        this.optimize = optimize;
    }
}
