/*
 * 201. Bitwise AND of Numbers Range
 */
package leetcode;

import java.util.Scanner;

class RangeBitwiseAnd {
	public static int rangeBitwiseAnd(int left, int right) {
		int count = 0;
		while (left != right) {
			left = left >> 1;
			right = right >> 1;
			count++;
		}
		return left << count;

	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int left = sc.nextInt();
		int right = sc.nextInt();

		System.out.println(rangeBitwiseAnd(left,right));

	}
}
