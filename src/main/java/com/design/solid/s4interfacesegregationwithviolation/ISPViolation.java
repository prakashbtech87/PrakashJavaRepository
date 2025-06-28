package com.design.solid.s4interfacesegregationwithviolation;

/**
 * @author prakashkaruppusamy
 */
public class ISPViolation {
    public static void main(String[] args) {
        Human human = new Human();
        human.work();
        human.eat();
        Robot robot = new Robot();
        robot.work();
        robot.eat();
    }
}
