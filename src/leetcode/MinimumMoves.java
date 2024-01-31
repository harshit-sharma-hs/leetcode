package leetcode;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumMoves {

	public static long minMoves(int arr[], int k) {
		int ans=0;
		int n=arr.length;
		Arrays.sort(arr);
		for(int i = 0;i<n;i++)
		{
			if(i<n/2)
				ans+=Math.max(0,arr[i]-k);
			else if(i==n/2)
				ans+=Math.abs(k-arr[i]);
			else
				ans+=Math.max(0,k-arr[i]);
		}
		return ans;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int k = sc.nextInt();
		System.out.println(minMoves(arr, k));

	}
}
