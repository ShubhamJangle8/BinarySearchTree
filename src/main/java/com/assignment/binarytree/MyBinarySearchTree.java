package com.assignment.binarytree;

public class MyBinarySearchTree<k extends Comparable<k>> {

	public MyBinaryNode<k> root;

	public boolean add(k key) {
		this.root = addToBST(root, key);
		return true;
	}

	public MyBinaryNode<k> addToBST(MyBinaryNode<k> current, k key) {
		if (current == null) {
			return new MyBinaryNode<>(key);
		}
		int compareResult = key.compareTo(current.key);
		if (compareResult < 0)
			current.leftNode = addToBST(current.leftNode, key);
		else
			current.rightNode = addToBST(current.rightNode, key);
		return current;

	}

	public int size() {
		return getSize(root);
	}

	public int getSize(MyBinaryNode<k> current) {
		return (current == null) ? 0 : 1 + getSize(current.leftNode) + getSize(current.rightNode);
	}

	public boolean search(k key) {
		return searchBST(root, key);
	}

	public boolean searchBST(MyBinaryNode<k> current, k key) {
		if (current == null) {
			return false;
		}
		int compareResult = key.compareTo(current.key);
		if (compareResult == 0)
			return true;
		else if (compareResult < 0)
			return searchBST(current.leftNode, key);
		else
			return searchBST(current.rightNode, key);
	}

}
