/*
 * Number of paths in a matrix with k coins
 */
package leetcode;

import java.util.Scanner;

class KnumPaths {
	static int ans = 0;

	static long numberOfPath(int n, int k, int[][] arr) {
		helper(0, 0, n, k, arr, 0);
		return ans;

	}

	public static void helper(int row, int col, int n, int k, int arr[][], int sum) {
		if (row < 0 || col < 0 || row >= n || col >= n)
			return;
		sum += arr[row][col];
		if (sum > k)
			return;
		if (sum == k && row == n - 1 && col == n - 1) {
			ans++;
			return;
		}

		helper(row + 1, col, n, k, arr, sum);
		helper(row, col + 1, n, k, arr, sum);
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		int k = sc.nextInt();
		int[][] arr = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		System.out.println(numberOfPath(n, k, arr));

	}
}
