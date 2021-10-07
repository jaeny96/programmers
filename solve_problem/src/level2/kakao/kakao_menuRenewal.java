package level2.kakao;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class kakao_menuRenewal {

	public static void main(String[] args) {
		String[] orders = { "ABCFG", "AC", "CDE", "ACDE", "BCFG", "ACDEH" };
		int[] course = { 2, 3, 4 };
		for (String str : solution(orders, course)) {
			System.out.println(str);
		}
	}

	static Map<String, Integer> map;
	static int m;

	public static String[] solution(String[] orders, int[] course) {
		// 우선순위 큐를 활용해 불필요한 정렬 과정 생략
		PriorityQueue<String> pQ = new PriorityQueue<>();
		// 길이별 조합 조합 만들기 위함
		// 경우의 수마다 새롭게 map 생성
		for (int i = 0; i < course.length; i++) {
			map = new HashMap<>();
			m = 0;
			for (int j = 0; j < orders.length; j++) {
				chk(0, "", course[i], 0, orders[j]);
			}
			System.out.println(m);
			for (String key : map.keySet()) {
				if (map.get(key) == m && m > 1) {
					pQ.offer(key);
				}
			}
		}

		String[] answer = new String[pQ.size()];
		int idx = 0;
		while (!pQ.isEmpty()) {
			answer[idx] = pQ.poll();
			idx++;
		}

		return answer;
	}

	// 조합 만들기
	static void chk(int cnt, String str, int targetNumber, int idx, String word) {
		if (cnt == targetNumber) {
			char[] arr = str.toCharArray();
			Arrays.sort(arr);
			String tmp = "";
			for (int i = 0; i < arr.length; i++) {
				tmp += arr[i];
			}
			map.put(tmp, map.getOrDefault(tmp, 0) + 1);
			m = Math.max(m, map.get(tmp));
			return;
		}
		for (int i = idx; i < word.length(); i++) {
			char now = word.charAt(i);
			chk(cnt + 1, str + now, targetNumber, i + 1, word);
		}
	}
}
