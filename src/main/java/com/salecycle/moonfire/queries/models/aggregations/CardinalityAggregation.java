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
        setType("cardinality");
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public List<DimensionSpec> getFields() {
        return fields;
    }

    protected void setFields(List<DimensionSpec> fields) {
        this.fields = fields;
    }

    public boolean isByRow() {
        return byRow;
    }

    public void setByRow(boolean byRow) {
        this.byRow = byRow;
    }

    public boolean isRound() {
        return round;
    }

    public void setRound(boolean round) {
        this.round = round;
    }
}
