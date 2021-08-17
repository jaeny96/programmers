//짝수와 홀수
package level1.practice;

public class practice_evenAndOdd {

	public static void main(String[] args) {
		int num = 3;
		System.out.println(solution(num));
	}
    public static String solution(int num) {
        String answer = (num%2==0) ? "Even" : "Odd";
        return answer;
    }
}
