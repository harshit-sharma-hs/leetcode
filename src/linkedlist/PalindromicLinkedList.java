package linkedlist;

import java.util.ArrayList;
import java.util.List;

class PalindromicLinkedList {
	public static boolean isPalindrome(ListNode head) {

		List<Integer> list = new ArrayList<>();
		if (head == null) {
			return false;
		}
		ListNode fast = head;
		while (fast != null ) {
			list.add(fast.val);
			fast = fast.next;
		}
		int x = 0;
		int y = list.size() - 1;
		while (x <= y) {
			if (list.get(x) == list.get(y)) {
				x++;
				y--;
			} else
				return false;
		}
		return true;

	}

	public static void main(String args[]) {
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(2);
		head.next.next.next = new ListNode(1);
//    	head.next.next.next.next = new ListNode(5);
//    	head.next.next.next.next.next = new ListNode(6);

		System.out.println(isPalindrome(head));

	}

}
