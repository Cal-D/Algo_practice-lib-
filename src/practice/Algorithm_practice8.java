package practice;

import java.util.HashMap;
import java.util.Map;

/*participant						completion								return
[leo, kiki, eden]	                [eden, kiki]							leo
[marina, josipa, nikola, vinko, filipa]	[josipa, filipa, marina, nikola]	vinko
[mislav, stanko, mislav, ana]	     [stanko, ana, mislav]					misla
*/
public class Algorithm_practice8 {
	public String solution(String[] participant, String[] completion) {
		String answer ="";
		Map<String, Integer> HashList = new HashMap<>();
		for(String part : participant) {
			HashList.put(part,HashList.getOrDefault(part, 0)+1);
		}
		for(String comp : completion) {
			HashList.put(comp, HashList.get(comp)-1);
		}
		
		for(String com :HashList.keySet()) {
			if(HashList.get(com) != 0)
				answer = com; 
		}
		
		return answer;
	}

}
