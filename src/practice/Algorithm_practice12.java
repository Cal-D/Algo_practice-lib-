package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
/*
 프로그래머스 k번째수 
 
 2번째 for 문의 j 초기값을 -1 을 해주지 않았다.
 
 */

public class Algorithm_practice12 {
	public int[] solution(int[] array, int[][] commands) {
		int[] answer = new int[commands.length];
		List <Integer> demoAnswer = new LinkedList<>();
		
		for (int i = 0; i < commands.length; i++) {
			List<Integer> list = new LinkedList<>();
			for(int j = commands[i][0]-1; j < commands[i][1]; j++) {
				list.add(array[j]);
			}
			Collections.sort(list);
			demoAnswer.add(list.get(commands[i][2]-1));
		}
		for(int i = 0; i < demoAnswer.size();i++) {
			answer[i] = demoAnswer.get(i).intValue();
		}
		for(int a: answer) {
			System.out.println(a);
		}
			return answer;
	}
	public static void main(String[] args) {
		Algorithm_practice12 test = new Algorithm_practice12();
	    int[] a = {1, 5, 2, 6, 3, 7, 4};
	    int[][] b = {{2,5,3},{4,4,1},{1,7,3}};
		test.solution(a, b);
	}

}
