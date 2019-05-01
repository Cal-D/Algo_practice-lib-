package practice;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class Algorithm_practice15 {
	public int solution(int[] A) {
		HashMap<Integer, Integer> hm = new HashMap<>();
		int oddCountNum = 0;

		for (int num : A) {
			if (!hm.containsKey(num)) {
				hm.put(num, 1);
			} else {
				hm.put(num, hm.get(num) + 1);
			}
		}

		Collection<Integer> values = hm.values();
		Set<Integer> keys = hm.keySet();

		for (Integer key : keys) {
			if(hm.get(key) % 2 != 0) {
				oddCountNum = key;
				break;
			}
		}

		return oddCountNum;

	}
}
