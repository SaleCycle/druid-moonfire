package com.salecycle.moonfire.queries.filters;

import com.salecycle.moonfire.queries.models.filters.*;
import com.salecycle.moonfire.queries.models.filters.searchqueryspecs.*;
import org.junit.Test;

import java.util.Collections;

import static org.junit.Assert.assertEquals;

public class TypeCheckTest {
    @Test
    public void TypeCheck() {
        assertEquals("selector", new SelectorFilter().getType());
        assertEquals("columnComparison", new ColumnComparisonFilter().getType());
        assertEquals("regex", new RegexFilter().getType());
        assertEquals("and", new AndFilter().getType());
        assertEquals("or", new OrFilter().getType());
        assertEquals("not", new NotFilter().getType());
        assertEquals("javascript", new JavascriptFilter().getType());
        assertEquals("search", new SearchFilter("myDimension", new ContainsSearchQuerySpec("value")).getType());
        assertEquals("contains", new ContainsSearchQuerySpec("value").getType());
        assertEquals("insensitive_contains", new InsensitiveContainsSearchQuerySpec("value").getType());
        assertEquals("fragment", new FragmentSearchQuerySpec("value").getType());
        assertEquals("in", new InFilter().getType());
        assertEquals("like", new LikeFilter("dimension", "pattern").getType());
        assertEquals("bound", new BoundFilter("dimension").getType());
        assertEquals("interval", new IntervalFilter("dimension", Collections.<String>emptyList()).getType());
    }
}
