package com.salecycle.moonfire.queries.models.queryspecs;

public class SearchQuerySpec {
    private String type;
    private String value;

    public String getType() {
        return type;
    }

    protected void setType(String type) {
        this.type = type;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
