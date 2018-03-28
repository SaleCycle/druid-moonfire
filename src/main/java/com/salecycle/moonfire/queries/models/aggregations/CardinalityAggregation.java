package com.salecycle.moonfire.queries.models.aggregations;

import com.salecycle.moonfire.queries.models.dimensionspecs.DimensionSpec;

import java.util.ArrayList;
import java.util.List;

public class CardinalityAggregation extends Aggregation {
    private String fieldName;
    private List<DimensionSpec> fields = new ArrayList<DimensionSpec>();
    private boolean byRow;
    private boolean round;

    public CardinalityAggregation() {
        super("cardinality");
    }

    public String getFieldName() {
        return fieldName;
    }

    public CardinalityAggregation setFieldName(String fieldName) {
        this.fieldName = fieldName;
        return this;
    }

    public List<DimensionSpec> getFields() {
        return fields;
    }

    public CardinalityAggregation setFields(List<DimensionSpec> fields) {
        this.fields = fields;
        return this;
    }

    public boolean isByRow() {
        return byRow;
    }

    public CardinalityAggregation setByRow(boolean byRow) {
        this.byRow = byRow;
        return this;
    }

    public boolean isRound() {
        return round;
    }

    public CardinalityAggregation setRound(boolean round) {
        this.round = round;
        return this;
    }
}
