package leetcode;
/*
 * 739. Daily Temperatures
 */
import java.util.Scanner;
import java.util.Stack;

class DailyTemp {
    static int wait[];
    static Stack<Integer> stack;

   public static int[] dailyTemperatures(int[] temperatures) {
       wait = new int[temperatures.length];
       stack = new Stack<>();
       for (int i = 0; i < temperatures.length; i++) {
           while (!stack.isEmpty() && temperatures[stack.peek()] < temperatures[i])
               wait[stack.peek()] = i - stack.pop();
           stack.push(i);
       }

       return wait;

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
   	System.out.println(dailyTemperatures(arr));
   		
   }
}
