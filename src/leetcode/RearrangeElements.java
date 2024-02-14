/*
 * 2149. Rearrange Array Elements by Sign
 */
package leetcode;

import java.util.Scanner;

class RearrangeElements {
   /* public static int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int pos[] = new int[n / 2];
        int neg[] = new int[n / 2];
        int x = 0, y = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] >= 0)
                pos[x++] = nums[i];
            else
                neg[y++] = nums[i];
        }
        x = 0;
        y = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0)
                nums[i] = pos[x++];
            else
                nums[i] = neg[y++];
        }
        return nums;

    }*/
    
        public static int[] rearrangeArray(int[] nums) {
           int n=nums.length;
            int []ans=new int[n];
           int posIndex=0,negIndex=1;
           for(int i=0;i<n;i++){
               if(nums[i]>0){
                   ans[posIndex]=nums[i];
                   posIndex+=2;
               }
               else{
                   ans[negIndex]=nums[i];
                   negIndex+=2;
               }
           }
           return ans;

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
    	System.out.println(rearrangeArray(arr));
    		
    }
}