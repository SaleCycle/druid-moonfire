package com.salecycle.moonfire.queries.models.extractionfunctions;

import com.salecycle.moonfire.queries.models.lookups.Lookup;

public class LookupExtractionFunction extends ExtractionFunction {
    private Lookup lookup;
    private boolean retainMissingValue;
    private boolean injective;
    private boolean optimize = true;
    private String replaceMissingValueWith;

    public LookupExtractionFunction() {
        setType("lookup");
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

    public void setRetainMissingValue(boolean retainMissingValue) {
        this.retainMissingValue = retainMissingValue;
    }

    public boolean isInjective() {
        return injective;
    }

    public void setInjective(boolean injective) {
        this.injective = injective;
    }

    public String getReplaceMissingValueWith() {
        return replaceMissingValueWith;
    }

    public void setReplaceMissingValueWith(String replaceMissingValueWith) {
        this.replaceMissingValueWith = replaceMissingValueWith;
    }

    public boolean isOptimize() {
        return optimize;
    }

    public void setOptimize(boolean optimize) {
        this.optimize = optimize;
    }
}
