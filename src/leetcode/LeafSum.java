/*
 * Check for Children Sum Property in a Binary Tree
 */
package leetcode;

class LeafSum
{
    //Function to check whether all nodes of a tree have the value 
    //equal to the sum of their child nodes.
 boolean flag = true;

		public static  int isSumProperty(TreeNode root) {
			if (root == null)
				return 0;
			return check(root) == -1 ? 0 : 1;

		}

		public static  int check(TreeNode root) {
			if(root == null)
            return 0;
            
        if(root.left==null && root.right==null)
            return root.val;
            
        int left = check(root.left);
        int right = check(root.right);
        
        if(left==-1 || right==-1)
            return -1;
            
        if(left+right == root.val)
            return root.val;
        else
            return -1;
		}
		public static void main(String args[]) {
			TreeNode root = new TreeNode(1);
			 root.left = new TreeNode(2);
			 root.right = new TreeNode(3);
//			
//			root.left.left = new TreeNode(3);
			root.left.right = new TreeNode(5);

			root.right.left = new TreeNode(6);
			System.out.println(isSumProperty(root));

		}
}

