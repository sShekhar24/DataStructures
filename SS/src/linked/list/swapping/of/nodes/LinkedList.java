package linked.list.swapping.of.nodes;

public class LinkedList {

	static class Node{
		int data;
		Node next;
		Node(int d){
			this.data = d;
			next = null;
		}
	}

	Node head;

	public void printList() {
		Node n = head;
		while(n != null) {
			System.out.println(n.data);
			n = n.next;
		}
		System.out.println();
	}

	public void swapNode(int x,int y) {
		if(head == null) {
			System.out.println("Linked List does not exist");
			return;
		}

		if(x == y) { 
			return;
		}

		Node prevNodeX = null ;
		Node curNodeX = head;

		Node prevNodeY = null ;
		Node curNodeY = head;

		while(curNodeX != null && curNodeX.data != x) {
			prevNodeX = curNodeX;
			curNodeX = curNodeX.next;
		}

		while(curNodeY != null &&  curNodeY.data != y) {
			prevNodeY = curNodeY;
			curNodeY = curNodeY.next;
		}

		// If either x or y is not present, nothing to do
		if (curNodeX == null || curNodeY == null)
			return;

		// If x is not head of linked list
		if (prevNodeX != null)
			prevNodeX.next = curNodeY;
		else // make y the new head
			head = curNodeY;

		// If y is not head of linked list
		if (prevNodeY != null)
			prevNodeY.next = curNodeX;
		else // make x the new head
			head = curNodeX;

		// Swap next pointers
		Node temp = curNodeX.next;
		curNodeX.next = curNodeY.next;
		curNodeY.next = temp;


	}


	public static void main(String[] args) {

		LinkedList list = new LinkedList();

		list.head = new Node(100);
		Node second = new Node(200);
		Node third = new Node(300);
		Node fourth = new Node(400);
		Node fifth = new Node(500);

		list.head.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;

		list.printList();

		list.swapNode(200,400);

		list.printList();
	}
}
