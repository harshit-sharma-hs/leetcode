/*
 * QUESTION - 1239. Maximum Length of a Concatenated String with Unique Characters
 */


package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Maxconcatstring {
	
	 static int max;
	 public static  int maxLength(List<String> arr) {
        backtrack(arr,"",0);
		return max;
	 }

    public static void backtrack(List<String> arr,String current,int start)
    {
        if(max<current.length())
           max=current.length();

       for(int i=start;i<arr.size();i++)
       {
           if(!isValid(current,arr.get(i)))
               continue;
           
           backtrack(arr,current+arr.get(i),i+1);
       }
        }
       public static boolean isValid(String current, String newString)
       {
           int[] count = new int[26];
           for(char c:newString.toCharArray())
           {
               if(++count[c - 'a']==2)
                   return false;
               if(current.contains(c+""))
                   return false;
               
           
           }
           return true;
       }
       
       public static void main(String args[])
       {
       	Scanner sc =new Scanner(System.in); 
       	int n=sc.nextInt();
       	List<String> list = new ArrayList<>();
       	for(int i=0;i<n;i++)
       	{
       		list.add(sc.next());
       	}
       	System.out.println(maxLength(list));
       		
       }
}

