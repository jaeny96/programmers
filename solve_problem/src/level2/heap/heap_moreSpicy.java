//더 맵게
package level2.heap;

import java.util.PriorityQueue;

public class heap_moreSpicy {

	public static void main(String[] args) {
		int[] scoville = { 1, 2, 3 };
		int K = 11;
		System.out.println(solution(scoville, K));
	}

	public static int solution(int[] scoville, int K) {
		int answer = 0, tmp = 0;
		PriorityQueue<Integer> pQ = new PriorityQueue<Integer>();
		for (int s : scoville) {
			pQ.offer(s);
		}

		// 섞기 전부터 K보다 높을 경우 0반환
		if (pQ.peek() >= K) {
			return 0;
		}

		while (true) {
			// 최종까지 갔을 때 size=1, 목표값에 도달하지 못한 경우이므로 -1반환
			if (pQ.size() == 1) {
				return -1;
			}

			tmp = pQ.poll() + (pQ.poll() * 2);
			pQ.offer(tmp);
			answer++;
			// pQ.peek()이 K보다 크면 answer 반환, 아니면 tmp=0으로 초기화
			if (pQ.peek() >= K) {
				return answer;
			} else {
				tmp = 0;
			}
		}
	}
}
