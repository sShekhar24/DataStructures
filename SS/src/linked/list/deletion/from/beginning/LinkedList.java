package linked.list.deletion.from.beginning;

public class LinkedList {

	static class Node
	{
		int data;
		Node next;
		Node(int d)
		{
			this.data=d;
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

	public void remove()
	{
		if(head == null)
		{
			System.out.println("LinkedList does not exist");
			return;
		}
		
		Node temp = head;
		
		temp = temp.next;
		head = temp;
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
		list.remove();
		list.printList();
	}
}
