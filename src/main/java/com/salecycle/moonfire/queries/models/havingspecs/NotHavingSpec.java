package com.salecycle.moonfire.queries.models.havingspecs;

public class NotHavingSpec extends HavingSpec {
    private HavingSpec havingSpec;

    public NotHavingSpec() {
        super("not");
    }

    public NotHavingSpec setHavingSpec(HavingSpec havingSpec) {
        this.havingSpec = havingSpec;
        return this;
    }

    public HavingSpec getHavingSpec() {
        return havingSpec;
    }

    public void setHavingSpecs(HavingSpec havingSpec) {
        this.havingSpec = havingSpec;
    }
}
