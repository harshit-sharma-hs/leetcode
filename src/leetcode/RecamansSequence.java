/*
 * Recamans sequence
 */
package leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

class RecamansSequence {
	static ArrayList<Integer> recamanSequence(int n) {
		ArrayList<Integer> ans = new ArrayList<Integer>();
		HashSet<Integer> set = new HashSet<>();
		ans.add(0, 0);
		set.add(0);
		for (int i = 1; i < n; i++) {
			if (ans.get(i - 1) - i > 0 && !set.contains(ans.get(i - 1) - i)) {
				ans.add(i, ans.get(i - 1) - i);
				set.add(ans.get(i - 1) - i);
			}

			else {
				ans.add(i, ans.get(i - 1) + i);
				set.add(ans.get(i - 1) + i);
			}

		}
		return ans;

	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(recamanSequence(n));

	}
}
