package com.salecycle.moonfire.queries.models.lookups;

public class NamespaceLookup extends Lookup {
    private String namespace;

    public NamespaceLookup() {
        setType("namespace");
    }

    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }
}
