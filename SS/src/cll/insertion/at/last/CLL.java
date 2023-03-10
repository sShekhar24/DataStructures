package cll.insertion.at.last;


public class CLL {

	static class Node {
		int data;
		Node next;

		Node(int d) {
			this.data = d;
			next = null;
		}
	}
	Node head;

	public void displayList() {
		if(head == null) {
			System.out.println("Circular Linked List does not exist");
			return;
		}

		int len = 0;

		if(head.next == head) {
			System.out.println("Singular Circular Linked List\nData is -->:"+head.data+"\n");
			return;
		}
		Node n = head;

		do {
			System.out.println(n.data);
			n = n.next;
			len++;
		}
		while(n != head); 
		System.out.println();
		System.out.println("Length of the Circular List is -->:"+len);
	}

	public void insertAtLast(int newData) {

		if(head == null) {
			System.out.println("Circular Linked List does not exist");
			return;
		}

		Node newNode = new Node(newData);
		Node n = head;

		if(head.next == head) {
			n.next = newNode;
			newNode.next = n;
		}
		else {	//for multiple nodes
			while(n.next != head) {
				n = n.next;
			}
			n.next = newNode;
			newNode.next = head; 
		}
	}

	public static void main(String[] args) {
		CLL list = new CLL();
		list.head = new Node(10);
		Node second = new Node(20);
		Node third = new Node(30);
		Node fourth = new Node(40);

		list.head.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = list.head;

		list.displayList();
		list.insertAtLast(50);
		list.displayList();

		CLL list1 = new CLL();
		list1.head = new Node(10);
		list1.head.next = list1.head;
		list1.displayList();
		list1.insertAtLast(20);
		list1.displayList();
	}

}
