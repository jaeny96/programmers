//다리를 지나는 트럭
package level2.stackQueue;

import java.util.LinkedList;
import java.util.Queue;

public class stackQueue_truckCrossingTheBridge {

	public static void main(String[] args) {
		int bridge_length = 2;
		int weigth = 10;
		int[] truck_weights = { 7, 4, 5, 6 };
		System.out.println(solution(bridge_length, weigth, truck_weights));

	}

	public static int solution(int bridge_length, int weight, int[] truck_weights) {
		int answer = 0, idx = 0, tmp = 0;

		Queue<Integer> q = new LinkedList<>();

		while (true) {
			//인덱스 값이 마지막일때 break;
			if (idx == truck_weights.length) {
				break;
			}
			//큐의 사이즈가 다리길이와 같을때, poll해준 뒤 tmp에서 무게 값 빼주기
			if (q.size() == bridge_length) {
				tmp -= q.poll();
			} else if (tmp + truck_weights[idx] > weight) {
				//현재 무게값 + 다음트럭의 무게가 weight보다 클때
				//q에 0값 대입
				q.offer(0);
				answer++;
			} else {
				//그 외
				//큐에 truck 추가, 현재 무게에 트럭 무게 추가
				q.offer(truck_weights[idx]);
				tmp += truck_weights[idx];
				idx++;
				answer++;
			}
		}

		//마지막 트럭값까지 더해준 값 return
		return answer+bridge_length;
	}
}
