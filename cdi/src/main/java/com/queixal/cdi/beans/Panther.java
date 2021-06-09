package com.queixal.cdi.beans;

import javax.inject.Named;

@Named("panther")
@FelineType("panther")
public class Panther implements Feline {

    @Override
    public void scratch() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void walk() {
        System.out.println("walking like a panther");
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        
    }
    
}
