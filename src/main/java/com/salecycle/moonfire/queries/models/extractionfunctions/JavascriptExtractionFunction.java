package com.salecycle.moonfire.queries.models.extractionfunctions;

public class JavascriptExtractionFunction extends ExtractionFunction {
    private String function;
    private boolean injective;

    public JavascriptExtractionFunction() {
        super("javascript");
    }

    public String getFunction() {
        return function;
    }

    public JavascriptExtractionFunction setFunction(String function) {
        this.function = function;
        return this;
    }

    public boolean isInjective() {
        return injective;
    }

    public JavascriptExtractionFunction setInjective(boolean injective) {
        this.injective = injective;
        return this;
    }
}
