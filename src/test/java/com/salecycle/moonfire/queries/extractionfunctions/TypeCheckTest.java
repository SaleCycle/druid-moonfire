package com.salecycle.moonfire.queries.extractionfunctions;

import com.salecycle.moonfire.queries.models.extractionfunctions.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TypeCheckTest {
    @Test
    public void TypeCheck() {
        assertEquals("regex", new RegexExtractionFunction().getType());
        assertEquals("partial", new PartialExtractionFunction().getType());
        assertEquals("searchQuery", new SearchQueryExtractionFunction().getType());
        assertEquals("substring", new SubstringExtractionFunction().getType());
        assertEquals("strlen", new StrlenExtractionFunction().getType());
        assertEquals("timeFormat", new TimeFormatExtractionFunction().getType());
        assertEquals("time", new TimeParsingExtractionFunction().getType());
        assertEquals("javascript", new JavascriptExtractionFunction().getType());
        assertEquals("lookup", new LookupExtractionFunction().getType());
        assertEquals("registeredLookup", new RegisteredLookupExtractionFunction().getType());
        assertEquals("cascade", new CascadeExtractionFunction().getType());
        assertEquals("stringFormat", new StringFormatExtractionFunction().getType());
        assertEquals("upper", new UpperExtractionFunction().getType());
        assertEquals("lower", new LowerExtractionFunction().getType());
        assertEquals("bucket", new BucketExtractionFunction().getType());
    }
}
