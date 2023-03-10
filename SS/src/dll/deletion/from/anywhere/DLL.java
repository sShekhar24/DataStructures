package dll.deletion.from.anywhere;

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

	public void deleteNode(int d) {
		if(head == null) {
			System.out.println("Doubly Linked List does not exist.");
			return;
		}
		
		if(head.next == null) {
			head = null;
			System.out.println("Doubly Libked List will be deleted.");
			return;
		}
		
		Node n = head;
		while(n.data != d) {
			n = n.next;
		}
		n.prev.next = n.next;
		n.next.prev = n.prev;
		
		
	}
	
	public static void main(String[] args) {
		DLL list = new DLL();
		list.head = new Node(10);
		Node second = new Node(20);
		Node third = new Node(30);
		Node fourth = new Node(40);
		
		list.head.next = second;
		second.prev = list.head;
		second.next = third;
		third.prev = second;
		third.next = fourth;
		fourth.prev = third;
		
		list.displayList();
		list.deleteNode(20);
		list.displayList();;
	}
}
