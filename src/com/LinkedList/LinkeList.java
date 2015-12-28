package com.LinkedList;

public class LinkeList {
	Node head;
	public int count;
	public LinkeList(Object value) {
		// TODO Auto-generated constructor stub
		this.head = new Node(value);
		this.count = 1;
	}
	public Node getHead() {
		return this.head;
	}
	
	public void setHead(Node d) {
		this.head = d;
	}
	
	public void add(Object data) {
		Node nodeToBeAdded = new Node(data);
		Node iteratedNode = head;
		while(iteratedNode.next != null) {
			iteratedNode = iteratedNode.next;
		}
		iteratedNode.setNext(nodeToBeAdded);
		count = count + 1;
	}
	
	public void insert(Object val, int index) {
		Node nodeToBeInserted = new Node(val);
		Node currentNode = head;
		Node prevNode = null;
		for(int i = 0; i < index; ++i ) {
			currentNode = currentNode.next;
		}
		if(index != 0) {
			prevNode = head;
			for(int j = 0; j < index - 1; ++j) {
				prevNode = prevNode.next;
			}
		}
		nodeToBeInserted.next = currentNode;
		prevNode.next = nodeToBeInserted;
		count = count + 1;
	}
	
	public String printLinkedList(){
		Node iteratedNode = head;
		Object desc = iteratedNode.getData();
		while(iteratedNode.next != null) {
			iteratedNode = iteratedNode.next;
			desc = desc + "->" + iteratedNode.getData();
		}
		return desc.toString();
	}
}
	
