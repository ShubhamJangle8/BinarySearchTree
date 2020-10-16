package com.assignment.binarytree;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;

public class MyBinarySearchTreeTest {

	@Test
	public void whenNoNodeAdded_shouldReturn_True() {
		MyBinarySearchTree<Integer> binaryTree = new MyBinarySearchTree<>();
		assertTrue(binaryTree.add(null));
	}
	
	@Test
	public void whenOneNodeAdded_shouldReturnTrue() {
		MyBinarySearchTree<Integer> binaryTree = new MyBinarySearchTree<>();
		assertTrue(binaryTree.add(56));
	}

	@Test
	public void whenTwoNodesAdded_shouldReturnTrue() {
		MyBinarySearchTree<Integer> binaryTree = new MyBinarySearchTree<>();
		assertTrue(binaryTree.add(56));
		assertTrue(binaryTree.add(30));
	}

	@Test
	public void whenThreeNodesAdded_shouldReturnTrue() {
		MyBinarySearchTree<Integer> binaryTree = new MyBinarySearchTree<>();
		assertTrue(binaryTree.add(56));
		assertTrue(binaryTree.add(30));
		assertTrue(binaryTree.add(70));
	}

	@Test
	public void whenNoNodeAdded_shouldReturnSize_zero() {
		MyBinarySearchTree<Integer> binaryTree = new MyBinarySearchTree<>();
		assertEquals(0, binaryTree.size());
	}

	@Test
	public void whenOneNodeAdded_shouldReturnSize_one() {
		MyBinarySearchTree<Integer> binaryTree = new MyBinarySearchTree<>();
		binaryTree.add(56);
		assertEquals(1, binaryTree.size());
	}

	@Test
	public void whenTwoNodesAdded_shouldReturnSize_two() {
		MyBinarySearchTree<Integer> binaryTree = new MyBinarySearchTree<>();
		binaryTree.add(56);
		binaryTree.add(30);
		assertEquals(2, binaryTree.size());
	}

	@Test
	public void whenThreeNodesAdded_shouldReturnSize_three() {
		MyBinarySearchTree<Integer> binaryTree = new MyBinarySearchTree<>();
		binaryTree.add(56);
		binaryTree.add(30);
		binaryTree.add(70);
		assertEquals(3, binaryTree.size());
	}
	
	// UC 3
	@Test
	public void ifNodePresent_shouldReturn_true(){
		MyBinarySearchTree<Integer> binaryTree = new MyBinarySearchTree<>();
		binaryTree.add(56);
		binaryTree.add(30);
		binaryTree.add(70);
		binaryTree.add(22);
		binaryTree.add(40);
		binaryTree.add(11);
		binaryTree.add(63);
		binaryTree.add(67);
		assertTrue(binaryTree.search(63));	
		assertTrue(binaryTree.search(22));	
		
	}
	
	@Test
	public void ifNodeAbsent_shouldReturn_false(){
		MyBinarySearchTree<Integer> binaryTree = new MyBinarySearchTree<>();
		binaryTree.add(56);
		binaryTree.add(30);
		binaryTree.add(70);
		binaryTree.add(60);
		binaryTree.add(95);
		binaryTree.add(65);
		binaryTree.add(63);
		binaryTree.add(67);
		assertFalse(binaryTree.search(23));	
		assertFalse(binaryTree.search(64));
	}
}
