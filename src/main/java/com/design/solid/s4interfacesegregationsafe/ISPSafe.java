package com.design.solid.s4interfacesegregationsafe;


/**
 * @author prakashkaruppusamy
 */
public class ISPSafe {

    public static void main(String[] args) {
        Human human = new Human();
        human.work();
        human.eat();
        Robot robot = new Robot();
        robot.work();
    }
}
