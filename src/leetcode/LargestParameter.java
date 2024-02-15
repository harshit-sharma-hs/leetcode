/*
 * 2971. Find Polygon With the Largest Perimeter
 */
package leetcode;

import java.util.Arrays;
import java.util.Scanner;

class LargestParameter {
    public static long largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length - 1;
        long longest = nums[n];
        long sum = nums[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            sum += nums[i];
            if (i == 0 && sum <= longest) {
                n--;
                longest = nums[n];
                sum = nums[n - 1];
                i = n - 1;
            }
        }
       if(sum>longest)
    		return sum+longest;
        return -1;
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
    	System.out.println(largestPerimeter(arr));
    		
    }
}