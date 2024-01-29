package leetcode;


import java.util.ArrayList;
import java.util.List;

/*
 *   144. Binary Tree Preorder Traversal
 */
class PreorderTraverse {
	static List<Integer> ans = new ArrayList<>();

	public static List<Integer> preorderTraversal(TreeNode root) {
		if (root == null)
			return ans;

		ans.add(root.val);
		preorderTraversal(root.left);
		preorderTraversal(root.right);

		return ans;
	}
	public static void main(String args[]) {
		TreeNode root = new TreeNode(1);
	//	root.left = new TreeNode(3);
//		root.right = new TreeNode(2);
//		
//		root.left.left = new TreeNode(3);
//		root.left.right = new TreeNode(1);
		
		root.right.left = new TreeNode(3);
		System.out.println(preorderTraversal(root));

	}
}
