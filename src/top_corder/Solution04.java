package top_corder;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Solution04 {
	 public String[] solution(String[][] tickets) {
	        String[] answer = {};
	        boolean [] visit = new boolean[tickets.length];
	        PriorityQueue<ticket> pq = new PriorityQueue<>(new Comparator<ticket>() {
	        	@Override
	        	public int compare(ticket o1, ticket o2) {
	        		return o1.end.compareTo(o2.end);
	        	}
			});
	        for(int i=0;i<tickets.length;i++) {
	        	ticket ticket = new ticket(tickets[i][0],tickets[i][1]);
	        	pq.add(ticket);
	        }
	        
	        for(int i=0;i<tickets.length;i++) {
	        	ticket ticket = pq.poll();
	        	tickets[i][0] = ticket.start;
	        	tickets[i][1] = ticket.end;
	        }
	        
	        
	        return answer;
	        
	 }
	 
	 public static void dfs(int i,String start,boolean[] visit,String[][] tickets) {
			
		    
			for(int j=0;j<tickets.length;j++) {
				for(int k=0;k<tickets[j].length;k++) {
					if(!start.equals(tickets[j][k])&&visit[i]==false) {
						visit[j] = true;
						dfs(j,tickets[j][k],visit,tickets);
					}
				}
			}
				
	 }

	 
}



class ticket{
	
	String start;
	String end;
	
	public ticket(String start, String end) {
		super();
		this.start = start;
		this.end = end;
	}
	
	
}