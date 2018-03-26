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

    public void setLookup(String lookup) {
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
}
