/*
 * Search Pattern (Rabin-Karp Algorithm)
 */
package leetcode;

import java.util.ArrayList;
import java.util.Scanner;

import linkedlist.ListNode;

class SearchSubstringIndex {

	static ArrayList<Integer> search(String pattern, String text) {
		ArrayList<Integer> list = new ArrayList<>();
		int len = pattern.length();

		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) == pattern.charAt(0)) {
				if (i + len <= text.length()) {
					String temp = text.substring(i, i + len);
					if (temp.equals(pattern)) {
						list.add(i + 1);

					}

				}

			}
		}
		return list;

	}
	 public static void main(String args[])
	    {
	    	Scanner sc= new Scanner(System.in);
	    	
	    	System.out.println(search(sc.next(),sc.next()));
	    		
	    }

}
