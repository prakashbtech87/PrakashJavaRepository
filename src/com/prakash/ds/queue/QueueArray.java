package com.prakash.ds.queue;

public class QueueArray {

	public static final int DEFAULT_SIZE = 5;
	public Object data[];
	public int rear;

	public QueueArray() {
		data = new Object[DEFAULT_SIZE];
	}

	public boolean isEmpty() {
		return rear == 0;
	}

	public Object dequeue() {
		if (isEmpty()) {
			System.out.println("Queue is empty..");
		}

		Object obj = data[0];
		for (int i = 0; i < rear - 1; i++) {
			data[i] = data[i + 1];
		}
		rear--;
		return obj;
	}

	public void enqueue(String element) {

		if (rear == DEFAULT_SIZE - 1) {
			System.out.println("Queue is full..Dequeue some Elements.class..is..");
		}
		data[rear] = element;
		rear++;
	}

	public void printQueue(QueueArray q) {

		System.out.print("Elements in Queue...");

		for (int i = 0; i < data.length - 1; i++) {
			System.out.print(data[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {

		QueueArray q = new QueueArray();
		q.enqueue("1");
		q.enqueue("2");
		q.enqueue("3");
		q.printQueue(q);
		System.out.println("dequeuing..." + q.dequeue());
		q.printQueue(q);
		q.enqueue("5");
		q.printQueue(q);
		q.enqueue("6");
		q.printQueue(q);

	}

}
