/*
 * 791. Custom Sort String
 */
package leetcode;

import java.util.Scanner;

class CustomSortString {
	public static String customSortString(String order, String s) {
		String ans = "";
		int arr[] = new int[26];
		// StringBuilder sb = new StringBuilder(s);

		for (char c : s.toCharArray())
			arr[c - 'a']++;

		for (char c : order.toCharArray()) {

			while (arr[c - 'a'] > 0) {
				ans += c;
				arr[c - 'a']--;
			}

		}
		for (int i = 0; i < arr.length; i++) {

			while (arr[i] > 0) {
				ans += Character.valueOf((char) (i + 'a'));
				arr[i]--;
				if (ans.length() == s.length())
					return ans;
			}

		}
		return ans;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.println(customSortString(sc.next(), sc.next()));

	}

}
