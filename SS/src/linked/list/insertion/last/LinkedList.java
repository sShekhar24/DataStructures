package linked.list.insertion.last;

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

	public void append(int newData)
	{
		Node newNode = new Node(newData);
		
		if(head == null)
		{
			head = newNode;
			return;
		}
		
		newNode.next=null;
		Node last = head;
		while(last.next != null)
		{
			last = last.next;
		}
		last.next=newNode;
	}
	
	public static void main(String[] args)
	{
		LinkedList list= new LinkedList();
		list.head = new Node(100);
		Node second = new Node(200);
		Node third = new Node(300);
		list.head.next = second;
		second.next = third;
		list.printList();
		list.append(400);
		list.printList();
	}
}
