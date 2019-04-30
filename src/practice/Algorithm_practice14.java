package practice;

import java.util.Arrays;

public class Algorithm_practice14 {
	public int solution(int N) {
		String binary = Integer.toBinaryString(N);
		char[] binaryChar = binary.toCharArray();
		int comCount = 0;
		int maxCount = 0;

		for (int i = 0; i < binaryChar.length; i++) {
			if (binaryChar[i] == '1') {
				if (comCount > maxCount) {
					maxCount = comCount;
				}
				comCount =0;
			}
			else {
				comCount++;
			}
		}

		return maxCount;
	}
}
