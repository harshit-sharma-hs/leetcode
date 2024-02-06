
/*
 * Count the nodes at distance K from leaf
 */
package leetcode;

class DistancefromLeafNode {

	static int kDistantFromLeafUtil(TreeNode node, int path[], boolean visited[], int pathLen, int k) {

		if (node == null)
			return 0;

		path[pathLen] = node.val;
		visited[pathLen] = false;
		pathLen++;

		if (node.left == null && node.right == null && pathLen - k - 1 >= 0 && visited[pathLen - k - 1] == false) {

			visited[pathLen - k - 1] = true;
			return 1;
		}

		int l = kDistantFromLeafUtil(node.left, path, visited, pathLen, k);
		int r = kDistantFromLeafUtil(node.right, path, visited, pathLen, k);
		return l + r;

	}

	static int printKDistantfromLeaf(TreeNode node, int k) {
		int path[] = new int[1000];
		boolean visited[] = new boolean[1000];
		int result = kDistantFromLeafUtil(node, path, visited, 0, k);
		return result;
	}

	public static void main(String args[]) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
//		
//		root.left.left = new TreeNode(3);
		root.left.right = new TreeNode(5);

		root.right.left = new TreeNode(6);
		System.out.println(printKDistantfromLeaf(root, 2));

	}
}
