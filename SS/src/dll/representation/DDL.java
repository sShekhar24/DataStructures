package dll.representation;

public class DDL {
	
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
	
	public static void main(String[] args) {
		DDL list = new DDL();
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
		
		
	}

}
