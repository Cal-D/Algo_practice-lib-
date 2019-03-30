package practice;

/*Input: [2,3,-2,4]
Output: 6
Explanation: [2,3] has the largest product 6.*/
public class Algorithm_practice5 {
	public int maxProduct(int[] nums) {
		int[][] result = new int[nums.length][2];
		result[0][0] = nums[0];
		result[0][1] = nums[0];

		for (int i = 1; i < nums.length; i++) {
			int cur = nums[i];
			result[i][0] = Math.max(cur, Math.max(cur * result[i - 1][0], cur * result[i - 1][1]));
			result[i][1] = Math.min(cur, Math.min(cur * result[i - 1][0], cur * result[i - 1][1]));
		}

		int max = result[0][0];
		for(int i =0;i < nums.length;i++) {
			if(max < result[i][0]) max = result[i][0]; 
		}
		return max;
	}

}
