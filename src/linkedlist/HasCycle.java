/*
 * 141. Linked List Cycle
 */

package linkedlist;

public class HasCycle {
    public static boolean hasCycle(ListNode head) {
        if(head == null || head.next == null)
            return false;
        ListNode fast = head;
        ListNode slow = head;
    
        while(fast!=null && fast.next!=null)
        {
            fast= fast.next.next;
            slow = slow.next;

            if(fast == slow)
                return true;
        }
        return false;

        
    }
    public static void main(String args[])
    {
    	ListNode head= new ListNode(1);
    	head.next = new ListNode(2);
    	head.next.next = new ListNode(3);
    	head.next.next.next = new ListNode(4);
    	head.next.next.next.next = new ListNode(5);
    	head.next.next.next.next.next = new ListNode(6);
    	
    	System.out.println(hasCycle(head));
    		
    }
}