package com.salecycle.moonfire.queries.models.filters;

public class NotFilter extends Filter {
    private Filter field;

    public NotFilter() {
        setType("not");
    }

    public Filter getField() {
        return field;
    }

    public void setField(Filter field) {
        this.field = field;
    }
}
