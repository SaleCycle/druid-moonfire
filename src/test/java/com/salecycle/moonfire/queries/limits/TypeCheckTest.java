package com.salecycle.moonfire.queries.limits;

import com.salecycle.moonfire.queries.models.limits.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TypeCheckTest {
    @Test
    public void typeCheck() {
        assertEquals("default", new DefaultLimitSpec().getType());
    }
}
