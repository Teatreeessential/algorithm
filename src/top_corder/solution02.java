package top_corder;

public class solution02 {
	 public int solution(int n, int[][] computers) {
	     int answer = 0;   
		 boolean visit[] = new boolean[n];
	     for(int i=0;i<computers.length;i++) {
	    	 if(!visit[i]) { 
	    		 //�ش� ������ �湮���� ��쿡�� �̹� �������� ���� �����ϴ� ��� ������ ���� Ž���� ���ؼ� ��� �߰���
	    		 dfs(computers,i,visit);
	    		 answer++; //���� �ش� ������ ����Ǿ��ִ� �����鰣�� ��Ʈ��ũ ������ ���� ������
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
