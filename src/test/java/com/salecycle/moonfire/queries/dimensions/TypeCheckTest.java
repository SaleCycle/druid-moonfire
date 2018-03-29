package com.salecycle.moonfire.queries.dimensions;

import com.salecycle.moonfire.queries.models.dimensionspecs.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TypeCheckTest {
    @Test
    public void TypeCheck() {
        assertEquals("default", new DefaultDimension().getType());
        assertEquals("extraction", new ExtractionDimension().getType());
        assertEquals("listFiltered", new ListFilteredDimensionSpec().getType());
        assertEquals("regexFiltered", new RegexFilteredDimensionSpec().getType());
        assertEquals("lookup", new LookupDimensionSpec().getType());
        assertEquals("lookup", new RegisteredLookupDimensionSpec().getType());
    }
}
