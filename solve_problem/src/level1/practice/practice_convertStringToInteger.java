//문자열을 정수로 바꾸기
package level1.practice;

public class practice_convertStringToInteger {

	public static void main(String[] args) {
		String s = "-1234";
		System.out.println(solution(s));
	}
    public static int solution(String s) {
        return Integer.parseInt(s);
    }
}
