package top_corder;

public class backpack {
	final int backpack_weight = 10;
	int []weight = {3,4,1,2,3};
	int []worth = {2,3,2,3,6};
	int sum_worth;
	int max_worth = 0;
	
	public void most_method(int weight_sum, int worth_sum,int item_num) {
		
		if(weight_sum>backpack_weight) return;
		max_worth = Math.max(max_worth, worth_sum);
		while(weight.length>item_num) {
			
			most_method(weight_sum+weight[item_num],worth_sum+worth[item_num],++item_num);
			most_method(weight_sum,worth_sum,++item_num);
	
		}
		
		
	}
}
