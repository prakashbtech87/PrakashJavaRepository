package com.design.solid.s2singleresponsibilitywithviolation;

/**
 * @author prakashkaruppusamy
 */

class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public double calculateSalary() {
        return salary * 1.6;
    }

    public void generateReport() {
        System.out.println("Generating Employee Report");
    }

}
