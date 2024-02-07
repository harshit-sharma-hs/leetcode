/*
 * Min distance between two given nodes of a Binary Tree
 */
package leetcode;

class GfG {
	static TreeNode cans(TreeNode root, int a, int b) {
		if (root == null || root.val == a || root.val == b)
			return root;
		TreeNode ln = cans(root.left, a, b);
		TreeNode rn = cans(root.right, a, b);
		if (rn == null)
			return ln;
		if (ln == null)
			return rn;
		return root;
	}

	static int dist(TreeNode root, int a) {
		if (root == null)
			return -1;
		else if (root.val == a)
			return 0;
		int ld = dist(root.left, a);
		int rd = dist(root.right, a);
		if (ld >= 0)
			return ld + 1;
		return (rd >= 0) ? rd + 1 : -1;

	}

	static int findDist(TreeNode root, int a, int b) {
		TreeNode nn = cans(root, a, b);
		int ld = dist(nn, a);
		int rd = dist(nn, b);
		return ld + rd;
	}

	public static void main(String args[]) {
		TreeNode root = new TreeNode(11);
		root.left = new TreeNode(22);
		root.right = new TreeNode(33);

		root.left.left = new TreeNode(44);
		root.left.right = new TreeNode(55);

		root.right.left = new TreeNode(66);
		root.right.right = new TreeNode(77);
		System.out.println(findDist(root, 22, 77));

	}

}
