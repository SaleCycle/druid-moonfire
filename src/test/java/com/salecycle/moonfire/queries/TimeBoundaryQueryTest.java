package com.salecycle.moonfire.queries;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.salecycle.moonfire.queries.models.Bound;
import com.salecycle.moonfire.queries.models.contexts.DefaultContext;
import com.salecycle.moonfire.queries.models.extractionfunctions.JavascriptExtractionFunction;
import com.salecycle.moonfire.queries.models.filters.*;
import org.junit.Test;

import static org.junit.Assert.*;

public class TimeBoundaryQueryTest {

    @Test
    public void serialisation() throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        ObjectWriter writer = mapper.writerFor(TimeBoundaryQuery.class);

        TimeBoundaryQuery query = new TimeBoundaryQuery();
        query.setDataSource("sample_datasource");
        query.setBound(Bound.maxTime);

        LikeFilter likeFilter = new LikeFilter();
        likeFilter.setDimension("myLikeDimension");
        likeFilter.setEscape("\\");
        likeFilter.setPattern("pattern");

        RegexFilter regexFilter = new RegexFilter();
        regexFilter.setDimension("myRegexDimension");
        regexFilter.setPattern("$[i]^");

        SelectorFilter selectorFilter = new SelectorFilter();
        selectorFilter.setDimension("myDimension");
        selectorFilter.setValue("myValue");
        JavascriptExtractionFunction jsExctractionFunction = new JavascriptExtractionFunction();
        jsExctractionFunction.setFunction("function() {}");
        selectorFilter.setExtractionFn(jsExctractionFunction);
        NotFilter notFilter = new NotFilter();
        notFilter.setField(selectorFilter);

        AndFilter andFilter = new AndFilter();
        andFilter.getFields().add(likeFilter);
        andFilter.getFields().add(notFilter);
        andFilter.getFields().add(regexFilter);

        query.setFilter(andFilter);

        DefaultContext context = new DefaultContext();
        context.put("timeout", 100);
        context.put("useCache", true);
        context.put("chunkPeriod", "P0D");
        query.setContext(context);

        String json = writer.withDefaultPrettyPrinter().writeValueAsString(query);
        String expected =
                "{\n" +
                "  \"queryType\" : \"timeBoundary\",\n" +
                "  \"dataSource\" : \"sample_datasource\",\n" +
                "  \"bound\" : \"maxTime\",\n" +
                "  \"filter\" : {\n" +
                "    \"type\" : \"and\",\n" +
                "    \"extractionFn\" : null,\n" +
                "    \"fields\" : [ {\n" +
                "      \"type\" : \"like\",\n" +
                "      \"extractionFn\" : null,\n" +
                "      \"dimension\" : \"myLikeDimension\",\n" +
                "      \"pattern\" : \"pattern\",\n" +
                "      \"escape\" : \"\\\\\"\n" +
                "    }, {\n" +
                "      \"type\" : \"not\",\n" +
                "      \"extractionFn\" : null,\n" +
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
                "      \"extractionFn\" : null,\n" +
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