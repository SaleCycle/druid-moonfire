package com.salecycle.moonfire.queries.models.extractionfunctions;

import com.salecycle.moonfire.queries.models.lookups.Lookup;

public class LookupExtractionFunction extends ExtractionFunction {
    private Lookup lookup;
    private boolean retainMissingValue;
    private boolean injective;
    private boolean optimize = true;
    private String replaceMissingValueWith;

    public LookupExtractionFunction() {
        super("lookup");
    }

    public Lookup getLookup() {
        return lookup;
    }

    public LookupExtractionFunction setLookup(Lookup lookup) {
        this.lookup = lookup;
        return this;
    }

    public boolean isRetainMissingValue() {
        return retainMissingValue;
    }

    public LookupExtractionFunction setRetainMissingValue(boolean retainMissingValue) {
        this.retainMissingValue = retainMissingValue;
        return this;
    }

    public boolean isInjective() {
        return injective;
    }

    public LookupExtractionFunction setInjective(boolean injective) {
        this.injective = injective;
        return this;
    }

    public boolean isOptimize() {
        return optimize;
    }

    public LookupExtractionFunction setOptimize(boolean optimize) {
        this.optimize = optimize;
        return this;
    }

    public String getReplaceMissingValueWith() {
        return replaceMissingValueWith;
    }

    public LookupExtractionFunction setReplaceMissingValueWith(String replaceMissingValueWith) {
        this.replaceMissingValueWith = replaceMissingValueWith;
        return this;
    }
}
