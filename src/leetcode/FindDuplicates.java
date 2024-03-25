package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class FindDuplicates {
    public static List<Integer> findDuplicates(int[] nums) {
    	List<Integer> l = new ArrayList<>();
    	boolean arr[]=new boolean[nums.length+1];
    	for(int i:nums)
    	{
    		if(arr[i]==true)
    			l.add(i);
    		else
    			arr[i]=true;
    	}
		return l;
        
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
    	System.out.println(findDuplicates(arr));
    		
    }
}