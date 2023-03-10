package cll.deletion.from.last;

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
			System.out.println("Circular Linked List does not exist.");
			return;
		}
		
		if(head.next == head) {
			System.out.println("Single Circular Linked List.\nData is -->:"+head.data);
			return;
		}
		
		Node n = head;
		
		do {
			System.out.println(n.data);
			n = n.next;
		}while(n != head);

		
	}
	
	public void deleteFromLast() {
		
		if(head == null)return; //if CLL does not exist
	
		if(head.next == head) { //singular CLL
			System.out.println("Circular Linked List will be deleted.");
			head =null;
			return;
		}
		
		Node n = head;
		Node prevNode = null;
		while(n.next != head) {
			prevNode = n;
			n = n.next;
		}
		prevNode.next = n.next;
		
		
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
		System.out.println("After deletion from last:");
		list.deleteFromLast();
		list.displayList();
		System.out.println("***************************************************************************************************************");
		
		CLL list1 = new CLL();
		list1.displayList();
		list1.deleteFromLast();
		list1.displayList();
		System.out.println("***************************************************************************************************************");

		
		CLL list2 = new CLL();
		list2.head = new Node(90);
		list2.head.next = list2.head;
		list2.displayList();
		list2.deleteFromLast();
		list2.displayList();
		System.out.println("***************************************************************************************************************");

	}
	
}

