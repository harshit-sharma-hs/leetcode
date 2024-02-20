/*
 * Word Break
 */
package leetcode;

import java.util.ArrayList;
import java.util.Scanner;

//User function Template for Java

class DPWordBreak
{
  public static int wordBreak(int n, String s, ArrayList<String> dictionary )
  {
//        int m=s.length();
//      boolean dp[]= new boolean[m+1];
//      dp[0]=true;
//      for(int i=0;i<=m;i++){
//          for(int j=0;j<i;j++){
//            if (dp[j] && dictionary.contains(s.substring(j, i))) {
//                  dp[i]=true;
//                  break;
//              }
//          }
//      }
//      return dp[m]?1:0;
	  int m = s.length();
	  boolean dp [] = new boolean[m+1];
	  dp[0]=true;
	  for(int i=0;i<=m;i++)
	  {
		  for(int j=0;j<i;j++)
		  {
			  if(dp[j] && dictionary.contains(s.substring(j, i)))
			  {
				  dp[i]=true;
				  break;
			  }
		  }
	  }
	  return dp[m]?1:0;
  }
  public static void main(String args[])
  {
  	Scanner sc =new Scanner(System.in); 
  	int n=sc.nextInt();
  	String str = sc.next();
  	ArrayList<String> list = new ArrayList<String>();
  	for(int i=0;i<n;i++)
  	{
  		list.add(sc.next());
  	}
  	System.out.println(wordBreak(n,str,list));
  		
  }
}
