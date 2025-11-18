package com.sunbeam;

public class Tester {
	public static void main(String[] args) {
		List l = new List();
		
		l.insertSorted(10);
		l.insertSorted(20);
		l.insertSorted(15);
		l.insertSorted(35);
		l.insertSorted(40);
		l.insertSorted(5);
		
		l.display();
	}
}
