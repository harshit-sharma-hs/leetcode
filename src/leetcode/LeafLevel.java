/*
 * Check if all leaves are at same level
 */
package leetcode;

import java.util.HashSet;

public class LeafLevel {
	static HashSet<Integer> set = new HashSet<>();

	static boolean check(TreeNode root) {
		helper(root, 0);
		return set.size() == 1 ? true : false;

	}

	static void helper(TreeNode root, int leafheight) {
		if (set.size() > 1)
			return;
		if (root == null)
			return;
		if (root.left == null && root.right == null) {
			set.add(leafheight);
			return;
		}
		leafheight++;
		helper(root.left, leafheight);
		helper(root.right, leafheight);
	}
	public static void main(String args[]) {
		TreeNode root = new TreeNode(11);
		root.left = new TreeNode(22);
		root.right = new TreeNode(33);

		root.left.left = new TreeNode(44);
		root.left.right = new TreeNode(55);

		root.right.left = new TreeNode(66);
		root.right.right = new TreeNode(77);
		System.out.println(check(root));

	}

}
