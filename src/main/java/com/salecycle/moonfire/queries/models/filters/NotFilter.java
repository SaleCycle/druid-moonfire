package com.salecycle.moonfire.queries.models.filters;

public class NotFilter extends Filter {
    private Filter field;

    public NotFilter() {
        super("not");
    }

    public Filter getField() {
        return field;
    }

    public NotFilter setField(Filter field) {
        this.field = field;
        return this;
    }
}
