/*
 * Game with String
 */
package leetcode;

import java.util.Arrays;
import java.util.Scanner;

class MinValue {
	static int minValue(String s, int k) {
		if (s.length() == 0)
			return 0;
		if (s.length() == 1 && k == 1)
			return 0;
		int carr[] = new int[26];
		for (char c : s.toCharArray()) {
			carr[c - 'a']++;
		}
		int sum = 0;
		while (k != 0) {
			Arrays.sort(carr);
			carr[25]--;
			k--;
		}
		for (int i = 25; i >= 0; i--) {
			sum += carr[i] * carr[i];
		}

		return sum;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		String str = sc.next();
		System.out.println(minValue(str, k));

	}
}
