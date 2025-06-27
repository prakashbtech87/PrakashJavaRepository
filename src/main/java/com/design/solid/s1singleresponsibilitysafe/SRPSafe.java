package com.design.solid.s1singleresponsibilitysafe;

public class SRPSafe {

    public static void main(String[] args) {
        Employee e = new Employee("Alice", 400000);
        SalaryCalclator s = new SalaryCalclator();
        ReportGenerator r = new ReportGenerator();
        r.generateReport(e);
        System.out.println("Salary :" + s.calculateSalary(e));
    }


}
