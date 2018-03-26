package com.salecycle.moonfire.queries;

import com.salecycle.moonfire.queries.models.AnalysisType;
import com.salecycle.moonfire.queries.models.contexts.Context;
import com.salecycle.moonfire.queries.models.toincludes.ToInclude;

import java.util.List;

public class SegmentMetadataQuery {
    private final String queryType = "segmentMetadata";
    private String dataSource;
    private List<String> intervals;
    private ToInclude toInclude;
    private boolean merge;
    private List<AnalysisType> analysisTypes;
    private boolean lenietAggregatorMerge;
    private Context context;

    public String getQueryType() {
        return queryType;
    }

    public String getDataSource() {
        return dataSource;
    }

    public void setDataSource(String dataSource) {
        this.dataSource = dataSource;
    }

    public List<String> getIntervals() {
        return intervals;
    }

    public void setIntervals(List<String> intervals) {
        this.intervals = intervals;
    }

    public ToInclude getToInclude() {
        return toInclude;
    }

    public void setToInclude(ToInclude toInclude) {
        this.toInclude = toInclude;
    }

    public boolean isMerge() {
        return merge;
    }

    public void setMerge(boolean merge) {
        this.merge = merge;
    }

    public List<AnalysisType> getAnalysisTypes() {
        return analysisTypes;
    }

    public void setAnalysisTypes(List<AnalysisType> analysisTypes) {
        this.analysisTypes = analysisTypes;
    }

    public boolean isLenietAggregatorMerge() {
        return lenietAggregatorMerge;
    }

    public void setLenietAggregatorMerge(boolean lenietAggregatorMerge) {
        this.lenietAggregatorMerge = lenietAggregatorMerge;
    }

    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }
}
