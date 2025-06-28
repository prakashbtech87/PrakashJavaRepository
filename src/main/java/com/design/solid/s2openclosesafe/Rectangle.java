package com.design.solid.s2openclosesafe;

/**
 * @author prakashkaruppusamy
 */
public class Rectangle implements Shape {

    private double length, breadth;

    public Rectangle(double length, double breadth) {
        this.breadth = breadth;
        this.length = length;
    }

    @Override
    public double calculateArea() {
        return length * breadth;
    }
}
