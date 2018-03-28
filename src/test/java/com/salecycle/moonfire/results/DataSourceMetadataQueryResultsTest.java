package com.salecycle.moonfire.results;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertNotNull;

public class DataSourceMetadataQueryResultsTest {
    @Test
    public void deserialise() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        ObjectReader reader = mapper.readerFor(DataSourceMetadataQueryResults.class);

        String json = "[ {\n" +
                "  \"timestamp\" : \"2013-05-09T18:24:00.000Z\",\n" +
                "  \"result\" : {\n" +
                "    \"maxIngestedEventTime\" : \"2013-05-09T18:24:09.007Z\"\n" +
                "  }\n" +
                "} ]";

        DataSourceMetadataQueryResults results = reader.readValue(json);

        assertNotNull(results);
    }
}