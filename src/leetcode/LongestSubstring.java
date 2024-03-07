/*
 * Longest repeating and non-overlapping substring
 */
package leetcode;

import java.util.Scanner;

class LongestSubstring {
	static String longestSubstring(String s, int n) {
		String ans = "";
		if (n == 1)
			return "-1";

		int len = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j <= n; j++) {
				if (j - i <= len)
					continue;

				String a = s.substring(i, j);
				String b = s.substring(j, n);

				if (b.contains(a)) {
					len = a.length();
					ans = a;
				} else
					break;
			}
		}
		return ans.length() == 0 ? "-1" : ans;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.println(longestSubstring(sc.next(), sc.nextInt()));

	}

}
