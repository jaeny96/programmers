//문자열 내 마음대로 정렬하기
package level1.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class practice_sortingStringsMyOwnWay {

	public static void main(String[] args) {
		String[] strings = { "abcd", "abce", "cdx" };
		int n = 1;
		for (String str : solution(strings, n)) {
			System.out.println(str);
		}
	}

	public static String[] solution(String[] strings, int n) {
		String[] answer = new String[strings.length];
		List<Character> stdChar = new ArrayList<>();
		for (int i = 0; i < strings.length; i++) {
			stdChar.add(strings[i].charAt(n));
		}

		Collections.sort(stdChar);

		for (char c : stdChar) {
			System.out.println(c);
		}

		for (int i = 0; i < stdChar.size(); i++) {
			for (int j = 0; j < strings.length; j++) {
				if (stdChar.get(i) == strings[j].charAt(n)) {
					answer[i] = strings[j];
				}
			}
		}

		return answer;
	}
}
