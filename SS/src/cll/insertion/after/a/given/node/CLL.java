package cll.insertion.after.a.given.node;

public class CLL {

	static 	int len = 0;

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
			System.out.println("Singular Circular Linked List\nData is -->:"+head.data+"\n");
			len++;
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
		/**System.out.println("Length of the Circular List is -->:"+len);*/

	}

	public void insertAfter(int after,int newData) {

		Node newNode = new Node(newData);

		if(head == null) {
			System.out.println("Circular Linked List does not exist");
			return;
		}
		Node n = head;
		if(head.data == after && len < 2) { //single node.
			n.next = newNode;
			newNode.next = n;
		}
		else { //multiple nodes.
			Node nextNode = null;
			while(n.data != after) {
				n = n.next;
			}
			nextNode = n.next;
			n.next = newNode;
			newNode.next = nextNode;
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
		list.insertAfter(40,50);
		list.displayList();

		CLL list1 = new CLL();
		list1.head = new Node(10);
		list1.head.next = list1.head;
		list1.displayList();
		list1.insertAfter(10,50);
		list1.displayList();

	}
}