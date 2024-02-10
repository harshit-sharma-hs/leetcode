/*
 * 647. Palindromic Substrings
 */
package leetcode;

import java.util.Scanner;

class PalindrominSubstringCount {
	static int count = 0;

	public static int countSubstrings(String s) {
		int n = s.length();

		for (int i = 0; i < n; i++) {
			helper(s, i, i);
			helper(s, i, i + 1);
		}
		return count;

	}
	public static void helper(String s,int left,int right)
	{
		while(left>=0 && right < s.length() && s.charAt(left) == s.charAt(right))
		{
			count++;
			left--;
			right++;
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(countSubstrings(str));

	}

}
