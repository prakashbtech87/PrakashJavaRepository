package com.prakash.ll;

public class LinkedList {

	private Node head;
	int size;

	public void addToFront(Employee employee) {
		Node node = new Node(employee);
		node.setNext(head);
		head = node;
		size++;
	}

	public void addAtEnd(Employee employee) {
		Node node = new Node(employee);
		node.setNext(null);
		if (head == node) {
			head = node;
		} else {
			Node n = head;
			while (n.getNext() != null) {
				n = n.getNext();
			}
			n.setNext(node);
			node.setNext(null);
		}

		size++;
	}

	public void printList() {

		Node current = head;
		while (current != null) {
			System.out.print(current + "==>");
			current = current.getNext();
		}
		System.out.println("null");
	}

}
