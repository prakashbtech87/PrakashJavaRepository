package com.design.solid.s2singleresponsibilitywithviolation;


public class SRPViolation {
    public static void main(String[] args) {
        Employee emp = new Employee("Prakash", 300000);
        System.out.println("Salary :"+emp.calculateSalary());
        emp.generateReport();
    }
}
