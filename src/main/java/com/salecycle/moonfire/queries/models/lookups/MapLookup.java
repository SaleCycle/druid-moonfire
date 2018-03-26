package com.salecycle.moonfire.queries.models.lookups;

import java.util.HashMap;

public class MapLookup extends Lookup {
    private HashMap<String, String> map;
    private Boolean isOneToOne;

    public MapLookup() {
        setType("map");
    }

    public HashMap<String, String> getMap() {
        return map;
    }

    public void setMap(HashMap<String, String> map) {
        this.map = map;
    }

    public Boolean getOneToOne() {
        return isOneToOne;
    }

    public void setOneToOne(Boolean oneToOne) {
        isOneToOne = oneToOne;
    }
}
