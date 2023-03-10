package linked.list.deletion.from.anywhere;

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
			n=n.next;
		}
	}
	
	public void removeFromAnywhere(int dataToBeDeleted)
	{
	
		if(head == null)
		{
			System.out.println("LinkedList does not exist");
			return;
		}
		
		if(head.data == dataToBeDeleted)
		{
			head = head.next;
			return;
		}

		Node tempNode = head;

		while(tempNode.next.data != dataToBeDeleted)
		{
			tempNode = tempNode.next;
		}
		tempNode.next = tempNode.next.next;
	}
	
	public static void main(String[] args)
	{
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
		
		list.printList();
		list.removeFromAnywhere(200);
		list.printList();
		
	}

}
