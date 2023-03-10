package cll.deletion.from.front;

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
		
		if(head.next == head) {
			System.out.println("Single circular Linked List\nData is -->:"+head.data);
			return;
		}
		
		Node n = head;

		do {
			System.out.println(n.data);
			n = n.next;
		}while(n != head);
		
	}
	
	public void deleteFromFront() {
		
		if(head == null) {
			System.out.println("Circualr Linked list does not exist");
			return;
		}
		
		if(head.next == head) {
			System.out.println("Single Circular Linked List will be deleted");
			head = null;
			return;
		}
		
		Node n = head;
		head = n.next;
		
	}
	
	public static void main(String[] args) {
		
		CLL list = new CLL();
		list.head = new Node(10);
		Node second = new Node(20);
		Node third = new Node(30);
		
		list.head.next = second;
		second.next = third;
		third.next = list.head;
		
		list.displayList();
		System.out.println("After deletion from front:");
		list.deleteFromFront();
		list.displayList();
		
		CLL list1 = new CLL();
		list1.displayList();
		list1.deleteFromFront();
		list1.displayList();
	}

}
