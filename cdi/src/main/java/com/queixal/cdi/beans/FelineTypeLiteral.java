package com.queixal.cdi.beans;

import javax.enterprise.util.AnnotationLiteral;

public class FelineTypeLiteral extends AnnotationLiteral<FelineType> implements FelineType {
    private final String name;

    public FelineTypeLiteral(String _name) {
        this.name = _name;
    }

    @Override
    public String value() {
        return this.name;
    }
}
