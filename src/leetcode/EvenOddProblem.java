package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class EvenOddProblem {
	static HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
	static boolean flag = true;

	public static boolean isEvenOddTree(TreeNode root) {

		helper(root, 0);
		return flag ? true : false;

	}

	static void helper(TreeNode root, int depth) {
		if (root == null || flag == false)
			return;
		if (depth % 2 != 0) {
			if (root.val % 2 != 0) {
				flag = false;
				return;
			}
			ArrayList<Integer> list = map.getOrDefault(depth, new ArrayList<Integer>());
			if (!list.isEmpty() && root.val < list.get(list.size()-1)) {
				list.add(root.val);
				map.put(depth, list);
			} else if (list.isEmpty()) {
				list.add(root.val);
				map.put(depth, list);
			} else {
				flag = false;
				return;
			}

		} else if (depth % 2 == 0) {
			if (root.val % 2 == 0) {
				flag = false;
				return;
			}

			ArrayList<Integer> list = map.getOrDefault(depth, new ArrayList<Integer>());
			if (!list.isEmpty() && root.val > list.get(list.size()-1)) {
				list.add(root.val);
				map.put(depth, list);
			} else if (list.isEmpty()) {
				list.add(root.val);
				map.put(depth, list);
			} else {
				flag = false;
				return;
			}
		}
		helper(root.left, depth + 1);
		helper(root.right, depth + 1);
	}

	public static void main(String args[]) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(10);
		root.right = new TreeNode(4);
//		
		root.left.left = new TreeNode(3);
		root.left.right = new TreeNode(5);
		
		root.right.right = new TreeNode(9);
		root.right.left = new TreeNode(7);
		root.right.left.left = new TreeNode(6);
		root.right.right.right = new TreeNode(2);

		root.left.left.left = new TreeNode(12);
		root.left.left.right = new TreeNode(8);
		
		System.out.println(isEvenOddTree(root));

	}
}
