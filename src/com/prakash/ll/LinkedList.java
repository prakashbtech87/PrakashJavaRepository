package com.prakash.ll;

public class LinkedList {

	private Node head;
	int size;

	public void addToFront(Employee employee) {
		Node node = new Node(employee);
		node.next = head;
		head = node;
		size++;
	}

	public void addAtEnd(Employee employee) {
		Node node = new Node(employee);
		node.next = null;
		if (head == null) {
			head = node;
		} else {
			Node n = head;
			while (n.next != null) {
				n = n.next;
			}
			n.next = node;
		}

		size++;
	}

	public void addAtIndex(int idx, Employee employee) {

		Node node = new Node(employee);
		if (idx == 0) {
			addToFront(employee);

		} else {

			Node n = head;
			for (int i = 0; i < idx - 1; i++) {
				n = n.next;
			}

			node.next = n.next;
			n.next = node;
			size++;
		}
	}

	public int getListSize() {
		return size;
	}

	public void printList() {

		Node current = head;
		while (current != null) {
			System.out.print(current + "==>");
			current = current.getNext();
		}
		System.out.println("null");
	}

	public Node removeFromFront() {

		if (isEmpty()) {
			return null;
		}

		Node n = head;
		head = head.next;
		size--;
		n.next = null;
		return n;

	}

	private boolean isEmpty() {

		return head == null;
	}

	public void deleteAtIndex(int idx) {

		if (idx == 0) {
			head = head.next;

		} else {

			Node node = head;
			for (int i = 0; i < idx - 1; i++) {
				node = node.next;
			}
			node.next = node.next.next;

		}
	}
}
