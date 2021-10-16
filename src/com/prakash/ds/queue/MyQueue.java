package com.prakash.ds.queue;

public class MyQueue {

	Node front, rear;

	public MyQueue() {
		this.front = null;
		this.rear = null;
	}

	public void enqueue(int value) {
		Node temp = new Node(value);
		if (this.rear == null) {
			rear = front = temp;
			return;
		}
		rear.next = temp;
		rear = temp;
	}

	public Node dequeue() {
		if (front == null) {
			return null;
		}
		Node temp = this.front;
		this.front = this.front.next;
		if (this.front == null) {
			this.rear = null;
		}

		return temp;
	}

	public void printQueue(MyQueue queue) {
		Node currentNode = queue.front;
		System.out.println("Queue Elements :");
		while (currentNode != null) {
			System.out.print(currentNode.getData() + " ");
			currentNode = currentNode.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		MyQueue q = new MyQueue();
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		q.printQueue(q);
		q.dequeue();
		q.printQueue(q);
	}

}
