
/*
 * QUESTION - 1457. Pseudo-Palindromic Paths in a Binary Tree
 */

package leetcode;

import java.util.Scanner;

public class PseudoPalindrome {
	
	static int sum = 0;

	public static  int pseudoPalindromicPaths(TreeNode root) {
		int nums[] = new int[10];
		Paths(root, nums);
		return sum;

	}

	public static  void Paths(TreeNode root, int[] path) {

		if (root == null)
			return;
		path[root.val]++;
		if (root.left == null && root.right == null) {

			if (ispalindrome(path))
				sum++;
			path[root.val]--;
			return;
		}

		Paths(root.left, path);
		Paths(root.right, path);
		path[root.val]--;
		return;

	}

	public static  boolean ispalindrome(int[] nums) {

		int odd = 0;
		for (int i = 1; i < 10; i++) {
			if (nums[i] % 2 != 0)
				odd++;
			if (odd > 1)
				return false;
		}
		return true;
	}

	public static void main(String args[]) {
		TreeNode root = new TreeNode(2);
		root.left = new TreeNode(3);
		root.right = new TreeNode(1);
		
		root.left.left = new TreeNode(3);
		root.left.right = new TreeNode(1);
		
		root.right.right = new TreeNode(1);
		System.out.println(pseudoPalindromicPaths(root));

	}
}
