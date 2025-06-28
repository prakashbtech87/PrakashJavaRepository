package com.design.solid.s2opencloseviolation;

/**
 * @author prakashkaruppusamy
 */
public class OCPViloation {

    public static void main(String[] args) {
        AreaCaluculator ac = new AreaCaluculator();
        System.out.println("Circle Area :" + ac.caluculateArea("circle", 5, 4, 6));
    }
}
