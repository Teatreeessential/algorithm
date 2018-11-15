package top_corder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution03 {
	 public int solution(String begin, String target, String[] words) {
	     boolean []visit = new boolean[words.length];   
		 int answer = bfs(begin,target,visit,words);
		 return answer;
	        
	 }
	 public int bfs(String begin, String target,boolean visit[] ,String[] words) {
		 Arrays.sort(words);
		 int count = 0;
		 Queue<Node> q = new LinkedList<>();
		 q.add(new Node(begin,count));
		 
		 while(!q.isEmpty()) {
			 Node node = q.poll();
			 if(target.equals(node.getWord())) return node.getCount(); 
			 for(int i=0;i<words.length;i++) {
				 if(visit[i]==false&&comp_word(node.getWord(),words[i])) {
					 q.add(new Node(words[i],node.getCount()+1));
					 visit[i] = true;
				 }
			 }
			
		 }
		 return count;
		 
	 }
	 public boolean comp_word(String temp,String word) {
		 int count = 0;
		 for(int i=0;i<temp.length();i++) {
			 if(temp.charAt(i) == word.charAt(i)) {
				 count++;
			 }
		 }
		 if(count>1) {
			 return true;
		 }else {
			 return false;
		 }
	 }
	
}
class Node{
	private String word;
	private int count;
	 
	public Node(String word, int count) {
		super();
		this.word = word;
		this.count = count;
	}
	public String getWord() {
		return word;
	}
	public void setWord(String word) {
		this.word = word;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	 
}
