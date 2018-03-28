package com.salecycle.moonfire.results;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class TimeSeriesQueryResultsTest {
    @Test
    public void deserialise() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        ObjectReader reader = mapper.readerFor(TimeSeriesQueryResults.class);

        String json = "[\n" +
                "  {\n" +
                "    \"timestamp\": \"2012-01-01T00:00:00.000Z\",\n" +
                "    \"result\": { \"sample_name1\": \"<some_value>\", \"sample_name2\": \"<some_value>\", \"sample_divide\": \"<some_value>\" } \n" +
                "  },\n" +
                "  {\n" +
                "    \"timestamp\": \"2012-01-02T00:00:00.000Z\",\n" +
                "    \"result\": { \"sample_name1\": \"<some_value>\", \"sample_name2\": \"<some_value>\", \"sample_divide\": \"<some_value>\" }\n" +
                "  }\n" +
                "]";

        TimeSeriesQueryResults results = reader.readValue(json);

        assertNotNull(results);
    }
}