package samsung_cording.d3;

import java.util.Arrays;
import java.util.Scanner;

public class samsung_5431 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb;
		int T = sc.nextInt();
		for(int i=1;i<=T;i++) {
			sb = new StringBuilder();
			int numOfstudent[] = new int[sc.nextInt()+1];
			Arrays.fill(numOfstudent, 1);
			int submit_people = sc.nextInt();
			for(int j=0;j<submit_people;j++) {
				int submit_student = sc.nextInt();
				numOfstudent[submit_student] = 0;
			}
			sb.append("#"+i+" ");
			
			
			for(int f=1;f<numOfstudent.length;f++) {
				if(numOfstudent[f]!=0) sb.append(f+" ");
				
			}
			System.out.println(sb.toString());
		}
	}
}
