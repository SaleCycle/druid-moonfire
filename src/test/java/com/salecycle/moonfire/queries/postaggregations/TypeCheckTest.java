package com.salecycle.moonfire.queries.postaggregations;

import com.salecycle.moonfire.queries.models.postaggregations.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TypeCheckTest {
    @Test
    public void typeCheck() {
        assertEquals("arithmetic", new ArithmeticPostAggregation().getType());
        assertEquals("fieldAccess", new FieldAccessPostAggregation().getType());
        assertEquals("finalizingFieldAccess", new FinalizingFieldAccessPostAggregation().getType());
        assertEquals("constant", new ConstantPostAggregation().getType());
        assertEquals("doubleGreatest", new DoubleGreatestPostAggregation().getType());
        assertEquals("longGreatest", new LongGreatestPostAggregation().getType());
        assertEquals("doubleLeast", new DoubleLeastPostAggregation().getType());
        assertEquals("longLeast", new LongLeastPostAggregation().getType());
        assertEquals("javascript", new JavascriptPostAggregation().getType());
        assertEquals("hyperUniqueCardinality", new HyperUniqueCardinalityPostAggregation().getType());
    }
}
