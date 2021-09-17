package com.queixal.cdi.beans;

import javax.inject.Named;

@FelineType("tiger")
public class Tiger implements Feline {

    @Override
    public void scratch() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void walk() {
        System.out.println("walking like a tiger");
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        
    }
    
}
