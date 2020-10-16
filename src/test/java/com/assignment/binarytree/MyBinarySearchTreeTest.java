package com.assignment.binarytree;

import static org.junit.Assert.assertEquals;
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

	@Test
	public void whenNoNodeAdded_shouldReturnSize_zero() {
		MyBinarySearchTree<Integer> bst = new MyBinarySearchTree<>();
		assertEquals(0, bst.size());
	}

	@Test
	public void whenOneNodeAdded_shouldReturnSize_one() {
		MyBinarySearchTree<Integer> bst = new MyBinarySearchTree<>();
		bst.add(56);
		assertEquals(1, bst.size());
	}

	@Test
	public void whenTwoNodesAdded_shouldReturnSize_two() {
		MyBinarySearchTree<Integer> bst = new MyBinarySearchTree<>();
		bst.add(56);
		bst.add(30);
		assertEquals(2, bst.size());
	}

	@Test
	public void whenThreeNodesAdded_shouldReturnSize_three() {
		MyBinarySearchTree<Integer> bst = new MyBinarySearchTree<>();
		bst.add(56);
		bst.add(30);
		bst.add(70);
		assertEquals(3, bst.size());
	}
}
