package com.practise;

import java.util.HashSet;

public class RemoveDupFromLl {
	Node head;
	class Node{
		int data;
		Node next;
		Node(int d){
			data = d;
		}
	}
	
	public void insert(int data) {
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
	}
	
	/* Function to print linked list */
    void printList() 
    { 
        Node temp = head; 
        while (temp != null) 
        { 
           System.out.print(temp.data+" "); 
           temp = temp.next; 
        }   
        System.out.println(); 
    } 
    
	public static void main(String[] args) {
		
		RemoveDupFromLl list = new RemoveDupFromLl();
		list.insert(10);
		list.insert(11);
		list.insert(12);
		list.insert(11);
		list.insert(11);
		list.insert(12);
		list.insert(10);
		list.printList();
		list.removeDuplicatesFromUnsortedList(list.head);
		list.printList();
	}

	private void removeDuplicatesFromUnsortedList(Node head) {
		Node current  =head, prev = null;
		HashSet<Integer> hset = new HashSet<>();
		while(current !=null) {
			
			if(hset.contains(current.data)) {
				prev.next = current.next;
				
			}else {
				hset.add(current.data);
				prev=current;
				
			}
			current = current.next;
		}
		
	}

	/*private void removeDuplicatesFromUnsortedList(Node head) {
		Node ptr1=null, ptr2 =null,dup =null;
		ptr1=head;
		while(ptr1 !=null && ptr1.next!=null) {
			ptr2 = ptr1;
			
			while(ptr2.next !=null) {
				if(ptr1.data == ptr2.next.data) {
					ptr2.next =ptr2.next.next;
				}else {
					ptr2 =ptr2.next;
				}
			}
			
			ptr1 = ptr1.next;
		}
		
	}*/

}
