package samsung_cording.d3;

import java.util.Scanner;

public class saumsung_5515 {
	public static void main(String[] arr) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int i=1;i<=T;i++) {
//			StringBuilder sb = new StringBuilder();
//			sb.append(sc.nextLine());
			int month = Integer.parseInt(sc.next());
			int day = Integer.parseInt(sc.next());

			
			int arr1[] = {0,31,29,31,30,31,30,31,31,30,31,30,31};
			int sum=0;
			for(int j=1;j<month;j++) {
				sum += arr1[j];
			}
			System.out.println("#"+i+" "+(sum+day+3)%7);
			
			
		}
	}
}
