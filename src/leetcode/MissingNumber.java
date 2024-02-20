/*
 * 268. Missing Number
 */
package leetcode;

import java.util.Scanner;

class MissingNumber {
    public static int missingNumber(int[] nums) {
         int sum1=0,sum2=0;
        
        for(int i =0;i<nums.length;i++)
        {
        	sum1+=i;
        	sum2+=nums[i];
        }
        sum1+=nums.length;
       return sum1-sum2;
    }
    public static void main(String args[])
    {
    	Scanner sc =new Scanner(System.in); 
    	int n=sc.nextInt();
    	int arr[] = new int[n];
    	for(int i=0;i<n;i++)
    	{
    		arr[i]=sc.nextInt();
    	}
    	System.out.println(missingNumber(arr));
    		
    }
}
