package com.salecycle.moonfire.queries.havingspecs;

import com.salecycle.moonfire.queries.models.havingspecs.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TypeCheckTest {
    @Test
    public void typeCheck() {
        assertEquals("filter", new QueryFilterHavingSpec().getType());
        assertEquals("greaterThan", new GreaterThanHavingSpec().getType());
        assertEquals("lessThan", new LessThanHavingSpec().getType());
        assertEquals("dimSelector", new DimensionSelectorHavingSpec().getType());
        assertEquals("and", new AndHavingSpec().getType());
        assertEquals("or", new OrHavingSpec().getType());
        assertEquals("not", new NotHavingSpec().getType());
    }
}
