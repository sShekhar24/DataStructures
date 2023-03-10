package dll.insertion.after.a.given.node;


public class DLL {

	static class Node {
		int data;
		Node prev;
		Node next;

		Node(int after){
			this.data = after;
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

	public void insertAfter(int after,int newData) {

		if(head == null) {
			System.out.println("Doubly Linked list does not exist");
			return;
		}

		Node newNode = new Node(newData);

		Node n = head;
		Node nextNode = null;

		while(n.data != after) {
			n = n.next;
		}

		if(n.next == null) {
			System.out.println("Insertion will be at the last of the list.\n"+newData+" will be inserted after "+after+"\n");
			n.next = newNode;
			newNode.prev = n;
			return;
		}
		System.out.println(newData+" will be inserted after "+after+"\n");
		nextNode = n.next;
		n.next = newNode;
		newNode.prev = n;
		newNode.next = nextNode;
		nextNode.prev = newNode;

	}

	public static void main(String[] args) {


		DLL list = new DLL();
		list.head = new Node(10);
		Node second = new Node(20);
		Node third = new Node(30);

		list.head.next = second;
		second.prev = list.head;
		second.next = third;
		third.prev = second;

		list.displayList();
		list.insertAfter(20,40);
		list.displayList();


	}

}
