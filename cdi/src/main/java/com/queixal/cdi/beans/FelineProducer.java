package com.queixal.cdi.beans;

import javax.enterprise.inject.Any;
import javax.enterprise.inject.Instance;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;

public class FelineProducer {
    
    @Inject
    @Any
    private Instance<Feline> felineBeansList;

    @Inject
    private ProducerConfig config;

    @Produces
    public Feline getFeline() {
        String felineType = config.getTypeToUse();
        Instance<Feline> instance = this.felineBeansList.select(new FelineTypeLiteral(felineType));

        if (!instance.isResolvable()) {
            throw new IllegalArgumentException("feline type " + felineType + " not supported");
        }

        return instance.get();
    }
}
