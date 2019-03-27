package practice;

public class Algorithm_practice4 {
	public int minPathSum(int[][] grid) {
		int[][] result_array = new int[grid.length][grid[0].length];
		result_array[0][0] = grid[0][0];
		
		for (int i = 0; i < result_array.length; i++) {
			for (int j = 0; j < result_array[0].length; j++) {
				if(i==0 && j==0)continue;
				int up = (i>0) ? result_array[i-1][j] : Integer.MAX_VALUE;
				int left = (j>0) ? result_array[i][j-1] : Integer.MAX_VALUE;
				result_array[i][j] = Math.min(up,left) + grid[i][j];
			}
		}

		return result_array[grid.length-1][grid[0].length-1];
	}

}
