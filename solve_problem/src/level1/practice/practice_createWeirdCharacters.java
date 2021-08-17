//이상한 문자 만들기
package level1.practice;

import java.util.ArrayList;
import java.util.List;

public class practice_createWeirdCharacters {

	public static void main(String[] args) {
		String s = "TRYHELLOWORLD";
		System.out.println(solution(s));

	}

	public static String solution(String s) {
		String answer = "";
		List<Integer> list = new ArrayList<>();
		//원래 문자열에서 공백이 있는 위치 모두 찾기
		for(int i=0; i<s.toCharArray().length; i++){
			if(" ".equals(s.charAt(i)+"")) {
				list.add(i);
			}
		}

		//하나 이상의 공백을 하나의 공백으로 처리한 newStr 변수 생성
		String newStr = s.replaceAll("\\s+"," ");
		//문자열 하나의 공백 기준으로 split
		String[] strArr = newStr.split(" ");
		
		//index 짝수 일때만 Uppercase로 변경
		for (int i = 0; i < strArr.length; i++) {
			for (int j = 0; j < strArr[i].length(); j++) {
				if (j % 2 == 0) {
					answer += (strArr[i].charAt(j) + "").toUpperCase();
				} else {
					answer += (strArr[i].charAt(j) + "").toLowerCase();
				}
			}
		}

		//원래 위치에 공백 넣어주기
		StringBuffer sb = new StringBuffer();
		sb.append(answer);
		for(int i=0; i<list.size(); i++) {
			sb.insert(list.get(i), " ");
		}
	
		return sb.toString();
	}
}
