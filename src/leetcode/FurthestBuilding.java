/*
 * 1642. Furthest Building You Can Reach
 */
package leetcode;

import java.util.PriorityQueue;
import java.util.Scanner;

class FurthestBuilding {
    public static int furthestBuilding(int[] heights, int bricks, int ladders) {
      PriorityQueue<Integer> heap = new PriorityQueue<>();
        for (int i = 0; i < heights.length - 1; i++) {
            int diff = heights[i + 1] - heights[i];
            if (diff > 0) {
                heap.offer(diff);
                if (heap.size() > ladders) {
                    bricks -= heap.poll();
                }
                if (bricks < 0) {
                    return i;
                }
            }
        }
        return heights.length - 1;
    }
    public static void main(String args[])
    {
    	Scanner sc =new Scanner(System.in); 
    	int n=sc.nextInt();
    	int bricks = sc.nextInt();
    	int ladders = sc.nextInt();
    	int arr[] = new int[n];
    	for(int i=0;i<n;i++)
    	{
    		arr[i]=sc.nextInt();
    	}
    	System.out.println(furthestBuilding(arr,bricks,ladders));
    		
    }
}
