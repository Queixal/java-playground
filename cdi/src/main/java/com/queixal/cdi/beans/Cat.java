package com.queixal.cdi.beans;

import javax.inject.Named;

@Named("cat")
@FelineType("cat")
public class Cat implements Feline {

    @Override
    public void scratch() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void walk() {
        System.out.println("walking like a cat");
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        
    }
    
}
