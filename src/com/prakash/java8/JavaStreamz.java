package com.prakash.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Project {
	String name;
	List<Employee> emps;

	public Project(String name, List<Employee> emps) {
		super();
		this.name = name;
		this.emps = emps;
	}

	@Override
	public String toString() {
		return "Project [name=" + name + ", emps=" + emps + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Employee> getEmps() {
		return emps;
	}

	public void setEmps(List<Employee> emps) {
		this.emps = emps;
	}

}

class Employee {
	String firstName;

	public Employee(String firstName) {
		super();
		this.firstName = firstName;
	}

	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + "]";
	}

}

public class JavaStreamz {

	public static void main(String... prakash) {

		Employee e1 = new Employee("Alice");
		Employee e2 = new Employee("Bob");
		List<Employee> empsDEV = Arrays.asList(e1, e2);

		Employee e3 = new Employee("Charles");
		Employee e4 = new Employee("Donald");
		List<Employee> empsQA = Arrays.asList(e3, e4);

		Project p1 = new Project("dev", empsDEV);
		Project p2 = new Project("qa", empsQA);

		List<Project> prjcts = Arrays.asList(p1, p2);

		 List<List<Employee>> collect = prjcts.stream().map(Project::getEmps).distinct().collect(Collectors.toList());
		System.out.println(collect);

	}

}
