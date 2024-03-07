/*
 * 876. Middle of the Linked List
 */
package linkedlist;

import java.util.Scanner;

class MiddleNode {
	public static ListNode middleNode(ListNode head) {

		if (head == null)
			return null;
		int count = 1;
		ListNode fast = head;
		ListNode slow = head;
		while (fast.next != null) {

			count++;
			fast = fast.next;
		}
		int mid = (count / 2) + 1;
		int i = 1;
		while (i != mid) {
			slow = slow.next;
			i++;
		}
		return slow;
	}
	 public static void main(String args[])
	    {
	    	ListNode head= new ListNode(1);
	    	head.next = new ListNode(2);
	    	head.next.next = new ListNode(3);
	    	head.next.next.next = new ListNode(4);
	    	head.next.next.next.next = new ListNode(5);
	    	head.next.next.next.next.next = new ListNode(6);
	    	
	    	System.out.println(middleNode(head));
	    		
	    }
}