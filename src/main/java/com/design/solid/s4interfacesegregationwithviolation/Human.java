package com.design.solid.s4interfacesegregationwithviolation;

/**
 * @author prakashkaruppusamy
 */
public class Human implements Worker {
    @Override
    public void work() {
        System.out.println("Human working");
    }

    @Override
    public void eat() {
        System.out.println("Human eating");
    }
}
