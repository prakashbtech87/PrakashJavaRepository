package com.prakash.ds.stack;

import java.time.LocalDateTime;

public class MyStack {

	private static Node first = null;
	static MyStack stack = new MyStack();

	public static void push(int n) {
		Node newNode = new Node(n); 
		newNode.next = first;
		first = newNode;
	}

	public static void pop() {

		Node temp = first;
		first = first.next;
		System.out.println("Removed elements :" + temp.getData());

	}

	@SuppressWarnings("static-access")
	public static void main(String[] args) {

		stack.push(4);
		stack.push(6);
		stack.push(1);
		printStack(stack);
		stack.pop();
		printStack(stack);

	}

	private static void printStack(MyStack stack) {
		Node currentNode = stack.first;
		System.out.println("The Stack contains at" + LocalDateTime.now());
		while (currentNode != null) {
			System.out.println(currentNode.getData() + " ");
			currentNode = currentNode.next;
		}
		System.out.println();

	}

	@Override
	public String toString() {
		return "MyStack [toString()=" + super.toString() + "]";
	}

}
