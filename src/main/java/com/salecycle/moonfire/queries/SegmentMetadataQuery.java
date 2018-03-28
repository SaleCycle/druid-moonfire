package com.salecycle.moonfire.queries;

import com.salecycle.moonfire.queries.models.AnalysisType;
import com.salecycle.moonfire.queries.models.contexts.Context;
import com.salecycle.moonfire.queries.models.toincludes.ToInclude;

import java.util.ArrayList;
import java.util.List;

public class SegmentMetadataQuery {
    private final String queryType = "segmentMetadata";
    private String dataSource;
    private List<String> intervals = new ArrayList<String>();
    private ToInclude toInclude;
    private boolean merge;
    private List<AnalysisType> analysisTypes = new ArrayList<AnalysisType>();
    private boolean lenietAggregatorMerge;
    private Context context;

    public SegmentMetadataQuery(String dataSource) {
        this.dataSource = dataSource;
    }

    public String getQueryType() {
        return queryType;
    }

    public String getDataSource() {
        return dataSource;
    }

    public SegmentMetadataQuery setDataSource(String dataSource) {
        this.dataSource = dataSource;
        return this;
    }

    public List<String> getIntervals() {
        return intervals;
    }

    public SegmentMetadataQuery setIntervals(List<String> intervals) {
        this.intervals = intervals;
        return this;
    }

    public ToInclude getToInclude() {
        return toInclude;
    }

    public SegmentMetadataQuery setToInclude(ToInclude toInclude) {
        this.toInclude = toInclude;
        return this;
    }

    public boolean isMerge() {
        return merge;
    }

    public SegmentMetadataQuery setMerge(boolean merge) {
        this.merge = merge;
        return this;
    }

    public List<AnalysisType> getAnalysisTypes() {
        return analysisTypes;
    }

    public SegmentMetadataQuery setAnalysisTypes(List<AnalysisType> analysisTypes) {
        this.analysisTypes = analysisTypes;
        return this;
    }

    public boolean isLenietAggregatorMerge() {
        return lenietAggregatorMerge;
    }

    public SegmentMetadataQuery setLenietAggregatorMerge(boolean lenietAggregatorMerge) {
        this.lenietAggregatorMerge = lenietAggregatorMerge;
        return this;
    }

    public Context getContext() {
        return context;
    }

    public SegmentMetadataQuery setContext(Context context) {
        this.context = context;
        return this;
    }
}
