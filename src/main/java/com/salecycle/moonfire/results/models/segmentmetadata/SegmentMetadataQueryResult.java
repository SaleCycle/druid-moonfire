package com.salecycle.moonfire.results.models.segmentmetadata;

import java.util.List;
import java.util.Map;

public class SegmentMetadataQueryResult {
    private String id;
    private List<String> intervals;
    private Map<String, ColumnResult> columns;
    private Map<String, AggregatorResult> aggregators;
    private QueryGranularity queryGranularity;
    private long size;
    private long numRows;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<String> getIntervals() {
        return intervals;
    }

    public void setIntervals(List<String> intervals) {
        this.intervals = intervals;
    }

    public Map<String, ColumnResult> getColumns() {
        return columns;
    }

    public void setColumns(Map<String, ColumnResult> columns) {
        this.columns = columns;
    }

    public Map<String, AggregatorResult> getAggregators() {
        return aggregators;
    }

    public void setAggregators(Map<String, AggregatorResult> aggregators) {
        this.aggregators = aggregators;
    }

    public QueryGranularity getQueryGranularity() {
        return queryGranularity;
    }

    public void setQueryGranularity(QueryGranularity queryGranularity) {
        this.queryGranularity = queryGranularity;
    }

    public long getSize() {
        return size;
    }

    public void setSize(long size) {
        this.size = size;
    }

    public long getNumRows() {
        return numRows;
    }

    public void setNumRows(long numRows) {
        this.numRows = numRows;
    }
}
