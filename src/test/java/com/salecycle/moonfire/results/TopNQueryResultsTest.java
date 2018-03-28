package com.salecycle.moonfire.results;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class TopNQueryResultsTest {

    @Test
    public void deserialise() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        ObjectReader reader = mapper.readerFor(TopNQueryResults.class);

        String json = "[\n" +
                "  {\n" +
                "    \"timestamp\": \"2013-08-31T00:00:00.000Z\",\n" +
                "    \"result\": [\n" +
                "      {\n" +
                "        \"dim1\": \"dim1_val\",\n" +
                "        \"count\": 111,\n" +
                "        \"some_metrics\": 10669,\n" +
                "        \"average\": 96.11711711711712\n" +
                "      },\n" +
                "      {\n" +
                "        \"dim1\": \"another_dim1_val\",\n" +
                "        \"count\": 88,\n" +
                "        \"some_metrics\": 28344,\n" +
                "        \"average\": 322.09090909090907\n" +
                "      },\n" +
                "      {\n" +
                "        \"dim1\": \"dim1_val3\",\n" +
                "        \"count\": 70,\n" +
                "        \"some_metrics\": 871,\n" +
                "        \"average\": 12.442857142857143\n" +
                "      },\n" +
                "      {\n" +
                "        \"dim1\": \"dim1_val4\",\n" +
                "        \"count\": 62,\n" +
                "        \"some_metrics\": 815,\n" +
                "        \"average\": 13.14516129032258\n" +
                "      },\n" +
                "      {\n" +
                "        \"dim1\": \"dim1_val5\",\n" +
                "        \"count\": 60,\n" +
                "        \"some_metrics\": 2787,\n" +
                "        \"average\": 46.45\n" +
                "      }\n" +
                "    ]\n" +
                "  }\n" +
                "]";

        TopNQueryResults results = reader.readValue(json);

        assertNotNull(results);
    }

}