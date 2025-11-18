package com.sunbeam;

public class List {
	static class Node{
		private int data;
		private Node next;
		public Node(int value) {
			data=value;
			next=null;
		}
	}
	private Node head,tail;
	
	public List() {
		head=null;
		tail=null;
	}
	
	public void display() {
		Node trav=head;
		while(trav!=null) {
			System.out.print(" "+trav.data);
				trav=trav.next;
		}
		System.out.println(" ");
	}
	
	public  void addAfter(int value,int dataIn) {
		//1.search the position from data by traversing 
		Node trav=head;
		while(trav.data!=dataIn) {
			trav=trav.next;
			
		}
		Node newNode=new Node(value);
		newNode.next=trav.next;
		trav.next=newNode;
		//2.add the data after that position
	}
	
	public  void addbefore(int value,int dataIn) {
		Node newNode=new Node(value);
		if(head.data==dataIn) {
			addFirst(value);
		}else {
			//1.search the position from data by traversing 
			Node trav=head;
			while(trav.next.data!=dataIn) {
				trav=trav.next;
				
			}
			
			newNode.next=trav.next;
			trav.next=newNode;
			//2.add the data after that position
		}
		
	}
	
	public void addFirst(int value) {
		Node newNode = new Node(value);
		
		newNode.next=head;
		head=newNode;
	}
	


}
