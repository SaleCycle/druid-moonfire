package com.salecycle.moonfire.queries;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.salecycle.moonfire.queries.models.OutputType;
import com.salecycle.moonfire.queries.models.aggregations.Aggregation;
import com.salecycle.moonfire.queries.models.aggregations.DoubleSumAggregation;
import com.salecycle.moonfire.queries.models.aggregations.LongSumAggregation;
import com.salecycle.moonfire.queries.models.datasources.TableDataSource;
import com.salecycle.moonfire.queries.models.dimensionspecs.DefaultDimension;
import com.salecycle.moonfire.queries.models.dimensionspecs.DimensionSpec;
import com.salecycle.moonfire.queries.models.filters.AndFilter;
import com.salecycle.moonfire.queries.models.filters.Filter;
import com.salecycle.moonfire.queries.models.filters.SelectorFilter;
import com.salecycle.moonfire.queries.models.granularities.Granularity;
import com.salecycle.moonfire.queries.models.postaggregations.ArithmeticPostAggregation;
import com.salecycle.moonfire.queries.models.postaggregations.FieldAccessPostAggregation;
import com.salecycle.moonfire.queries.models.postaggregations.PostAggregation;
import com.salecycle.moonfire.queries.models.topnmetricspecs.NumericTopNMetricSpec;
import com.salecycle.moonfire.queries.models.topnmetricspecs.TopNMetricSpec;
import com.salecycle.moonfire.queries.models.virtualcolumns.ExpressionVirtualColumn;
import com.salecycle.moonfire.queries.models.virtualcolumns.VirtualColumn;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class TopNQueryTest {

    @Test
    public void serialisation() throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper().setSerializationInclusion(JsonInclude.Include.NON_NULL);
        ObjectWriter writer = mapper.writerFor(TopNQuery.class);

        List<String> intervals = Collections.singletonList("2013-08-31T00:00:00.000/2013-09-03T00:00:00.000");
        Granularity granularity = Granularity.all;
        DimensionSpec dimension = new DefaultDimension().setDimension("sample_dim");
        int threshold = 5;
        TopNMetricSpec topNMetricSpec = new NumericTopNMetricSpec("count");
        List<VirtualColumn> virtualColumns = new ArrayList<VirtualColumn>() {{
            add(new ExpressionVirtualColumn().setName("value").setExpression("if(id!='myId', 0, value)").setOutputType(OutputType.FLOAT));
        }};
        List<Aggregation> aggregations = new ArrayList<Aggregation>() {{
            add(new LongSumAggregation().setFieldName("count").setName("count"));
            add(new DoubleSumAggregation().setFieldName("some_metric").setName("some_metric"));
        }};
        List<PostAggregation> fields = new ArrayList<PostAggregation>() {{
           add(new FieldAccessPostAggregation().setFieldName("some_metric").setName("some_metric"));
            add(new FieldAccessPostAggregation().setFieldName("count").setName("count"));
        }};
        List<PostAggregation> postAggregations = new ArrayList<PostAggregation>() {{
            add(new ArithmeticPostAggregation().setFn("/").setFields(fields).setName("average"));
        }};
        Filter filter = new AndFilter()
                .addField(new SelectorFilter().setDimension("dim1").setValue("some_value"))
                .addField(new SelectorFilter().setDimension("dim2").setValue("some_other_val"));

        TopNQuery query = new TopNQuery(new TableDataSource("sample_datasource"), intervals, granularity, dimension, threshold, topNMetricSpec)
                .setVirtualColumns(virtualColumns)
                .setAggregations(aggregations)
                .setPostAggregations(postAggregations)
                .setFilter(filter);

        String json = writer.withDefaultPrettyPrinter().writeValueAsString(query);
        String expected =
                "{\n" +
                "  \"queryType\" : \"topN\",\n" +
                "  \"dataSource\" : {\n" +
                "    \"type\" : \"table\",\n" +
                "    \"name\" : \"sample_datasource\"\n" +
                "  },\n" +
                "  \"intervals\" : [ \"2013-08-31T00:00:00.000/2013-09-03T00:00:00.000\" ],\n" +
                "  \"granularity\" : \"all\",\n" +
                "  \"filter\" : {\n" +
                "    \"type\" : \"and\",\n" +
                "    \"fields\" : [ {\n" +
                "      \"type\" : \"selector\",\n" +
                "      \"dimension\" : \"dim1\",\n" +
                "      \"value\" : \"some_value\"\n" +
                "    }, {\n" +
                "      \"type\" : \"selector\",\n" +
                "      \"dimension\" : \"dim2\",\n" +
                "      \"value\" : \"some_other_val\"\n" +
                "    } ]\n" +
                "  },\n" +
                "  \"virtualColumns\" : [ {\n" +
                "    \"type\" : \"expression\",\n" +
                "    \"name\" : \"value\",\n" +
                "    \"expression\" : \"if(id!='myId', 0, value)\",\n" +
                "    \"outputType\" : \"FLOAT\"\n" +
                "  } ],\n" +
                "  \"aggregations\" : [ {\n" +
                "    \"type\" : \"longSum\",\n" +
                "    \"name\" : \"count\",\n" +
                "    \"fieldName\" : \"count\"\n" +
                "  }, {\n" +
                "    \"type\" : \"doubleSum\",\n" +
                "    \"name\" : \"some_metric\",\n" +
                "    \"fieldName\" : \"some_metric\"\n" +
                "  } ],\n" +
                "  \"postAggregations\" : [ {\n" +
                "    \"type\" : \"arithmetic\",\n" +
                "    \"name\" : \"average\",\n" +
                "    \"fn\" : \"/\",\n" +
                "    \"fields\" : [ {\n" +
                "      \"type\" : \"fieldAccess\",\n" +
                "      \"name\" : \"some_metric\",\n" +
                "      \"fieldName\" : \"some_metric\"\n" +
                "    }, {\n" +
                "      \"type\" : \"fieldAccess\",\n" +
                "      \"name\" : \"count\",\n" +
                "      \"fieldName\" : \"count\"\n" +
                "    } ]\n" +
                "  } ],\n" +
                "  \"dimension\" : {\n" +
                "    \"type\" : \"default\",\n" +
                "    \"dimension\" : \"sample_dim\"\n" +
                "  },\n" +
                "  \"threshold\" : 5,\n" +
                "  \"metric\" : {\n" +
                "    \"type\" : \"numeric\",\n" +
                "    \"metric\" : \"count\"\n" +
                "  }\n" +
                "}";
        assertEquals(expected, json);
    }
}