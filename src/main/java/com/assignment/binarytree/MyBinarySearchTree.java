package com.assignment.binarytree;

public class MyBinarySearchTree<k extends Comparable<k>> {

	public MyBinaryNode<k> root;

	public void add(k key) {
		this.root = addToBST(root, key);

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

}
