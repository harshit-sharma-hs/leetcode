package leetcode;
/*
 * 2966. Divide Array Into Arrays With Max Difference
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class ArraytoArrays {

	public static int[][] divideArray(int[] nums, int k) {
		List<int[]> list = new ArrayList<>();
		Arrays.sort(nums);
		for (int i = 1; i < nums.length; i = i + 3) {
			if (nums[i] - nums[i - 1] <= k && nums[i + 1] - nums[i] <= k && nums[i + 1] - nums[i - 1] <= k) {
				list.add(new int[] { nums[i - 1], nums[i], nums[i + 1] });
			}

		}
		int a[][] = new int[list.size()][];
		if (list.size() == nums.length / 3) {
			for (int i = 0; i < list.size(); i++) {

				a[i] = list.get(i);
			}

		} else
			return new int[0][];

		return a;

	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(divideArray(arr, k));

	}

}
