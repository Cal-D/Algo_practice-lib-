package practice;

public class Algorithm_practice16 {
	public int[] solution(int[] A, int K) { 
		int arraySize = A.length;
		int result[] = new int[arraySize];

    for (int i = 0; i < arraySize; i++) {
        result[(i + K) % arraySize] = A[i];
    }
    return result;


	}

	public static void main(String[] args) {
		int a[] = { 1000 };
		Algorithm_practice16 aa = new Algorithm_practice16();
		aa.solution(a, 5);

	}
}
