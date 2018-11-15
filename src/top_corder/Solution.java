package top_corder;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	public int[] solution(int[] answers) {
		int supo_answers[][] ={
        	{1,2,3,4,5},
        	{2,1,2,3,2,4,2,5},
        	{3,3,1,1,2,2,4,4,5,5}
        };
        int []point = new int[3];
		
        for(int i=0;i<answers.length;i++) {
        	if(supo_answers[0][i%5]==answers[i]) point[0]+=1;
        	if(supo_answers[1][i%8]==answers[i]) point[1]+=1;
        	if(supo_answers[2][i%10]==answers[i]) point[2]+=1;
        }
		
		
        
        return max(point);
    }
	
	public int[] max(int[] point) {
		List<Integer> heightest_point = new ArrayList<>();
		int max = 0;
		for(int i=0;i<point.length;i++) {
			if(max<point[i]) {
				max = point[i];	 
			}
		}
		for(int j=0;j<point.length;j++) {
			if(max==point[j]) {
				heightest_point.add(j+1);
			}
		}
		int []answer = new int[heightest_point.size()];
		for(int k=0;k<answer.length;k++) {
			answer[k] = heightest_point.get(k);
		}
		
		return answer;
		
	}
		
}
