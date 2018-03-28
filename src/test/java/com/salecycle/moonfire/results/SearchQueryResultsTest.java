package com.salecycle.moonfire.results;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertNotNull;

public class SearchQueryResultsTest {
    @Test
    public void deserialise() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        ObjectReader reader = mapper.readerFor(SearchQueryResults.class);

        String json = "[\n" +
                "  {\n" +
                "    \"timestamp\": \"2012-01-01T00:00:00.000Z\",\n" +
                "    \"result\": [\n" +
                "      {\n" +
                "        \"dimension\": \"dim1\",\n" +
                "        \"value\": \"Ke$ha\",\n" +
                "        \"count\": 3\n" +
                "      },\n" +
                "      {\n" +
                "        \"dimension\": \"dim2\",\n" +
                "        \"value\": \"Ke$haForPresident\",\n" +
                "        \"count\": 1\n" +
                "      }\n" +
                "    ]\n" +
                "  },\n" +
                "  {\n" +
                "    \"timestamp\": \"2012-01-02T00:00:00.000Z\",\n" +
                "    \"result\": [\n" +
                "      {\n" +
                "        \"dimension\": \"dim1\",\n" +
                "        \"value\": \"SomethingThatContainsKe\",\n" +
                "        \"count\": 1\n" +
                "      },\n" +
                "      {\n" +
                "        \"dimension\": \"dim2\",\n" +
                "        \"value\": \"SomethingElseThatContainsKe\",\n" +
                "        \"count\": 2\n" +
                "      }\n" +
                "    ]\n" +
                "  }\n" +
                "]";

        SearchQueryResults results = reader.readValue(json);

        assertNotNull(results);
    }
}