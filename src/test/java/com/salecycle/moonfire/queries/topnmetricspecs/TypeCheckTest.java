package com.salecycle.moonfire.queries.topnmetricspecs;

import com.salecycle.moonfire.queries.models.topnmetricspecs.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TypeCheckTest {
    @Test
    public void typeCheck() {
        assertEquals("numeric", new NumericTopNMetricSpec("metric").getType());
        assertEquals("dimension", new DimensionTopNMetricSpec().getType());
        assertEquals("inverted", new InvertedTopNMetricSpec("metric").getType());
    }
}
