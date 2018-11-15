package top_corder;

public class solution02 {
	 public int solution(int n, int[][] computers) {
	     int answer = 0;   
		 boolean visit[] = new boolean[n];
	     for(int i=0;i<computers.length;i++) {
	    	 if(!visit[i]) { 
	    		 //해당 정점을 방문했을 경우에는 이미 정점으로 부터 존재하는 모든 정점을 깊이 탐색을 통해서 모두 발견함
	    		 dfs(computers,i,visit);
	    		 answer++; //따라서 해당 정점과 연결되어있는 정점들간의 네트워크 갯수를 증가 시켜줌
	    	 }
	     }
	        
	     return answer;
	 }
	 
	 public void dfs(int[][] computers,int num,boolean []visit) {
		 
		 	 		visit[num] = true;
			 		for(int i=0;i<computers.length;i++) {	
				 		 if(visit[i]==false&&computers[num][i]==1) {
							 dfs(computers,i,visit);
							 
						 }
					}
		 	
		 	 
	}
}
