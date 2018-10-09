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
import com.salecycle.moonfire.queries.models.filters.AndFilter;
import com.salecycle.moonfire.queries.models.filters.Filter;
import com.salecycle.moonfire.queries.models.filters.OrFilter;
import com.salecycle.moonfire.queries.models.filters.SelectorFilter;
import com.salecycle.moonfire.queries.models.granularities.Granularity;
import com.salecycle.moonfire.queries.models.postaggregations.ArithmeticPostAggregation;
import com.salecycle.moonfire.queries.models.postaggregations.FieldAccessPostAggregation;
import com.salecycle.moonfire.queries.models.postaggregations.PostAggregation;
import com.salecycle.moonfire.queries.models.virtualcolumns.ExpressionVirtualColumn;
import com.salecycle.moonfire.queries.models.virtualcolumns.VirtualColumn;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class TimeSeriesQueryTest {

    @Test
    public void serialisation() throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper().setSerializationInclusion(JsonInclude.Include.NON_NULL);
        ObjectWriter writer = mapper.writerFor(TimeSeriesQuery.class);

        List<String> intervals = Collections.singletonList("2012-01-01T00:00:00.000/2012-01-03T00:00:00.000");
        Granularity granularity = Granularity.day;
        List<VirtualColumn> virtualColumns = new ArrayList<VirtualColumn>() {{
            add(new ExpressionVirtualColumn().setName("value").setExpression("if(id!='myId', 0, value)").setOutputType(OutputType.FLOAT));
        }};
        List<Aggregation> aggregations = new ArrayList<Aggregation>() {{
            add(new LongSumAggregation().setFieldName("sample_fieldName1").setName("sample_name1"));
            add(new DoubleSumAggregation().setFieldName("sample_fieldName2").setName("sample_name2"));
        }};
        List<PostAggregation> fields = new ArrayList<PostAggregation>() {{
            add(new FieldAccessPostAggregation().setFieldName("sample_name1").setName("postAgg__sample_name1"));
            add(new FieldAccessPostAggregation().setFieldName("sample_name2").setName("postAgg__sample_name2"));
        }};
        List<PostAggregation> postAggregations = new ArrayList<PostAggregation>() {{
            add(new ArithmeticPostAggregation().setFn("/").setFields(fields).setName("sample_divide"));
        }};
        Filter filter = new AndFilter()
                .addField(new SelectorFilter().setDimension("sample_dimension1").setValue("sample_value1"))
                .addField(new OrFilter()
                        .addField(new SelectorFilter().setDimension("sample_dimension2").setValue("sample_value2"))
                        .addField(new SelectorFilter().setDimension("sample_dimension3").setValue("sample_value3"))
                );

        TimeSeriesQuery query = new TimeSeriesQuery(new TableDataSource("sample_datasource"), intervals, granularity)
                .setDescending(true)
                .setFilter(filter)
                .setVirtualColumns(virtualColumns)
                .setAggregations(aggregations)
                .setPostAggregations(postAggregations);

        String json = writer.withDefaultPrettyPrinter().writeValueAsString(query);
        String expected =
                "{\n" +
                "  \"queryType\" : \"timeseries\",\n" +
                "  \"dataSource\" : {\n" +
                "    \"type\" : \"table\",\n" +
                "    \"name\" : \"sample_datasource\"\n" +
                "  },\n" +
                "  \"granularity\" : \"day\",\n" +
                "  \"descending\" : true,\n" +
                "  \"virtualColumns\" : [ {\n" +
                "    \"type\" : \"expression\",\n" +
                "    \"name\" : \"value\",\n" +
                "    \"expression\" : \"if(id!='myId', 0, value)\",\n" +
                "    \"outputType\" : \"FLOAT\"\n" +
                "  } ],\n" +
                "  \"intervals\" : [ \"2012-01-01T00:00:00.000/2012-01-03T00:00:00.000\" ],\n" +
                "  \"filter\" : {\n" +
                "    \"type\" : \"and\",\n" +
                "    \"fields\" : [ {\n" +
                "      \"type\" : \"selector\",\n" +
                "      \"dimension\" : \"sample_dimension1\",\n" +
                "      \"value\" : \"sample_value1\"\n" +
                "    }, {\n" +
                "      \"type\" : \"or\",\n" +
                "      \"fields\" : [ {\n" +
                "        \"type\" : \"selector\",\n" +
                "        \"dimension\" : \"sample_dimension2\",\n" +
                "        \"value\" : \"sample_value2\"\n" +
                "      }, {\n" +
                "        \"type\" : \"selector\",\n" +
                "        \"dimension\" : \"sample_dimension3\",\n" +
                "        \"value\" : \"sample_value3\"\n" +
                "      } ]\n" +
                "    } ]\n" +
                "  },\n" +
                "  \"aggregations\" : [ {\n" +
                "    \"type\" : \"longSum\",\n" +
                "    \"name\" : \"sample_name1\",\n" +
                "    \"fieldName\" : \"sample_fieldName1\"\n" +
                "  }, {\n" +
                "    \"type\" : \"doubleSum\",\n" +
                "    \"name\" : \"sample_name2\",\n" +
                "    \"fieldName\" : \"sample_fieldName2\"\n" +
                "  } ],\n" +
                "  \"postAggregations\" : [ {\n" +
                "    \"type\" : \"arithmetic\",\n" +
                "    \"name\" : \"sample_divide\",\n" +
                "    \"fn\" : \"/\",\n" +
                "    \"fields\" : [ {\n" +
                "      \"type\" : \"fieldAccess\",\n" +
                "      \"name\" : \"postAgg__sample_name1\",\n" +
                "      \"fieldName\" : \"sample_name1\"\n" +
                "    }, {\n" +
                "      \"type\" : \"fieldAccess\",\n" +
                "      \"name\" : \"postAgg__sample_name2\",\n" +
                "      \"fieldName\" : \"sample_name2\"\n" +
                "    } ]\n" +
                "  } ]\n" +
                "}";
        assertEquals(expected, json);
    }
}