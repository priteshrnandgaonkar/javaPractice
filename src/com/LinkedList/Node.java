package com.LinkedList;

public class Node {
	Node next;
	Object data;
	
	public Node(Object _data) {
		// TODO Auto-generated constructor stub
		this.data = _data;
		this.next = null;
	}
	
	public void setData(Object data) {
		this.data = data;
	}
	
	public Object getData() {
		return this.data;
	}
	
	public Node getNext() {
		return this.next;
	}
	
	public void setNext(Node d) {
		this.next = d;
	}
}
