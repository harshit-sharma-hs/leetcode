/*
 * 143. Reorder List
 */
package linkedlist;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class ReorderLinkedLists {
    public static void reorderList(ListNode head) {
        ListNode preNode = new ListNode(0);
        ListNode curr = preNode;
        int i = 0;
        Deque<ListNode> nodeDeque = new LinkedList<>();
        while(head != null){  //save to Deque 
            nodeDeque.add(head);
            head = head.next;
        }
        while(!nodeDeque.isEmpty()){ //take out from Deque from front then end
            curr.next = nodeDeque.pollFirst();
            curr = curr.next;
            if(!nodeDeque.isEmpty()){
                curr.next = nodeDeque.pollLast();
                curr = curr.next;
            }
        }
        curr.next = null;  //no circle in the list
    }

	public static void main(String args[]) {
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		head.next.next.next.next = new ListNode(5);
//		head.next.next.next.next.next = new ListNode(6);

	reorderList(head);

	}
}
