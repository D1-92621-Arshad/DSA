
public class Tester {
	public static void main(String[] args) {

		CircularList list = new CircularList();

		System.out.println("Adding first few nodes : ");
		list.addFirst(30);
		list.addFirst(20);
		list.addFirst(10);
		list.display();

		System.out.println("Adding at last : ");
		list.addLast(40);
		list.addLast(50);
		list.display();

		System.out.println("Add after 30  insert 35 : ");
		list.addAfter(35, 30);
		list.display();

		System.out.println("Delete 10 : ");
		list.delete(10);
		list.display();

		System.out.println("Delete 50 : ");
		list.delete(50);
		list.display();

		System.out.println("Delete 30 : ");
		list.delete(30);
		list.display();

		System.out.println("Add last again after deletions : ");
		list.addLast(99);
		list.display();
	}
}

