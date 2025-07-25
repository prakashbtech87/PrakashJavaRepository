package com.design.solid.s1singleresponsibilitysafe;

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

    public double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }
}
