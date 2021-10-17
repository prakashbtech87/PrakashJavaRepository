package com.prakash.ds.tree;

public class TreeNode {

	private int data;
	private TreeNode left;
	private TreeNode right;

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

	public TreeNode(int data) {
		this.data = data;
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

}
