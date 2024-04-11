/*
 * 402. Remove K Digits
 */
package leetcode;

import java.util.Scanner;
import java.util.Stack;

class RemoveKDigits {
	public static String removeKdigits(String num, int k) {
		int min = Integer.MAX_VALUE;
		Stack<Character> stack = new Stack<>();

		for (char c : num.toCharArray()) {
			while (!stack.isEmpty() && k > 0 && stack.peek() > c) {
				stack.pop();
				k--;
			}
			stack.push(c);
		}
		while (k > 0 && !stack.isEmpty()) {
			stack.pop();
			k--;
		}
		StringBuilder sb = new StringBuilder();
		while (!stack.isEmpty())
			sb.append(stack.pop());

		sb = sb.reverse();
		while (sb.length() > 0 && sb.charAt(0) == '0') {
			sb.deleteCharAt(0);
		}

		return sb.length() > 0 ? sb.toString() : "0";

	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int n = sc.nextInt();
		System.out.println(removeKdigits(str, n));

	}
}