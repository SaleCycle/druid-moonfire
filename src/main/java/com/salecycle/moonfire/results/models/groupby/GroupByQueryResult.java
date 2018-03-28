package com.salecycle.moonfire.results.models.groupby;

import java.util.Map;

public class GroupByQueryResult {
    private String version;
    private String timestamp;
    private Map<String, Object> event;

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public Map<String, Object> getEvent() {
        return event;
    }

    public void setEvent(Map<String, Object> event) {
        this.event = event;
    }
}
