package com.salecycle.moonfire.queries.searchqueryspecs;

import com.salecycle.moonfire.queries.models.searchqueryspecs.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TypeCheckTest {
    @Test
    public void typeCheck() {
        assertEquals("insensitive_contains", new InsensitiveContainsSearchQuerySpec().getType());
        assertEquals("fragment", new FragmentSearchQuerySpec().getType());
        assertEquals("contains", new ContainsSearchQuerySpec().getType());
        assertEquals("regex", new RegexSearchQuerySpec().getType());
    }
}
