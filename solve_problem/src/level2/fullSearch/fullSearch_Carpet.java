package level2.fullSearch;

import java.util.HashMap;
import java.util.Map;

public class fullSearch_Carpet {

	public static void main(String[] args) {
		int brown = 18;
		int yellow = 6;
		for (int i : solution(brown, yellow)) {
			System.out.print(i + " ");
		}
	}

	public static int[] solution(int brown, int yellow) {
		int[] answer = new int[2];
		Map<Integer, Integer> map = measure(brown + yellow);
		for (int key : map.keySet()) {
			if ((key - 2) * (map.get(key) - 2) == yellow) {
				answer[0] = map.get(key);
				answer[1] = key;
				break;
			}
		}
		return answer;
	}

	//number만드는 짝 찾아 반환하는 함수
	static Map<Integer, Integer> measure(int number) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 1; i <= (int) Math.sqrt(number); i++) {
			if (number % i == 0) {
				map.put(i, number / i);
			}
		}
		return map;
	}

}
