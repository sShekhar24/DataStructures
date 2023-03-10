package dll.deletion.from.beginning;

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
	
	public void deleteFromBeginning() {
		if(head == null) {
			System.out.println("Doubly linked list does not exist");
			return;
		}
		
		if(head.next == null) {
			System.out.println("Doubly linked list will be deleted");
			head = head.next;
			return;
		}
		
		Node n = head;
		head = n.next;
		head.prev = null;
		
		
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
		list.deleteFromBeginning();
		list.displayList();
		
		DLL list1 = new DLL();
		list1.head = new Node(100);
		list1.displayList();
		list1.deleteFromBeginning();
		list1.displayList();
	}
}
