package com.salecycle.moonfire.queries.models.virtualcolumns;

public abstract class VirtualColumn {
    private String type;

    public VirtualColumn(String type) {
        this.type = type;
    }
    public String getType() {
        return type;
    }
}
