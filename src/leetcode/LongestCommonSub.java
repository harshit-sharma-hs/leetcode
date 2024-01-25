
/*
 * 1143. Longest Common Subsequence
 */

package leetcode;

import java.util.Scanner;

class LongestCommonSub {
	public static int longestCommonSubsequence(String text1, String text2) {
		if (text1.length() < text2.length()) {
			return checkLSC(text1, text2);
		}
		return checkLSC(text2, text1);
	}

	public static int checkLSC(String s1, String s2) {
		int dp[] = new int[s1.length() + 1];

		for (int i = 1; i <= s2.length(); i++) {
			int prev = 0;
			for (int j = 1; j <= s1.length(); j++) {
				int temp = dp[j];
				if (s1.charAt(j - 1) == s2.charAt(i - 1))
					dp[j] = prev + 1;
				else
					dp[j] = Math.max(dp[j], dp[j - 1]);

				prev = temp;
			}
		}
		return dp[s1.length()];
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.println(longestCommonSubsequence(sc.next(), sc.next()));

	}

}
