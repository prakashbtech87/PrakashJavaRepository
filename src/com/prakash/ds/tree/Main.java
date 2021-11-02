package com.prakash.ds.tree;

public class Main {

	public static void main(String[] args) {

		Tree intTree = new Tree();
		intTree.insert(25);
		intTree.insert(20);
		intTree.insert(15);
		intTree.insert(27);
		intTree.insert(30);
		intTree.insert(29);
		intTree.insert(88);
		intTree.insert(26);
		intTree.insert(22);
		intTree.insert(32);
		intTree.insert(17);
		System.out.println("Printing content of tree");
		intTree.traverseInOrder();
		System.out.println("\nPrinting content of tree after deleting 88");
		intTree.delete(88);
		intTree.traverseInOrder();
	}

}
