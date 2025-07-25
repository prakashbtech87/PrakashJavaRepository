package com.design.solid.s2openclosesafe;

/**
 * @author prakashkaruppusamy
 */
public class Circle implements Shape {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}
