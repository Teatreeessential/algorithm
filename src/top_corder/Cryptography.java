package top_corder;

public class Cryptography {
	public long encrypt(int[] numbers) {
		long ans = 0;
		long result = 0;
		
		for(int i=0;i<numbers.length;i++) {
			result = numbers[i]+1;
			for(int j=0;j<numbers.length;j++) {
				result *=numbers[j];
			}
			result = result/numbers[i];
			ans = Math.max(ans, result);
		}
		return ans;
	}
}
