package practice;
/*Input: word1 = "horse", word2 = "ros"
Output: 3
Explanation: 
horse -> rorse (replace 'h' with 'r')
rorse -> rose (remove 'r')
rose -> ros (remove 'e')*/
public class Algorithm_practice6 {
	public int minDistance(String word1,String word2) {
			int arr[][] = new int[word1.length()+1][word2.length()+1];
			for(int i = 0;i <= word1.length();i++) {
				arr[i][0] = i;
			}
			for(int j = 0;j <= word2.length();j++) {
				arr[0][j] = j;
			}
			for(int i = 1;i <= word1.length();i++) {
				for(int j = 1;j <= word2.length();j++) {
					if(word1.charAt(i-1) == word2.charAt(j-1)) {
						arr[i][j] = arr[i-1][j-1];
					}
					else {
						arr[i][j] = Math.min(arr[i-1][j], Math.min(arr[i][j-1],arr[i-1][j-1]))+1;
					}
				}
			}
			
		return arr[word1.length()][word2.length()];
	}
}
