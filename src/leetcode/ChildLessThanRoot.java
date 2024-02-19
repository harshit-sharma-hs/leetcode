/*
 * Does array represent Heap
 */
package leetcode;

import java.util.Scanner;

class ChildLessThanRoot {

	public static boolean countSub(long arr[], long n) {
		for (int i = 1; i < n; i++) {
			if (arr[(i - 1) / 2] < arr[i])
				return false;
		}
		return true;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long arr[] = new long[(int) n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(countSub(arr,n));
	}
}
