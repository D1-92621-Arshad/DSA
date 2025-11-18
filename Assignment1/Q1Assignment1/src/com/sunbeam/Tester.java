package com.sunbeam;

public class Tester {

	public static void main(String[] args) {
		List l = new List();
		
		l.addFirst(50);
		l.addFirst(40);
		l.addFirst(30);
		l.addFirst(20);
		l.addFirst(10);
		
		l.display();
		
		l.addAfter(100, 50);
		
		l.display();
		
//		l.addbefore(200, 10);
//		
//		l.display();
//		
	}
}
