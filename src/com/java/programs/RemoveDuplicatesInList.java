package com.java.programs;

public class RemoveDuplicatesInList {

	 public static ListNode deleteDuplicates(ListNode head) {
		 ListNode curr = head; 
		  
	        /* Traverse list till the last node */
	        while (curr != null) { 
	        	ListNode temp = curr; 
	            /*ListNode current node with the next node and  
	            keep on deleting them until it matches the current  
	            node data */
	            while(temp!=null && temp.val==curr.val) { 
	                temp = temp.next; 
	            } 
	            /*Set current node next to the next different  
	            element denoted by temp*/
	            curr.next = temp; 
	            curr = curr.next; 
	        } 
	        return head;
	  }
	 
	 public static void main(String[] args) {
		
		 ListNode list = new ListNode(1);
		
		 ListNode list1 = new ListNode(1);
		 ListNode list2 = new ListNode(1);
		 
		 list.next = list1;
		 list1.next = list2;
		 
		ListNode listNode=  deleteDuplicates(list);
		
		while(listNode!=null) {
			System.out.println(listNode.val);
			listNode =listNode.next;
		}
	}
	 
}

 class ListNode {
	      int val;
	      ListNode next;
	      ListNode(int x) { val = x; }
}