package top_corder;

public class CorporationSalary {
	
	private long[]dp= {};
	
	public long totalSalary(String[] relations) {
		dp = new long[relations.length];
		long sum = 0;
		for (int i = 0; i < relations.length; i++) {
			dfs(i, relations);
		}

		for (long j : dp) {
			sum += j;
		}
		return sum;
	}

	public long dfs(int i, String[] relations) {
		
		if(dp[i]==0) { //해당 직원의 월급이 아직 결정되지 않을 경우 
			for (int j = 0; j < relations[i].length(); j++) { //부하직원이 있는지 탐색
				if (relations[i].charAt(j) == 'Y') { //만약 부하직원이 있다면
						dp[i] += dfs(j, relations); //해당 부하직원을 통해서 다시 탐색
				}
	
			}
			if(dp[i]==0) dp[i] = 1;
		}
		return dp[i];
	}
}
