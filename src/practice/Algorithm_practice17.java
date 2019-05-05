package practice;

public class Algorithm_practice17 {
	public int solution(int X, int Y, int D) {
        // write your code in Java SE 8
		int num = Y - X;
		int count = num / D;
		int rest = num % D;
		
		if(rest > 0) {
			count++;
		}
		return count;
    }
}
