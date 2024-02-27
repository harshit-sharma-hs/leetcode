/*
 * 543. Diameter of Binary Tree
 */
package leetcode;

class DiameterOfBinaryTree {
    static int diameter = 0;
    public static int diameterOfBinaryTree(TreeNode root) {
        helper(root);
        return diameter;
    }
    public static int helper(TreeNode root)
    {
        if(root==null)
            return 0;
        
        int left = helper(root.left);
        int right = helper(root.right);
        diameter= Math.max(diameter,left+right);
        return Math.max(left,right)+1;
    }
    public static void main(String args[]) {
		TreeNode root = new TreeNode(1);
		 root.left = new TreeNode(2);
		 root.right = new TreeNode(3);
//		
		root.left.left = new TreeNode(3);
		root.left.right = new TreeNode(5);

		//root.right.left = new TreeNode(6);
		System.out.println(diameterOfBinaryTree(root));

	}
}