package com.prakash.javacoding.java17.sealedclass;

/**
 * @author prakashkaruppusamy
 */
public class SealedDemo {
}


sealed interface Shape permits Circle, Rectangle {
    double area();
}

final class Circle implements Shape {

    double radius;

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}

final class Rectangle implements Shape {

    @Override
    public double area() {
        double length = 10, breadth = 15;
        return length * breadth;
    }
}

