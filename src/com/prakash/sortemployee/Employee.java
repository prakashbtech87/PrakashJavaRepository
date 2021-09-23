package com.prakash.sortemployee;

import java.util.Comparator;

public class Employee {

	private int salary;
	private String name;

	public Employee(int salary, String name) {
		super();
		this.salary = salary;
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [salary=" + salary + ", name=" + name + "]";
	}

	public static final Comparator<Employee> empComp = new Comparator<Employee>() {

		@Override
		public int compare(Employee e1, Employee e2) {

			int comparison = 0;

			comparison = e1.getName().compareTo(e2.getName());
			if (comparison == 0) {
				if (e1.getSalary() < e2.getSalary())
					comparison = -1;
				else if (e1.getSalary() > e2.getSalary())
					comparison = +1;
				else
					comparison = 0;
			}

			return comparison;
		}

	};

}
