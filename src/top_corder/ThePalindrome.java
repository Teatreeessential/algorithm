package top_corder;

public class ThePalindrome {
	public int find(String s) {
		int len = s.length();
		int right = s.length()-1;
		int left = 0;
		
		while(left<right) {
			if(s.charAt(left)!=s.charAt(right)) {
				left++;
				len++;
			}else {
				left++;
				right--;
			}
		}
		return len;
		
	}
}
