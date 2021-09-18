package com.prakash.ll;

public class Main {

	public static void main(String[] args) {

		Employee janeJones = new Employee("Jane", "Jones", 1);
		Employee johnDoe = new Employee("John", "Doe", 2);
		Employee marySmith = new Employee("Mary", "Smith", 3);
		Employee mikeWilson = new Employee("Mike", "Wilson", 4);
		Employee aa = new Employee("aa", "aa", 5);
		Employee bb = new Employee("bb", "bb", 6);
		Employee cc = new Employee("cc", "cc", 7);

		LinkedList list = new LinkedList();
		list.addToFront(janeJones);
		list.addToFront(johnDoe);
		list.addToFront(marySmith);
		list.addToFront(mikeWilson);
		list.addAtEnd(aa);
		list.addToFront(bb);
		list.addAtEnd(cc);

		list.printList();

	}

}
