package practice;

public class Algorithm_practice2 {

	public int numIslands(char[][] grid) {
		int island_num = 0;
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				if (grid[i][j] != '1')
					continue;
				island_num++;
				sch_island(grid, i, j);
			}
		}
		return island_num;
	}

	public void sch_island(char[][] grid, int i, int j) {
		grid[i][j] = 'x';
		//위
		if(i-1 >= 0 && grid[i-1][j] == '1') {
			sch_island(grid,i-1,j);
		}
		//아래
		if(i+1 < grid.length && grid[i+1][j] == '1') {
			sch_island(grid,i+1,j);
		}
		//오른쪽
		if(j + 1 < grid[0].length && grid[i][j+1] == '1') {
			sch_island(grid,i,j+1);
		}
		//왼쪽
		if(j - 1 >= 0 && grid[i][j-1] == '1') {
			sch_island(grid,i,j-1);
		}
			
	}

	public static void main(String[] args) {

	}
}
