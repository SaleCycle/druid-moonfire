package com.salecycle.moonfire.queries.models.postaggregations;

/**
 * To use Theta Sketches you must include the datasketches extension in your Druid cluster:
 * druid.extensions.loadList=["druid-datasketches"]
 */
public class ThetaSketchEstimatePostAggregation extends PostAggregation {
    private FieldAccessPostAggregation field;

    public ThetaSketchEstimatePostAggregation() {
        super("thetaSketchEstimate");
    }

    public FieldAccessPostAggregation getField() {
        return field;
    }

    public ThetaSketchEstimatePostAggregation setField(FieldAccessPostAggregation field) {
        this.field = field;
        return this;
    }
}
