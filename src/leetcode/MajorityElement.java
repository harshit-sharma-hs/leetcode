/*
 * 169. Majority Element
 */
package leetcode;

import java.util.HashMap;
import java.util.Scanner;

class MajorityElement {
	public static int majorityElement(int[] nums) {
		HashMap<Integer, Integer> map = new HashMap<>();
		int max = nums.length / 2;
		int n = 0;
		for (int i : nums) {
			if (map.containsKey(i)) {
				if (map.get(i) > max) {
					n = i;
					break;

				}
				map.put(i, map.get(i) + 1);
			} else
				map.put(i, 1);
			if (map.get(i) > max) {
				n = i;
				break;

			}
		}
		return n;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(majorityElement(arr));

	}
}
