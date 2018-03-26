package com.salecycle.moonfire.queries.models.havingspecs;

public class NotHavingSpec extends HavingSpec {
    private HavingSpec havingSpec;

    public NotHavingSpec() {
        setType("not");
    }

    public HavingSpec getHavingSpec() {
        return havingSpec;
    }

    public void setHavingSpecs(HavingSpec havingSpec) {
        this.havingSpec = havingSpec;
    }
}
