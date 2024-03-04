/*
 * 948. Bag of Tokens
 */
package leetcode;

import java.util.Arrays;
import java.util.Scanner;

class BagOfTokenScore {
    public static int bagOfTokensScore(int[] tokens, int power) {
       		Arrays.sort(tokens);
		int x = 0;
		int y = tokens.length - 1;
		int score = 0;
		int result = 0;
        if(tokens.length == 0)
            return 0;
		if (tokens[0] > power)
			return 0;
		while (y >= x) {
			if (tokens[x] <= power) {
				power -= tokens[x];
				x++;
				score++;
			} else {
				if (score > 0) {
					power += tokens[y];
					y--;
					score--;
				}

			}
			result=Math.max(score,result);
		}
		return result;
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
    	int power = sc.nextInt();
    	System.out.println(bagOfTokensScore(arr,power));
    		
    }
}
