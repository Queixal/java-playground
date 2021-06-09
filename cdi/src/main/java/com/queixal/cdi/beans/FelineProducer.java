package com.queixal.cdi.beans;

import javax.enterprise.inject.Any;
import javax.enterprise.inject.Instance;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;

/**
 * FACTORY PATTERN
 * 
 * In order to generate a concrete feline we have a couple of implementations for that interface.
 * Those implementations have subtype qualifier.
 * We are using @Any Instance<Feline> in order tor etrieve all the implementations for Feline but without init them
 * Later on, when the producer is called, we are looking at the configuration in order to retrieve one of the implementations
 * 
 */
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
