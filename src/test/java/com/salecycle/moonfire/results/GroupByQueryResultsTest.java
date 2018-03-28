package com.salecycle.moonfire.results;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertNotNull;

public class GroupByQueryResultsTest {
    @Test
    public void deserialise() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        ObjectReader reader = mapper.readerFor(GroupByQueryResults.class);

        String json = "[ \n" +
                "  {\n" +
                "    \"version\" : \"v1\",\n" +
                "    \"timestamp\" : \"2012-01-01T00:00:00.000Z\",\n" +
                "    \"event\" : {\n" +
                "      \"country\" : \"<some_dim_value_one>\",\n" +
                "      \"device\" : \"<some_dim_value_two>\",\n" +
                "      \"total_usage\" : \"<some_value_one>\",\n" +
                "      \"data_transfer\" :\"<some_value_two>\",\n" +
                "      \"avg_usage\" : \"<some_avg_usage_value>\"\n" +
                "    }\n" +
                "  }, \n" +
                "  {\n" +
                "    \"version\" : \"v1\",\n" +
                "    \"timestamp\" : \"2012-01-01T00:00:12.000Z\",\n" +
                "    \"event\" : {\n" +
                "      \"dim1\" : \"<some_other_dim_value_one>\",\n" +
                "      \"dim2\" : \"<some_other_dim_value_two>\",\n" +
                "      \"sample_name1\" : \"<some_other_value_one>\",\n" +
                "      \"sample_name2\" :\"<some_other_value_two>\",\n" +
                "      \"avg_usage\" : \"<some_other_avg_usage_value>\"\n" +
                "    }\n" +
                "  }\n" +
                "]";

        GroupByQueryResults results = reader.readValue(json);

        assertNotNull(results);
    }
}