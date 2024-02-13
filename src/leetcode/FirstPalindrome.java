/*
 * 2108. Find First Palindromic String in the Array
 */
package leetcode;

import java.util.Scanner;

class FirstPalindrome {
    public static String firstPalindrome(String[] words) {
        StringBuilder sb =new StringBuilder();
		for(String str:words)
		{
			sb.append(str);
			String str2 = sb.reverse().toString();
			if(str.equals(str2))
			{
				return str2;
			}
			sb = new StringBuilder();
		}
		return"";

	}
    public static void main(String args[])
    {
    	Scanner sc =new Scanner(System.in); 
    	int n=sc.nextInt();
    	String arr[] = new String[n];
    	for(int i=0;i<n;i++)
    	{
    		arr[i]=sc.next();
    	}
    	System.out.println(firstPalindrome(arr));
    		
    }
}
