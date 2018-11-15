package top_corder;

import java.util.Stack;

public class Solution05 {
	 public int solution(String arrangement) {
	        int answer = 0;
	        Stack<Integer> stack = new Stack<>();
	       for(int i=0;i<arrangement.length();i++) {
	    	   if(arrangement.charAt(i)=='(') {
	    		   stack.push(1);
	    	   }else {
	    		   if(arrangement.charAt(i-1)=='(') {
	    			   stack.pop();
	    			   answer+=stack.size();
	    		   }else {
	    			   stack.pop();
	    			   answer+=1;
	    		   }
	    	   }
	    	   
	       }
	        return answer;
	    }
}
