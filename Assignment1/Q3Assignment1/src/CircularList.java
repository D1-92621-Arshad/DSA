


public class CircularList {
	static class Node {
		private int data;
		private Node next;
		public Node(int value) {
			data = value;
			next = null;
		}
	}

	private Node tail;    // no head pointer

	public CircularList() {
		tail = null;
	}

	public void display() {
		if(tail == null) {
			System.out.println(" ");
			return;
		}

		Node trav = tail.next;  // head
		do {
			System.out.print(" " + trav.data);
			trav = trav.next;
		} while(trav != tail.next);

		System.out.println(" ");
	}

	public void addFirst(int value) {
		Node newNode = new Node(value);

		if(tail == null) {
			tail = newNode;
			tail.next = tail;
		} else {
			newNode.next = tail.next;
			tail.next = newNode;
		}
	}

	public void addLast(int value) {
		Node newNode = new Node(value);

		if(tail == null) {
			tail = newNode;
			tail.next = tail;
		} else {
			newNode.next = tail.next;
			tail.next = newNode;
			tail = newNode;
		}
	}

	public void addAfter(int value, int dataIn) {
		if(tail == null)
			return;

		Node trav = tail.next;    // start from head

		do {
			if(trav.data == dataIn) {
				Node newNode = new Node(value);
				newNode.next = trav.next;
				trav.next = newNode;

				if(trav == tail)
					tail = newNode;   // inserted after tail

				return;
			}
			trav = trav.next;
		} while(trav != tail.next);
	}

	public void delete(int dataIn) {
		if(tail == null)
			return;

		Node trav = tail.next;     // head
		Node prev = tail;

		do {
			if(trav.data == dataIn) {

				if(trav == prev) {
					// only one node
					tail = null;
				} else {
					prev.next = trav.next;

					if(trav == tail)
						tail = prev;   // deleting tail
				}
				return;
			}
			prev = trav;
			trav = trav.next;
		} while(trav != tail.next);
	}
}

