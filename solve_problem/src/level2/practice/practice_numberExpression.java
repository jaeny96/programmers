//숫자의 표현
package level2.practice;

public class practice_numberExpression {

	public static void main(String[] args) {
		int n = 15;
		System.out.println(solution(n));
	}

	public static int solution(int n) {
		int answer = 0;
		for (int i = 1; i <= n; i++) {
			int count=0;
			for (int j = i; j <= n; j++) {
				count += j;
				if (count == n) {
					answer++;
					break;
				} else if (count > n) {
					break;
				}
			}
		}
		return answer;
	}
}
