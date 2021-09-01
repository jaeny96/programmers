//문자열 내림차순
package level1.practice;

public class practice_placingStringsInDescendingOrder {

	public static void main(String[] args) {
		String s = "Zbcdefg";
		System.out.println(solution(s));
	}

	public static String solution(String s) {
		String answer = "";
		char[] charArr = s.toCharArray();
		for (int i = 0; i < charArr.length - 1; i++) {
			for (int j = i + 1; j < charArr.length; j++) {
				if ((int) charArr[i] < (int) charArr[j]) {
					char tmp = charArr[j];
					charArr[j] = charArr[i];
					charArr[i] = tmp;
				}
			}
		}
		
		for(char c : charArr) {
			answer+=c;
		}
		
		return answer;
	}
}
