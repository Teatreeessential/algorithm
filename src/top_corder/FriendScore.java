package top_corder;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class FriendScore {
	int nV;
	int nE;
	boolean []visit;
	char [][]arr;
	int friend_count;
	int max_count;
	boolean flag;
	
	public int highestScore(String[] friends) {
		Queue<Integer> q = new LinkedList<>();
		HashMap<Integer, Boolean> hash = new HashMap<>();
		max_count = 0;
		nV = friends.length;
		arr = new char[nV+1][nV+1];
		
		for(int i=0;i<friends.length;i++) {
			for(int j=0;j<friends.length;j++) {
				arr[i+1][j+1]=friends[i].charAt(j);
			}
		}
		
		for(int i=1;i<nV+1;i++) {
			friend_count = 0;
			hash.put(i, true);
			q.offer(i);
			while(!q.isEmpty()) {
				int temp = q.poll();
				for(int j=1;j<nV+1;j++) {
					if(arr[temp][j]=='Y'&&!hash.containsKey(j)) {
						
							friend_count+=1;
							hash.put(j, true);
							q.offer(j);
						
					}
				}
					
			}
			max_count = Math.max(max_count, friend_count);
		}
		return max_count;
	}
}
