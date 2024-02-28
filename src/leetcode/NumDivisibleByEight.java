/*
 * DivisibleByEight
 */
package leetcode;

import java.util.Scanner;

class NumDivisibleByEight{
    static int DivisibleByEight(String s){
        //code here
        int num = Integer.parseInt(s.substring(Math.max(s.length()-3,0)));
        return num%8==0?1:-1;
    }


	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.println(DivisibleByEight(sc.next()));

	}
}
