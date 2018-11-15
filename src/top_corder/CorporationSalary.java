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
		
		if(dp[i]==0) { //�ش� ������ ������ ���� �������� ���� ��� 
			for (int j = 0; j < relations[i].length(); j++) { //���������� �ִ��� Ž��
				if (relations[i].charAt(j) == 'Y') { //���� ���������� �ִٸ�
						dp[i] += dfs(j, relations); //�ش� ���������� ���ؼ� �ٽ� Ž��
				}
	
			}
			if(dp[i]==0) dp[i] = 1;
		}
		return dp[i];
	}
}
