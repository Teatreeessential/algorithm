package samsung_cording.d4;

import java.util.Arrays;

public class winter_cording_1 {

	public static void main(String[] args) {
		winter_cording_1 t = new winter_cording_1();
		String[] skill_trees = {"BACDE", "CBADF", "AECB", "BDA"};
		System.out.println(t.solution("BA", skill_trees));

	}
	 public int solution(String skill, String[] skill_trees) {
	        int answer = 0;
	        boolean flag = true;
	        int arr[] = new int[skill.length()];
	        Arrays.fill(arr, 0);
	        char[] skill_set = new char[skill.length()];
	        for(int j=0;j<skill.length();j++) {
	        	skill_set[j] = skill.charAt(j);
	        }
	        	

	        for(String s:skill_trees){
	            for(int i=0;i<s.length();i++) {
	            	for(int j=0;j<skill_set.length;j++) {
	            		if(skill_set[j]==s.charAt(i)) {
	            			if(j==0) {
	            				arr[j]++;
	            			}else {
	            				arr[j-1]--;
		            			arr[j]++;
		            			if(arr[j-1]<0) {
		            				flag=false;
		            				break;
		            			}
		            		}
	            			
	            			
	            		}
	            	}
	            	if(!flag) break;
	            }
	            if(flag) answer++;
	            flag=true;
            	Arrays.fill(arr, 0);	           
           }
	        
	        return answer;
	    }
}
