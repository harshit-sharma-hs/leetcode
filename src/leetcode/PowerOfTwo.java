/*
 * 231. Power of Two
 */
package leetcode;

import java.util.Scanner;

class PowerOfTwo {
    public static boolean isPowerOfTwo(int n) {
       return n>0 && (n&n-1)==0;
    }
    public static void main(String args[])
    {
    	Scanner sc =new Scanner(System.in); 
    	int n=sc.nextInt();
    	System.out.println(isPowerOfTwo(n));
    		
    }
}
    /*
     * class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n==0)
            return false;
        while(n%2==0)
        {
            n=n/2;       
            }
            if(n==1)return true;else return false;
    }
}
     */
