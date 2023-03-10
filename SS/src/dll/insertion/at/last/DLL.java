package dll.insertion.at.last;

public class DLL {

	static class Node {
		int data;
		Node prev;
		Node next;
		Node(int d){
			this.data = d;
			prev = null;
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

	public void append(int newData) {

		if(head == null) {
			System.out.println("Doubly Linked list does not exist");
			return;
		}

		Node newNode = new Node(newData);
		Node n = head;
		while(n.next != null) {
			n = n.next;
		}
		n.next = newNode;
		newNode.prev = n;
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
		list.append(40);
		list.displayList();
	}

}
