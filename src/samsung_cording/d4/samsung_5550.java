package samsung_cording.d4;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Set;

public class samsung_5550 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		String frog_sound ="croak";
		char []arr = {'c','r','o','a','k'};
		char flag = 'c';
		int T = sc.nextInt();
		int result = 0;
		for(int i =1;i<=T;i++) {
			sc.nextLine();
			String sound = sc.nextLine();
			if(sound.substring(0, 5)==frog_sound) {
				for(int j=5;j<sound.length();j+=5) {
					if(sound.substring(j,j+j)!=frog_sound) {
						result = -1;
						break;
					}
				}
				result = 1;
				break;
			}else{
				for(int j=0;j<sound.length();j++) {
					if(flag=='k') {
						break;
					}else {
						if(flag==sound.substring(j,j+1)) {
							sb.append(sound.substring(j,j+1));
							continue;
						}else {
							flag=sound.substring(j,j+1);
							if(flag==arr[0]) {
								continue;
							}else {
								result = -1;
								break;
							}
						}
					}
					
				}
			}
		}

	}

}
