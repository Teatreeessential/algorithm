package samsung_cording.d3;

import java.util.Scanner;

public class samsung_1859 {
	
	private static final Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int T = sc.nextInt();
		for(int t=1;t<=T;t++) {
			long sum = 0;
			int i,n = sc.nextInt();
			int max = 0;
			int arr[] = new int[n];
			int maxs[] = new int[n];
			for(i=0;i<arr.length;i++) {
				arr[i] = sc.nextInt();
			}
			for(i=n-1;i>=0;i--) {
				if(arr[i] > max) max = arr[i];
				maxs[i] = max;
			}
			for(i=0;i<arr.length;i++) sum+=maxs[i] - arr[i] ;
			System.out.format( "#%d %d\n", t, sum ); 
		}
		
		

	}

}
