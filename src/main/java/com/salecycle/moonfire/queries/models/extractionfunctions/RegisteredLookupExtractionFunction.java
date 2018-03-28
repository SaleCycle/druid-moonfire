package com.salecycle.moonfire.queries.models.extractionfunctions;

public class RegisteredLookupExtractionFunction extends ExtractionFunction {
    private String lookup;
    private boolean retainMissingValue;
    private boolean injective;

    public RegisteredLookupExtractionFunction() {
        setType("registeredLookup");
    }

    public String getLookup() {
        return lookup;
    }

    public RegisteredLookupExtractionFunction setLookup(String lookup) {
        this.lookup = lookup;
        return this;
    }

    public boolean isRetainMissingValue() {
        return retainMissingValue;
    }

    public RegisteredLookupExtractionFunction setRetainMissingValue(boolean retainMissingValue) {
        this.retainMissingValue = retainMissingValue;
        return this;
    }

    public boolean isInjective() {
        return injective;
    }

    public RegisteredLookupExtractionFunction setInjective(boolean injective) {
        this.injective = injective;
        return this;
    }
}
