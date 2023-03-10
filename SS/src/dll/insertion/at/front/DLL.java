package dll.insertion.at.front;

public class DLL {

	static class Node {
		Node prev;
		Node next;
		int data;

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

	public void append(int newData) {
		Node newNode = new Node(newData);
		newNode.next = head;
		head.prev = newNode;
		head = newNode;
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
		list.append(0);
		list.displayList();

	}

}
