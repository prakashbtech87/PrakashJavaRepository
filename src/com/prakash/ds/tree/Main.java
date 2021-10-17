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
		intTree.insert(26);
		intTree.insert(22);
		intTree.insert(32);
		intTree.traverseInOrder();
		System.out.println();
		System.out.println("in get 027 :" + intTree.get(27));
		System.out.println("in get 988 :" + intTree.get(988));
		System.out.println("in get 020 :" + intTree.get(20));
		System.out.println("MIN :" + intTree.min());
		System.out.println("MAX :" + intTree.max());
	}

}
