//캐시
package level2.kakao;

import java.util.LinkedList;
import java.util.Queue;

public class kakao_cache {

	public static void main(String[] args) {
		int cacheSize = 4;
		String[] cities = { "Jeju", "Pangyo", "NewYork", "newyork" };
		System.out.println(solution(cacheSize, cities));
	}

	public static int solution(int cacheSize, String[] cities) {
		int hit = 0, miss = 0;
		// 페이지 교체 일어날 공간
		Queue<String> q = new LinkedList<>();
		// 대소문자 구분 x
		for (int i = 0; i < cities.length; i++) {
			cities[i] = cities[i].toLowerCase();
		}

		for (String city : cities) {
			// q가 city 가지고 있는 경우 hit, 순서 변경
			if (q.contains(city)) {
				hit++;
				q.remove(city);
				q.offer(city);
			} else {
				// q가 city 안가지고 있는 경우 miss, q에 값 추가
				miss++;
				q.offer(city);
			}
			// q의 사이즈가 cacheSize + 1 일때 q의 peek 값 제거
			if (q.size() == cacheSize + 1) {
				q.poll();
			}
		}

		return hit + (miss * 5);
	}
}
