package com.salecycle.moonfire.queries.lookups;

import com.salecycle.moonfire.queries.models.lookups.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TypeCheckTest {
    @Test
    public void typeCheck() {
        assertEquals("map", new MapLookup().getType());
        assertEquals("namespace", new NamespaceLookup().getType());
    }
}
