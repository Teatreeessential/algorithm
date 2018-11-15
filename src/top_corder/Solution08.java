package top_corder;

import java.util.Arrays;

public class Solution08 {
	 public int solution(int n, int[] v) {
		 int min = 0;
		 int flag = -1;
		 	int answer = 0;
	        int []left = new int[n];
	        int []right = new int[n];
	        
	        for(int i = 0;i<n+1;i++) {
	        	for(int j = 0;j<i;j++) left[j] = v[j];
	        	for(int k = i;k<n;k++) right[k] = v[k];
	        	
	        	
	        	if(flag == -1) {
	        		min = Math.abs(sum(left) - sum(right));
	        	}else {
	        		if(min>Math.abs(sum(left) - sum(right))) {
	        			min = Math.abs(sum(left) - sum(right));
	        			answer = i;
	        		}
	        	}
	        	 
	        	Arrays.fill(left,0);
	        	Arrays.fill(right,0);
	        	
	        }
	        
	        
	       
	        
	        return answer;
	 }
	 
	 public int sum(int[] arr) {
		 int sum = 0;
		 for(int i: arr) {
			 sum +=i;
		 }
		 return sum;
	 }
	 
}
