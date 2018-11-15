package top_corder;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution09 {

	public int solution(int n, int maxhp, int[] times, int[] effects) {
    //times 물약을 먹는 시간
	//effects 물약의 효과
	//n 물약의 갯수
	//물약을 먹은 뒤 
		int effect = 0;
		int answer = 0;
		int time = 0;
		int current_hp = 0;
		Map<Integer,Integer> map =new HashMap<Integer, Integer>();
		for(int i=0;i<times.length;i++) {
			map.put(times[i], effects[i]);
		}
		
		while(n!=0) {
			
			current_hp += effect;
			
			if(current_hp<0) current_hp = 0;
			if(maxhp<current_hp) current_hp = maxhp;
			
			if(current_hp==0||current_hp==maxhp) {
				answer++;
			}
			if(map.get(time)!=null) {
				effect += map.get(time);
				n--;
			}
			
			time++;
			
		}
        return answer;
    }
	public boolean binarySearch(int[] arr, int targetValue) {  
        int a = Arrays.binarySearch(arr, targetValue);
        return a >= 0;
    }
	

}
