package com.LinkedList.Tree;

public class Node {

	Node left;
	Node right;
	Object value;
	
	public Node(Object data, Node left, Node right) {
		// TODO Auto-generated constructor stub
		this.value = data;
		this.left = left;
		this.right = right;
	}

	public void addLeft(Object data) {
		this.left = new Node(data, null, null);
	}
	
	public void addRight(Object data) {
		this.right = new Node(data, null, null);
	}
	
	public Node getLeft() {
		return this.left;
	}
	
	public Node getRight() {
		return this.right;
	}
	
	public Object getData() {
		return this.value;
	}
}
