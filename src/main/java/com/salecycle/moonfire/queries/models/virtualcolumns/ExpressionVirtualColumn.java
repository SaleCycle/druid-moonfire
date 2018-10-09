package com.salecycle.moonfire.queries.models.virtualcolumns;

import com.salecycle.moonfire.queries.models.OutputType;

public class ExpressionVirtualColumn extends VirtualColumn {
    private String name;
    private String expression;
    private OutputType outputType;
    public ExpressionVirtualColumn() {
        super("expression");
    }

    public String getName() {
        return name;
    }

    public ExpressionVirtualColumn setName(String name) {
        this.name = name;
        return this;
    }

    public String getExpression() {
        return expression;
    }

    public ExpressionVirtualColumn setExpression(String expression) {
        this.expression = expression;
        return this;
    }

    public OutputType getOutputType() {
        return outputType;
    }

    public ExpressionVirtualColumn setOutputType(OutputType outputType) {
        this.outputType = outputType;
        return this;
    }
}
