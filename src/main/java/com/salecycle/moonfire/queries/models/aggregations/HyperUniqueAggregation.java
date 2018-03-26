package com.salecycle.moonfire.queries.models.aggregations;

public class HyperUniqueAggregation extends Aggregation {
    private String fieldName;
    private boolean isInputHyperUnique;
    private boolean round;

    public HyperUniqueAggregation() {
        setType("longSum");
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public boolean isInputHyperUnique() {
        return isInputHyperUnique;
    }

    public void setInputHyperUnique(boolean inputHyperUnique) {
        isInputHyperUnique = inputHyperUnique;
    }

    public boolean isRound() {
        return round;
    }

    public void setRound(boolean round) {
        this.round = round;
    }
}
