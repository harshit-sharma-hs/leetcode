/*
 * 150. Evaluate Reverse Polish Notation
 */

package leetcode;


import java.util.Scanner;
import java.util.Stack;

class ERPN {
	public static int evalRPN(String[] tokens) {
		Stack<Integer> stack = new Stack<>();
		int ans = 0;
		for (String str : tokens) {
			if (str.equals("+") || str.equals("-") || str.equals("*") || str.equals("/")) {
				if (!stack.isEmpty()) {
					int b = stack.pop();
					int a = stack.pop();
					ans = helper(a, b, str);
					stack.push(ans);
				}
			} else {
				stack.push(Integer.valueOf(str));
			}

		}
		return stack.pop();

	}

	public static int helper(int a, int b, String str) {
		if (str.equals("+"))
			return a + b;
		else if (str.equals("-"))
			return a - b;
		else if (str.equals("*"))
			return a * b;
		return a / b;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String arr[] = new String[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.next();
		}
		System.out.println(evalRPN(arr));

	}
}
