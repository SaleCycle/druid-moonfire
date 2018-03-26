package com.salecycle.moonfire.queries.models.extractionfunctions;

public class JavascriptExtractionFunction extends ExtractionFunction {
    private String function;
    private boolean injective;

    public JavascriptExtractionFunction() {
        setType("javascript");
    }

    public String getFunction() {
        return function;
    }

    public void setFunction(String function) {
        this.function = function;
    }

    public boolean isInjective() {
        return injective;
    }

    public void setInjective(boolean injective) {
        this.injective = injective;
    }
}
