package top_corder;

public class main {

	public static void main(String[] args) {
		FriendScore fs = new FriendScore();
		String []friends = {"NYNNN",
						    "YNYNN",
						    "NYNYN",
						    "NNYNY",
						    "NNNYN"};
		
		System.out.println(fs.highestScore(friends));
	}
		
	

}
