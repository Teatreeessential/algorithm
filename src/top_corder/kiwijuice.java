package top_corder;

public class kiwijuice {
	public int[] thePouring(int[] capacities,int[] bottles,int[] fromId,int[] toId) {
		for(int i=0;i<fromId.length;i++) {
			int from = fromId[i];
			int to = toId[i];
			if(capacities[to]<bottles[from]+bottles[to]) {
				bottles[from] = bottles[from]+bottles[to]-capacities[to];
				bottles[to] = capacities[to];
			}else {
				bottles[to] = bottles[from]+bottles[to];
				bottles[from] = 0;
			}
		}
		return bottles;
	}
}
