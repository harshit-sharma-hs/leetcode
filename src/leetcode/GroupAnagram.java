/*
 *  49. Group Anagrams
*/
package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class GroupAnagram {

	static List<List<String>> ans;

	public static List<List<String>> groupAnagrams(String[] strs) {
		ans = new ArrayList<>();
		HashMap<String, List<String>> map = new HashMap<>();

		for (String str : strs) {
			String value = val(str);
			if (map.containsKey(value)) {
				List<String> l = map.get(value);

				l.add(str);
				map.put(value, l);
			}

			else {
				map.put(value, new ArrayList<String>());
				List<String> l = map.get(value);
				l.add(str);
				map.put(value, l);
			}

		}
		for (List<String> l : map.values())
			ans.add(l);
		return ans;

	}

	public static String val(String str) {
		int sum = 0;
		char arr[] = str.toCharArray();
		Arrays.sort(arr);
		return new String(arr);
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String arr[] = new String[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.next();
		}
		System.out.println(groupAnagrams(arr));

	}

}
