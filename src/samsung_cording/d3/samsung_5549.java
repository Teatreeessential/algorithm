package samsung_cording.d3;

import java.util.Scanner;

public class samsung_5549 {

	private static final Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int T = sc.nextInt();
		int i;
		String num;
		for(i=1;i<=T;i++) {
			num = sc.next();
			if(Integer.parseInt(num.substring(num.length()-1))%2==0) {
				System.out.println("#"+i+" Even");
			}else {
				System.out.println("#"+i+" Odd");
			}
		}

	}

}
