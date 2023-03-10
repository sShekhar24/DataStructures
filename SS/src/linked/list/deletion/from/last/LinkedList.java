package linked.list.deletion.from.last;

public class LinkedList {

	static class Node
	{
		int data;
		Node next;
		Node(int d)
		{
			this.data = d;
			next = null;
		}
	}
	Node head;

	public void printList()
	{
		Node n = head;
		while(n != null)
		{
			System.out.println(n.data);
			n = n.next;
		}
	}

	public void removeFromLast()
	{
		if(head == null)
		{
			System.out.println("LinkedList does not exist");
			return;
		}

		Node tempNode = head;
		while(tempNode.next.next != null)
		{
			tempNode = tempNode.next;
		}
		tempNode.next = null;
	}

	public static void main(String[] args)
	{
		LinkedList list = new LinkedList();
		list.head = new Node(100);
		Node second = new Node(200);
		Node third = new Node(300);

		list.head.next = second;
		second.next = third;
		list.printList();
		list.removeFromLast();
		list.printList();
	}

}
