/*
 * 287. Find the Duplicate Number
 */
package leetcode;

import java.util.Scanner;

class FindDuplicate {
    public static int findDuplicate(int[] nums) {
    	int arr [] =new int[nums.length];
    	for(int i=0;i<nums.length;i++)
    	{
    		if(arr[nums[i]]==0)
    		{
    			arr[nums[i]]++;
    		}
    		else
    			return nums[i];
    	}
    	
    	
    	
		return 0;
        
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
    	System.out.println(findDuplicate(arr));
    		
    }
}