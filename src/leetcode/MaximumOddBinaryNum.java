/*
 * 2864. Maximum Odd Binary Number

 */
package leetcode;

import java.util.Arrays;
import java.util.Scanner;

class MaximumOddBinaryNum {
//	public static String maximumOddBinaryNumber(String s) {
//		char c[] = new char[s.length()];
//		Arrays.fill(c, '0');
//		int index = 0;
//		for (char ch : s.toCharArray()) {
//			if (ch == '1' && c[s.length() - 1] != '1') {
//				c[s.length() - 1] = '1';
//			} else if (ch == '1')
//				c[index++] = '1';
//		}
//		s="";
//		for(char ch : c)
//			s+=ch;
//
//		return s;
//
//	}
	 public static String maximumOddBinaryNumber(String s) {
	        int count1 = 0;
	        int count0 = 0;
	        for (char ch : s.toCharArray()) {
	            if (ch == '1') {
	                count1++;
	            }
	            else {
	                count0++;
	            }
	        }
	        StringBuilder result = new StringBuilder();
	        for (int i = 0; i < count1 - 1; i++) {
	            result.append('1');
	        }
	        for (int i = 0; i < count0; i++) {
	            result.append('0');
	        }
	        result.append('1');
	        
	        return result.toString();
	    }
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(maximumOddBinaryNumber(str));

	}
}