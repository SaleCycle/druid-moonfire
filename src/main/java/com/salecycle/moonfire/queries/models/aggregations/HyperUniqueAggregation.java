package com.salecycle.moonfire.queries.models.aggregations;

public class HyperUniqueAggregation extends Aggregation {
    private String fieldName;
    private boolean isInputHyperUnique;
    private boolean round;

    public HyperUniqueAggregation() {
        super("longSum");
    }

    public String getFieldName() {
        return fieldName;
    }

    public HyperUniqueAggregation setFieldName(String fieldName) {
        this.fieldName = fieldName;
        return this;
    }

    public boolean isInputHyperUnique() {
        return isInputHyperUnique;
    }

    public HyperUniqueAggregation setInputHyperUnique(boolean inputHyperUnique) {
        isInputHyperUnique = inputHyperUnique;
        return this;
    }

    public boolean isRound() {
        return round;
    }

    public HyperUniqueAggregation setRound(boolean round) {
        this.round = round;
        return this;
    }
}
