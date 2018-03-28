package com.salecycle.moonfire.queries.models.filters;

import java.util.ArrayList;
import java.util.List;

public class InFilter extends Filter {
    private String dimension;
    private List<String> values = new ArrayList<String>();

    public InFilter() {
        setType("in");
    }

    public String getDimension() {
        return dimension;
    }

    public InFilter setDimension(String dimension) {
        this.dimension = dimension;
        return this;
    }

    public List<String> getValues() {
        return values;
    }

    public InFilter setValues(List<String> values) {
        this.values = values;
        return this;
    }
}
