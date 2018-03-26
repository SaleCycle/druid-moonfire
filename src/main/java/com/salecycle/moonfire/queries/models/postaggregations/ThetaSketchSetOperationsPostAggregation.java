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

    public void setFunc(ThetaSketchFunction func) {
        this.func = func;
    }

    public List<FieldAccessPostAggregation> getFields() {
        return fields;
    }

    public void setFields(List<FieldAccessPostAggregation> fields) {
        this.fields = fields;
    }

    public long getSize() {
        return size;
    }

    public void setSize(long size) {
        this.size = size;
    }
}
