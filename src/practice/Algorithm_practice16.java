package practice;



public class Algorithm_practice16 {
	public int[] solution(int[] A, int K) {
  		int index = 0;
	int[] result = new int[A.length];
	int [] empty = new int [0];
	
	if(A.length == 0) return empty;
	if (K > A.length) {
		index = K % A.length;
	}
	index = K;
	
	for (int i = 0; i < A.length; i++) {
		if (i + index >= A.length) {
			result[(i + index) - A.length ] = A[i];
		}
		else {
			result[i + index] = A[i];
		}
	}
	for(int num : result) {
	System.out.println(num);
	}
	return result;
	}

public static void main(String[] args) {
	int a[] = {1000};
	Algorithm_practice16 aa =  new Algorithm_practice16();
	aa.solution(a, 5);

}
}
