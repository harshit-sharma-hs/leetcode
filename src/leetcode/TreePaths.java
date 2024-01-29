package leetcode;

import java.util.ArrayList;
import java.util.List;

/*
 * 257. Binary Tree Paths
 */
class TreePaths {
	static List<String> ans = new ArrayList<>();

	public static List<String> binaryTreePaths(TreeNode root) {
		path(root, "");
		return ans;
	}

	public static void path(TreeNode root, String route) {
		if (root == null)
			return;
		route = route + Integer.toString(root.val);
		if (root.left == null && root.right == null) {
			ans.add(route);
			return;
		}

		route += "->";
		path(root.left, route);
		path(root.right, route);

	}

	public static void main(String args[]) {
		TreeNode root = new TreeNode(1);
		 root.left = new TreeNode(2);
		 root.right = new TreeNode(3);
//		
//		root.left.left = new TreeNode(3);
		root.left.right = new TreeNode(5);

		root.right.left = new TreeNode(6);
		System.out.println(binaryTreePaths(root));

	}
}
