package top_corder;

public class Knapsack {
	int[] ws = { 3, 4,1,2,3};
	int[] ps = { 2, 3,2,3,6};
	int maxw = 10;
	int[][] dp = new int[6][11];

	public int knapsack(int n, int w) {
		
		if(w>maxw) return -ps[n-1];
		if(n>=ws.length) return 0; 
		if(dp[n][w]>0) return dp[n][w];
		return dp[n][w] = Math.max(knapsack(n+1, w), knapsack(n+1, w+ws[n])+ps[n]);
	}
}
