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

    public ThetaSketchAggregation setFieldName(String fieldName) {
        this.fieldName = fieldName;
        return this;
    }

    public boolean isInputThetaSketch() {
        return isInputThetaSketch;
    }

    public ThetaSketchAggregation setInputThetaSketch(boolean inputThetaSketch) {
        isInputThetaSketch = inputThetaSketch;
        return this;
    }

    public long getSize() {
        return size;
    }

    public ThetaSketchAggregation setSize(long size) {
        this.size = size;
        return this;
    }
}
