package practice;

import java.util.Arrays;

/*
 * For example, given array A such that:

  A[0] = 2
  A[1] = 3
  A[2] = 1
  A[3] = 5
the function should return 4, as it is the missing element.
 * */
public class Algorithm_practice18 {
	public int solution(int[] A) {
		int num = A.length + 1;

		for (int i = 1;i <= A.length;i++) {
			num += i;
			num -= A[i-1];
			}
		
		return num;
	}

	public static void main(String[] args) {
		Algorithm_practice18 a = new Algorithm_practice18();
		int[] b = { 7, 6, 3, 2, 1, 4, 5, 9 };
		a.solution(b);
	}
}
