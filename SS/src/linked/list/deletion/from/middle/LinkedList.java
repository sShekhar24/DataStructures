package linked.list.deletion.from.middle;

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
	
	public void removeFromMiddle(Node head) {
	 	
      Node prev =null;
      Node slow = head;
      Node fast = head;
      
      if(head == null) {
    	  System.out.println("LinkedList does not exist");
    	  return;
      }
      
      while(fast!=null && fast.next!=null) {
    	  prev=slow;
    	  slow=slow.next;
    	  fast = fast.next.next;
      }
      prev.next =slow.next;
	}
	
	public static void main(String[] args)
	{
		LinkedList list = new LinkedList();
		list.removeFromMiddle(list.head);

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
		list.removeFromMiddle(list.head);
		System.out.println("result");
		list.printList();
	}
}
