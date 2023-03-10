package linked.list.detect.loop;


public class LinkedList {

	static class Node {
		int data;
		Node next;
		Node(int d) {
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

	public boolean detectLoop(Node head) {
		Node n = head;

		Node slow = head;
		Node fast = head;

		if(n == null) {
			System.out.println("Linked List does not exist");
			return false;
		}

		while(n != null) {
			n = n.next;
			if(slow.next!=null)slow = slow.next;
			else return false;
			if(fast.next!=null && fast.next.next!=null) fast = fast.next.next;
			else return false; 

			if(slow == null || fast == null) {
				return false;
			}

			if(slow == fast) {
				return true;
			}
		}

		return false;
	}

	public static void main(String[] args) {

		LinkedList list = new LinkedList();

		list.head = new Node(100);
		Node second = new Node(200);
		Node third = new Node(300);
		Node fourth = new Node(400);
		Node fifth = new Node(500);
		Node sixth = new Node(600);
		list.head.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
		fifth.next = sixth;
		//		sixth.next = second;  //uncomment to check loop for existing.
		list.detectLoop(list.head);
		//		list.printList();  //if in loop then it will keep printing
		boolean loop = list.detectLoop(list.head);
		System.out.println("Is there any loop in the linked list ?  --> "+loop);
		//		list.printList();

	}

}
