//프린터
package level2.stackQueue;

import java.util.Collections;
import java.util.PriorityQueue;

public class stackQueue_printer {

	public static void main(String[] args) {
		int[] priorities = { 1, 1, 9, 1, 1, 1 };
		int location = 0;

		System.out.println(solution(priorities, location));
	}

	public static int solution(int[] priorities, int location) {
		int answer = 1;
		// 우선순위 큐
		PriorityQueue<Integer> pQ = new PriorityQueue<>(Collections.reverseOrder());

		for (int p : priorities) {
			pQ.offer(p);
		}

		while (!pQ.isEmpty()) {
			for (int i = 0; i < priorities.length; i++) {
				// 우선순위 값이 우선순위 큐의 맨 위값(=우선순위가 가장 높은 값)과 같을 때
				if (priorities[i] == pQ.peek()) {
					// 인덱스 값이 location과 같을때
					if (i == location) {
						// return
						return answer;
					}
					// 아니면 poll
					pQ.poll();
					answer += 1;
				}
			}
		}
		return answer;
	}
}
