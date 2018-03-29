package com.salecycle.moonfire.queries.toincludes;

import com.salecycle.moonfire.queries.models.toincludes.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TypeCheckTest {
    @Test
    public void typeCheck() {
        assertEquals("all", new AllToInclude().getType());
        assertEquals("none", new NoneToInclude().getType());
        assertEquals("list", new ListToInclude().getType());
    }
}
