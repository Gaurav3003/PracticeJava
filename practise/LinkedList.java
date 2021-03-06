package com.practise;

public class LinkedList {
	Node head;
	
	class Node{
		int data;
		Node next;
		Node(int d){
			data = d;
			next = null;
		}
	}
	Node reverse(Node head, int k) {
		Node current = head;
		Node prev = null;
		Node next = null;
		
		int count = 0;
		while(count<k) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
			count++;
		}
		
		if(next!=null) {
			head.next = reverse(next, k);
		}
		
		return prev;
	}
	
	public void push(int new_data) 
    { 
        /* 1 & 2: Allocate the Node & 
                  Put in the data*/
        Node new_node = new Node(new_data); 
   
        /* 3. Make next of new Node as head */
        new_node.next = head; 
   
        /* 4. Move the head to point to new Node */
        head = new_node; 
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
  
     /* Drier program to test above functions */
    public static void main(String args[]) 
    { 
        LinkedList llist = new LinkedList(); 
          
        /* Constructed Linked List is 1->2->3->4->5->6-> 
           7->8->8->9->null */
        llist.push(9); 
        llist.push(8); 
        llist.push(7); 
        llist.push(6); 
        llist.push(5); 
        llist.push(4); 
        llist.push(3); 
        llist.push(2); 
        llist.push(1); 
          
        System.out.println("Given Linked List"); 
        llist.printList(); 
          
        llist.head = llist.reverse(llist.head, 3); 
  
        System.out.println("Reversed list"); 
        llist.printList(); 
    } 
}
