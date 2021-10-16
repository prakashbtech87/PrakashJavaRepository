package com.prakash.ds.queueusingarray;

import java.util.NoSuchElementException;

public class ArrayQueue {

	private Employee[] queue;
	private int front;
	private int back;

	public ArrayQueue(int capacity) {
		queue = new Employee[capacity];
	}

	public void enqueue(Employee employee) {
		if (back == queue.length) {
			Employee[] newQueue = new Employee[2 * queue.length];
			System.arraycopy(queue, 0, newQueue, 0, queue.length);
			queue = newQueue;
		}
		queue[back] = employee;
		back++;
	}

	public Employee dequeue() {
		if (size() == 0) {
			throw new NoSuchElementException();
		}

		Employee employee = queue[front];
		queue[front] = null;
		front++;
		if (size() == 0) {
			front = 0;
			back = 0;
		}
		return employee;
	}

	public Employee peek() {
		if (size() == 0) {
			throw new NoSuchElementException();
		}
		return queue[front];
	}

	public int size() {
		return back - front;
	}

	public void printQueue() {

		System.out.println();

		for (int i = front; i < back; i++) {
			System.out.println(queue[i]);
		}
	}

	public static void main(String[] args) {

		Employee janeJones = new Employee("Jane", "Jones", 123);
		Employee johnDoe = new Employee("John", "Doe", 4567);
		Employee marySmith = new Employee("Mary", "Smith", 22);
		Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
		Employee billEnd = new Employee("Bill", "End", 78);

		ArrayQueue queue = new ArrayQueue(10);
		queue.enqueue(janeJones);
		queue.enqueue(johnDoe);
		queue.enqueue(marySmith);
		queue.enqueue(mikeWilson);
		queue.enqueue(billEnd);
		queue.printQueue();
		System.out.println("going to remove 2");
		queue.dequeue();
		queue.dequeue();
		queue.printQueue();

		 System.out.println("peek "+queue.peek());
		System.out.println("going to remove 4");
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
		//queue.dequeue();
		System.out.println("going to add mike");
		queue.enqueue(mikeWilson);

		queue.printQueue();

	}
}
