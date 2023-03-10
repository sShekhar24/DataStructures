package linked.list.insertion.after.a.given.node;

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
	
	public void insertAfter(Node prevNode, int newData)
	{
		if(prevNode == null)
		{
			System.out.println("Previous node cannot be null");
			return;
		}
		
		Node newNode = new Node(newData);
		newNode.next = prevNode.next;
		prevNode.next = newNode;
	}
	
	public static void main(String[] args)
	{
		LinkedList list = new LinkedList();
		list.head = new Node(100);
		Node second = new Node(200);
		Node third = new Node (300);
		list.head.next = second;
		second.next  = third;
		list.printList();
		list.insertAfter(second, 400);
		list.printList();
	}
}
