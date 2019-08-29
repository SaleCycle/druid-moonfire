package com.salecycle.moonfire.queries;

import com.salecycle.moonfire.queries.models.datasources.TableDataSource;
import com.salecycle.moonfire.queries.models.dimensionspecs.DefaultDimension;
import com.salecycle.moonfire.queries.models.dimensionspecs.DimensionSpec;
import com.salecycle.moonfire.queries.models.granularities.SimpleGranularity;
import com.salecycle.moonfire.queries.models.searchqueryspecs.ContainsSearchQuerySpec;
import com.salecycle.moonfire.queries.models.topnmetricspecs.NumericTopNMetricSpec;
import org.junit.Test;

import java.util.Collections;

import static org.junit.Assert.assertEquals;

public class QueryTypeCheckTest {
    @Test
    public void typeCheck() {
        assertEquals("dataSourceMetadata", new DataSourceMetadataQuery(new TableDataSource("dataSource")).getQueryType());
        assertEquals("timeseries", new TimeSeriesQuery(new TableDataSource("dataSource"), Collections.<String>emptyList(), SimpleGranularity.all).getQueryType());
        assertEquals("topN", new TopNQuery(new TableDataSource("dataSource"), Collections.<String>emptyList(), SimpleGranularity.all, new DefaultDimension(), 1, new NumericTopNMetricSpec("metric")).getQueryType());
        assertEquals("groupBy", new GroupByQuery(new TableDataSource("dataSource"), Collections.<String>emptyList(), SimpleGranularity.all, Collections.<DimensionSpec>emptyList()).getQueryType());
        assertEquals("timeBoundary", new TimeBoundaryQuery(new TableDataSource("dataSource")).getQueryType());
        assertEquals("segmentMetadata", new SegmentMetadataQuery(new TableDataSource("dataSource")).getQueryType());
        assertEquals("search", new SearchQuery(new TableDataSource("dataSource"), Collections.<String>emptyList(), SimpleGranularity.all, new ContainsSearchQuerySpec()).getQueryType());
    }
}
