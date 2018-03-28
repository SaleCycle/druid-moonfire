package com.salecycle.moonfire.results;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertNotNull;

public class TimeBoundaryQueryResultsTest {
    @Test
    public void deserialise() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        ObjectReader reader = mapper.readerFor(TimeBoundaryQueryResults.class);

        String json = "[ {\n" +
                "  \"timestamp\" : \"2013-05-09T18:24:00.000Z\",\n" +
                "  \"result\" : {\n" +
                "    \"minTime\" : \"2013-05-09T18:24:00.000Z\",\n" +
                "    \"maxTime\" : \"2013-05-09T18:37:00.000Z\"\n" +
                "  }\n" +
                "} ]";

        TimeBoundaryQueryResults results = reader.readValue(json);

        assertNotNull(results);
    }
}