package com.salecycle.moonfire.queries.models.postaggregations;

import java.util.List;

/**
 * To use Theta Sketches you must include the datasketches extension in your Druid cluster:
 * druid.extensions.loadList=["druid-datasketches"]
 */
public class ThetaSketchSetOperationsPostAggregation extends PostAggregation {
    private ThetaSketchFunction func;
    private List<FieldAccessPostAggregation> fields;
    private long size = 16384;

    public ThetaSketchSetOperationsPostAggregation() {
        setType("thetaSketchEstimate");
    }

    public ThetaSketchFunction getFunc() {
        return func;
    }

    public ThetaSketchSetOperationsPostAggregation setFunc(ThetaSketchFunction func) {
        this.func = func;
        return this;
    }

    public List<FieldAccessPostAggregation> getFields() {
        return fields;
    }

    public ThetaSketchSetOperationsPostAggregation setFields(List<FieldAccessPostAggregation> fields) {
        this.fields = fields;
        return this;
    }

    public long getSize() {
        return size;
    }

    public ThetaSketchSetOperationsPostAggregation setSize(long size) {
        this.size = size;
        return this;
    }
}
