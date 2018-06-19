package com.salecycle.moonfire.queries;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.salecycle.moonfire.queries.models.contexts.DefaultContext;
import org.junit.Test;

import static org.junit.Assert.*;

public class DataSourceMetadataQueryTest {

    @Test
    public void serialisation() throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper().setSerializationInclusion(JsonInclude.Include.NON_NULL);
        ObjectWriter writer = mapper.writerFor(DataSourceMetadataQuery.class);

        DefaultContext context = new DefaultContext();
        context.put("timeout", 100);
        context.put("useCache", true);
        context.put("chunkPeriod", "P0D");
        DataSourceMetadataQuery query = new DataSourceMetadataQuery("sample_datasource")
                .setContext(context);

        String json = writer.withDefaultPrettyPrinter().writeValueAsString(query);
        String expected =
                "{\n" +
                "  \"queryType\" : \"dataSourceMetadata\",\n" +
                "  \"dataSource\" : \"sample_datasource\",\n" +
                "  \"context\" : {\n" +
                "    \"useCache\" : true,\n" +
                "    \"chunkPeriod\" : \"P0D\",\n" +
                "    \"timeout\" : 100\n" +
                "  }\n" +
                "}";
        assertEquals(expected, json);
    }
}