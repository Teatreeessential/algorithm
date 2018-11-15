package top_corder;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Solution07 {
	 public int[] solution(int[] progresses, int[] speeds) {
	     
	     List<Integer> day = new LinkedList<>();
		 List<Integer> list = new LinkedList<>();
		 Stack<Integer> stack = new Stack<>();
		 for(int i =0;i<progresses.length;i++) {
			 int n = 1;
			 while(true) {
				 if(progresses[i]+speeds[i]*n>=100) {
					 day.add(n);
					 break;
				 };
				 n++;
			 }
		 }
	
		 for(int j=0;j<day.size();j++) 
		 {
			 if(stack.isEmpty()) {
				 stack.push(day.get(j));
			 }else {
				 if(stack.peek()>=day.get(j)) {
					 stack.push(day.get(j));
				 }else {
					 list.add(stack.size());
					 stack.clear();
					 stack.push(day.get(j));
				 }
			 }
			 
		 }
		list.add(stack.size());
			 
		
		int[] answer = new int[list.size()];
		
		for(int k=0;k<list.size();k++) {
			answer[k] = list.get(k);
		}
		 
		return answer;
		 
	        
	 }
}
