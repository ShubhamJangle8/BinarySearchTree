package com.assignment.binarytree;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;

public class MyBinarySearchTreeTest {

	@Test
	public void whenNoNodeAdded_shouldReturn_True() {
		MyBinarySearchTree<Integer> bst = new MyBinarySearchTree<>();
		assertTrue(bst.add(null));
	}

	@Test
	public void whenOneNodeAdded_shouldReturnTrue() {
		MyBinarySearchTree<Integer> bst = new MyBinarySearchTree<>();
		assertTrue(bst.add(56));
	}

	@Test
	public void whenTwoNodesAdded_shouldReturnTrue() {
		MyBinarySearchTree<Integer> bst = new MyBinarySearchTree<>();
		assertTrue(bst.add(56));
		assertTrue(bst.add(30));
	}

	@Test
	public void whenThreeNodesAdded_shouldReturnTrue() {
		MyBinarySearchTree<Integer> bst = new MyBinarySearchTree<>();
		assertTrue(bst.add(56));
		assertTrue(bst.add(30));
		assertTrue(bst.add(70));
	}

}
