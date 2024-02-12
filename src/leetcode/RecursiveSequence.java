/*
 * Recursive sequence
 */
package leetcode;

import java.util.Scanner;

public class RecursiveSequence {

	static long sequence(int n) {

		int mod = 1000000007;
		long ans = 0;
		long temp = 1;

		for (int i = 0; i < n; i++) {
			long mid = 1;
			for (int j = 0; j < i + 1; j++) {
				mid = (mid * temp) % mod;
				temp += 1;
			}
			ans = (ans + mid) % mod;
		}
		return ans;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		System.out.println(sequence(n));

	}
}
