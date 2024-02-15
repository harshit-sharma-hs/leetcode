/*
 * Count all Possible Path
 */
package leetcode;

import java.util.Scanner;

public class PathIsPossible {

	public static int isPossible(int[][] paths) {
		for (int i = 0; i < paths.length; i++) {
			int degree = 0;
			for(int j=0;j<paths[0].length;j++)
			{
				degree+=paths[i][j];
			}
			if(degree%2!=0)
				return 0;
		}
		return 1;

	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();

		int[][] arr = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		System.out.println(isPossible(arr));

	}
}
