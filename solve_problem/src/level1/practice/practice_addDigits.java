//자릿수 더하기
package level1.practice;

public class practice_addDigits {

	public static void main(String[] args) {
		int n =123;
		System.out.println(solution(n));
	}
    public static int solution(int n) {
        int answer = 0;
        while(n!=0) {
        	answer+=(n%10);
        	n=n/10;
        }
        return answer;
    }
}
