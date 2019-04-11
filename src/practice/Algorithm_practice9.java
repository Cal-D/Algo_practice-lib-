package practice;
/* 접두어 문제 
 phone_book	return
[119, 97674223, 1195524421]	false
[123,456,789]	true
[12,123,1235,567,88]	false
 */
public class Algorithm_practice9 {
	public boolean solution(String[] phone_book) {
		boolean answer = true;
		for (int i = 0; i < phone_book.length; i++) {
			for (int j = 0; j < phone_book.length; j++) {
				if (!phone_book[i].equals(phone_book[j])&& phone_book[j].startsWith(phone_book[i])) {
					answer = false;
					return answer;
				}
			}
		}
		return answer;
	}
}
