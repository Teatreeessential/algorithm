package top_corder;

import java.util.LinkedList;
import java.util.Queue;

public class move {

	int count = 0;
	int arr[][] = new int[5][6];
	int[] move_x = { 0, 1 };
	int[] move_y = { -1, 0 };
	int width = arr[0].length;
	int height = arr.length;

	public void move_on() {
		for (int i = 0; i < arr.length; i++)
			for (int j = 0; j < arr[0].length; j++)
				arr[i][j] = -1;
		arr[0][5] = 0;

		dfs(arr, 4, 0);

		System.out.println(count);

	}

	public void dfs(int[][] arr, int start_row, int start_col) {

		if(arr[start_row][start_col] == 0) {
			count++;
			return;
		}

		for (int i = 0; i < 2; i++) {
			int next_x = start_col + move_x[i]; // 열을 움직인다. 열이 움직이면 x축기준으로 움직임
			int next_y = start_row + move_y[i]; // 행을 움직인다. 행이 움직이면 y축기준으로 움직임
			if (0 <= next_x&& next_x< width && 0 <= next_y&& next_y< height) {
				dfs(arr, next_y, next_x);

			}

		}

	}
}
 