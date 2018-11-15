package top_corder;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class MazeMaker {
	
	public int longestPath(String[] maze,int startRow, int startCol, int[] moveRow, int[] moveCol) {
		int width = maze[0].length();
		int height = maze.length;
		int [][] board = new int[height][width];
		for(int i=0;i<height;i++)
			for(int j=0;j<width;j++) 
				board[i][j] = -1;
		int max = 0;
		
		board[startRow][startCol] = 0;
		
		Queue<Integer> qx = new LinkedList<>();
		Queue<Integer> qy = new LinkedList<>();
		
		qx.offer(startRow);
		qy.offer(startCol);
		
		while(!qx.isEmpty()) {
			int x = qx.poll();
			int y = qy.poll();
			
			for(int i=0;i<moveRow.length;i++) {
				int next_x = x + moveRow[i];
				int next_y = y + moveCol[i];
				
				if(next_x>=0&&next_x<width&&
					next_y>=0&&next_y<height&&
					board[next_x][next_y] == -1&&
					maze[next_y].charAt(next_x)=='.') {
					
					board[next_x][next_y] = board[x][y]+1;
					qx.offer(next_x);
					qy.offer(next_y);
				}
			}
		}
		
		for(int i=0;i<width;i++) {
			for(int j=0;j<height;j++) {
				if(board[i][j]==-1&&maze[i].charAt(j)=='.') {
					return -1;
				}
				max = Math.max(max, board[i][j]);
			}
		}
		return max;
	}
	
}
