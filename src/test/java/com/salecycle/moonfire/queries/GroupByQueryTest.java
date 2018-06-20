package com.salecycle.moonfire.queries;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.salecycle.moonfire.queries.models.aggregations.Aggregation;
import com.salecycle.moonfire.queries.models.aggregations.DoubleSumAggregation;
import com.salecycle.moonfire.queries.models.aggregations.LongSumAggregation;
import com.salecycle.moonfire.queries.models.dimensionspecs.DefaultDimension;
import com.salecycle.moonfire.queries.models.dimensionspecs.DimensionSpec;
import com.salecycle.moonfire.queries.models.filters.AndFilter;
import com.salecycle.moonfire.queries.models.filters.Filter;
import com.salecycle.moonfire.queries.models.filters.OrFilter;
import com.salecycle.moonfire.queries.models.filters.SelectorFilter;
import com.salecycle.moonfire.queries.models.granularities.Granularity;
import com.salecycle.moonfire.queries.models.havingspecs.GreaterThanHavingSpec;
import com.salecycle.moonfire.queries.models.havingspecs.HavingSpec;
import com.salecycle.moonfire.queries.models.limits.DefaultLimitSpec;
import com.salecycle.moonfire.queries.models.limits.LimitSpec;
import com.salecycle.moonfire.queries.models.limits.OrderByColumnSpec;
import com.salecycle.moonfire.queries.models.postaggregations.ArithmeticPostAggregation;
import com.salecycle.moonfire.queries.models.postaggregations.FieldAccessPostAggregation;
import com.salecycle.moonfire.queries.models.postaggregations.PostAggregation;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class GroupByQueryTest {

    @Test
    public void serialisation() throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper().setSerializationInclusion(JsonInclude.Include.NON_NULL);
        ObjectWriter writer = mapper.writerFor(GroupByQuery.class);

        List<String> intervals = Collections.singletonList("2012-01-01T00:00:00.000/2012-01-03T00:00:00.000");
        Granularity granularity = Granularity.day;
        List<DimensionSpec> dimensionSpecs = new ArrayList<DimensionSpec>() {{
            add(new DefaultDimension().setDimension("country"));
            add(new DefaultDimension().setDimension("device"));
        }};
        LimitSpec limitSpec = new DefaultLimitSpec().setLimit(500).setColumns(new ArrayList<OrderByColumnSpec>() {{
            add(new OrderByColumnSpec().setDimension(new DefaultDimension().setDimension("country")));
            add(new OrderByColumnSpec().setDimension(new DefaultDimension().setDimension("data_transfer")));
        }});
        List<Aggregation> aggregations = new ArrayList<Aggregation>() {{
            add(new LongSumAggregation().setFieldName("total_usage").setName("user_count"));
            add(new DoubleSumAggregation().setFieldName("data_transfer").setName("data_transfer"));
        }};
        List<PostAggregation> fields = new ArrayList<PostAggregation>() {{
           add(new FieldAccessPostAggregation().setFieldName("data_transfer"));
            add(new FieldAccessPostAggregation().setFieldName("total_usage"));
        }};
        List<PostAggregation> postAggregations = new ArrayList<PostAggregation>() {{
            add(new ArithmeticPostAggregation().setFn("/").setFields(fields).setName("avg_usage"));
        }};
        Filter filter = new AndFilter()
                .addField(new SelectorFilter().setDimension("carrier").setValue("AT&T"))
                .addField(new OrFilter()
                        .addField(new SelectorFilter().setDimension("make").setValue("Apple"))
                        .addField(new SelectorFilter().setDimension("make").setValue("Samsung"))
                );
        HavingSpec havingSpec = new GreaterThanHavingSpec().setAggregation("total_usage").setValue(100);

        GroupByQuery query = new GroupByQuery("sample_datasource", intervals, granularity, dimensionSpecs)
                .setLimitSpec(limitSpec)
                .setFilter(filter)
                .setAggregations(aggregations)
                .setPostAggregations(postAggregations)
                .setHaving(havingSpec);

        String json = writer.withDefaultPrettyPrinter().writeValueAsString(query);
        String expected =
                "{\n" +
                "  \"queryType\" : \"groupBy\",\n" +
                "  \"dataSource\" : \"sample_datasource\",\n" +
                "  \"dimensions\" : [ {\n" +
                "    \"type\" : \"default\",\n" +
                "    \"dimension\" : \"country\"\n" +
                "  }, {\n" +
                "    \"type\" : \"default\",\n" +
                "    \"dimension\" : \"device\"\n" +
                "  } ],\n" +
                "  \"limitSpec\" : {\n" +
                "    \"type\" : \"default\",\n" +
                "    \"limit\" : 500,\n" +
                "    \"columns\" : [ {\n" +
                "      \"dimension\" : {\n" +
                "        \"type\" : \"default\",\n" +
                "        \"dimension\" : \"country\"\n" +
                "      }\n" +
                "    }, {\n" +
                "      \"dimension\" : {\n" +
                "        \"type\" : \"default\",\n" +
                "        \"dimension\" : \"data_transfer\"\n" +
                "      }\n" +
                "    } ]\n" +
                "  },\n" +
                "  \"having\" : {\n" +
                "    \"type\" : \"greaterThan\",\n" +
                "    \"aggregation\" : \"total_usage\",\n" +
                "    \"value\" : 100\n" +
                "  },\n" +
                "  \"granularity\" : \"day\",\n" +
                "  \"filter\" : {\n" +
                "    \"type\" : \"and\",\n" +
                "    \"fields\" : [ {\n" +
                "      \"type\" : \"selector\",\n" +
                "      \"dimension\" : \"carrier\",\n" +
                "      \"value\" : \"AT&T\"\n" +
                "    }, {\n" +
                "      \"type\" : \"or\",\n" +
                "      \"fields\" : [ {\n" +
                "        \"type\" : \"selector\",\n" +
                "        \"dimension\" : \"make\",\n" +
                "        \"value\" : \"Apple\"\n" +
                "      }, {\n" +
                "        \"type\" : \"selector\",\n" +
                "        \"dimension\" : \"make\",\n" +
                "        \"value\" : \"Samsung\"\n" +
                "      } ]\n" +
                "    } ]\n" +
                "  },\n" +
                "  \"aggregations\" : [ {\n" +
                "    \"type\" : \"longSum\",\n" +
                "    \"name\" : \"user_count\",\n" +
                "    \"fieldName\" : \"total_usage\"\n" +
                "  }, {\n" +
                "    \"type\" : \"doubleSum\",\n" +
                "    \"name\" : \"data_transfer\",\n" +
                "    \"fieldName\" : \"data_transfer\"\n" +
                "  } ],\n" +
                "  \"postAggregations\" : [ {\n" +
                "    \"type\" : \"arithmetic\",\n" +
                "    \"name\" : \"avg_usage\",\n" +
                "    \"fn\" : \"/\",\n" +
                "    \"fields\" : [ {\n" +
                "      \"type\" : \"fieldAccess\",\n" +
                "      \"fieldName\" : \"data_transfer\"\n" +
                "    }, {\n" +
                "      \"type\" : \"fieldAccess\",\n" +
                "      \"fieldName\" : \"total_usage\"\n" +
                "    } ]\n" +
                "  } ],\n" +
                "  \"intervals\" : [ \"2012-01-01T00:00:00.000/2012-01-03T00:00:00.000\" ]\n" +
                "}";
        assertEquals(expected, json);
    }
}