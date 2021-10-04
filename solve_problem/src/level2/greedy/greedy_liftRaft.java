//구명보트
package level2.greedy;

import java.util.Arrays;

public class greedy_liftRaft {

	public static void main(String[] args) {
		int[] people = { 70, 80, 50 };
		int limit = 100;
		System.out.println(solution(people, limit));
	}

	public static int solution(int[] people, int limit) {
		int answer = 0, idx = 0;
		// 정렬
		Arrays.sort(people);

		// 큰 것부터~
		for (int j = people.length - 1; j >= idx; j--) {
			//limit 보다 크면 answer++
			if (people[idx] + people[j] > limit) {
				answer++;
			} else { // 2명이 한보트에 타는 경우~
				answer++;
				idx++;
			}
		}
		return answer;
	}
}
