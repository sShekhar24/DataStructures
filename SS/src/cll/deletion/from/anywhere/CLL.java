package cll.deletion.from.anywhere;


public class CLL {
	
	int len = 0;
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
			len++;
			return;
		}
		
		Node n = head;
		
		do {
			System.out.println(n.data);
			n = n.next;
			len++;
		}while(n != head);
	}
	
	public void delete( int dataToBeDeleted) {
		
		if(head == null) {
			return;
		}
		
		if(head.next == head && len<2) {
			head = null;
			System.out.println("Circular Linked List will be deleted");
			return;
		}
		Node n = head;
		if(n.data == dataToBeDeleted) {
			head = n.next;
			return;
		}
		
		//10 -- 20 -- 30 -- 40
		Node nextNode = null;
		Node prevNode = null;
		while(n.data != dataToBeDeleted) {
			prevNode = n;
			n = n.next;
			nextNode = n.next;
		}
		n = prevNode;
		n.next = nextNode;
		
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
		System.out.println("After deletion :");
		list.delete(30);
		list.displayList();
		System.out.println("***************************************************************************************************************");
		
		CLL list1 = new CLL();
		list1.displayList();
		System.out.println("After deletion :");
		list1.delete(20);
		list1.displayList();
		System.out.println("***************************************************************************************************************");

		
		CLL list2 = new CLL();
		list2.head = new Node(90);
		list2.head.next = list2.head;
		list2.displayList();
		System.out.println("After deletion :");
		list2.delete(90);
		list2.displayList();
		System.out.println("***************************************************************************************************************");

	}
	
}

