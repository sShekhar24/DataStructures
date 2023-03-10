package linked.list.traversal;

public class LinkedList
{
	static class Node  /** this class is made static so that main class can access it*/
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
		while (n != null)
		{
			System.out.println(n.data);
			n = n.next;
		}
	}
	
	public static void main (String[] args )
	{
		LinkedList list = new LinkedList();
		list.head = new Node(100);
		Node second = new Node(200);
		Node third = new Node(300);
		Node fourth = new Node(400);
		
		list.head.next = second;
		second.next = third;
		third.next = fourth;
		
		list.printList();
	}
}
