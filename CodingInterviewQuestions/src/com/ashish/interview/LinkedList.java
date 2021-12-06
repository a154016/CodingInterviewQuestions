package com.ashish.interview;

/*Trim the list, delete N elements from the end,
write delete function to delete Every Kth element. (single list) ,
optimize if possible.*/
public class LinkedList {

	Node head;

	class Node {
		int data;
		Node next;
	}

	void add(int data) {

		// Node head;
		Node node = new Node();
		node.data = data;
		node.next = null;
		if (head == null) {
			head = node;
		} else {
			Node n = head;
			while (n.next != null) {
				n = n.next;
			}
			n.next = node;
		}
	}

void trim(int a)
{
	 int count=0;
Node noderef = null;
	Node n = head;
	while (n.next != null) {
		n = n.next;
		count++;
		if(count%a==0)
		{
			 noderef=n;
		}
		
	}
	
	if(noderef.next!=null)
	{
		noderef.next=null;
		
	}

	
}
}