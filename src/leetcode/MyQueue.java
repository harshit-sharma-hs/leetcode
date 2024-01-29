package leetcode;

/*
 *  232. Implement Queue using Stacks
 */
import java.util.Stack;

class MyQueue {

	   Stack<Integer> stack = new Stack<>();
	    public MyQueue() {
	        
	    }
	    
	    public void push(int x) {
	        stack.push(x);
	    }
	    
	    public int pop() {
	    	
			return stack.remove(0);
	        
	    }
	    
	    public int peek() {
	    	
			return stack.get(0);
	        
	    }
	    
	    public boolean empty() {
	    	if(stack.isEmpty())
	    		return true;
			return false;
	        
	    }
	}

