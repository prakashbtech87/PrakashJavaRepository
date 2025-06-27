package com.design.solid.s1singleresponsibilitysafe;

/**
 * @author prakashkaruppusamy
 */
class SalaryCalclator {
    public double calculateSalary(Employee e) {
        return e.getSalary() * 4.5;
    }
}
