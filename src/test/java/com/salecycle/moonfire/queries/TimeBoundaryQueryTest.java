package com.salecycle.moonfire.queries;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.salecycle.moonfire.queries.models.Bound;
import com.salecycle.moonfire.queries.models.contexts.DefaultContext;
import com.salecycle.moonfire.queries.models.datasources.TableDataSource;
import com.salecycle.moonfire.queries.models.extractionfunctions.JavascriptExtractionFunction;
import com.salecycle.moonfire.queries.models.filters.*;
import org.junit.Test;

import static org.junit.Assert.*;

public class TimeBoundaryQueryTest {

    @Test
    public void serialisation() throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper().setSerializationInclusion(JsonInclude.Include.NON_NULL);
        ObjectWriter writer = mapper.writerFor(TimeBoundaryQuery.class);

        DefaultContext context = new DefaultContext();
        context.put("timeout", 100);
        context.put("useCache", true);
        context.put("chunkPeriod", "P0D");

        LikeFilter likeFilter = new LikeFilter("myLikeDimension", "pattern")
                .setEscape("\\");

        RegexFilter regexFilter = new RegexFilter()
                .setDimension("myRegexDimension")
                .setPattern("$[i]^");

        SelectorFilter selectorFilter = new SelectorFilter()
                .setDimension("myDimension")
                .setValue("myValue")
                .setExtractionFn(new JavascriptExtractionFunction().setFunction("function() {}"));

        NotFilter notFilter = new NotFilter()
                .setField(selectorFilter);

        TimeBoundaryQuery query = new TimeBoundaryQuery(new TableDataSource("sample_datasource"))
                .setBound(Bound.maxTime)
                .setFilter(new AndFilter().addField(likeFilter).addField(notFilter).addField(regexFilter))
                .setContext(context);

        String json = writer.withDefaultPrettyPrinter().writeValueAsString(query);
        String expected =
                "{\n" +
                "  \"queryType\" : \"timeBoundary\",\n" +
                "  \"dataSource\" : {\n" +
                "    \"type\" : \"table\",\n" +
                "    \"name\" : \"sample_datasource\"\n" +
                "  },\n" +
                "  \"bound\" : \"maxTime\",\n" +
                "  \"filter\" : {\n" +
                "    \"type\" : \"and\",\n" +
                "    \"fields\" : [ {\n" +
                "      \"type\" : \"like\",\n" +
                "      \"dimension\" : \"myLikeDimension\",\n" +
                "      \"pattern\" : \"pattern\",\n" +
                "      \"escape\" : \"\\\\\"\n" +
                "    }, {\n" +
                "      \"type\" : \"not\",\n" +
                "      \"field\" : {\n" +
                "        \"type\" : \"selector\",\n" +
                "        \"extractionFn\" : {\n" +
                "          \"type\" : \"javascript\",\n" +
                "          \"function\" : \"function() {}\",\n" +
                "          \"injective\" : false\n" +
                "        },\n" +
                "        \"dimension\" : \"myDimension\",\n" +
                "        \"value\" : \"myValue\"\n" +
                "      }\n" +
                "    }, {\n" +
                "      \"type\" : \"regex\",\n" +
                "      \"dimension\" : \"myRegexDimension\",\n" +
                "      \"pattern\" : \"$[i]^\"\n" +
                "    } ]\n" +
                "  },\n" +
                "  \"context\" : {\n" +
                "    \"useCache\" : true,\n" +
                "    \"chunkPeriod\" : \"P0D\",\n" +
                "    \"timeout\" : 100\n" +
                "  }\n" +
                "}";
        assertEquals(expected, json);
    }
}