package top_corder;

public class Solution01 {
	
	
	public int solution(int[] numbers, int target) {
        int answer = 0;
        answer = dfs(numbers,0,0,target);
        
        return answer;
    }
	public int dfs(int[] numbers,int num,int sum,int target) {
		if(num==numbers.length) {
			if(sum==target) {
				return 1;
			}else {
				return 0;
			}
		
		}
		int plus = sum+numbers[num];
		int minus = sum-numbers[num];
		return dfs(numbers,num+1,plus,target)+dfs(numbers,num+1,minus,target);
		
	
					
			
	}
			
			
}
		
		
			
	

