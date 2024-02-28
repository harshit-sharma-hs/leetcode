/*
 * 513. Find Bottom Left Tree Value
 */
package leetcode;

class BottomLeftValue {
	public static int findBottomLeftValue(TreeNode root) {
		int result[] = new int[] { 0, 0 };
		helper(root, 1, result);
		return result[1];
	}

	public static void helper(TreeNode root, int currDepth, int[] result) {
		if (root == null)
			return;

		if (currDepth > result[0]) {
			result[0] = currDepth;
			result[1] = root.val;
		}
		helper(root.left, currDepth + 1, result);
		helper(root.right, currDepth + 1, result);
	}

	public static void main(String args[]) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);

		root.left.left = new TreeNode(3);
		root.left.right = new TreeNode(5);

		root.right.left = new TreeNode(6);
		System.out.println(findBottomLeftValue(root));

	}
}