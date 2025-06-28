package com.design.solid.s2opencloseviolation;

/**
 * @author prakashkaruppusamy
 */
class AreaCaluculator {


    public double caluculateArea(String shape, double radius, double length, double breadth) {
        if (shape.equals("circle")) {
            return Math.PI * radius * radius;
        } else if (shape.equals("rectangle")) {
            return length * breadth;

        }
        return 0;
    }

}
