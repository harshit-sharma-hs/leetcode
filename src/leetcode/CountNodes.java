package leetcode;
/*
 * 222. Count Complete Tree Nodes
 */

class CountNodes {
    static int count;

    public static int countNodes(TreeNode root) {
        if (root == null)
            return count;

        count++;
        countNodes(root.left);
        countNodes(root.right);

        return count;

    }
    public static void main(String args[]) {
		TreeNode root = new TreeNode(1);
	//	root.left = new TreeNode(3);
//		root.right = new TreeNode(2);
//		
//		root.left.left = new TreeNode(3);
//		root.left.right = new TreeNode(1);
		
		root.right.left = new TreeNode(3);
		System.out.println(countNodes(root));

	}
    
}
