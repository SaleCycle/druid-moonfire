package com.salecycle.moonfire.queries;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.salecycle.moonfire.queries.models.AnalysisType;
import com.salecycle.moonfire.queries.models.toincludes.NoneToInclude;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class SegmentMetadataQueryTest {

    @Test
    public void serialisation() throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper().setSerializationInclusion(JsonInclude.Include.NON_NULL);
        ObjectWriter writer = mapper.writerFor(SegmentMetadataQuery.class);

        List<String> intervals = Collections.singletonList("2012-01-01T00:00:00.000/2012-01-03T00:00:00.000");
        
        SegmentMetadataQuery query = new SegmentMetadataQuery("sample_datasource")
                .setIntervals(intervals)
                .setToInclude(new NoneToInclude())
                .setAnalysisTypes(new ArrayList<AnalysisType>() {{
                    add(AnalysisType.interval);
                }})
                .setMerge(false)
                .setLenientAggregatorMerge(false);

        String json = writer.withDefaultPrettyPrinter().writeValueAsString(query);
        String expected =
                "{\n" +
                "  \"queryType\" : \"segmentMetadata\",\n" +
                "  \"dataSource\" : \"sample_datasource\",\n" +
                "  \"intervals\" : [ \"2012-01-01T00:00:00.000/2012-01-03T00:00:00.000\" ],\n" +
                "  \"toInclude\" : {\n" +
                "    \"type\" : \"none\"\n" +
                "  },\n" +
                "  \"merge\" : false,\n" +
                "  \"analysisTypes\" : [ \"interval\" ],\n" +
                "  \"lenientAggregatorMerge\" : false\n" +
                "}";
        assertEquals(expected, json);
    }
}