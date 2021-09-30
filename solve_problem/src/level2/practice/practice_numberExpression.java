//숫자의 표현
package level2.practice;

public class practice_numberExpression {

	public static void main(String[] args) {
		int n = 15;
		System.out.println(solution(n));
	}

	public static int solution(int n) {
		int answer = 0;
		//1~n까지 반복
		for (int i = 1; i <= n; i++) {
			int count=0;
			//i~n까지 반복
			for (int j = i; j <= n; j++) {
				count += j;
				//if count값이 n과 같아지면 answer값 더하기
				if (count == n) {
					answer++;
					break;
				} else if (count > n) {
					//커지면, 연속되는 수로 만들수 없는 것으로 break;
					break;
				}
			}
		}
		return answer;
	}
}
