package com.salecycle.moonfire.queries.models.searchqueryspecs;

public class RegexSearchQuerySpec extends SearchQuerySpec {
    private String pattern;

    public RegexSearchQuerySpec() {
        setType("regex");
    }

    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }
}
