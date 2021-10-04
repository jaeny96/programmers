//조이스틱
//좀 더 생각해봐야하는 문제!
package level2.greedy;

public class greedy_joyStick {

	public static void main(String[] args) {
		String name = "JAN";
		System.out.println(solution(name));
	}

	public static int solution(String name) {
		// 총 움직임
		int answer = 0;
		// 왼,오 움직임
		int move = name.length() - 1;
		for (int i = 0; i < name.length(); i++) {
			// 위, 아래 움직임 중 최소값 더해주기
			answer += Math.min(name.charAt(i) - 'A', 'Z' - name.charAt(i)+1);
			// 현재보다 다음 위치에서
			int next = i + 1;
			// name.length()범위 내 A라면 넘어가기
			while (next < name.length() && name.charAt(next) == 'A') {
				next++;
			}
			// move 초기 값 : 오른쪽으로 차례대로 이동했을 때의 값
			// i + name.length()-next+i : 방향 전환 후 다시 현재 위치로 돌아오는 값
			move = Math.min(move, i + name.length() - next + i);
		}
		answer += move;
		return answer;
	}
}
