package com.salecycle.moonfire.queries;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.salecycle.moonfire.queries.models.Ordering;
import com.salecycle.moonfire.queries.models.datasources.TableDataSource;
import com.salecycle.moonfire.queries.models.granularities.Granularity;
import com.salecycle.moonfire.queries.models.searchqueryspecs.ContainsSearchQuerySpec;
import com.salecycle.moonfire.queries.models.searchqueryspecs.SearchQuerySpec;
import org.junit.Test;

import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class SearchQueryTest {

    @Test
    public void serialisation() throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper().setSerializationInclusion(JsonInclude.Include.NON_NULL);
        ObjectWriter writer = mapper.writerFor(SearchQuery.class);

        List<String> intervals = Collections.singletonList("2012-01-01T00:00:00.000/2012-01-03T00:00:00.000");
        Granularity granularity = Granularity.day;
        SearchQuerySpec searchQuerySpec = new ContainsSearchQuerySpec().setCase_sensitive(true).setValue("sample_value");

        SearchQuery query = new SearchQuery(new TableDataSource("sample_datasource"), intervals, granularity, searchQuerySpec)
                .setLimit(5)
                .setSearchDimensions(Collections.singletonList("sample_dimension"))
                .setSort(Ordering.alphanumeric);

        String json = writer.withDefaultPrettyPrinter().writeValueAsString(query);
        String expected =
                "{\n" +
                "  \"queryType\" : \"search\",\n" +
                "  \"dataSource\" : {\n" +
                "    \"type\" : \"table\",\n" +
                "    \"name\" : \"sample_datasource\"\n" +
                "  },\n" +
                "  \"granularity\" : \"day\",\n" +
                "  \"limit\" : 5,\n" +
                "  \"intervals\" : [ \"2012-01-01T00:00:00.000/2012-01-03T00:00:00.000\" ],\n" +
                "  \"searchDimensions\" : [ \"sample_dimension\" ],\n" +
                "  \"query\" : {\n" +
                "    \"type\" : \"contains\",\n" +
                "    \"value\" : \"sample_value\",\n" +
                "    \"case_sensitive\" : true\n" +
                "  },\n" +
                "  \"sort\" : \"alphanumeric\"\n" +
                "}";
        assertEquals(expected, json);
    }
}