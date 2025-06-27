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

class SalaryCalclator {
    public double calculateSalary(Employee e) {
        return e.getSalary() * 4.5;
    }
}

class ReportGenerator {
    public void generateReport(Employee e) {
        System.out.println("reprting " + e.getName());
    }

}

public class SRPSafe {

    public static void main(String[] args) {
        Employee e = new Employee("Alice", 400000);
        SalaryCalclator s = new SalaryCalclator();
        ReportGenerator r = new ReportGenerator();
        r.generateReport(e);
        System.out.println("Salary :" + s.calculateSalary(e));
    }


}
