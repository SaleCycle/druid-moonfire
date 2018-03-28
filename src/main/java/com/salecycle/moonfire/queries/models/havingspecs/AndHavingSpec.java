package com.salecycle.moonfire.queries.models.havingspecs;

import java.util.List;

public class AndHavingSpec extends HavingSpec {
    private List<HavingSpec> havingSpecs;

    public AndHavingSpec() {
        setType("and");
    }

    public List<HavingSpec> getHavingSpecs() {
        return havingSpecs;
    }

    public AndHavingSpec setHavingSpecs(List<HavingSpec> havingSpecs) {
        this.havingSpecs = havingSpecs;
        return this;
    }
}
