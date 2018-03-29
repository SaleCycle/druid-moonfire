package com.salecycle.moonfire.queries.aggregations;

import com.salecycle.moonfire.queries.models.aggregations.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TypeCheckTest {
    @Test
    public void typeCheck() {
        assertEquals("count", new CountAggregation().getType());
        assertEquals("longSum", new LongSumAggregation().getType());
        assertEquals("doubleSum", new DoubleSumAggregation().getType());
        assertEquals("floatSum", new FloatSumAggregation().getType());
        assertEquals("doubleMin", new DoubleMinAggregation().getType());
        assertEquals("doubleMax", new DoubleMaxAggregation().getType());
        assertEquals("floatMin", new FloatMinAggregation().getType());
        assertEquals("floatMax", new FloatMaxAggregation().getType());
        assertEquals("longMin", new LongMinAggregation().getType());
        assertEquals("longMax", new LongMaxAggregation().getType());
        assertEquals("doubleFirst", new DoubleFirstAggregation().getType());
        assertEquals("doubleLast", new DoubleLastAggregation().getType());
        assertEquals("floatFirst", new FloatFirstAggregation().getType());
        assertEquals("floatLast", new FloatLastAggregation().getType());
        assertEquals("longFirst", new LongFirstAggregation().getType());
        assertEquals("longLast", new LongLastAggregation().getType());
        assertEquals("javascript", new JavascriptAggregation().getType());
        assertEquals("cardinality", new CardinalityAggregation().getType());
        assertEquals("hyperUnique", new HyperUniqueAggregation().getType());
        assertEquals("filtered", new FilteredAggregation().getType());
        assertEquals("thetaSketch", new ThetaSketchAggregation().getType());
    }
}
