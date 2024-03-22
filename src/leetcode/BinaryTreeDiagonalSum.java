/*
 * Diagonal sum in binary tree.
 */

package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

class BinaryTreeDiagonalSum {
	public static ArrayList<Integer> diagonalSum(TreeNode root) {
		if (root == null)
			return null;
		ArrayList<Integer> list = new ArrayList<Integer>();
		TreeMap<Integer, Integer> map = new TreeMap<>();

		diagonalSumUtil(root, 0, map);

		for (int i : map.values())
			list.add(i);
		return list;

	}

	private static void diagonalSumUtil(TreeNode root, int height, Map<Integer, Integer> map) {
		if (root == null)
			return;

		int sum=0;
        if( map.get(height) == null)
            map.put(height,root.val);
        else {
        	sum = map.get(height);
    		sum += root.val;
    		map.put(height, sum);
        }
        

		

		diagonalSumUtil(root.left, height, map);
		diagonalSumUtil(root.right, height, map);
	}

	public static void main(String args[]) {
		TreeNode root = new TreeNode(4);
		root.left = new TreeNode(1);
		root.right = new TreeNode(3);

//		root.left.left = new TreeNode(3);
//		root.left.right = new TreeNode(1);

		root.right.left = new TreeNode(3);
		System.out.println(diagonalSum(root));

	}
}
