package com.design.solid.s4interfacesegregationwithviolation;

/**
 * @author prakashkaruppusamy
 */
public class Robot implements Worker {
    @Override
    public void work() {
        System.out.println("Robot working");
    }

    @Override
    public void eat() {
        throw new UnsupportedOperationException("Robots do not eat at all");
    }
}
