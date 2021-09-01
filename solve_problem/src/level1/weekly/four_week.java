package level1.weekly;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class four_week {

	public static void main(String[] args) {
		String[] table = { "SI JAVA JAVASCRIPT SQL PYTHON C#", "CONTENTS JAVASCRIPT JAVA PYTHON SQL C++",
				"HARDWARE C C++ PYTHON JAVA JAVASCRIPT", "PORTAL JAVA JAVASCRIPT PYTHON KOTLIN PHP",
				"GAME C++ C# JAVASCRIPT C JAVA" };
		String[] languages = { "JAVA", "JAVASCRIPT" };
		int[] preference = { 7, 5 };

		System.out.println(solution(table, languages, preference));
	}

	public static String solution(String[] table, String[] languages, int[] preference) {
		String answer = "";
		// 직업군 + 언어별 언어 점수
		Map<String, Map<String, Integer>> scoreMap = new TreeMap<>();
		Map<String, Integer> scoreResult = new LinkedHashMap<>();

		for (int i = 0; i < table.length; i++) {
			Map<String, Integer> langScore = new LinkedHashMap<>();

			for (int j = 1; j < table[i].split(" ").length; j++) {
				langScore.put(table[i].split(" ")[j], (6 - j));
			}

			scoreMap.put(table[i].split(" ")[0], langScore);
		}

		for (String str : scoreMap.keySet()) {
			int temp = 0;
			for (String key : scoreMap.get(str).keySet()) {
				for (int i = 0; i < languages.length; i++) {
					if (languages[i].equals(key)) {
						temp += preference[i] * scoreMap.get(str).get(key);
					}
				}
			}
			scoreResult.put(str, temp);
		}

		int max = 0;
		for (String str : scoreResult.keySet()) {
			if (scoreResult.get(str) > max) {
				max = scoreResult.get(str);
				answer = str;
			}
		}

		return answer;
	}
}
