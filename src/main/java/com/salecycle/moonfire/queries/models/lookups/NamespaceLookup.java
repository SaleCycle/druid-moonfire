package com.salecycle.moonfire.queries.models.lookups;

public class NamespaceLookup extends Lookup {
    private String namespace;

    public NamespaceLookup() {
        super("namespace");
    }

    public String getNamespace() {
        return namespace;
    }

    public NamespaceLookup setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
}
