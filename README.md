# Moonfire

A java library for crafting [Druid](http://druid.io/) queries

Moonfire provides both strongly typed query models and results models. Allowing you to build up a query and serialize it 
to the required json and also allowing you to deserialize the result response into a POJO.

Available Query Models:

### [DataSourceMetadataQuery](http://druid.io/docs/0.12.1/querying/datasourcemetadataquery.html) 
example input:
```Java
DefaultContext context = new DefaultContext();
context.put("timeout", 100);
context.put("useCache", true);
context.put("chunkPeriod", "P0D");
DataSourceMetadataQuery query = new DataSourceMetadataQuery(new TableDataSource("sample_datasource"))
       .setContext(context);
```
example output:
```Json
{
  "queryType" : "dataSourceMetadata",
  "dataSource" : {
    "type" : "table",
    "name" : "sample_datasource"
  },
  "context" : {
    "useCache" : true,
    "chunkPeriod" : "P0D",
    "timeout" : 100
  }
}
```

### [GroupByQuery](http://druid.io/docs/0.12.1/querying/groupbyquery.html)
example input:
```Java
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

GroupByQuery query = new GroupByQuery(new TableDataSource("sample_datasource"), intervals, granularity, dimensionSpecs)
        .setLimitSpec(limitSpec)
        .setFilter(filter)
        .setAggregations(aggregations)
        .setPostAggregations(postAggregations)
        .setHaving(havingSpec);
```
example output:
```Json
{
  "queryType" : "groupBy",
  "dataSource" : {
    "type" : "table",
    "name" : "sample_datasource"
  },
  "dimensions" : [ {
    "type" : "default",
    "dimension" : "country"
  }, {
    "type" : "default",
    "dimension" : "device"
  } ],
  "limitSpec" : {
    "type" : "default",
    "limit" : 500,
    "columns" : [ {
      "dimension" : {
        "type" : "default",
        "dimension" : "country"
      }
    }, {
      "dimension" : {
        "type" : "default",
        "dimension" : "data_transfer"
      }
    } ]
  },
  "having" : {
    "type" : "greaterThan",
    "aggregation" : "total_usage",
    "value" : 100
  },
  "granularity" : "day",
  "filter" : {
    "type" : "and",
    "fields" : [ {
      "type" : "selector",
      "dimension" : "carrier",
      "value" : "AT&T"
    }, {
      "type" : "or",
      "fields" : [ {
        "type" : "selector",
        "dimension" : "make",
        "value" : "Apple"
      }, {
        "type" : "selector",
        "dimension" : "make",
        "value" : "Samsung"
      } ]
    } ]
  },
  "aggregations" : [ {
    "type" : "longSum",
    "name" : "user_count",
    "fieldName" : "total_usage"
  }, {
    "type" : "doubleSum",
    "name" : "data_transfer",
    "fieldName" : "data_transfer"
  } ],
  "postAggregations" : [ {
    "type" : "arithmetic",
    "name" : "avg_usage",
    "fn" : "/",
    "fields" : [ {
      "type" : "fieldAccess",
      "fieldName" : "data_transfer"
    }, {
      "type" : "fieldAccess",
      "fieldName" : "total_usage"
    } ]
  } ],
  "intervals" : [ "2012-01-01T00:00:00.000/2012-01-03T00:00:00.000" ]
}
```

### [SearchQuery](http://druid.io/docs/0.12.1/querying/searchquery.html)
example input:
```Java
List<String> intervals = Collections.singletonList("2012-01-01T00:00:00.000/2012-01-03T00:00:00.000");
Granularity granularity = Granularity.day;
SearchQuerySpec searchQuerySpec = new ContainsSearchQuerySpec().setCase_sensitive(true).setValue("sample_value");

SearchQuery query = new SearchQuery(new TableDataSource("sample_datasource"), intervals, granularity, searchQuerySpec)
        .setLimit(5)
        .setSearchDimensions(Collections.singletonList("sample_dimension"))
        .setSort(Ordering.alphanumeric);
```
example output:
```Json
{
  "queryType" : "search",
  "dataSource" : {
    "type" : "table",
    "name" : "sample_datasource"
  },
  "granularity" : "day",
  "limit" : 5,
  "intervals" : [ "2012-01-01T00:00:00.000/2012-01-03T00:00:00.000" ],
  "searchDimensions" : [ "sample_dimension" ],
  "query" : {
    "type" : "contains",
    "value" : "sample_value",
    "case_sensitive" : true
  },
  "sort" : "alphanumeric"
}
```

### [SegmentMetadataQuery](http://druid.io/docs/0.12.1/querying/segmentmetadataquery.html)
example input:
```Java
List<String> intervals = Collections.singletonList("2012-01-01T00:00:00.000/2012-01-03T00:00:00.000");
    
SegmentMetadataQuery query = new SegmentMetadataQuery(new TableDataSource("sample_datasource"))
        .setIntervals(intervals)
        .setToInclude(new NoneToInclude())
        .setAnalysisTypes(new ArrayList<AnalysisType>() {{
            add(AnalysisType.interval);
        }})
        .setMerge(false)
        .setLenientAggregatorMerge(false);
```
example output:
```Json
{
  "queryType" : "segmentMetadata",
  "dataSource" : {
    "type" : "table",
    "name" : "sample_datasource"
  },
  "intervals" : [ "2012-01-01T00:00:00.000/2012-01-03T00:00:00.000" ],
  "toInclude" : {
    "type" : "none"
  },
  "merge" : false,
  "analysisTypes" : [ "interval" ],
  "lenientAggregatorMerge" : false
}
```

### [TimeBoundaryQuery](http://druid.io/docs/0.12.1/querying/timeboundaryquery.html)
example input:
```Java
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
```
example output:
```Json
{
  "queryType" : "timeBoundary",
  "dataSource" : {
    "type" : "table",
    "name" : "sample_datasource"
  },
  "bound" : "maxTime",
  "filter" : {
    "type" : "and",
    "fields" : [ {
      "type" : "like",
      "dimension" : "myLikeDimension",
      "pattern" : "pattern",
      "escape" : "\\"
    }, {
      "type" : "not",
      "field" : {
        "type" : "selector",
        "extractionFn" : {
          "type" : "javascript",
          "function" : "function() {}",
          "injective" : false
        },
        "dimension" : "myDimension",
        "value" : "myValue"
      }
    }, {
      "type" : "regex",
      "dimension" : "myRegexDimension",
      "pattern" : "$[i]^"
    } ]
  },
  "context" : {
    "useCache" : true,
    "chunkPeriod" : "P0D",
    "timeout" : 100
  }
}
```

### [TimeSeriesQuery](http://druid.io/docs/0.12.1/querying/timeseriesquery.html)
example input: 
```Java
List<String> intervals = Collections.singletonList("2012-01-01T00:00:00.000/2012-01-03T00:00:00.000");
Granularity granularity = Granularity.day;
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
        .setAggregations(aggregations)
        .setPostAggregations(postAggregations);
```
example output:
```Json
{
  "queryType" : "timeseries",
  "dataSource" : {
    "type" : "table",
    "name" : "sample_datasource"
  },
  "granularity" : "day",
  "descending" : true,
  "intervals" : [ "2012-01-01T00:00:00.000/2012-01-03T00:00:00.000" ],
  "filter" : {
    "type" : "and",
    "fields" : [ {
      "type" : "selector",
      "dimension" : "sample_dimension1",
      "value" : "sample_value1"
    }, {
      "type" : "or",
      "fields" : [ {
        "type" : "selector",
        "dimension" : "sample_dimension2",
        "value" : "sample_value2"
      }, {
        "type" : "selector",
        "dimension" : "sample_dimension3",
        "value" : "sample_value3"
      } ]
    } ]
  },
  "aggregations" : [ {
    "type" : "longSum",
    "name" : "sample_name1",
    "fieldName" : "sample_fieldName1"
  }, {
    "type" : "doubleSum",
    "name" : "sample_name2",
    "fieldName" : "sample_fieldName2"
  } ],
  "postAggregations" : [ {
    "type" : "arithmetic",
    "name" : "sample_divide",
    "fn" : "/",
    "fields" : [ {
      "type" : "fieldAccess",
      "name" : "postAgg__sample_name1",
      "fieldName" : "sample_name1"
    }, {
      "type" : "fieldAccess",
      "name" : "postAgg__sample_name2",
      "fieldName" : "sample_name2"
    } ]
  } ]
}
```

### [TopNQuery](http://druid.io/docs/0.12.1/querying/topnquery.html)
example input:
```Java
List<String> intervals = Collections.singletonList("2013-08-31T00:00:00.000/2013-09-03T00:00:00.000");
Granularity granularity = Granularity.all;
DimensionSpec dimension = new DefaultDimension().setDimension("sample_dim");
int threshold = 5;
TopNMetricSpec topNMetricSpec = new NumericTopNMetricSpec("count");
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

TopNQuery query = new TopNQuery(new TableDataSource("sample_data"), intervals, granularity, dimension, threshold, topNMetricSpec)
        .setAggregations(aggregations)
        .setPostAggregations(postAggregations)
        .setFilter(filter);
```
example output:
```Json
{
  "queryType" : "topN",
  "dataSource" : {
    "type" : "table",
    "name" : "sample_data"
  },
  "intervals" : [ "2013-08-31T00:00:00.000/2013-09-03T00:00:00.000" ],
  "granularity" : "all",
  "filter" : {
    "type" : "and",
    "fields" : [ {
      "type" : "selector",
      "dimension" : "dim1",
      "value" : "some_value"
    }, {
      "type" : "selector",
      "dimension" : "dim2",
      "value" : "some_other_val"
    } ]
  },
  "aggregations" : [ {
    "type" : "longSum",
    "name" : "count",
    "fieldName" : "count"
  }, {
    "type" : "doubleSum",
    "name" : "some_metric",
    "fieldName" : "some_metric"
  } ],
  "postAggregations" : [ {
    "type" : "arithmetic",
    "name" : "average",
    "fn" : "/",
    "fields" : [ {
      "type" : "fieldAccess",
      "name" : "some_metric",
      "fieldName" : "some_metric"
    }, {
      "type" : "fieldAccess",
      "name" : "count",
      "fieldName" : "count"
    } ]
  } ],
  "dimension" : {
    "type" : "default",
    "dimension" : "sample_dim"
  },
  "threshold" : 5,
  "metric" : {
    "type" : "numeric",
    "metric" : "count"
  }
}
```
