package top_corder;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Solution06 {
	public int solution(int[] priorities, int location) {
        int answer = 0;
        
        PriorityQueue<Paper> pq = new PriorityQueue<Paper>(new Comparator<Paper>() {
        	@Override
        	public int compare(Paper o1, Paper o2) {
        		if(o2.priority-o1.priority>0) {
        			return 1;
        		}else {
        			return -1;
        		}
        		
        	}
        });
        for(int i=0;i<priorities.length;i++) {
        	Paper paper = new Paper(i,priorities[i]);
        	pq.add(paper);
        }
        for(Paper p:pq) {
        	answer++;
        	if(p.location == location) {
        		break;
        	}
        }
        
        return answer;
    }
}
class Paper{
	
	int location;
	int priority;
	
	public Paper(int location, int priority) {
		super();
		this.location = location;
		this.priority = priority;
	}
	
	
}
