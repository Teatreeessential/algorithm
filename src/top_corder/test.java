package top_corder;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.PriorityQueue;

public class test {

	public static void main(String[] args) {
		 String[][] tickets = {
				 {"ICN","SFO"},
				 {"ICN","ATL"},
				 {"SFO","ATL"},
				 {"ATL","ICN"},
				 {"ATL","SFO"}
		 };
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
	        
	        for(int i=0;i<tickets.length;i++) {
	        	System.out.print(tickets[i][0]);
	        	System.out.println(tickets[i][1]);
	        }
	        
		
	}
	

	

}
