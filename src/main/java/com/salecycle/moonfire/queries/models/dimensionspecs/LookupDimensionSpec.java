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

    public LookupDimensionSpec setDimension(String dimension) {
        this.dimension = dimension;
        return this;
    }

    public String getOutputName() {
        return outputName;
    }

    public LookupDimensionSpec setOutputName(String outputName) {
        this.outputName = outputName;
        return this;
    }

    public String getReplaceMissingValueWith() {
        return replaceMissingValueWith;
    }

    public LookupDimensionSpec setReplaceMissingValueWith(String replaceMissingValueWith) {
        this.replaceMissingValueWith = replaceMissingValueWith;
        return this;
    }

    public boolean isRetainMissingValue() {
        return retainMissingValue;
    }

    public LookupDimensionSpec setRetainMissingValue(boolean retainMissingValue) {
        this.retainMissingValue = retainMissingValue;
        return this;
    }

    public Lookup getLookup() {
        return lookup;
    }

    public LookupDimensionSpec setLookup(Lookup lookup) {
        this.lookup = lookup;
        return this;
    }

    public boolean isInjective() {
        return injective;
    }

    public LookupDimensionSpec setInjective(boolean injective) {
        this.injective = injective;
        return this;
    }

    public boolean isOptimize() {
        return optimize;
    }

    public LookupDimensionSpec setOptimize(boolean optimize) {
        this.optimize = optimize;
        return this;
    }
}
