package com.salecycle.moonfire.queries;

import com.salecycle.moonfire.queries.models.dimensionspecs.DefaultDimension;
import com.salecycle.moonfire.queries.models.dimensionspecs.DimensionSpec;
import com.salecycle.moonfire.queries.models.granularities.Granularity;
import com.salecycle.moonfire.queries.models.searchqueryspecs.ContainsSearchQuerySpec;
import com.salecycle.moonfire.queries.models.topnmetricspecs.NumericTopNMetricSpec;
import org.junit.Test;

import java.util.Collections;

import static org.junit.Assert.assertEquals;

public class QueryTypeCheckTest {
    @Test
    public void typeCheck() {
        assertEquals("dataSourceMetadata", new DataSourceMetadataQuery("dataSource").getQueryType());
        assertEquals("timeseries", new TimeSeriesQuery("dataSource", Collections.<String>emptyList(), Granularity.all).getQueryType());
        assertEquals("topN", new TopNQuery("dataSource", Collections.<String>emptyList(), Granularity.all, new DefaultDimension(), 1, new NumericTopNMetricSpec("metric")).getQueryType());
        assertEquals("groupBy", new GroupByQuery("dataSource", Collections.<String>emptyList(), Granularity.all, Collections.<DimensionSpec>emptyList()).getQueryType());
        assertEquals("timeBoundary", new TimeBoundaryQuery("dataSource").getQueryType());
        assertEquals("segmentMetadata", new SegmentMetadataQuery("dataSource").getQueryType());
        assertEquals("search", new SearchQuery("dataSource", Collections.<String>emptyList(), Granularity.all, new ContainsSearchQuerySpec()).getQueryType());
    }
}