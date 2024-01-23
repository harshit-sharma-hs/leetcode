/*
 *QUESTION - 198. House Robber 
 */


package leetcode;

import java.util.Scanner;

class HouseRobber {
    public static int rob(int[] nums) {
       int n = nums.length;
        return solveTAB(nums, n);
    }
    public static int solveTAB(int[] nums, int n) {
        int[] dp = new int[n + 2];

        for (int i = n - 1; i >= 0; i--) {
            dp[i] = Math.max(nums[i] + dp[i + 2], dp[i + 1]);
        }

        return dp[0];
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
    	System.out.println(rob(arr));
    		
    }
}
