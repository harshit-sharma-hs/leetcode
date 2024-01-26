
/*
 * Question - 576. Out of Boundary Paths
 */

package leetcode;

import java.util.Scanner;

class BoudaryPaths {
//	static int result;
//	public static int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {
//		int arr[][]=new int[m][n];
//		arr[startRow][startColumn]=1;
//		int move = 0;
//		boolean visited[][]=new boolean[m][n];
//		traverse(arr,startRow,startColumn,maxMove,move,visited);
//		return result;
//
//	}
//	public static void traverse(int arr[][],int n,int m,int maxMove,int move,boolean visited[][])
//	{
//		if(n<0 || m<0 || n>=arr.length || m>=arr.length )
//		{
//			if(move<=maxMove)
//				result++;
//			return;
//		}
//		if(visited[n][m])
//			return;
//		
//		//visited[n][m]=true;
//		move++;
//		
//		traverse(arr,n+1,m,maxMove,move,visited);
//		traverse(arr,n,m+1,maxMove,move,visited);
//		traverse(arr,n-1,m,maxMove,move,visited);
//		traverse(arr,n,m-1,maxMove,move,visited);
//		
//	}
	 static Integer dp[][][];
	    static int M = (int)1e9+7;
	    public static int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {
	        dp = new Integer[m][n][maxMove+1];
	        return solve(m,n,maxMove,startRow,startColumn);
	    }
	    public static int solve(int m,int n,int moves,int row,int col) {
	        if(row >= m || col >= n || row<0 || col<0) {
	            return 1;
	        }
	        if(moves<=0){
	            return 0;
	        }
	        if(dp[row][col][moves]!=null){
	            return dp[row][col][moves];
	        }
	        int ans = 0;
	        ans = (ans + solve(m,n,moves-1,row-1,col))%M;
	        ans = (ans + solve(m,n,moves-1,row+1,col))%M;
	        ans = (ans + solve(m,n,moves-1,row,col-1))%M;
	        ans = (ans + solve(m,n,moves-1,row,col+1))%M;
	        return dp[row][col][moves] = ans;
	    }


	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int maxmove = sc.nextInt();
		int startrow = sc.nextInt();
		int startcol = sc.nextInt();
		
		System.out.println(findPaths(m,n,maxmove,startrow,startcol));

	}
}