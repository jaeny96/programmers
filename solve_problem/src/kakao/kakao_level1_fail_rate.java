package kakao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class kakao_level1_fail_rate {

	public static void main(String[] args) {
		int[] stages = { 1, 1, 1, 1, 1 };
		int N = 5;
		int[] resArr = solution(N, stages);
		for (int i : resArr) {
			System.out.print(i + " ");
		}

	}

	public static int[] solution(int N, int[] stages) {
		int[] answer = new int[N];

		// stage 를 키값으로 갖는 map 변수 선언
		Map<Integer, Double> map = new HashMap<Integer, Double>();
		for (int i = 0; i < N; i++) {
			map.put(i + 1, (double) 0);
		}

		// 최고 stage 이하의 중복값 찾아서 스테이지별 통과하지 못한 수 map의 값으로 대입
		for (int i = 0; i < stages.length; i++) {
			if (stages[i] <= N) {
				map.put(stages[i], map.getOrDefault(stages[i], (double) 0) + 1);
			}
		}

		// 각 스테이지 별 도전자 수 저장 변수 선언
		int[] cnt = new int[N];
		// 각 stage에 도전하는 도전자 수 계산하여 cnt 배열에 대입
		for (int i = 0; i < N; i++) {
			for (int j : stages) {
				if ((i + 1) <= j) {
					cnt[i]++;
				}
			}
		}

		for (int i = 0; i < cnt.length; i++) {
			// 실패율 계산 완료한 후 map에 값 대입
			if (cnt[i] == 0) { //스테이지에 도달한 유저가 없는 경우 해당 스테이지의 실패율은 0 으로 정의
				map.put(i + 1, (double) 0);
			} else { 
				map.put(i + 1, map.get(i + 1) / (double) cnt[i]);
			}
		}

		// map key 저장할 list선언
		List<Integer> mapKey = new ArrayList<Integer>(map.keySet());
		Comparator<Object> comparator = new Comparator<Object>() {
			@Override
			public int compare(Object o1, Object o2) {
				if (map.get(o1) != map.get(o2)) { //실패율이 다른 경우에는 내림차순
					return map.get(o2).compareTo(map.get(o1));
				} else {	//실패율이 같은 경우에는 오름차순
					return map.get(o1).compareTo(map.get(o2));
				}
			}
		};
		Collections.sort(mapKey, (o1, o2) -> (comparator.compare(o1, o2)));
		
		for (int i = 0; i < mapKey.size(); i++) {
			answer[i] = mapKey.get(i);
		}

		return answer;
	}
}
