package cll.representation;

public class CLL {

	static class Node {
		int data;
		Node next;
		Node(int d){
			this.data = d;
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
			System.out.println(head.data);
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

		CLL list1 = new CLL();
		list1.head = new Node(10);
		list1.head.next = list1.head;
		list1.displayList();
	}
}
