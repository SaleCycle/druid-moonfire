package com.salecycle.moonfire.results;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertNotNull;

public class SegmentMetadataQueryResultsTest {
    @Test
    public void deserialise() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        ObjectReader reader = mapper.readerFor(SegmentMetadataQueryResults.class);

        String json = "[ {\n" +
                "  \"id\" : \"some_id\",\n" +
                "  \"intervals\" : [ \"2013-05-13T00:00:00.000Z/2013-05-14T00:00:00.000Z\" ],\n" +
                "  \"columns\" : {\n" +
                "    \"__time\" : { \"type\" : \"LONG\", \"hasMultipleValues\" : false, \"size\" : 407240380, \"cardinality\" : null, \"errorMessage\" : null },\n" +
                "    \"dim1\" : { \"type\" : \"STRING\", \"hasMultipleValues\" : false, \"size\" : 100000, \"cardinality\" : 1944, \"errorMessage\" : null },\n" +
                "    \"dim2\" : { \"type\" : \"STRING\", \"hasMultipleValues\" : true, \"size\" : 100000, \"cardinality\" : 1504, \"errorMessage\" : null },\n" +
                "    \"metric1\" : { \"type\" : \"FLOAT\", \"hasMultipleValues\" : false, \"size\" : 100000, \"cardinality\" : null, \"errorMessage\" : null }\n" +
                "  },\n" +
                "  \"aggregators\" : {\n" +
                "    \"metric1\" : { \"type\" : \"longSum\", \"name\" : \"metric1\", \"fieldName\" : \"metric1\" }\n" +
                "  },\n" +
                "  \"queryGranularity\" : {\n" +
                "    \"type\": \"none\"\n" +
                "  },\n" +
                "  \"size\" : 300000,\n" +
                "  \"numRows\" : 5000000\n" +
                "} ]";

        SegmentMetadataQueryResults results = reader.readValue(json);

        assertNotNull(results);
    }
}