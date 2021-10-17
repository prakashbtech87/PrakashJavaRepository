package com.prakash.ds.tree;

public class TreeNode {

	private int data;
	private TreeNode left;
	private TreeNode right;

	public TreeNode(int data) {
		this.data = data;
	}

	public void insert(int value) {
		if (value == data) {
			return;
		}

		if (value < data) {
			if (left == null) {
				left = new TreeNode(value);
			} else {
				left.insert(value);
			}
		} else {
			if (right == null) {
				right = new TreeNode(value);
			} else {
				right.insert(value);
			}
		}
	}

	public void traverseInOrder() { // LEFT ROOT RIGHT
		if (left != null) {
			left.traverseInOrder();
		}
		System.out.print(data + " ");
		if (right != null) {
			right.traverseInOrder();
		}

	}

	public TreeNode get(int value) {

		if (value == data) {
			return this;
		}

		if (value < data) {
			if (left != null) {
				return left.get(value);
			}
		} else {
			if (right != null) {
				return right.get(value);
			}
		}
		return null;
	}

	public int min() {

		if (left == null) {
			return data;
		} else {
			return left.min();
		}
	}

	public int max() {

		if (right == null) {
			return data;
		} else {
			return right.max();
		}
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public TreeNode getLeftChild() {
		return left;
	}

	public void setLeftChild(TreeNode leftChild) {
		this.left = leftChild;
	}

	public TreeNode getRightChild() {
		return right;
	}

	public void setRightChild(TreeNode rightChild) {
		this.right = rightChild;
	}

	@Override
	public String toString() {
		return "TreeNode [data=" + data + "]";
	}

}
