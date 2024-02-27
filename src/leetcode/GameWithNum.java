/*
 * Play With OR
 */
package leetcode;

import java.util.Scanner;

class GameWithNum {
	public static int[] game_with_number(int arr[], int n) {
		for (int i = 0; i < arr.length - 1; i++) {
			arr[i] = arr[i] | arr[i + 1];
		}

		return arr;

	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(game_with_number(arr,n));

	}
}
