package com.prakash.ll;

public class Main {

	public static void main(String[] args) {

		Employee zero = new Employee("zero", "", 0);
		Employee one = new Employee("one", "", 1);
		Employee two = new Employee("two", "", 2);
		Employee three = new Employee("three", "", 3);
		Employee four = new Employee("four", "", 4);
		Employee five = new Employee("five", "", 5);
		Employee six = new Employee("six", "", 6);
		Employee seven = new Employee("seven", "", 7);
		Employee newEmp = new Employee("newEMP", "", 100);

		LinkedList list = new LinkedList();
		System.out.println(list.getListSize());
		list.addToFront(four);
		list.addToFront(three);
		list.addToFront(two);
		list.addToFront(one);
		list.addToFront(zero);
		list.addAtEnd(five);
		list.addAtEnd(six);
		list.addAtEnd(seven);
		list.addAtIndex(2, newEmp);
		list.printList();
		System.out.println(list.getListSize());
		list.removeFromFront();
		System.out.println("After Front Removed");
		list.printList();
		list.addAtIndex(0, zero);
		list.printList();
		System.out.println(list.getListSize());
		list.removeFromFront();
		System.out.println("After Front Removed");
		list.printList();
		list.deleteAtIndex(1);
		System.out.println("After Delte Removed");
		list.printList();

	}

}
