package practice;

/*
 hashmap 의 replace 를 배웠다.
 
 프로그래머스 위장 문제
 경우의수
 각각 입지 않는 경우를 +1 마지막 아무것도 입지 않는 경우의수 -1 이다.
 
 */
import java.util.HashMap;

public class Algorithm_practice10 {
	public int solution(String[][] clothes) {
		int total = 1;
		HashMap<String, Integer> hm = new HashMap<>();

		for (int i = 0; i < clothes.length; i++) {
			if (hm.containsKey(clothes[i][1])) {
				hm.replace(clothes[i][1], hm.get(clothes[i][1]) + 1);
			} else {
				hm.put(clothes[i][1], 1);
			}
		}
		for (int count : hm.values()) {
			total *= (count + 1);
		}
		total -= 1;
		return total;
	}
}
