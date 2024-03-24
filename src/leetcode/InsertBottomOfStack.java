package leetcode;

import java.util.Stack;

class InsertBottomOfStack {
    public Stack<Integer> insertAtBottom(Stack<Integer> st, int x) {
        Stack<Integer> stack = new Stack<>();
        
        while(!st.isEmpty())
        	stack.push(st.pop());
        st.push(x);
        while(!stack.isEmpty())
        	st.push(stack.pop());
        
		return st;
    }
}
