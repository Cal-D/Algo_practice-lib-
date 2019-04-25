package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
/*
 프로그래머스 앨범 문제
Comparator compare 

 
 */

public class Algorithm_practice11 {
	public int[] solution(String[] genres, int[] plays) {
		List<Integer> demoAnswer = new LinkedList<>();
		Map<String, Integer> hm = new HashMap<>();
		for (int i = 0; i < genres.length; i++) {
			if (hm.containsKey(genres[i])) {
				hm.put(genres[i], (hm.get(genres[i]) + plays[i]));
			} else {
				hm.put(genres[i], plays[i]);
			}

		}
		List<String> keysetList = new ArrayList<>(hm.keySet());
		Collections.sort(keysetList, new Comparator<String>() {
			public int compare(String o1, String o2) {
				return hm.get(o2) - hm.get(o1);
			}
		});
	
	
		// 장르 배열하나씩 돌면서 string plays 해서 비교 2개,한개일경우 한개만
		for (int j = 0; j < keysetList.size(); j++) {
			int mostPlayed = -1, secondPlayed = -1,firstIndex=0,secondIndex=0;
			for (int i = 0; i < genres.length; i++) {
				if (keysetList.get(j).toString() != genres[i]) {
					continue;
				}
				if (mostPlayed < plays[i]) {
					secondPlayed = mostPlayed;
					secondIndex = firstIndex;
					mostPlayed = plays[i];
					firstIndex = i;
					
				}

				else if (mostPlayed > plays[i] && secondPlayed < plays[i]) {
					secondPlayed = plays[i];
					secondIndex =i;
				}
			}
		
			demoAnswer.add(firstIndex);
			if(secondPlayed != -1) {
				demoAnswer.add(secondIndex);
			}
		}
		
		int[] answer = new int[demoAnswer.size()];
		
		for(int i = 0; i < answer.length; i++) {
			answer[i] = demoAnswer.get(i).intValue();
		}
		
		
		for(int a : answer) {
			System.out.println(a);
		}
		
		return answer;

	}

	public static void main(String[] args) {
		String[] a = { "classic", "pop", "classic", "classic", "pop"};
		int[] b = {500, 600, 150, 800, 2500};

		Algorithm_practice11 ne = new Algorithm_practice11();
		ne.solution(a, b);
	}

}
