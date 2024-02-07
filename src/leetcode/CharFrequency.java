/*
 * 451. Sort Characters By Frequency
 */
package leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;

//public class Solution {                                             //SOLUTION 1.
//	static HashMap<Character, String> map = new HashMap<>();
//	static HashMap<Integer, String> map2 = new HashMap<>();
//	static String ans = "";
//
//	public static String frequencySort(String s) {
//
//		for (char c : s.toCharArray()) {
//			if (map.containsKey(c)) {
//				String str = map.get(c);
//				str += c;
//				map.put(c, str);
//			} else
//				map.put(c, c + "");
//		}
//		int max = 0;
//		for (String str : map.values()) {
//			max = Math.max(max, str.length());
//			if (map2.containsKey(str.length())) {
//
//				String str2 = map2.get(str.length());
//				str2 += str;
//				map2.put(str.length(), str2);
//			} else {
//
//				map2.put(str.length(), str);
//			}
//
//		}
//
//		for (int i = max; i >= 1; i--) {
//			if (map2.containsKey(i)) {
//				ans += map2.get(i);
//
//			}
//		}
//		return ans;
//	}

class CharFrequency {
	public static String frequencySort(String s) { // SOLUTION 2. OPTIMIZED WITH PRIORITY QUEUE
		int len = s.length();
		Map<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < len; i++) {
			map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
		}
		PriorityQueue<Character> pq = new PriorityQueue<>((c1, c2) -> map.get(c2) - map.get(c1));
		for (char ch : map.keySet()) {
			pq.add(ch);
		}
		StringBuilder sb = new StringBuilder();
		while (!pq.isEmpty()) {
			char ch = pq.remove();
			int freq = map.get(ch);
			for (int i = 0; i < freq; i++) {
				sb.append(ch);
			}
		}
		return sb.toString();
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(frequencySort(str));

	}
}
