package com.queixal.cdi.beans;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ProducerConfig {

    private String typeToUse = "cat";

    public String getTypeToUse() {
        return typeToUse;
    }

    public void setTypeToUse(String typeToUse) {
        this.typeToUse = typeToUse;
    } 

}
