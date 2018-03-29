package com.salecycle.moonfire.queries.granularities;

import com.salecycle.moonfire.queries.models.granularities.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TypeCheckTest {
    @Test
    public void typeCheck() {
        assertEquals("period", new PeriodGranularity().getType());
        assertEquals("duration", new DurationGranularity().getType());
    }
}
