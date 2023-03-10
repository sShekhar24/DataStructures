package dll.deletion.from.last;

public class DLL {

	static class Node {
		int data;
		Node prev;
		Node next;
		Node(int d){
			this.data = d;
			prev= null;
			next = null;
		}
	}

	Node head;

	public void displayList() {
		Node n = head;
		while(n != null) {
			System.out.println(n.data);
			n = n.next;
		}
		System.out.println();
	}

	public void deletionFromLast() {
		if(head == null) {
			System.out.println("Doubly linked list does not exist.");
			return;
		}

		if(head.next == null) {
			head =null;
			System.out.println("Doubly Linked List will be deleted.");
			return;
		}

		Node n = head;
		while(n.next != null) {
			n = n.next;
		}
		n.prev.next = null;
	}


	public static void main(String[] args) {
		DLL list = new DLL();
		list.head = new Node(10);
		Node second = new Node(20);
		Node third = new Node(30);

		list.head.next = second;
		second.prev = list.head;
		second.next = third;
		third.prev = second;

		list.displayList();
		list.deletionFromLast();
		list.displayList();

		DLL list1 = new DLL();
		list1.head = new Node(100);
		list1.displayList();
		list1.deletionFromLast();
		list1.displayList();

	}
}
