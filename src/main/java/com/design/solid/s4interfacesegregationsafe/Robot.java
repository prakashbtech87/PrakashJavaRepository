package com.design.solid.s4interfacesegregationsafe;

/**
 * @author prakashkaruppusamy
 */
public class Robot implements Workable {
    @Override
    public void work() {
        System.out.println("Robots can work");
    }
}
