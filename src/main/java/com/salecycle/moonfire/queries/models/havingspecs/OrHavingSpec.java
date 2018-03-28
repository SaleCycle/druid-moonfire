package com.salecycle.moonfire.queries.models.havingspecs;

import java.util.List;

public class OrHavingSpec extends HavingSpec {
    private List<HavingSpec> havingSpecs;

    public OrHavingSpec() {
        setType("or");
    }

    public List<HavingSpec> getHavingSpecs() {
        return havingSpecs;
    }

    public OrHavingSpec setHavingSpecs(List<HavingSpec> havingSpecs) {
        this.havingSpecs = havingSpecs;
        return this;
    }
}
