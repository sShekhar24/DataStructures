package linked.list.reversal;

public class LinkedList {

	static class Node {
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

	public Node reverseList(Node head) {
		
		if(head == null) {
			System.out.println("Linked List does not exist");
		}
//		1 -->  2 -->  3 --> 4 --> 5
//		5 -->  4 -->  3 --> 2 --> 1
		
		Node prevNode = null;
		Node curNode = head;
		Node nextNode = null;
		
		while(curNode != null) {
			nextNode = curNode.next;
			curNode.next = prevNode;
			prevNode = curNode;
			curNode = nextNode;
		}
		head = prevNode;
		return head;
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
		list.head = list.reverseList(list.head);
		list.printList();

	}

}
