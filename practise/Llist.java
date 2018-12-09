package com.practise;

public class Llist {
	
	Node head;
	class Node{
		int data;
		Node next;
		public Node(int d) {
			data = d;
			next = null;
		}
				
	}

	public void push(int data) {
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
		
	}
	
	public boolean checkLoop(Node head) {
		Node slow, fast;
		slow =head;
		fast = head;
		
		while(slow != null && fast != null && fast.next != null) {
			slow =slow.next;
			fast = fast.next.next;
			if(slow == fast) {
				System.out.println("Loop Exists");
				findStartNodeOfLoop(slow, head);
				return true;
			}
			
		}
		return false;
		
		
	}

	private void findStartNodeOfLoop(Node slow, Node head2) {
		Node ptr1 = slow;
		Node ptr2 = slow;
		int k=1,i;
		while(ptr1.next != ptr2) {
			ptr1=ptr1.next;
			k++;			
		}
		ptr1=head;
		ptr2 = head;
		
		for(i=0;i<k;i++) {
			ptr2=ptr2.next;
		}
		
		while(ptr1!=ptr2) {
			ptr1 = ptr1.next;
			ptr2 = ptr2.next;
		}
		
		System.out.println("start of loop"+ ptr1.data);
		
	}

	public static void main(String[] args) {
		Llist list = new Llist();
		//10->15->4->20
		list.push(20);
		list.push(4);
		list.push(15);
		list.push(10);
		
		list.head.next.next.next.next = list.head.next;
		System.out.println(list.head.next.next.next.next.data);
		
		list.checkLoop(list.head);
		
	}

}
