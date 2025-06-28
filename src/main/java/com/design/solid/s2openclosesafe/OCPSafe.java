package com.design.solid.s2openclosesafe;

/**
 * @author prakashkaruppusamy
 */
public class OCPSafe {

    public static void main(String[] args) {

        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6);
        AreaCalculator calculator = new AreaCalculator();
        System.out.println("Circle area :" + calculator.calculateArea(circle));
        System.out.println("Rectangle area :" + calculator.calculateArea(rectangle));

    }
}
