package leetcode;
/*
 * Panagram Checking
 */

import java.util.HashSet;
import java.util.Scanner;

class Panagram {
	// Function to check if a string is Pangram or not.
	public static boolean checkPangram(String s) {
		// your code here
		HashSet<Character> set = new HashSet<>();
		for (char c : s.toCharArray()) {
			c = Character.toLowerCase(c);
			if (c - 'a' < 0 || c - 'a' > 25)
				continue;
			else
				set.add(c);
		}
		if (set.size() == 26)
			return true;

		return false;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(checkPangram(str));

	}

}
