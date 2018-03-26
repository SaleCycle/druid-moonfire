package com.salecycle.moonfire.queries.models.aggregations;

/**
 * To use Theta Sketches you must include the datasketches extension in your Druid cluster:
 * druid.extensions.loadList=["druid-datasketches"]
 */
public class ThetaSketchAggregation extends Aggregation {
    private String fieldName;
    private boolean isInputThetaSketch;
    private long size = 16384;

    public ThetaSketchAggregation() {
        setType("thetaSketch");
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public boolean isInputThetaSketch() {
        return isInputThetaSketch;
    }

    public void setInputThetaSketch(boolean inputThetaSketch) {
        isInputThetaSketch = inputThetaSketch;
    }

    public long getSize() {
        return size;
    }

    public void setSize(long size) {
        this.size = size;
    }
}
