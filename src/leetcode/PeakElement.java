/*
 * Peak element
 */
package leetcode;

import java.util.Scanner;

class PeakElement {
	public static int peakElement(int[] arr, int n) {
		int maxidx=-1;
		 if(n==1)
		   return arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(i==0)
			{
				if(arr[i]>=arr[i+1])
				{
					maxidx=i;
					return maxidx;
				}
			}
			else if(i==arr.length-1)
			{
				if(arr[i]>=arr[i-1])
				{
					maxidx=i;
					return maxidx;
				}
			}
			else
			{
				if(arr[i]>=arr[i+1] && arr[i]>=arr[i-1])
				{
					maxidx=i;
					return maxidx;
				}
			}
		}
		return maxidx;

	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(peakElement(arr,n));

	}
}