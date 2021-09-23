package com.prakash.sortemployee;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MySortTest {

	public static void main(String[] args) {

		Employee e1 = new Employee(300, "Mani");
		Employee e2 = new Employee(400, "Mani");
		Employee e3 = new Employee(100, "Divya");
		Employee e4 = new Employee(500, "Abhishek");
		List<Employee> emps = new ArrayList<>();
		List<Employee> empSorted = new ArrayList<>();
		emps.add(e1);
		emps.add(e2);
		emps.add(e3);
		emps.add(e4);
		System.out.println("Before Sort :" + emps);
		sortJavaClassic(emps, empSorted);
		sortJavaEight(emps, empSorted);

	}

	private static void sortJavaClassic(List<Employee> emps, List<Employee> empSorted) {
		emps.sort(Employee.empComp);
		System.out.println("Afterr Sort Classic way:" + emps);

	}

	private static void sortJavaEight(List<Employee> emps, List<Employee> empSorted) {
		empSorted = emps.stream().sorted(Comparator.comparing(Employee::getName).thenComparing(Employee::getSalary))
				.collect(Collectors.toList());
		System.out.println("Afterr Sort  Java 8 way:" + emps);

	}

}
