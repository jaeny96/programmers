//후보키 -- 다시 한번 보기
package level2.kakao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class kakao_candidateKey {

	public static void main(String[] args) {
		String[][] relation = { { "100", "ryan", "music", "2" }, { "200", "apeach", "math", "2" },
				{ "300", "tube", "computer", "3" }, { "400", "con", "computer", "4" }, { "500", "muzi", "music", "3" },
				{ "600", "apeach", "music", "2" } };
		System.out.println(solution(relation));
	}

	// 모든 후보키 조합
	static List<String> list = new ArrayList<>();
	// 유일성과 최소성 모두 만족하는 후보키
	static List<List<String>> candidateKey = new ArrayList<>();

	public static int solution(String[][] relation) {
		boolean[] visited = new boolean[relation[0].length];
		Set<String> set = new HashSet<>();
		// 조합을 이용해 모든 후보키 조합을 추출
		for (int i = 1; i <= relation[0].length; i++) {
			combi(visited, 0, i);
		}

		// 후보키의 유일성을 판별
		for (int i = 0; i < list.size(); i++) {
			set.clear();
			String[] keys = list.get(i).split("");
			for (int j = 0; j < relation.length; j++) {
				String tmp = "";
				for (int k = 0; k < keys.length; k++) {
					tmp += relation[j][Integer.parseInt(keys[k])];
				}
				set.add(tmp);
			}
			// 유일성 통과시
			if (set.size() == relation.length) {
				// 최소성 판별
				List<String> key = Arrays.asList(list.get(i).split(""));
				boolean chk = true;
				for (int u = 0; u < candidateKey.size(); u++) {
					// 최소성을 만족하지 않을때
					// 후보키 리스트에서 부분집합으로 존재
					if (key.containsAll(candidateKey.get(u))) {
						chk = false;
						break;
					}
				}

				if (chk) { // 후보키 리스트에서 부분집합으로 존재하지 않는다면 최소성 만족
					candidateKey.add(key);
				}
			}
		}

		return candidateKey.size();
	}

	//후보키 조합 만들기
	static void combi(boolean[] visited, int start, int r) {
		if (r == 0) {
			String tmp = "";
			for (int i = 0; i < visited.length; i++) {
				if (visited[i]) {
					tmp = tmp + i;
				}
			}
			list.add(tmp);
			return;
		} else {
			for (int i = start; i < visited.length; i++) {
				visited[i] = true;
				combi(visited, i + 1, r - 1);
				visited[i] = false;
			}
		}
	}
}
