package com.salecycle.moonfire.queries.datasources;

import com.salecycle.moonfire.queries.GroupByQuery;
import com.salecycle.moonfire.queries.models.datasources.GroupByQueryDataSource;
import com.salecycle.moonfire.queries.models.datasources.TableDataSource;
import com.salecycle.moonfire.queries.models.datasources.UnionDataSource;
import com.salecycle.moonfire.queries.models.granularities.Granularity;
import org.junit.Test;

import java.util.Collections;

import static org.junit.Assert.assertEquals;

public class TypeCheckTest {
    @Test
    public void TypeCheck() {
        GroupByQuery groupByQuery = new GroupByQuery(new TableDataSource("sample_datasource"), Collections.emptyList(), Granularity.all, Collections.emptyList());
        assertEquals("query", new GroupByQueryDataSource(groupByQuery).getType());
        assertEquals("table", new TableDataSource("sample_datasource").getType());
        assertEquals("union", new UnionDataSource(Collections.emptyList()).getType());
    }
}
