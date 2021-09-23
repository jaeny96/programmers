//올바른 괄호
package level2.practice;

public class practice_correctBracket {

	public static void main(String[] args) {
		String s = "(((())))()";
		System.out.println(solution(s));
	}

	static boolean solution(String s) {
		boolean answer = true;
		int count = 0;

		for (char c : s.toCharArray()) {
			if (c == '(') {
				count++;
			} else {
				count--;
				if (count < 0) {
					answer = false;
					break;
				}
			}
		}

		if (s.charAt(0) == ')' || s.charAt(s.length() - 1) == '(' || count != 0) {
			answer = false;
		}
		return answer;
	}
}
