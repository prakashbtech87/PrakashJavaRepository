package com.prakash.ds.stack;

public class StackArray {

	static final int MAX = 100;
	int top;
	int a[] = new int[MAX];

	StackArray() {
		top = -1;
	}

	boolean isEmpty() {
		return top < 0;
	}

	public boolean push(int element) {

		if (top >= (MAX - 1)) {
			System.out.println("Stack Overflow");
			return false;
		} else {
			a[++top] = element;
			return true;
		}

	}

	int pop() {
		if (top < 0) {
			System.out.println("Stack Underflow");
			return 0;
		} else {
			int del = a[top--];
			return del;
		}
	}

	public void printStack() {
		System.out.println("Elements in Stack Are :");

		for (int i = 0; i <=top; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();

	}

	public static void main(String[] args) {

		StackArray s = new StackArray();
		s.push(1);
		s.push(2);
		s.push(3);
		s.printStack();
		s.pop();
		s.printStack();

	}

}
